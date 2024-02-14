FROM openjdk:17
EXPOSE 8080
ADD target/docker-kubernetes-assignment.jar docker-kubernetes-assignment.jar
ENTRYPOINT ["java","-jar", "/docker-kubernetes-assignment.jar"]