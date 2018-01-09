# WC

## Description 
This should handle the liquid problems of any person.

## Fields

* `private boolean toiletPaper` This stores if there is toilet paper in the toilet or not. By defualt it's false.
* `private int stinkLevel` This show how much the person disgusted from the smell.
* `private boolean beauty` This should if the person see himself beautiful or not in the mirror. By default is false.
* `public String replacementTool` This could be anything given by the user. Can be reset anytime freely, as it has public modifier. 

## Constructor

### `public WC(String tool)`
* `replacementTool` set to a given `tool` got by the user (expect a string);
* `toiletPaper` will be false by default;
* `stinkLevel` will be 0 by default;
* `beauty` will be false by default;

## Instance methods

### `setToiletPaper()`Set the value of this variable to a given value.
### `setStinkLevel()` Set the value of this variable to a given value.
### `setBeauty()` Set the value of this variable to a given value.

### `getToiletPaper()` Return with the value of the `toiletPaper`.
### `getStinkLevel()` Return with the value of the `stinkLevel`.
### `getBeauty()` Return with the value of the `beauty`.
### `getReplacementTool()` Return with the value of the `replacementTool`

