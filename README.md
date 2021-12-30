
we need to start the Workbench, the main GUI for the whole system, and at least one KIE (knowledge is everything) server which is an execution node behind the workbench.

#### getting started

start workbench

`docker run -p 8080:8080 -p 8001:8001 -d --name drools-workbench --env "JAVA_OPTS=-Dorg.uberfire.nio.git.ssh.host=0.0.0.0 -Xms256m -Xmx2048m -Djava.net.preferIPv4Stack=true -Dfile.encoding=UTF-8" jboss/drools-workbench-showcase:latest`

start kie server

`docker run -p 8180:8080 -d --name kie-server --link drools-workbench:kie-wb jboss/kie-server-showcase:latest`

* make sure the kie server is linked to the workbench
* it takes minutes for the workbench to be accessible in the web after starting
* the server can be started immediately after starting the workbench docker container, and it will autoconnect
* default is for both servers to listen on 0.0.0.0, make sure the host has ports 8080 and 8180 open, we'll interact w both directly
* the java option, git.ssh.host, allows us to import a drools project from the web (ie, github)

#### import and deploy a project

navigate to http://$SERVER:8080/business-central and login with admin / admin

the difference between `drools-workbench` and `drools-workbench-showcase` is the existence of sample projects.

* go to the main projects tab 
* click the 3 dots in the top right (ABOVE the 'Add Project' button)
* import project
* enter "https://github.com/mikerjacobi/rules.git" and hit enter
* * one gotcha, i originally only had branch=main, and drools requires imported projects have branch=master
* select the new project and click OK in the top right - this will take a second to import and then redirect to the imported project 

click deploy.

under the project assets, there is a file called `Rules`, which is a .DRL file - this is where rules are defined.

#### load facts and execute rules

in Drools, facts are data points to be taken into account for the rules engine. facts can either be batch loaded in a single api call, or multiple.

run python rules script to load container facts and execute rules.

`python rules.py`

#### notes