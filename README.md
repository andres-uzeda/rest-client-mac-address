# REST Client MAC address
It is a JAVA CLI application

## How to use:

1 Create a image with the following command:

docker image build -t rest-client-mac .

2 Create a Docker Container with the following command:

docker container run --name client-mac-address -d -t rest-client-mac bash

3 Enter image with the following command:

docker exec -it client-mac-address bash

4 In the container use the following commands in order to run the application with the following command:

cd /rest-client-mac-address
java main


## How to use the CLI
Enter a MAC address when a message was displayed in console
Send out in console if you want to out