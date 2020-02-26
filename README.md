# An alternative to far jars
based on this approach https://medium.com/holisticon-consultants/dont-build-fat-jars-for-docker-applications-6252a5571248

This app creates a jar inside the build directory but sets its dependencies inside a separate folder that is referenced in the jar's manifest file. 

This is done in order to avoid creating a fat or uber-jar.

As usual you need to have Maven installed for this project to work, after that run `mvn validate` and then `mvn clean package`. Generated jar will be in `target/application.jar` and dependencies will be inside `target/alternateLocation`