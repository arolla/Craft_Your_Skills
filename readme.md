# Craft Your Skills #

This reposittory contains materials used to run [Craft your skills meetup](http://www.meetup.com/Craft-your-Skills/).

If you came here, you probably want to learn and pratice some TDD, Clean Code, Legacy Code Refactoring, etc.

This repository is a work in progress that follows and try to keep up with needs of participants.
So you can either raise an issue on github and/or come to the meetup if you see, want or need an improvement.

Actually, you will find most common exercices that you will choose according to your objectives.
This repository contains subjects of exercices, but does not contains clues on the methodologies, tips and tricks : come to the meetup to get them !

TDD is our way to write code. If you don't know it, you'll to learn it before moving to other subjects.

If you are brand new to TDD, you should start with FooBarQix.

## Knowing TDD ##
To get up to speed with TDD, you will need to practice it on several kind of code :
Roman Numeral is about data transformation as you have to convert arabic number to roman numerals.
Bowling Game is about information processing as you have to calculate a score from each points you made on each rolls.
Game Of Life is about data structure as you have to explore and process state of a board game (a 2-dimensionnal array). 
Many others exists as you may see on [cyber-dojo](http://cyber-dojo.org/setup/show_exercises/?language=Java&test=JUnit).

## Knowing Clean Code ##
Clean Code is a permanent concern and every time you write a code to provide a functionnality, You'll have to make it work, make it clean and make it fast if need be. Making a code work is not the end. It shall be considered a draft and you should reshape it by all due respect to your peers to make it clean. By clean, we mean easy to read and maintain.

## Knowing Legacy Code Refactoring ##
There several steps towards refactoring existing code :
You will first need to make the class testable first, then test it by approval or by behavior in second, now you can rename and manipulate code to make understandalbe, then you may transfrom it to make it SOLID.
Trip Service is about cutting dependencies so the class become testable.
Gilded Rose is about testing legacy code by approval and by behavior. You will then be able to refactor it toward clean code. So you may have two objective for this exercise : How to cover code with test and/or how to move code around so it will be easyer to read (a big part of "make it clean").
Tennis Game is about implementing a fourth time a scoring tool and compare it with other weird implementation so you can enforce your tatse on clean code.

## Knowing BDD and double loop of outside-in TDD ##
Correctly sized exercises have yet to be found or defined.

## Knowing SOLID principles ~~by heart~~, by code ##
Here are theses SOLID principles :
- SRP : Single Responsibility
- OCP : Open Closed
- LSP : Liskov Substitution
- ISP : Iterface Segregation
- DIP : Dependency Inversion
This part is under construction as SOLID are architectural concern. They touch the way classes collaborate together, so you wil try code for several classes and related exercices are either too long for meetup or does not cover much on the topic.
Tire Pressure Monitor is small enougth and will give you a taste.
Birthday greetings card is intermediate in syze and show a start of a SOLID architecture aka Hexagonal.
EShopping's Customer is yet to be defined as a kata.

