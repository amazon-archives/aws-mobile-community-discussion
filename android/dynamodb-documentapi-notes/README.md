# Android Notes App

To configure the cloud backend:

*  Log in to the AWS Console.
*  Click the **Mobile Hub** console.
*  **Create a New Project**.
*  Click **NoSQL Database**.
*  Click **Enable NoSQL**.
*  Click **Add a new table**.
*  Click **Start with an example schema**.
*  Select **Notes** as the example schema.
*  Select **Public** for the permissions.
*  Click **Create Table**, then click **Create Table** in the dialog.
*  Click **Resources** in the left-hand sidebar.
*  Make a note of the Amazon Cognito Pool ID and the name of the Notes table.

To configure the app:

*  Open the project in Android Studio.
*  Open the DatabaseAccess.java file.
*  Replace the COGNITO_POOL_ID and DYNAMODB_TABLE variables with the values from your cloud backend.



