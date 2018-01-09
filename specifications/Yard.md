# Yard

## Description 
This class handle person's beverage making attampt on the yard.

## Parent class
None

## Fields

* `private HidingPlaces[] locations` This stores the available location objects, where a person could go.
* `private int luck` Stores a randomized number for 0 to 100. 
* `private int userChoice` Stores the choice of the user, what index of the object from the `HidingPlaces[]` will be used.

## Constructor

### `Yard()`
Takes no argument.

* `HidingPlaces[] locations` Initialize some pre coded element to the array of choosable the locations. Can be added more by the user later.
* `int luck` Store a randoized number.
* `int userChoice` Initilaized with 1 by default, can be changed by the user later with a set method.



## Instance methods

### `getLocations()` 
Returns with a `HidingPlaces[] locations`

### `addNewLocation(String name, int fireQuality, int visibility)` 
Extend the `HidingPlaces[]` array, and then add the new object to it.

### `setUserChoice(int userChioce)` 
Overwrite the value of the userChoice when called.

### `getAreYouSeen()` 
Returns `true` if the value is higher then 0 or `false` if 0.

### `calculateResult()` 
Do the calculation, returns with `false` if the beverage making failed or `true` if not failed.



