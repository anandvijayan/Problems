# Question 2

## This program reverses a given string
1. Run maven build to compile and run junit tests. Complete output <a href='outputs/Q2Success.log'>here</a>
<pre>
mvn clean install exec:java -Dexec.mainClass=com.sabre.intvw.Reverse -Dexec.args=This
...
...

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.sabre.intvw.test.ReverseTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.093 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ StringRev ---
[INFO] Building jar: C:\Users\NISHANAND\Documents\GitHub\Problems\Question2\target\StringRev-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ StringRev ---
[INFO] Installing C:\Users\NISHANAND\Documents\GitHub\Problems\Question2\target\StringRev-1.0-SNAPSHOT.jar to C:\Users\NISHANAND\.m2\repository\com\sabre\intvw\StringRev\1.0-SNAPSHOT\StringRev-1.0-SNAPSHOT.jar
[INFO] Installing C:\Users\NISHANAND\Documents\GitHub\Problems\Question2\pom.xml to C:\Users\NISHANAND\.m2\repository\com\sabre\intvw\StringRev\1.0-SNAPSHOT\StringRev-1.0-SNAPSHOT.pom
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ StringRev ---
Input String:This
Output String:sihT
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.623 s
[INFO] Finished at: 2018-05-14T23:15:53-07:00
[INFO] Final Memory: 19M/156M
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0

</pre>
