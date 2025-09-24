###Why doesn't the integer change after the method call?
The integer doesn't change because the print statement only calls the value of the variable of number, not the method with the number variable. This then causes the After method print statement to print 5 just like Before method print statement.

###Why does the array change after the method call?
Didn't change because a new array was created and was used to print.

###What happens when you try to access y outside the loop?
An error occurs when you try to access y because of the scope. The y variable is declared and initialized in the for loop which can only be used inside the for loop. Outside of the for loop the y variable doesn't exist.
