#Template Method pattern

Template Method 
=
- Define the skeleton of an algorithm in an operation deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.


OO principle
=
"Don't call us, we'll call you" (The Hollywood principle)

This principle preventing "dependency rot". Dependency rot happens when you have high-level components, depending on low-level components
depending on high level components, depending on sideways components depending on low-level components, and so on, so on.
When rot sets in, no one can easly understand the way a system is designed.

With the Hollywood principle, we allow low-level components to how themselves into a system, but the high-level components
determine when they are needed, and how.
In other words, the high-level components give the low-level components a "do not call us, we will call you" treatment. 
Other patterns full-fill this principle:
Observer, Factory Method