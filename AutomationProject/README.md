The is folder with advice how you can run this project:

steps:
This project can run in intelij or eclipse basically any IDE or directly from Jenkins, The code is written with selenium java se.

In the project folder there will be 2 projects the one will be called QEtodolist_project this is the framework which i ran from my IDE.
The second project will be called TestingQRtodolist.

Refer to TestingQRtodolist it will have a POM.xml file that can run the Test_todolistFunctions.java class. You will see I have created a TestNG.xml file,
this file is presented in the POM.xml.

You will require maven setup to run the POM.xml file. 
Once you have all your maven utilities installed you then can run POM.xml file. 

When running test in CLI mode you can run this in Jenkings, you will need a gitplugin refer to install plugins on Jenkins then search for Git plugin.
Then add the git repository. 
