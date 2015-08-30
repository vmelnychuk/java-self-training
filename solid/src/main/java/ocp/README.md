## Open Close principle
Open to extension, but close to modification

Bertrand Meyer: module can be open to extension and close to modification.

System resists to change, it is rigid.

Easy to add new feature, but source code should not change.

Tools: abstraction and inversion.

Problems:

- main problem
    - need to change main method, can be moved with using dependency injection frameworks
- crystal ball problem
    - it's easy to design abstractions for future changes if you know what future changes is going to be.
    But you haven't this kind of crystal ball.
    - __It only protects you from change if you can predict the future.__

This is difficult to __all__ system that conforms for OCP, but it can be used for class and functions.

Two solution for OCP problems:

- Big design up front (BDUF) (think __really__ hard)
    - consider customer and problem domain, create domain model that anticipate customer need and desires,
    domain model with abstractions that bound and isolate the components, making them open to extension and close for modification,
    caught everything that could possibly change. Abstractions should be bearable.
- agile design
    - pragmatic and reactive. You did simples thing you possibly can, get it out in front of customer as soon as possible
    and customer starts _shoot_ at it with change requests and then you know what change requests they are likely.
    The best predictors of change is past change. If you know what can change you can protect yourself of this kind of change it a future.
    Wait for a customer make a change and then invent the abstraction that will protect you from further occurrence of that change it a future.
    Every week developers deliver new version of software. When customers make changes developers refactor the code by adding the abstractions that make
    that kind of change easy to make in a future. Those, the system becomes open for extension but close for future modification. 

In practise we live somewhere in between of these two extremes, avoid big design up front, but also avoid no design up front.

Iteration-zero: focus on general design and domain, not on features. user stories.

The goal is not completely eliminate the pain of changes, the goal is to minimise the pain of changes.

New features are added by adding new code, as opposed to changing old code.

Conform not fully but well enough.

Moral centre of system architecture.