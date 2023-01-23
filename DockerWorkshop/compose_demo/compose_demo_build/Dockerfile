FROM openjdk:11
COPY compose-demo.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
HEALTHCHECK --interval=25s --timeout=3s --retries=2 CMD wget --spider http://localhost:8091/actuator/health || exit 1
ENTRYPOINT [ "java" ]
CMD [ "-jar", "compose-demo.jar" ]
#more info on ENTRYPOINT and CMD and the subtle differences between them: https://codewithyury.com/docker-run-vs-cmd-vs-entrypoint/
#documentation: https://docs.docker.com/engine/reference/builder/