Name:EVANA T D
Reg. No:22122022
Email:evana.td@msds.christuniversity.in
Class:2MScDS A

Question:
Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student.
Reg. No.
Name
Email
Phone
Class
Department
The Student class will have the following methods:
A constructor to initialize the values of the Student
A method to print the Details of the Student.
A method (named 'toString()) that convert the student details to string, and can be used to write the student details to file.
In the main-method class, create an array of Student Class to hold maximum details of 100 Students.

In the menu-driven program, the menu options will have
Add a student
Adds the details of 1 student to the array of Student.
Search for a student
Search for the details of a student from the array of Student.
Searching can be done with Name or Register Number.
Update the details of a student
Update the student details based on the search based on name or register number.
Display all students
Displays the details of all students.
Save the details of each student in a file, with the student name as filename.


LAB DESCRIPTION:
The Java code displays an ArrayList-based, fundamental student record management system. It enables the user to carry out a number of actions, including adding a new student, looking up a student, updating student information, seeing all students, saving student information to a file, and quitting the software.The Student class stands for a student's characteristics, including registration number, name, email, phone, class, and department. It features a function Object() { [native code] } for initialising the attributes, a printDetails() method for printing a student's details, and a function toString() { [native code] }() method for returning a string representation of the student object.The lab6 class is a representation of the main class, which houses the main method for executing the programme. The student records are stored in an ArrayList of Student objects.Until the user decides to end the programme, it keeps running in a while loop. Using the switch statement, the programme shows a menu of alternatives for the user to select from during each iteration of the loop.
Option 1 enables the user to add a new student to the ArrayList by asking for input for each attribute and then using the function Object() { [native code] } to create a new Student object. After that, the Student object is included in the ArrayList.Option 2 enables the user to do a name- or registration-number-based student search using nested switch statements. If the user input matches a student's name or registration number, the computer runs over the ArrayList and performs a comparison. If a match is discovered, the printDetails() method is used to print the student's information. In the event that no match is discovered, the programme prints a notice stating that the student was not located.With option 3, the user can use nested switch statements to change a student's information by name or registration number. If the user input matches a student's name or registration number, the computer runs over the ArrayList and performs a comparison. The programme requests input from the user for each attribute and updates the relevant attribute of the Student object if a match is discovered. In the event that no match is discovered, the programme prints a notice stating that the student was not located.With option 4, the user can cycle through the ArrayList and execute the printDetails() method for each student to display all the students that are included in the list.The user may save the information about each student to a file using option 5. The write() method is used to send each Student object's string representation to the file as it loops over the ArrayList. Following that, the FileWriter object is closed.Option 6 enables the user to end the programme by setting the exit variable to true, which ends the while loop.
