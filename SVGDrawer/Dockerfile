FROM amazoncorretto:17-alpine-jdk
EXPOSE 8080
ADD target/svg-drawer.jar svg-drawer.jar
ENTRYPOINT ["java", "-jar", "/svg-drawer.jar"]