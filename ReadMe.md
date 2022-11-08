Create a tool that manages and simulates a day in the life of a collection of pets. The program, which is called Menagerie, will enable the user to add dog, cats, or fish to their list of pets. They can print the list of pets in order sorted by their name, save the pets to a file, load the pets from a file, clear the list of pets, and simulate a day in the lives of their pets.

This program will give you a chance to work with a number of the object-oriented concepts we've been learning. Your create a hierarchy of pet-related classes, starting with an abstract class called Pet, with concrete subclasses Dog, Cat, and Fish. Every pet will have a name, weight, and age. Every pet will need to eat, sleep, and seek your attention, but the likelihood that they will need to do so in any given hour will depend on the kind of pet they are. Also, every pet will have a range of activities they might do in any given hour. For example, a cat might play with a ball of yarn, and a dog might play fetch. Again, the pet-specific activities will differ for each type of pet, and so the subclasses will have to be differentiated by the activities they can perform any given hour.

| Points | Criterion |
| --- | --- |
| 10 | You define an abstract base class called Pet that introduces the name, age, and weight data members that all pet classes will have. The Pet class will also declare a Random number generator object that will function as the pet's "brain", deciding what it will do each hour. The Pet class will also have int variables that are used to determine whether the pet will eat, sleep, or seek attention by acting as behavior cutoff values against which a randomly generated value will be compared to decide whether the pet will do those things. The Pet class will need getters, setters, and constructors. The Pet class will have a toString function. It will have an abstract getType() function that returns a String that indicates what type of animal it is. It will have functions that indicate whether it is sleeping, eating, or seeking attention by comparing a randomly generated number agains the eat, sleep, and attention behavior cutoffs. These functions will be called during the simulation for each hour of the day. The Pet class will also have an abstract function called act() that subclasses will implement to choose among a variety of tasks that are specific to that kind of pet. |
| 5 | You define a Dog class that extends Pet. Dog will initialize the behavior cutoffs to values you think are reasonable for a dog. (For example, a Dog sleeps a lot, but doesn't eat all that often, and loves attention.) Dog will override the getType() function. It will override the abstract act() function to randomly choose an activity dogs typically do (or choose to do nothing at all). The act() function will return this randomly selected activity (or lack of activity) and add it to sleeping, eating, and/or seeking your attention as the things the dog did during the past hour. You decide what activities are relevant for a dog. |
| 5 | You define a Cat class that extends Pet. Cat will initialize the behavior cutoffs to values you think are reasonable for a cat. (For example, cats sleep a lot, but they don't seek attention much.) Cat will override the getType() function. It will override the abstract act() function to randomly choose an activity cats typically do (or choose to do nothing at all). The act() function will return this randomly selected activity (or lack of activity) and add it to sleeping, eating, and/or seeking your attention as the things the cat did during the past hour. You decide what activities are relevant for a cat. |
| 5 | You define a Fish class that extends Pet. Fish will initialize the behavior cutoffs to values you think are reasonable for a fish. (For example, fish don't seem to sleep much, and they definitely don't seek attention.) Fish will override the getType() function. It will override the abstract act() function to randomly choose an activity fish typically do (or choose to do nothing at all). The act() function will return this randomly selected activity (or lack of activity) and add it to sleeping, eating, and/or seeking your attention as the things the fish did during the past hour. You decide what activities are relevant for a fish. |
| 4 | You define a PetWriter class that includes static functions for writing to the screen and writing to a tab-delimited file. The columns should line up well. |
| 4 | You define a PetReader class that includes a static function that reads and returns an ArrayList\<Pet\> from reading data from a tab-delimited file. |
| 1 | Your App class starts with a centered header and ends with a good-bye message. |
| 2 | Your App class repeated offers a menu of 7 options that repeats until the user chooses to exit. |
| 3 | When the user chooses to add a new Pet, you ask them the necessary questions (including what kind of pet) and then create and add the requested Pet to the list of Pet objects. |
| 2 | You print the list of pets sorted by their name when the user elects to do so. You use PetWriter to do so. |
| 2 | You save the list of pets to a file in order sorted by their name using the functions of the PetWriter class. |
| 2 | You successfully read the list of Pets from the file when the user chooses to do so using PetReader. |
| 1 | You clear the list of pets when the user chooses to do so. |
| 8 | You simulate the 24 hours of a day, showing what your pets are doing for each of those hours. You use each pet's act() function to determine this. |
| 1 | You comment your code well enough that other scan understand it. |

Sample Output-

\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

Menagerie V1.0: The Pet Simulator

\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 1

Enter d for dog, c for cat, or f for fish: d

Enter name, age, and weight: Brody 11 22.5

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 1

Enter d for dog, c for cat, or f for fish: c

Enter name, age, and weight: Aaron 5 17.25

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 1

Enter d for dog, c for cat, or f for fish: f

Enter name, age, and weight: Julio 1 0.5

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 1

Enter d for dog, c for cat, or f for fish: d

Enter name, age, and weight: Felipe 4 34.75

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 2

Here is your list of pets:

cat Aaron 5 17.25

dog Brody 11 22.50

dog Felipe 4 34.75

fish Julio 1 0.50

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 3

Enter name of file to save: c:\temp\pets.txt

The pets were saved to the file.

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 6

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 2

Here is your list of pets:

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 4

Enter name of file to load: c:\temp\pets.txt

The pets were read from the file.

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 2

Here is your list of pets:

cat Aaron 5 17.25

dog Brody 11 22.50

dog Felipe 4 34.75

fish Julio 1 0.50

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 5

Here is a simulation of a day in the life of your pets:

HOUR 1

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, chased its tail

The dog, Brody, sought your attention.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, barked at the window.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, played fetch.

The fish, Julio, was sleepy and took a nap.

The fish, Julio swam up to the surface.

HOUR 2

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The fish, Julio, was sleepy and took a nap.

HOUR 3

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, had some catnip.

The dog, Brody, sought your attention.

The dog, Brody, barked at the window.

The dog, Felipe, was hungry and ate.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, tore the squeaker out of its toy.

The fish, Julio hung out in the castle.

HOUR 4

-------

The cat, Aaron, chased its tail

The dog, Brody, was sleepy and took a nap.

The dog, Brody, played fetch.

The dog, Felipe, sought your attention.

The dog, Felipe, tore the squeaker out of its toy.

The fish, Julio, was sleepy and took a nap.

HOUR 5

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, had some catnip.

The dog, Brody, sought your attention.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, played fetch.

The fish, Julio, was sleepy and took a nap.

The fish, Julio swam up to the surface.

HOUR 6

-------

The cat, Aaron, was hungry and ate.

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Brody, whimpered at its water bowl.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, barked at the window.

The fish, Julio swam up to the surface.

HOUR 7

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, chased its tail

The dog, Brody, was sleepy and took a nap.

The fish, Julio, sought your attention.

The fish, Julio swam in circles.

HOUR 8

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, had some catnip.

The dog, Brody, was sleepy and took a nap.

The dog, Felipe, sought your attention.

The dog, Felipe, whimpered at its water bowl.

The fish, Julio hung out in the castle.

HOUR 9

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Brody, sought your attention.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, sought your attention.

The fish, Julio, sought your attention.

HOUR 10

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, had some catnip.

The dog, Brody, played fetch.

The dog, Felipe, sought your attention.

The dog, Felipe, whimpered at its water bowl.

HOUR 11

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, barked at the window.

The fish, Julio hung out in the castle.

HOUR 12

-------

The cat, Aaron, chased its tail

The dog, Brody, sought your attention.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, played fetch.

The dog, Felipe, barked at the window.

The fish, Julio swam in circles.

HOUR 13

-------

The cat, Aaron, sought your attention.

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Brody, sought your attention.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, sought your attention.

The fish, Julio, was sleepy and took a nap.

The fish, Julio hung out in the castle.

HOUR 14

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Brody, sought your attention.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The fish, Julio swam up to the surface.

HOUR 15

-------

The cat, Aaron, jumped onto the bookshelf.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, sought your attention.

The dog, Felipe, barked at the window.

The fish, Julio, was sleepy and took a nap.

The fish, Julio hung out in the castle.

HOUR 16

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, jumped onto the bookshelf.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, barked at the window.

The dog, Felipe, whimpered at its water bowl.

The fish, Julio, was sleepy and took a nap.

The fish, Julio swam up to the surface.

HOUR 17

-------

The cat, Aaron, was sleepy and took a nap.

The dog, Brody, was hungry and ate.

The dog, Brody, played fetch.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, barked at the window.

The fish, Julio swam in circles.

HOUR 18

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, jumped onto the bookshelf.

The dog, Brody, sought your attention.

The dog, Brody, was sleepy and took a nap.

The dog, Felipe, sought your attention.

The dog, Felipe, barked at the window.

The fish, Julio, was sleepy and took a nap.

The fish, Julio hung out in the castle.

HOUR 19

-------

The cat, Aaron, sought your attention.

The cat, Aaron, was sleepy and took a nap.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, whimpered at its water bowl.

The dog, Felipe, sought your attention.

The fish, Julio, was sleepy and took a nap.

The fish, Julio swam in circles.

HOUR 20

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, played with a ball of yarn.

The dog, Felipe, sought your attention.

The dog, Felipe, barked at the window.

The fish, Julio swam up to the surface.

HOUR 21

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, chased its tail

The dog, Brody, sought your attention.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, tore the squeaker out of its toy.

The dog, Felipe, sought your attention.

The dog, Felipe, was hungry and ate.

The dog, Felipe, tore the squeaker out of its toy.

The fish, Julio swam up to the surface.

HOUR 22

-------

The cat, Aaron, was hungry and ate.

The cat, Aaron, jumped onto the bookshelf.

The dog, Brody, played fetch.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, tore the squeaker out of its toy.

HOUR 23

-------

The cat, Aaron, was hungry and ate.

The cat, Aaron, was sleepy and took a nap.

The dog, Brody, was hungry and ate.

The dog, Brody, was sleepy and took a nap.

The dog, Brody, barked at the window.

The dog, Felipe, sought your attention.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, played fetch.

The fish, Julio, sought your attention.

The fish, Julio swam up to the surface.

HOUR 24

-------

The cat, Aaron, was sleepy and took a nap.

The cat, Aaron, chased its tail

The dog, Brody, whimpered at its water bowl.

The dog, Felipe, was hungry and ate.

The dog, Felipe, was sleepy and took a nap.

The dog, Felipe, tore the squeaker out of its toy.

The fish, Julio, was sleepy and took a nap.

The fish, Julio swam up to the surface.

What would you like to do?

1. Add a new pet.

2. Print list of pets.

3. Save pets to a file.

4. Load pets from a file.

5. Simulate a day in the life of your pets.

6. Clear your list of pets.

7. Exit

Enter the number of your choice: 7

Thank you for using Menagerie. We hope you had fun.