# Deploy to AWS Mobile Hub

This sample demonstrates the use of the "Deploy to AWS Mobile Hub" button.  Click on the button below to import the AWS cloud components of this project (stored in the photoapptemplate.zip file) into your AWS Mobile Hub console.

<p align="center">
<a target="_blank" href="https://console.aws.amazon.com/mobilehub/home?#/starterkit/?config=https://github.com/aws/aws-mobile-community-discussion/blob/master/oneclick-deployment-sample/photoapptemplate.zip&app=web">
<span>
    <img height="100%" src="https://s3.amazonaws.com/deploytomh/button-deploy-aws-mh.png"/>
</span>
</a>
</p>

When you click on the button above, you will be asked to log into the AWS console (if you are not already logged in).  Once logged in, you will be prompted to name the project.   Accept the name (or change it),
then click **Import project**.

This project consists of the following features:

*  User Sign-in, powered by Amazon Cognito.
*  NoSQL Database, powered by Amazon DynamoDB.
*  User Data Storage, powered by Amazon S3.

After importing the project, click on **build my app** to reach the integration instructions.  You can
either download a sample app which allows you to exercise each feature, or you can integrate the AWS
Mobile SDK into your own app.

## Create your own Deploy to AWS Mobile Hub button

To create a **Deploy to AWS Mobile Hub** button, first export your AWS Mobile Hub project:

1.  Log in to the AWS Console and select the [Mobile Hub console](https://console.aws.amazon.com/mobilehubhome?#/).
2.  Click the triple-dots in the top-right corner of the card for the project you wish to export.
3.  Click **Export (file)**.
4.  Check the downloaded ZIP file in to your GitHub repository.
5.  Add a button to your README.md file.   Use the button above as a model for creating your own button.

