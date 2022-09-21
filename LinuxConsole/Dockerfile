FROM amazoncorretto:17-alpine-jdk
EXPOSE 8082
ADD target/linux-console.jar linux-console.jar
ENTRYPOINT ["java", "-jar", "/linux-console.jar"]