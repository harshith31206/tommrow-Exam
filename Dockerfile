
FROM tomcat:9.0



COPY target/exam.war /usr/local/tomcat/webapps/exam.war



EXPOSE 8080



CMD ["catalina.sh", "run"]

