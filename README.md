# JavaForMe
## Download JDK
 https://www.oracle.com/in/java/technologies/downloads/#jdk20-windows

## Environment Variables
JAVA_HOME=C:\Program Files\Java\jdk<version>

For example, if you have installed JDK 16, you would set JAVA_HOME to C:\Program Files\Java\jdk-16.

PATH= %JAVA_HOME%\bin

Once you have set the JAVA_HOME environment variable, you should also add the bin directory of the JDK to your system's PATH environment variable. This allows you to run Java command-line tools such as java, javac, and jar from anywhere in the command line. 

 ## Reading from Keyboard
 In Java, you can read data from the keyboard using the Scanner class, which is part of the java.util package. The Scanner class provides methods to read different types of input from the keyboard, including integers, floating-point numbers, strings, and more.

Here is an example of how to use the Scanner class to read a string from the keyboard:
 ```java
 import java.util.Scanner;

public class ReadStringFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        scanner.close();
    }
}
```
