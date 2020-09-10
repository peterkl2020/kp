
#Lab2:Google cloud fundamentals Getting Started with Compute Engine

##Objectives

In this lab, you will learn how to perform the following tasks

  - Initialize App Engine.

  - Preview an App Engine application running locally in Cloud Shell.

  - Deploy an App Engine application, so that others can reach it.

  - Disable an App Engine application, when you no longer want it to be visible.

  ## Steps:

  1. Initialize App Engine.

 - gcloud app create --project=$DEVSHELL_PROJECT_ID

 When prompted, select the region where you want your App Engine application located

 - Clone the source code repository for a sample application in the hello_world directory

    git clone https://github.com/GoogleCloudPlatform/python-docs-samples

 - Navigate to the source directory

    cd python-docs-samples/appengine/standard_python3/hello_world

 2. Run Hello World application locally

 - Execute the following command to download and update the packages list

      sudo apt-get update

 - Set up a virtual environment in which you will run your application

    sudo apt-get install virtualenv

 - If prompted [Y/n], press Y and then Enter

    virtualenv -p python3 venv

 - Activate the virtual environment

    source venv/bin/activate

 - Navigate to your project directory and install dependencies

    pip install  -r requirements.txt

 - Run the application

    python main.py

 - In Cloud Shell, Preview on port 8080

    Result: HelloWorld

3. Deploy and run Hello World on App Engine

 - Navigate to the source directory

   cd ~/python-docs-samples/appengine/standard_python3/hello_world

 - Deploy your Hello World application

    gcloud app deploy

 - Launch your browser to view the app at http://YOUR_PROJECT_ID.appspot.com

    gcloud app browse

 - Copy and paste the URL into a new browser window

    Result: HelloWorld!

 4. Disable the application

 - To get version of your application run this command

     gcloud app versions list

 - stop the application with this command

    gcloud app versions stop version_id


