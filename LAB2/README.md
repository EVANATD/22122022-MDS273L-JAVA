Name:EVANA T D
Reg. No:22122022
Email:evana.td@msds.christuniversity.in
Class:2MScDS A

LAB-2 QUESTION
You are supposed to create a menu-driven program that has the following menu options:
1.Enter a name
2.Search for a name
3.Remove a name
Note:
The menu-driven program has to be made with the help of a do-while loop and switch-case statements.
Constraints:
1.The names collected must be stored in an array with a max length of 1024.
2.The names in the array should be UNIQUE; no duplicate entries are expected!
3.Provide necessary validations that the user enters only valid names that are not going to be repeated.
4.Removing a name should not create empty space inside the array!
5.Format your results properly!!

Lab Description:
This Java software uses a simple name management system. The user can add names to a list of names stored in an array named "names," search for names within the list, and remove names from the list. Up until the user chooses to depart, the programme continuously displays a menu to them. Four choices are available on the menu: Entering a name, looking it up, deleting it, and then leaving are the four steps.For reading user input, the software uses a Scanner object. When the user picks option 1, the software asks them to enter a name and then uses the "isNameExists" method to see if the name is already present in the list. The programme prints a message stating that the name already exists if it does else the name will be added to the list.The software asks the user to enter a name to search for once the user chooses option 2, and then uses a for loop to look through the list for a match. The programme prints the name's position in the list if a match is discovered; if not, it prints a message indicating that no match was made for the name. When the user chooses option 3, the application asks the user to specify a name to remove before conducting a for loop search to see if there is a match. The programme prints a message saying the name was not discovered if it does not find a match and removes the name from the list if one is found.



