FROM openjdk:11
COPY compose-demo.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
HEALTHCHECK --interval=30s --timeout=30s --start-period=5s --retries=3 CMD wget -q http://0.0.0.0:8091/actuator/health 2>&1 | grep -o -q "UP" || exit
CMD [ "java", "-jar", "compose-demo.jar" ]