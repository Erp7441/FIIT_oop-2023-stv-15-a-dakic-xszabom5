Aspect-Oriented Software Development 2018/19

RangeControl 3

There are two lines you can follow in this example. One is the meaning of a pointcut, which is targeted by the PointMonitor aspect. There you can see how pointcuts can be used to collect all join points of a specific kind (and even only one particular join point), but also how they can collect join points in a lexical context (such as those occurring in a specific class or that take an argument of a certain type) or in an execution context (such as an object being executed or control flow). PointMonitor also features some compound pointcuts for avoiding infinite recursion in cases when an aspect advises the join points it adds.

The other line is targeted by the RangeControl aspect. It demonstrates the use of the within() and cflow() pointcuts to narrow the scope of the call() pointcut. However, this aspect also demonstrates pointcut fragility. Look at how the within() pointcut fails to survive adding yet another level of indirection (the within() pointcut version combined with case 3 in the Shape class).

