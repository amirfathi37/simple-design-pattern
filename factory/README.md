# Factory Design Pattern - Simple Project

## Project Description

This project is a simple demonstration of the Factory design pattern. The Factory pattern is a creational design pattern used to create objects without specifying the exact class of the object that will be created. It provides an interface for creating objects, but the subclasses decide which class to instantiate.


## Factory Design Pattern

### Intent

The intent of the Factory design pattern is to create objects without exposing the instantiation logic to the client. It provides an abstraction to create objects, allowing subclasses to decide which class to instantiate.

### Advantages

1. **Encapsulation:** The Factory pattern encapsulates the object creation logic, providing a clean separation between object creation and object usage.

2. **Flexibility:** By delegating the responsibility of object creation to subclasses, the Factory pattern allows for easy addition or modification of new types of objects without changing the client code.

3. **Decoupling:** The client code is decoupled from the specific classes of objects being created, promoting loose coupling between classes.

### Disadvantages

1. **Complexity for Small Projects:** For small projects with a limited number of classes and object types, using a Factory pattern might introduce unnecessary complexity.

2. **Creation of Complex Factories:** As the number of object types increases, the Factory class might become complex, leading to maintenance challenges.
