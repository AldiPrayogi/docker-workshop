**Docker Basics**

![docker vs vm](docker_vs_vm.png "Docker vs. VM")

Docker Reference
[https://docs.docker.com/reference/]

```
docker --help
```

| Management Command | Description               |
| -------------------- | --------------------------- |
| container          | Mangage docker containers |
| image              | Mangage docker images     |
| system             | Mangage docker            |
| volume             | Mangage docker volumes    |


| Command | Description                          |
| :-------- | :------------------------------------- |
| build   | Build docker images                  |
| cp      | Copy files from/to docker container  |
| exec    | Run command in running container     |
| inspect | Get information about docker objects |
| kill    | Kill running containers              |
| load    | Load image from tar archive          |
| login   | Log in to a docker registry          |
| logout  | Log out from a docker registry       |
| logs    | Get logs of a container              |
| ps      | List containers                      |
| pull    | Pull image from registry             |
| push    | Push image to registry               |
| rm      | Remove containers                    |
| rmi     | Remove images                        |
| run     | Run a command in a new container     |
| save    | Save image to tar archive            |
| search  | Search docker hub for images         |
| start   | Start stopped containers             |
| stop    | Stop running containers              |
| tag     | Tag an image                         |

search for openjdk image
```
docker search openjdk
````

pull openjdk image
```
docker pull openjdk:11
```

list images
```
docker image ls
docker images
```

inspect openjdk image
```
docker inspect openjdk:11
```
Image-Page
[https://hub.docker.com/_/openjdk]


build first image
```
cd docker/first_image
docker build -t commsult/dockerworkshop .
```

docker file reference
[https://docs.docker.com/engine/reference/builder/]

run docker image
```
docker run -d -p8090:8090 commsult/dockerworkshop
```

see result
[http://localhost:8090/]

list docker containers
```
docker ps
```

show docker logs
```
docker logs <containerid>
```

look into container
```
docker exec -it <containerid> bash
ls -l
exit
```

stop container
```
docker stop <containerid>
```

list all stopped containers
```
docker container ls -a
```

start container again
```
docker start <containerid>
```

copy file to container
```
touch test.txt
docker cp text.txt <containerid>:/usr/src/myapp/
docker exec -it <containerid> bash
ls -l
exit
```