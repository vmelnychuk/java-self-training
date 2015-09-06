## Dependency inversion principle

Types of dependencies:

- Runtime
- Source code

Problem: __source code__ dependencies _mimic_ __runtime__ dependencies. High-level functions call low level function.

Solution: use polymorphism.

Inversion for source code dependencies, in different direction of runtime.

    Before                              After
    +---------+        +--------+       +--------+       +----<I>-+
    |         |        |        |       |        |  use  |        |
    |    A    +-------->    B   |       |   A    +------->   IB   |
    |         |        |        |       |        |       |        |
    |         |        | +f()   |       |        |       | +f()   |
    +---------+        +--------+       +--------+       +----#---+
                                                              |    
                                                              | implement
                                                         +----+---+
                                                         |        |
                                                         |   B    |
                                                         |        |
                                                         | +f()   |
                                                         +--------+

A has run-time dependency on B, but no compile-time dependency on B. B and A have source code dependencies on Interface IB.
 Opposite direction of source dependency of B. Plugin architecture.

High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend upon details. Details should depend upon abstractions.