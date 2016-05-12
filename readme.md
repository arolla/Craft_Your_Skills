# Craft Your Skills #

This reposittory contains materials used to run [Craft your skills meetup](http://www.meetup.com/Craft-your-Skills/).

If you came here, you probably want to learn and practice some TDD, Clean Code, Legacy Code Refactoring, or animate an exercise, etc.

This repository will always be a work in progress that follows and try to keep up with needs of participants.
So you can either raise an issue on github and/or come to the meetup if you want or need an improvement.

Actually, you will find most common exercises that you will choose according to your objectives.
This repository contains subjects of exercises, but does not contains clues on the methodologies, tips and tricks : come to the meetup to get them !

TDD and "Clean Code" are our way to write code. If you don't know them, you'll to learn it before moving to other subjects.
So if you are brand new to TDD, you should start with FooBarQix.

## Custom content ##
The meetup is often "hacked" by one or two pairs who work on a kata and/or a language they bring.
If you also want want something specific, ask for it. 
If you find a pair, do it.

## Learning TDD ##
To get up to speed with TDD, you will need to practice it on several kind of code :
Roman Numeral is about data transformation as you have to convert arabic number to roman numerals.
Bowling Game is about information processing as you have to calculate a score from each points you made on each rolls.
Game Of Life is about data structure as you have to explore and process state of a board game (a 2-dimensionnal array). 
Many others exists as you may see on [cyber-dojo](http://cyber-dojo.org/setup/show_exercises/?language=Java&test=JUnit).

## Learning Clean Code ##
Clean Code is a permanent concern and every time you write a code to provide a functionality, You'll have to make it work, make it clean and make it fast if need be.
Making a code work is not the end. 
It shall be considered a draft and you should reshape it by all due respect to your peers to make it clean.
By clean, we mean easy to read and understand.
To choose a kata, the reach features needs more clean code than simple features.

## Knowing Legacy Code Refactoring ##
There several steps towards refactoring existing code :
You will first need to make the class testable with as few modification as possible.
Then you can choose to test with :
- a golden master
- approval testing
- behavior testing

At last, you can refactor your code base to make it understandable, then you may transform it to make it Clean and SOLID.

Trip Service is about cutting dependencies so the class become testable.
Gilded Rose is about testing legacy code by approval and by behavior. You will then be able to refactor it toward clean code. So you may have two objective for this exercise : How to cover code with test and/or how to move code around so it will be easyer to read (a big part of "make it clean").
Tennis Game is about implementing a fourth time a scoring tool and compare it with other weird implementation so you can enforce your taste on clean code.

## Knowing BDD and double loop of outside-in TDD ##
Correctly sized exercises have yet to be found or defined.
It shall be big enough to need a double loop, small enough to be significative in two hours or so.

## Knowing SOLID principles ~~by heart~~, by code ##
Here are theses SOLID principles :
- SRP : Single Responsibility
- OCP : Open Closed
- LSP : Liskov Substitution
- ISP : Interface Segregation
- DIP : Dependency Inversion

This part is under construction as SOLID are architectural concern. 
They touch the way classes collaborate together, so you will try code for several classes and related exercises are either too long for meetup or does not cover much on the topic.
Tire Pressure Monitor is small enough and will give you a taste.
Birthday greetings card is intermediate in size and show a start of a SOLID architecture aka Hexagonal.
Shopping's Customer is yet to be defined as a kata.
