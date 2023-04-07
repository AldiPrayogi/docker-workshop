# Docker Basics

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
```

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
cd image_demo/image_demo_build
docker build -t commsult/imagedemo .
```

docker file reference
[https://docs.docker.com/engine/reference/builder/]

run docker image
```
docker run -d -p 8090:8090 commsult/imagedemo
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
docker exec -i <containerid> bash
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
docker exec -i <containerid> bash
ls -l
exit
```

destroy a stopped container
```
docker rm <container_name/id>
```

# Docker Compose

docker-compose --help

| Commands           | Description               |
| -------------------- | --------------------------- |
| down               | Stop compose              |
| scale              | Scale up/down services    |
| up                 | Start compose             |

building image with spring db app
```
cd ../../compose_demo/compose_demo_build
docker build -t commsult/composedemo .
```

compose file reference
[https://docs.docker.com/compose/compose-file/]

starting docker compose (app + db)
```
cd ../compose_file
docker-compose up
```

see result
[http://localhost:18091/customers]

list docker containers
```
docker ps
```

volume is still available
```
docker volume ls
```

look for the path of the volume (linux/vm)
```
docker inspect <volume_name>
```

scale app:
```
docker-compose up --scale cs-commsult-app=3
```

Stop and remove containers:
```
docker-compose down
```