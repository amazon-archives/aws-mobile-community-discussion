package com.amazonaws.samples.notes;

import android.app.Activity;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;

/**
 * Replacement UncaughtExceptionHandler to handle application crashes and log the cause.
 */
public class CrashHandler implements UncaughtExceptionHandler {
    /**
     * Stores the original UncaughtExceptionHandler for the app
     */
    private UncaughtExceptionHandler defaultHandler;

    /**
     * Stores the original (first) Activity that was called
     */
    private Activity activity;

    /**
     * Install the CrashHandler properly
     * @param activity the first activity to use.
     */
    public static void installHandler(Activity activity) {
        if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof CrashHandler)) {
            Thread.setDefaultUncaughtExceptionHandler(new CrashHandler(activity));
        }
    }

    /**
     * Create a new instance of the CrashHandler
     * @param activity the original Activity that installed the CrashHandler
     */
    public CrashHandler(Activity activity) {
        this.defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.activity = activity;
    }

    /**
     * Called by the app when an uncaught exception happens
     * @param t The thread that caused the crash
     * @param e The exception that was thrown
     */
    public void uncaughtException(Thread t, Throwable e) {
        String stacktrace = getStackTrace(e);

        Log.e("CRASH", stacktrace);
        Log.e("CRASH", e.toString());

        defaultHandler.uncaughtException(t, e);
    }

    /**
     * Obtain the stacktrace as a String
     * @param e The exception
     * @return The stack trace
     */
    private String getStackTrace(Throwable e) {
        final Writer sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String stacktrace = sw.toString();
        pw.close();
        return stacktrace;
    }
}
