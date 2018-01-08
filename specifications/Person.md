# Person

## Description
This class representing all the poeple in the _codecool class_, including students, mentors, dead or alive.

## Parent class
None

## Subclass
Mentors
Students

## Fields
`String firstName` This is the first name of the person, gotten from the terminal as an argument 
`String lastName` This is the last name of the person, gotten from the terminal as an argument
`int yearOfBirth` stores year of the birth of a given person
`String gender (male/female/notsure :)` stores the gender of the person

## Constructors

### `Person(String firstName, String lastName)`

The construnctor takes 2 argument matching to the fields. If firstName and lastName is not given by the user (empty), then raise exception.

### `Persons(int yearOfBirth, String gender)`

The construnctor takes 2 argument matching to the field. By default it`s null, gettin argument when called from the Mentors or Studnet subclass.


## Instance methods

### `Persons getPersonalName()`

Return the name for a given person.

### `Persons getPersonAge()`

Return the age of a given person.

### `Persons getPersonGander()`

Return the gender of the person.






