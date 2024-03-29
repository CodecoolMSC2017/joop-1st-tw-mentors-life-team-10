# Person

## Description
This class representing all the poeple in the _codecool class_, including students, mentors, dead or alive.

## Parent class
None

## Subclass
Mentors
Students

## Fields
* `String firstName` This is the first name of the person, gotten from the terminal as an argument
* `String lastName` This is the last name of the person, gotten from the terminal as an argument
* `int yearOfBirth` stores year of the birth of a given person
* `String gender (male/female/notsure :)` stores the gender of the person
* `int energyLevel` current energy level

## Constructors

### `Person(String firstName, String lastName, int yearOfBirth, String gender, int energyLevel)`

The construnctor takes 5 argument matching to the fields. If firstName and lastName is not given by the user (empty), then raise exception.

## Instance methods

### `Person getPersonalName()`

Return the name for a given person.

### `Person getPersonAge()`

Return the age of a given person.

### `Person getPersonGander()`

Return the gender of the person.

### `Person getEnergyLevel()`

Return the energy level of the person.

### `Person setEnergyLevel(int level)`

Set `energyLevel` to a new level.
