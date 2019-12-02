# OOP Design Patterns

### Introduction
Software patterns are industry standard "best practice" templates for solving frequently occurring problems.

They fall into 3 categories:

**Creational**: Design patterns for instantiating objects.

**Structural**: Design patterns focused on easing design by examining how classes inherit and how they can be composed with other classes, by examining their relationships.

**Behavioural**: Design patterns for handling interaction between objects.

### Creational Design Patterns

##### Singleton
This pattern ensures that only a single instance of a class is ever instantiated during an application's runtime.

##### Factory
This pattern is used when a method needs to return an instance of one of several sub-classes that all share the same super class, but we do not know ahead of time which sub class (for example, this could be determined by user input).

##### Prototype
This pattern is used when creating an object that is costly in terms of time or computing resources, for example instantiating an object with a large amount of data from a database.

Objects are designed to be cloneable, so that a required object can be cloned from one that already exists, which can save significant time and computing resources.

It is typically used when we need to perform multiple different operations on the same object.

### Structural Design Patterns

#### Adapter
The adapter pattern is designed to allow objects with incompatible interfaces to collaborate.

With the object adapter pattern, we implement a class that bridges the difference between an expected interface and an existing class. *(Note: Interface is the collection of all the methods that an object has)*
