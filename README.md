# billing-inquiry
## Application which exposes web services.

Let's take into account that Maven and Git will be needed as well as Java 8.
First, we need to add the sql-driver jar file to our Maven local repository. Please execute the ./settings/addSqlServerDriver.bat file. 

In order to compile and run the application, please:

1. Clone the project using https://github.com/Marco-Jojojo/billing-inquiry.git
2. Once the code is downloaded, execute:
    mvn clean package
    This will create the jar file.
3. This jar file can be executed with one of the following commands:
    1. java -jar BillingInquiry-1.0-SNAPSHOT.jar
    2. mvn spring-boot:run
    3. Directly from the IDE
4. The application will be exposed in http://localhost:8080/