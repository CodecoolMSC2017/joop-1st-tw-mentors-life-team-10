# CodecoolClass

## Description
This class represents a real class @ Codecool, containing mentors and students working at the class.

## Parent class
None

## Fields

* `String location` stores the city where the class was started in
* `int year` stores the year when the class was started at
* `Mentor[] mentors` stores the mentors of the class
* `Student[] students` stores the students of the class

## Constructors

### `CodecoolClass(String location, int year, Mentor[] mentors, Student[] students)`

The constructor takes 4 argument matching the class's fields. Using this constructor initializes a complete class at Codecool.

### `CodecoolClass(String location, int year, String mentorsCsvPath, String studentsCsvPath)`

This constructor is similar to the other, but instead of taking two arrays it takes as its argument two CSV filenames.
One pointing to `data/mentors.csv` the other pointing to `data/students.csv`.
When invoked (e.g. `CodecoolClass myClass = new CodecoolClass("New York", 2022, "students.csv", "mentors.csv")` it reads and processes
the two files to initialize the two array typed field of the class (the `Mentor[]` and the `Student[]` array).

## Class methods

### `CodecoolClass createLocal()`

This static method is a shortcut for creating a "local" Codecool class. It delegates to one of the constructors above.
When invoked it creates a `CodecoolClass` object having some real-life data from the implementer students' real class for the current year.

The method takes no arguments and returns an instance of the `CodecoolClass` type.

## Instance methods

### `Student findStudentByFullName(String fullName)`

Searches the `CodecoolClass` instance's `students` array and if it finds a student having the name contained in the `fullName` parameter
it returns the student object. If it doesn't find such a student it returns `null` instead.

### `Mentor findMentorByFullName(String fullName)`

It works like `findStudentByFullName` but instead of trying to find and return a `Student` object it returns a `Mentor` instead.
