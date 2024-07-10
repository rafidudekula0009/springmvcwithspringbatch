FROM tomcat:9.0.89-jre8
RUN rm -rf /usr/local/tomcat/webapps/*
COPY /target/parent.war /usr/local/tomcat/webapps/parent.war
COPY /target/child.war /usr/local/tomcat/webapps/child.war
EXPOSE 90
CMD [ "catalina.sh", "run" ]