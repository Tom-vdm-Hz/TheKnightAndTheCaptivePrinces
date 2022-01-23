# TheKnightAndTheCaptivePrincess
You are A knight fighting to save a princess, but you come across an obstacle


## Design patterns
When making code you always come across problems, to fix the most common issues we can use design patterns. Design patterns are like blueprints we can apply to our code so we can improve the readability and structure of our code. There are a lot of different design patterns, each with a specific problem they fix.

For this project we chose three design patterns, we used the site [refactoring guru](https://refactoring.guru/) for most of our information on the patterns we used.

### Abstract factory
With an abstract factory you can create multiple objects using an interface that creates families of connected classes. The abstract factory can create multiple similar objects, this makes it easy to add more objects without having to repeat code. 

In this project we used it to create the multiple characters as they had similar features getting hit, blocking attacks, and attacking. Some factories had specific things that only one character had, like the dragon has a random element and age for each round. We also applied an option so the player can choose a weapon by creating a scanner that can detect the input from the user. 

### Bridge
The bridge is mainly used to split up large classes into 2 hierarchies. With a bridge you can prevent having to create many subclasses for each object, this makes it easier to add new objects.

We used the bridge for the different persons in the project. We chose the bridge as we had to make three different persons that all shared some similar features, for example all of them has a name, age, and health but only the knight uses weapons and armour.

### Observer
With an observer you can notify multiple objects when something happens to the object they are observing. With an observer you can make an object check another to see if it had changed in any meaningful way, and if that is the case it does a specified action.

In our application the Game class implements an observer, but with only one subscriber, instead of mutiple. This lonely subriber is the Story class, and the update method is used as the publish. It looks at what the story does and outputs after that it updates it accordanly.



### State
With a state pattern you can change the state of a class as it changes internally. 



## Contributions
We decided to divide the three different types of design patterns but because there are only three of them, we had to do some compensations. Seeing that we also had to make a form of documentation in the README we decided to include that in the tasks so one would do two types design patterns and the other would do the remaining design pattern and makes the README so that we both had a somewhat equal amount of work. 
### Tom
Tom made two types of design patterns, the Structural and the Behavioural patterns. 
- Design Pattern: Bridge
- Design Pattern: Observer
- Design Pattern: State

### Stefan
Stefan made one type of design pattern and made the README. 
- Design Pattern: abstract factory
- Scanner
- Explanation
