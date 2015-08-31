## Interface segregation principle

Don't depend on things that you don't need.

The interface name is more about users than implementers.
Interfaces deal more with classes that use them than classes that implement them.

Interface syntax is appeared for solve multiple inheritance problem, to avoid "deadly diamond of death".

               +--------------+             
               |              |             
               |      B       |             
               +--------------+             
               |              |             
               | - v          |             
               |              |             
               +----+-----+---+             
                    ^     ^                 
                    |     |                 
          +---------+     +----------+      
          |                          |      
          |                          |      
    +-----+----+               +-----+-----+
    |          |               |           |
    |   D1     |               |    D2     |
    |          |               |           |
    +----+-----+               +----+------+
         ^                          ^       
         +----------+    +----------+       
                    |    |                  
                 +--+----+----+             
                 |            |             
                 |     M      |             
                 |            |             
                 +------------+           
How many v variables is in M: a) one that goes from B b) two that go from D1 and D2?

### Fat classes
Classes that have a lot of methods. One class have a lot of subsystems and subsystems have a lot of data.
All data should manage in one place. Fat class brings coupling.

Interfaces coupled to classes that call them, not to the classes that implement them. 