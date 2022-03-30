FROM openjdk:8
VOLUME /tmp
ADD ./target/services-ipau-usuarios-0.0.1-SNAPSHOT.jar services-ipau-usuarios.jar
ENTRYPOINT ["java","-jar","/services-ipau-usuarios.jar"]