FROM openjdk:10.0.2-jre-slim
MAINTAINER Renard Gold <goldrenard@gmail.com>
RUN mkdir -p /JuniperBot/logs /JuniperBot/temp
WORKDIR /JuniperBot
COPY jb-web/build/libs/JuniperBot.jar JuniperBot.jar
COPY modules/jb-module-aiml/bots/ aiml/
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar JuniperBot.jar