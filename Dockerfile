#Docerkile

#base image
FROM openjdk:21

#빌드할 JAR 파일의 경로
ARG JAR_FILE=build/libs/*.jar

#빌드된 파일을 Docker 이미지에 포함
COPY ${JAR_FILE} app.jar

#컨테이너가 시작될 때 jar 파일 실행
ENTRYPOINT ["java", "-jar", "app.jar"]