## Single responsibility principle
There is only one reason to change class.

The best modules have just one responsibility.
It's about user that will request for changes for class. Responsibility of classes and function to their users.
Responsibility as source of change. Separate users and their roles, actors.
Actors:

- policy
- architecture
- operations

Values of software:

- save money
- make money

Values:

- primary
    - ability to tolerate and facilitate outgoing change, that is difference between soft and hard wares
    - keep it flexible
- secondary
    - behaviour of software
    - current soft meets current needs of current user
    - current needs change frequently

If it is easy software to change it is good for business and if it is hard softwatr to change it is bad for business.
Share and structure that is easy to change. Collocation is Coupling.

Gather together things that have same reasons to change and separate things that have different reasons to change.
Separate to different files, or functions, or inner classes.

Invert dependencies.
Facade.
Interface segregation.

Perfect solutions are for mathematicians and fiction writes, manage mutual exclusive forces.
Couple and easy to define function and decouple and hard to define functions. Balance the forces without resolving them completely.
Engineering is about trade-off.

Employee:

+ CalculatePay // lawyer, managers, accountants
+ Save // DBs
+ DescribeEmployee //reports
