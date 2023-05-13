Name:EVANA T D
Reg. No:22122022
Email:evana.td@msds.christuniversity.in
Class:2MScDS A

LAB 3 QUESTION:
Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality

LAB DESCRIPTION:
A simple Java programme that creates a student-information system make the code. The programme lets the user enter and view student information, and it stores the data in names and details arrays.
The programme uses three primary techniques:
1.collectDetails: This method takes input from the user and stores the data in the names and details arrays (student name, register number, email, class, and department). also, it check whether the student information already exist in the arrays and alerts the user if it is.
2.displayDetails: This method creates a student's name in the names array using the student's name as input. If the student's name is located, information from the details array is shown. The programme notifies you if the name cannot be discovered.
3.searchName: This method shows up a student's name in the names array using the student's name as input. If the name is recognised, the function returns the student's index in the names array; if not, it returns -1.
A menu with three alternatives is displayed while the programme is running in a loop: enter details, display details, or exit. The software executes the  action corresponding to the user's selection, which they input using the Scanner class.
In conclusion, the code offers a fundamental Java implementation of a student information system, using arrays to store student information and a menu-driven user interface.



Flowchart:



![FL3](https://github.com/EVANATD/22122022-MDS273L-JAVA/assets/118044613/69dbb43d-1618-4600-a45f-85608a01e345)

