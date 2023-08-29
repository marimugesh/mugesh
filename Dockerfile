FROM eclipse-temurin:17
COPY target/appdoc.jar appdoc.jar
CMD [ "java", "-jar", "appdoc.jar" ]
