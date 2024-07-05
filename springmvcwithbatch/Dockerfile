FROM tomcat:9.0.89-jre8
RUN rm -rf /usr/local/tomcat/webapps/*
COPY /target/springmvcwithbatch.war /usr/local/tomcat/webapps/springmvcwithbatch.war
EXPOSE 90
CMD [ "catalina.sh", "run" ]