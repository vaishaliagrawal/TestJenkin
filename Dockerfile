FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/docker-spring-boot.jar docker-spring-boot.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /docker-spring-boot.jar" ]