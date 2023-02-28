# Fitness app - Portfolio project

----

----

## Devlog

19.01.23 - 
Future plans to change the architecture for the system. Plan to change gRPC to communicate between Logic and Data Access server. Plan to remove Web server. Blazor client will make HTTP requests to the logic server. Plans to improve database and security in the system.

28.02.23 -
Project will be with less features than the semester project. The featurs implemented will be:
* As a user, I want to create a profile, so that I can get access to the system.
* As a user, I want to log into my profile, so that I can gain access to the system.
* As a user, I want to create exercises, so that I can have them in workouts.
* As a user, I want to see exercises, so that I can use them during workouts and to use them with other features.
* As a user, I want to create workouts, so that they can be used during training.
* As a user, I want to see workouts, so that I can use them during workouts.
* As a user, I want to manage exercises, so that I can remove them or change details.
* As a user, I want to manage workouts, so that I can remove them or change details.
* As a user, I want to manage my profile, so that I can remove it or change user my user information.

For the architecture the system will be implemented with two servers, Data server and logic server. For the client the application will be coded using React native.\
The communication between serves will be with REST endpoints. Data server will be coded in C# and logic server will be coded in Java. There will be also an authentications server coded in Node.js that will authenticate the user to be able to communicate with the logic server API. 

Before the coding can be started the repository will be implemented with CI/CD pipelines but the code for now will not be deployed on the cloud. 

During implementation TDD will be used for better code and development.

For more documentation look into documentation folder where from now on the documentation will be held.

The code that and the documentation will be changed/removed in the following few commits. 

## Changelog

Alpha-1.0.0: 
The initial setup is taken from a Semester 3 project which was a two man collaboration. The repository is found here https://github.com/ASilins/SEP3-Project \
The intellectual property for the idea for the project is for both collaborators in the Semester 3 project: Arturs Silins and Ondrej Klimek.
