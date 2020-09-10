#Lab:Google cloud fundamentals Getting Started with Compute Engine

##Objectives

In this lab, you will learn how to perform the following tasks:

 - Create a Compute Engine virtual machine using the Google Cloud Platform (GCP) Console.

 - Create a Compute Engine virtual machine using the gcloud command-line interface.

 - Connect between the two instances.

 ## Steps:
 1. Create a virtual machine using the GCP Console

gcloud compute instances create "my-vm-1" --machine-type "e2-medium" --image-project "debian-cloud" --image="debian-9-stretch-v20200902" --subnet=default --tags=http-server

2. Create a virtual machine using the gcloud command line

gcloud config set compute/zone us-central1-b

gcloud compute instances create "my-vm-2" --machine-type "n1-standard-1" --image-project "debian-cloud" --image "debian-9-stretch-v20190213" --subnet "default"

3. Connect between VM instances

  1.Use the ping command to confirm that my-vm-2 can reach my-vm-1 over the network

    - connect to my-vm-2

        gcloud compute ssh my-vm-2

    - Ping my-vm-1 from my-vm-2

       ping -c 3 my-vm-1

    - use the ssh command to open a command prompt on my-vm-1 from my-vm-2

       ssh my-vm-1

    - At the command prompt on my-vm-1, install the Nginx web server

        sudo apt-get install nginx-light -y

    - Use the nano text editor to add a custom message to the home page of the web server

       sudo nano /var/www/html/index.nginx-debian.html

    - Add text like this, and replace YOUR_NAME with your name

        Hi from Peter Kalisa

    - Exit editor and confirm that the web server is serving your new page. At the command prompt on my-vm-1, execute this command

        curl http://localhost/

        Results;The response will be the HTML source of the web server's home page, including your line of custom text

    - To exit the command prompt on my-vm-1, execute this command

       exit

    - To confirm that my-vm-2 can reach the web server on my-vm-1, at the command prompt on my-vm-2, execute this command

       curl http://my-vm-1/

      Results: The response will again be the HTML source of the web server's home page, including your line of custom text

    - Now get the external IP of my-vm-1 instance from this command

      gcloud compute instances list

   - Paste the copied IP address of my-vm-1  into the address bar of a new browser tab and hit enter

     Result: You will see your web server's home page, including your custom text