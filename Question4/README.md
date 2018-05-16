# Question 4

## This program adds books to a shopping cart, performs checkout and schdedules delivery
1. Run maven build to compile and run junit tests. Complete output <a href='outputs/Q4Success.log'>here</a>
<pre>
mvn clean install
...
...


-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.sabre.intvw.test.ShoppingCartTest
Checking out book started...
Checking out book done...
Scheduling the shipping of book:Read book: To Kill a Mocking Bird
Checking out book started...
Checking out book done...
Scheduling the shipping of book:Read book: Go set a watchmen
Schdeuled for Tue May 15 23:40:50 MST 2018
Checking out book started...
Checking out book done...
Scheduling the shipping of book:Read book: The Firm
Schdeuled for Wed May 16 23:41:10 MST 2018
Checking out book started...
Checking out book done...
Scheduling the shipping of book:Read book: The Painted House
Schdeuled for Wed May 23 23:41:10 MST 2018
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 40.097 sec
Running com.sabre.intvw.test.StringHelpersTest
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ ShoppingCart ---
[INFO] Building jar: C:\Users\NISHANAND\Documents\GitHub\Problems\Question4\target\ShoppingCart-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ ShoppingCart ---
[INFO] Installing C:\Users\NISHANAND\Documents\GitHub\Problems\Question4\target\ShoppingCart-1.0-SNAPSHOT.jar to C:\Users\NISHANAND\.m2\repository\com\sabre\intvw\ShoppingCart\1.0-SNAPSHOT\ShoppingCart-1.0-SNAPSHOT.jar
[INFO] Installing C:\Users\NISHANAND\Documents\GitHub\Problems\Question4\pom.xml to C:\Users\NISHANAND\.m2\repository\com\sabre\intvw\ShoppingCart\1.0-SNAPSHOT\ShoppingCart-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 43.482 s
[INFO] Finished at: 2018-05-15T23:41:30-07:00
[INFO] Final Memory: 18M/205M
[INFO] ------------------------------------------------------------------------
Disconnected from the target VM, address: '127.0.0.1:57793', transport: 'socket'

Process finished with exit code 0


</pre>
