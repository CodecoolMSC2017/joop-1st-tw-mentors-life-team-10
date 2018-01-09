# Kitchen

## Description
The class represents the kitchen place in Codecool, where codecoolers can eat and raise energyLevel up.

## Parent class
None

## Fields

* `String[] food` Stores the food in the Codecool area.
* `String[] foodFrom` Stores the food origin.
* `boolean clean` Show that the kitchen clean or not. By default it's true.
 
## Constructors

### `Kitchen()`
* `String[] food` Initilazied with some pre coded places.
* `String[] foodFrom` Initialized with some pre coded origin.
* `boolean clean` Set to true.

## Instance Methods

### `isClean()`

Get the condition of the kitchen.

### `eatLikeAPig()`

Set the value of `clean` to false.

### `doTheDirtyJob()`

Set the kitchen condition to true.

### `feedThePerson()`

The person get a random food from a random location.