# Spring-Postgree-Basic

In order to run this Spring application it is required to have a Postgree DB running on port 5432 (can be a docker).

Also it is neccesary a DB with name "springbootdb".

Docker command to create a container:
docker run --name postgres-ariel -e POSTGRES_PASSWORD=password1 -p 5432:5432 -d postgres

