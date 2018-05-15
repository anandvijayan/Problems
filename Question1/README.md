#Question 1

## This program fails to compile
1. Run maven build. Complete output <a href='outputs/Q1Errors.log'>here</a>
<pre>
mvn clean install exec:java -Dexec.mainClass=com.sabre.intvw.GlobalMembers
...
...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.935 s
[INFO] Finished at: 2018-05-14T22:20:00-07:00
[INFO] Final Memory: 15M/165M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project ProbJava: Compilation failure: Compilation failure:
[ERROR] /C:/Users/NISHANAND/Documents/GitHub/Problems/Question1/src/main/java/com/sabre/intvw/C.java:[19,45] cannot find symbol
[ERROR] symbol:   method close()
[ERROR] location: variable name of type java.lang.String
[ERROR] /C:/Users/NISHANAND/Documents/GitHub/Problems/Question1/src/main/java/com/sabre/intvw/B.java:[28,27] foo() in com.sabre.intvw.B cannot override foo() in com.sabre.intvw.A
[ERROR] overridden method is final
[ERROR] /C:/Users/NISHANAND/Documents/GitHub/Problems/Question1/src/main/java/com/sabre/intvw/B.java:[34,27] close() in com.sabre.intvw.B cannot override close() in com.sabre.intvw.A
[ERROR] overridden method is final
[ERROR] /C:/Users/NISHANAND/Documents/GitHub/Problems/Question1/src/main/java/com/sabre/intvw/GlobalMembers.java:[33,28] constructor C in class com.sabre.intvw.C cannot be applied to given types;
[ERROR] required: no arguments
[ERROR] found: com.sabre.intvw.C
[ERROR] reason: actual and formal argument lists differ in length
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

Process finished with exit code 1

</pre>

## After compilation errors were fixed, the program ran successfully. Full output <a href='outputs/Q1Success.log'>here</a>
<pre>
mvn clean install exec:java -Dexec.mainClass=com.sabre.intvw.GlobalMembers
...
...


Problem part A
name is: Geremy
name is: Geremy
name is: Geremy
Problem part B
foo. B
B destructed
A destructed
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.835 s
[INFO] Finished at: 2018-05-14T22:32:13-07:00
[INFO] Final Memory: 18M/163M
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0

</pre>