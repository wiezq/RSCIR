FROM amazoncorretto:17-alpine-jdk
EXPOSE 8081
ADD target/sort-app.jar sort-app.jar
ENTRYPOINT ["java", "-jar", "/sort-app.jar"]