# Kata Project

This repo contains the basic files you need to build your Java code on 
Linux/Mac/Windows using a Gradle. If you don't know what Gradle is, it is 
basically a way to build your code on Linux/Mac/Windows easily. 

## How to run tests through command line in Linux/Mac/Windows with Gradle

1. Make sure you have java version 1.8. To check open up a new 
   terminal and type:
   ```  
   prompt> java -version
   ```  
   If you don't have any of the above, install java 1.8 by going [
   here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). 
   After installing java 1.8 open up a new terminal to check if java 1.8 is 
   installed by retyping `java -version` in the terminal.

2. To run all tests in the Linux or Mac terminal type: 
   ```
   prompt/kata> ./gradlew clean # cleans old compiled code
   prompt/kata> ./gradlew test
   ```

3. To run all tests in the Windows command prompt type:
   ```
   prompt/kata> gradlew.bat clean 
   prompt/kata> gradlew.bat test
   ```