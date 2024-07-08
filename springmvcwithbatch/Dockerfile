FROM tomcat:9.0.89-jre8
RUN rm -rf /usr/local/tomcat/webapps/*
COPY /target/springmvcwithbatch.war /usr/local/tomcat/webapps/springmvcwithbatch.war
#COPY /src/hibernatedemowarfile.war /usr/local/tomcat/webapps/hibernatedemowarfile.war
#COPY /target/mvc.war /usr/local/tomcat/webapps/mvc.war
#COPY server.xml /usr/local/tomcat/conf/server.xml
EXPOSE 90
CMD [ "catalina.sh", "run" ]