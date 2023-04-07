#this is your parent image, all subsequent commands are based on this parent image
FROM openjdk:11
#this line copies the jar file to a specified folder within the image
COPY image-demo.jar /usr/src/myapp/
#this line sets the work directory of our image
#workdir sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instruction
WORKDIR /usr/src/myapp
#this line runs whatever command is specified
#in this instance we are essentially running
#java -jar image-demo.jar within the work directory
#specified earlier
CMD [ "java", "-jar", "image-demo.jar" ]
#documentation: https://docs.docker.com/engine/reference/builder/