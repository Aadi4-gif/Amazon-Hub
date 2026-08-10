### **SOLID Principles:**



\- These are a set of rules which you have to follow if you want to maintain a clean architecture in your application.

**-S** - Single Responsibility.

**-O** - Open Closed.

**-L** - Liskov Substitution.

**-I** - Interface Segregation.

**-D** - Dependency Inversion.



##### **Single Responsibility:**



Def- a class should have only one reason to change/ a class should have only one responsibility.



\-Creating multiple methods in a single class is bad, which makes the class huge, which makes it difficult to read and understand.

\-It will make harder to debug. Overtime, managing classes becomes difficult where everything is crowded into one place instead of being separate.

\-It will affect the logic of the operations where one method produce an error and the dev starts to rectify it makes it difficult to debug as it affects the entire class.

\-Unit tests maintenance (process of updating, refactoring, and pruning automated test suites to ensure they remain accurate, efficient, and aligned with evolving production code) will be difficult.



###### **How to implement SRP:**

&#x20;Create separate classes for sections(for eg: OrderServices, NotificationServices, BillingServices etc..)

Each class can have its related methods which can help structured system. all the methods of other classes should not be in a single class(for eg orderservice containing methods of notification services, billing services etc...)





##### **Open Closed Principle:**



Def- Code should be open for extension, but closed for modification. i.e, one should be able to add new functionality without changing the already tested and existing code.



\-Because in real industries project modifying again \& again is risky. A small change can unintentionally break something which is working perfectly before.

\-Functionality should not be modified each time whenever the workflow needs a new functions.



\-public class PaymentService{

&#x20;   public void processPayments(String type){

&#x20;       if(type.equals("UPI")){

&#x20;           System.out.println("Processing UPI Payment");

&#x20;       }

&#x20;       if else(type.equals("Credit Card")){

&#x20;           System.out.println("Processing Credit Card Payment");

&#x20;       }

&#x20;       if else(type.equals("Net Banking")){

&#x20;           System.out.println("Processing Net Banking Payment");

&#x20;       }

&#x20;   }

}

WRONG IMPLEMENTATION!!!!



###### **How to implement ORP:**



Separate functionality class should be created as extensions which can be accessed by using "implements".

Make the functionality interface; and make each logic separate class which make every class independent which cannot be broken and can be accessed by using "implements" which overrides the processpayment() function.

if the change in the process of the method, it can be modified whereas you should not create a new method or functionality inside another method.

refer OrderService OCP folder.





##### **Liskov Substitution Principle:**



Def- If a child class extends a parent class, then we should be able to replace the parent object with the child object without breaking the application behavior.(Inheritance already tells us that the child object can be treated as a parent object)



###### **Understanding eg:**



\-Suppose we have a parent interface which contains two methods P1 and P2. Now we

create child one and child 2 classes which implement this parent interface. So automatically child one and child 2will have P1 and P2 inherited from the parent. And maybe they can have their own extra methods like C1 and C2. So that is not a problem. Now suppose we have another class let's call it client which contains a method that accepts parent as a parameter and using this it calls P1 and P2. So Liskov says that instead of passing a parent object here we should also be able to pass the child object without breaking the code. Now if we pass child one or child 2, they will also be able to call P1 and P2 because they have inherited those. So everything works fine.



###### **Why do we need LSP when we have inheritance?**



\-Even though inheritance allows substitution, there are certain scenarios where substituting the child object actually breaks the expected behavior of the program.

\-A child class should implement its parents method and it can have its own methods.



###### **How breaks LSP:**



If a child class implements methods from the parent interface where the child class don't want one of the methods, if you throw an exception it breaks the LSP where the child class should always accept the parents interface methods.



###### **How to implement LSP:**



Create another parent interface with methods only the child class needs. So instead of using the parent interface with methos a the child class don't wants, use the parent interface supports the child class.



**For having two parent interfaces with identical methods, remove the identical method from the interface which copies the other interface and make it a child interface using the "extends" keyword to make the interface access the method from the parent interface.**





##### **Interface Segregation Principle:**



Def- A class should not be forced to implement methods which it does not use. i.e, Instead of creating one large interface, we should create smaller and more specific interfaces. 



**It is similar to LSP!**



###### **How breaks:**



When a class have methods which it doesn't implements some methods of the parent interface, it will break the ISP.



###### **How to implement ISP:**



Create separate Interfaces for specific methods where the class can implement the required interface for its workflow.



**Refer Employee ISP!**



##### **Difference b/w ISP \& LSP:**



|**ISP** |**LSP**|
|-|-|
|A class should not be forced to implement a method that it does not want to.|A parent object can be replaced by a child object without breaking the code.|



**So if there a class where it have the methods which is not forced to implement; which follows ISP, Instead the class has a limit where it breaks (by breaking the code) the parent interface's methods it will break LSP.**





##### **Dependency Inversion Principle:**



def- High-level modules should not depend on low-level modules. Both should depend on abstractions. i.e, Instead of one class directly depending on another concrete class, we should depend on interfaces.



###### **Why?**



That creates loose coupling! Loosely coupled code is easier to maintain, easier to scale, and easier to modify in the future.



###### **Breaks DIP:**



when you implement hard coupling.



### **Design Patterns:**



\-Design Patterns are proven solutions to commonly occurring software design problems.



\- It helps the structure to make the code; Maintainable, Scalable, Reusable, Flexible.

\- These are not Frameworks, Libraries, Code-Snippets but they are Standardized solutions, best practices, proven solutions.

\- They are used to provide cleaner and smarter codes.



(YOU WILL STOP WRITING CODES INSTEAD YOU WILL WRITE SYSTEMS)



##### **Types of Design Patterns:**



###### **Creational**



\-These patterns deal with object creation mechanisms. How objects should be created in an efficient and flexible ways.

Patterns- Factory, Abstract Factory, Singleton, Builder, Prototype.



###### **Structural**



\-These pattern focus on how classes and objects are organized and related to each other. They help us structure our codes in flexible and maintainable ways.

Patterns- Adapter, Decorator, Proxy.

These patterns are used in enterprises applications and spring frameworks.



###### **Behavioral**



\-These patterns focus on communication between objects. This shows how objects react with each other and shows responsibilities.

Patterns- Observer, Strategy, Chain of Responsibility.

They are used in loosely coupled and highly extensible applications.

