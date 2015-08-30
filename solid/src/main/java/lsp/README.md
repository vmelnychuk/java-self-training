## Liskov substitution principle

inheritance, polymorphism, subtyping

We don't care about type, by we care about what type can do, type's operation and functions.
Type is bag of operations (set of operations). Class is bunch of methods.

Point <|-- DescribedPoint
DP can be used as point, but point can't be used as DP.
__can be used as__ usability define relationship, subtype relationship

1988 by Barbara Liskov

__subtypes can be used as parent types__

U uses T
S is subtype of T
U can use S without knowing

    +-------+      +-------+
    |       |      |       |
    |   U   +----->|   T   |
    |       |      |       |
    +-------+      +---+---+
                       #    
                       |    
                       |    
                   +---+---+
                   |       |
                   |   S   |
                   |       |
                   +-------+

 - Association >
 - Inheritance #

If object can respond for message then the method will be invoked, otherwise runtime error occurs.
As long as two objects respont to the same method, they can be used polymorphically, so no inheritance is needed.

Substitutable for it's parents.


### Violation
- Subclass can throws exception that client of base class does not expect.
- Subclass cause side effect that user of base class doesn't expect.
- Refused bequest.

Example:

    +------------+       +-------------+
    |            |       |             |
    |  Program   +------->  Rectangle  |
    |            |       |             |
    +------------+       +-------------+
                                #       
                                |       
                                |       
                          +-----+----+  
                          |          |  
                          |  Square  |  
                          |          |  
                          +----------+  

Square should behaves as Rectangle, but when we call setWidth, setHeight is called too.
This brings as to undefined behaviour. (If function does something that you don't expect, it is undefined behaviour)
Hard to debug, do unwanted operations.

rect instanceof Square

refused bequest

Principle of Representatives

Object Rectangle is represents rectangle abstraction, but it is not physical rectangle, it is just piece of code.

__Representatives rule:__
they are not share the relationship of things that they represent.
Two divorced people have two lawyers that represent them, but it doesn't mean that lawyers are divorced, they don't share relationships.

Complex <|-- Real <|-- Integer
every complex number holt 2 real numbers

Every class represents object from real world.
It's not a pipe.

If S is subtype of T, list of T's can't be substitute as list of S
Circle extends Shape
void f(List<Shape> l) { ... }
f(List<Circle>) // wrong!
f may adds Square to list of Circles

## Patterns:
 - Composite
 - Visitor
 - Adapter

## Possible indicators of LSP violation
- general function __void f() {}__
    - Derived class with __void f() {}__ and it was implemented in base class
- derived class __throws exception__
- if __instanceof__ statement
    - case when check the type of instance it OK: you are allowed to check the type instance if you already know what type it is.
    if the compiler has forgotten it: when we get subclass form collection of base classes by index and do the cast or throw exception
- typecases: else if __instanceof__
    - should be replaced with polymorphic dispatch
     

Subclass do the same operation in same as superclass do it with same expectation from the caller.
Expected behaviour, subtype can di more, but it never do less

## Design by contract
invariant, pre-conditions, post-conditions
DC --> TDD
