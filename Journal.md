# Journal
Write your Journal questions and notes here.

Phase 1-
This step outlines the base class and the template method that will be used. This completes the principle by not having the logic inside the concrete implementations called by main, when they are instanced they main loop will call the template to preform the action.This template will call the concrete class's implementation of the methods called by the template.

Phase 2-
I feel like the flow is more top down that you would normal have with inheritance the magic is mostly happening on the abstract class insted of the sub-class. When the generate is called, it is calling the other 3 methods in order, which could all be implemnetations on the sub-class side by this main method is being run within the super class. I don't feel it is tricky, if I had to plan this from sctratch I can see how it might be alittle confusing which part is delgated to the base class and what part is sub, but it's pretty clear here.

Phase 3-
I can see how adding a boolean check like this you can make it to where parts of the template methods logic can be made to fire or not depending on the sub-class implementation. I think this seems more useful after tools like this to make parts of the method able to be switched on and off.

Phase 4-
testing came back clear. I was thinking about making things more dynamic through injecting values into the methods. With having hooks that return values these values can be set on a per sub-class basis and I think thats pretty cool. It definetely gives more power to the pattern.
