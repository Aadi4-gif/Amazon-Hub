##### **Learned from-**

**https://www.youtube.com/playlist?list=PLsyeobzWxl7oa1WO9n4cP3OY9nOtUcZIg**





##### **Object Oriented Programming-**



Java is Object oriented programming.



###### **Object:**



def- object is something that knows something or it can do something. In Java, an object is a specific instance of a class that represents a real-world entity with a unique identity, state, and behavior.



It has multiple properties and behaviors.



The object is created from making methods/classes.



###### Class:



def- Class acts as a blueprint for creating the object. Dev creates classes which contains blueprints which is given to the JVM, who creates the object. This class file gets compiled to give byte code which is given to the JVM to create objects.



Class and Objects- a class serves as a logical blueprint or template defining properties (fields) and actions (methods), an object is the tangible runtime entity that holds actual data values.





Key characteristics include:



State: Stored in variables (fields) specific to that object instance.



Behavior: Defined by methods that the object can execute.



Identity: A unique internal identifier used by the JVM to distinguish one object from another, even if they share the same class.





###### **JDK, JRE \& JVM:**



**JDK- Java Development Kit;** Def- The Java Development Kit (JDK) is the foundational software development environment for creating, compiling, debugging, and running Java applications.  It serves as the superset that includes the Java Runtime Environment (JRE) and the Java Virtual Machine (JVM), along with essential development tools such as the javac compiler, jar archiver, and javadoc documentation generator.



**JVM- Java Virtual Machine;** Def- The Java Virtual Machine (JVM) is a virtual machine and core component of the Java Runtime Environment (JRE) that enables computers to execute Java bytecode.  It acts as an interpreter and execution engine between platform-independent bytecode and underlying hardware, facilitating Java’s Write Once, Run Anywhere (WORA) capability.



JVM is a space where the java code will run, this is where you execute the code.



**JRE- Java Runtime Environment;** Def- JRE stands for Java Runtime Environment, a software layer that provides the essential libraries, class loader, and Java Virtual Machine (JVM) required to execute Java applications.  It acts as a platform-independent bridge between Java bytecode and the underlying operating system, allowing programs to run on any device without modification.



JVM is a part of JRE. and JDK have both JRE and JVM.



JDK vs JRE vs JVM-



|Component|Full Name|Primary Purpose|Target Audience|
|-|-|-|-|
|JDK|Java Development Kit|Develop, compile, and debug code|developers|
|JRE|Java Runtime Environment|Run java application|end-users|
|JVM|Java Virtual Machine|execute java bytecode|Runtime System|





###### **Methods:**



Def- A method definition in Java is a block of code within a class that performs a specific task and is executed only when called or invoked.  It serves as a reusable unit of logic, promoting code modularity, reusability, and maintainability by allowing the same code to be used multiple times without duplication.

&#x20;

Method Overloading- It is a concept of having multiple methods with different parameters with same name.



for e.g.

public class Calculator {







&#x20;   public int add(int n1, int n2){

&#x20;       return n1+n2;

&#x20;   }



&#x20;   public int add(int n1, int n2, int n3){

&#x20;       return n1+n2+n3;

&#x20;   }

}





###### **Stack \& Heap:**



Def- In Java, memory management is divided into Stack Memory and Heap Memory, each serving distinct purposes in the Java Virtual Machine (JVM).



Stack Memory is used for method execution and local variables.  It operates on a Last-In-First-Out (LIFO) basis, meaning memory is automatically allocated and deallocated as methods are called and return.  It is thread-specific, faster to access, and has a fixed, smaller size.  If the stack is exhausted (e.g., via deep recursion), a StackOverflowError is thrown.



Heap Memory is used for object storage and instance variables.  It is shared across all threads and is dynamically allocated at runtime using the new keyword.  Unlike the stack, heap memory is not automatically cleared when a method ends; instead, it is managed by the Garbage Collector to reclaim space from unused objects.  It is larger and more flexible but slower to access than the stack. If the heap is exhausted, an OutOfMemoryError occurs.



Inside JVM memory, there is Stack memory which follows LIFO where you store data and Heap memory have open space.



There are local variables and instance variables in system.



The stack will contain Key and value, key is the name of the variable.



Every method will have its own stack. variable which are dedicated to a method is local variable and the variables which are not dedicated to some methods is instance variable.



The objects and instance variable are created inside Heap memory.



The content (objects/instances) of the heap is assigned with an address which are given to the stack which helps the stack to access the method without depending on heap.



The main looks at its stack memory and identifies the object address and access the heap using the address.





###### **Array:**



Def- In Java, an array is a fixed-size, homogeneous data structure that stores elements of the same type in contiguous memory locations.  Because arrays are objects, their length is established upon creation and cannot be changed dynamically, requiring the use of the .length property to determine size rather than a method.



To store multiple values to a variable.



syntax;

empty array with fixed size

int arr\[] = new int\[size];

array with known values

int arr\[] = {1,2,3};



Indexing starts with 0, which is the accessing address for the values of the array.



For updating the values; arr\[1] = 4 which makes {1,4,3}.



.length shows the length of the array i.e. how many spaces there are in the array until it ends. It won't make an out of bound error.



###### **Multi-Dimensional Array:**



Def-  It is a container of multiple arrays i.e. an array containing multiple arrays.



Syntax- datatype arr\[]\[] = new datatype\[i]\[j];.

i- no of arrays in a multi dimensional array.

j- no of elements in each array.



**Indexing:**



||0|1|2|3|
|-|-|-|-|-|
|0|5|2|6|1|
|1|3|2|1|7|
|2|4|8|1|2|



e.g.



5-(0,0)

7-(1,3)



Refer Multi-Dimensional Array-OOPS.





###### **Jagged \& 3D-Array:**



**Jagged:**



Def- In multidimensional array, each array size can be fixed and varying, this varying sized array is called jagged array.



Syntax-



datatype arr\[]\[] = new datatype\[i]\[];

arr\[o] = new int\[3];

arr\[1] = new int\[4];

arr\[2] = new int\[2];

Here specifying separate array sizes.





**Indexing:**



0

|0|1|2|
|-|-|-|
||||

1

|0|1|2|3|
|-|-|-|-|
|||||

2

|0|1|
|-|-|
|||



**3D-Array:**



Def- A 3D array in Java is a collection of 2D arrays, effectively forming a cube of data where each element is accessed using three indices: array\[depth]\[row]\[column].  It is declared using three sets of square brackets, such as int\[]\[]\[] arr = new int\[x]\[y]\[z], where x, y, and z represent the sizes of the respective dimensions.



Syntax- int\[]\[]\[] arr = new int\[x]\[y]\[z];.

here,

x- no of arrays.

y- no of arrays inside this array.

z- values inside that array.



**Indexing:**



e.g. https://kevinsguides.com/wp-content/uploads/2024/06/3d-array.svg



Refer Jagged \& 3D Array-OOPS.





###### **Drawbacks of Array:**



* Array is an object, which takes memory from the heap, where it occupy the space continuously which means once the array size is specified we cannot go back and expand the array. Array is Fixed.
* Every time you search for an element, it traverse through it which takes time.
* It cannot carry multiple datatypes of values.



**Collections exceeds these drawbacks but array have its own use cases.**



**Every time you know a fixed size and to store multiple elements, array comes the first.**



**+// Exception are errors which comes in runtime.**



###### **Array of Objects:**



Def- An array of objects in Java is a fixed-size collection that stores references (pointers) to instances of a specific class, allowing for organized management of multiple related entities.  Unlike arrays of primitives, the array itself holds memory addresses, requiring each element to be explicitly instantiated before use.



While printing the array of objects, If you print the array without specifying in the print statement, it will print the address of the array objects elements, instead specify the parameters as given in the reference.



Refer Array of Objects- OOPS.





###### **Enhanced For Loop:**



Def- The enhanced for loop (also known as the for-each loop in other languages) is a streamlined iteration construct introduced in Java 5 that simplifies traversing arrays and collections without manual index management.  Its syntax is for (Type variable : collection) { ... }, where the variable holds each element sequentially, making code more readable and less prone to off-by-one errors compared to traditional for loops. 



**Key Characteristics:**



Read-Only Iteration: It is ideal for reading elements; modifying the loop variable does not change the original array or collection.



No Index Access: You cannot access the current index or perform backward iteration directly; use a standard for loop if index-based control or modification of elements is required. 



Versatility: It works with arrays, Array List, HashSet, and any object implementing the Iterable interface, including Map. Entry sets.





Refer Enhanced For Loop- OOPS.



















