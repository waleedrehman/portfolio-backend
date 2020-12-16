# Readme | Portfolio-Backend | waleedrehman.co.uk
This is a java web service which will be used to fetch the data from databas and return the data to portfolio-ui to render. This will be accessibile from portfolio-backend.waleedrehman.co.uk

# applications.properties | Resources folder
In order for this application to work there are a few properties we need to pass to the application such as the connection details to the database and the email credentials to be used by sendEmail. The template of these configurations are listed bellow:

spring.jpa.hibernate.ddl-auto=update
spring.main.banner-mode=off
logging.level.org.springframework=ERROR
spring.datasource.url=jdbc:mysql://{ServerHost}:{Port}/{DBName}
spring.datasource.username={UserName}
spring.datasource.password={Password}

spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.jpa.show-sql=false

#For mail server
logging.level.org.springframework.mail=DEBUG

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username={Email Address for Gmail}
spring.mail.password={Encrypted key for gmail or password for gmail}

# Other properties
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.connectiontimeout=5000
spring.mail.properties.mail.smtp.timeout=5000
spring.mail.properties.mail.smtp.writetimeout=5000

# TLS , port 587
spring.mail.properties.mail.smtp.starttls.enable=true

# SSL, post 465
#spring.mail.properties.mail.smtp.socketFactory.port = 465
#spring.mail.properties.mail.smtp.socketFactory.class = javax.net.ssl.SSLSocketFactory

# References
# https://www.mkyong.com/java/javamail-api-sending-email-via-gmail-smtp-example/


