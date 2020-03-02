FROM openjdk:8
VOLUME /tmp
EXPOSE 8090
ADD ./target/services-ipau-usuarios-0.0.1-SNAPSHOT.jar services-ipau-usuarios.jar
ENTRYPOINT ["java","-jar","/services-ipau-usuarios.jar"]