SOLID Principles:



\- These are a set of rules which you have to follow if you want to maintain a clean architecture in your application.

**-S** - Single Responsibility.

**-O** - Open Closed.

**-L** - Liskov Substitution.

**-I** - Interface Segregation.

**-D** - Dependency Inversion.



Single Responsibility:



Def- a class should have only one reason to change/ a class should have only one responsibility.



\-Creating multiple methods in a single class is bad, which makes the class huge, which makes it difficult to read and understand.

\-It will make harder to debug. Overtime, managing classes becomes difficult where everything is crowded into one place instead of being separate.

\-It will affect the logic of the operations where one method produce an error and the dev starts to rectify it makes it difficult to debug as it affects the entire class.

\-Unit tests maintenance (process of updating, refactoring, and pruning automated test suites to ensure they remain accurate, efficient, and aligned with evolving production code) will be difficult.



How to implement SRP:

&#x20;Create separate classes for sections(for eg: OrderServices, NotificationServices, BillingServices etc..)

Each class can have its related methods which can help structured system. all the methods of other classes should not be in a single class(for eg orderservice containing methods of notification services, billing services etc...)





Open Closed Principle:



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



How to implement ORP:

Separate functionality class should be created as extensions which can be accessed by using "implements".

Make the functionality interface; and make each logic separate class which make every class independent which cannot be broken and can be accessed by using "implements" which overrides the processpayment() function.

if the change in the process of the method, it can be modified whereas you should not create a new method or functionality inside another method.

refer OrderService OCP folder.





Design Patterns- Design Patterns are proven solutions to commonly occurring software design problems.



\- It helps the structure to make the code; Maintainable, Scalable, Reusable, Flexible.

\- These are not Frameworks, Libraries, Code-Snippets but they are Standardized solutions, best practices, proven solutions.

\- They are used to provide cleaner and smarter codes.



(YOU WILL STOP WRITING CODES INSTEAD YOU WILL WRITE SYSTEMS)



Types of Design Patterns:



Creational - These patterns deal with object creation mechanisms. How objects should be created in an efficient and flexible ways.

Patterns- Factory, Abstract Factory, Singleton, Builder, Prototype.



Structural - These pattern focus on how classes and objects are organized and related to each other. They help us structure our codes in flexible and maintainable ways.

Patterns- Adapter, Decorator, Proxy.

These patterns are used in enterprises applications and spring frameworks.



Behavioral - These patterns focus on communication between objects. This shows how objects react with each other and shows responsibilities.

Patterns- Observer, Strategy, Chain of Responsibility.

They are used in loosely coupled and highly extensible applications.

