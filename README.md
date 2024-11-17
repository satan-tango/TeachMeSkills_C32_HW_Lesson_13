# Here, the following task is implemented:

Create a class with a static method.
This method takes three parameters:  
Login  
Password  
confirmPassword    
All fields have the String data type.
The length of login must be less than 20 characters and must not contain
spaces.
If login does not meet these requirements, you must "throw" a WrongLoginException.
The length of password must be less than 20 characters, must not contain spaces, and must contain at least one digit.
Also, password and confirmPassword must be equal.
If password does not meet these requirements, you must throw a WrongPasswordException.
The exception classes WrongPasswordException and WrongLoginException are custom
exception classes with two constructors - one by default, the second
accepts the exception message and passes it to the Exception class constructor.
The method returns true if the values ​​are valid or false otherwise.
Place the classes in packages: the class for checking values ​​should be in its own separate package, and the classes for exceptions should be in their own.
Create a Runner class to test this class.
Try to solve the problem in two ways:
1. using the methods of the String class "out of the box", for example the contains method
2. splitting the string into an array of chars (string toCharArray()) and traversing and checking the array