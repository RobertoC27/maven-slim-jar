# An alternative to far jars
based on this approach https://medium.com/holisticon-consultants/dont-build-fat-jars-for-docker-applications-6252a5571248

This app creates a jar inside the build directory but sets its dependencies inside a separate folder that is referenced in the jar's manifest file. 

This is done in order to avoid creating a fat or uber-jar.