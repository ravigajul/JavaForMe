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
## Stack & Heap
The stack is a portion of memory that is used for storing local variables, function arguments, and return addresses. It operates in a Last-In-First-Out (LIFO) manner, which means that the last item pushed onto the stack is the first item to be popped off. The stack is typically a fixed size and is allocated when a program is started.

The heap, on the other hand, is a portion of memory that is used for dynamically allocated memory. This means that memory is allocated and deallocated as needed at runtime, and is not pre-allocated like the stack. The heap is typically a larger area of memory and is managed by the operating system or programming language runtime.

In summary, the stack is used for static memory allocation, while the heap is used for dynamic memory allocation.
 
 ## order of precedence
 PEMDAS - Please Excuse My Dear Aunt Sally!  
 P: Paranthesis  
 E: Exponent  
 M: Multiplication & Division (*, / , %) left to right   
 D: Division  
 A: Addition  & Subtraction (+ , -) left to right  
 S: Subtraction  

 ## Expression Evaluation with different data types
In Java, when an expression contains different data types, the Java compiler applies certain rules to determine the resulting data type of the expression. This is known as type conversion or type promotion.The type hierarchy in Java is as follows, from smallest to largest:  
byte -> short -> int -> long -> float -> double  
we can remember this with the pnemonic device  "Bees Shouldn't Intimidate Lazy Fat Dogs"  
