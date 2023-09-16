FROM tomcat
COPY BasicWebApp/target/BasicWebApp.war /usr/local/tomcat/webapps
EXPOSE 8080:80
CMD ["catalina.sh","run"]
