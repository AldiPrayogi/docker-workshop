FROM openjdk:11
COPY compose-demo.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
#this command runs a healthcheck to check whether the container is still working or not
#the interval option states the interval in which a healthcheck command is run
#the timeout option specifies the length of which a run is expected to last, if it exceeds it, then it's assumed to have failed
#the retries option specifies the amount of consecutive failed run before a healthcheck is considered unhealthy
HEALTHCHECK --interval=25s --timeout=3s --retries=2 CMD wget --spider http://localhost:8091/actuator/health || exit 1
ENTRYPOINT [ "java" ]
CMD [ "-jar", "compose-demo.jar" ]
#more info on ENTRYPOINT and CMD and the subtle differences between them: https://codewithyury.com/docker-run-vs-cmd-vs-entrypoint/
#documentation: https://docs.docker.com/engine/reference/builder/