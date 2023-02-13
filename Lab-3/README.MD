Problem Statement:-
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

Outputs:-
Menu
1. Collect Details
2. Display Details
3. Search Details
4. Exit
Enter your choice: 1
Enter the name of the student: ksdduh
Enter the Register Number: 778890
Enter the Email: jjsjssjsj
Enter the Class: hhshs
Enter the Department: hhshsh
Details successfully entered!

Menu
1. Collect Details
2. Display Details
3. Search Details
4. Exit
Enter your choice: 1
Enter the name of the student: Harpreet Singh
Enter the Register Number: 7894556
Enter the Email: yurt090@gmail.com
Enter the Class: 1MscDSA
Enter the Department: DS
Details successfully entered!

Menu
1. Collect Details
2. Display Details
3. Search Details
4. Exit
Enter your choice: 2
Enter the name of the student: ksdduh
Name: ksdduh
Register Number: 778890
Email: jjsjssjsj
Class: hhshs
Department: hhshsh

Menu
1. Collect Details
2. Display Details
3. Search Details
4. Exit
Enter your choice: 2
Enter the name of the student: Harpreet Singh
Name: Harpreet Singh
Register Number: 7894556
Email: yurt090@gmail.com
Class: 1MscDSA
Department: DS

Menu
1. Collect Details
2. Display Details
3. Search Details
4. Exit
Enter your choice: 3

Menu
1. Collect Details
2. Display Details
3. Search Details
4. Exit
Enter your choice: 2
Enter the name of the student: Harpreet Singh
Name: Harpreet Singh
Register Number: 7894556
Email: yurt090@gmail.com
Class: 1MscDSA
Department: DS




Basic Flowchart for the Program:-
Start
    |
    |__ Input: User selects option 1
    |     |
    |     |__ Call function to Collect Details of Student
    |     |   |
    |     |   |__ Input: Name, Register Number, Email, Class, Department
    |     |   |
    |     |   |__ Check if Name exists in Static String Array
    |     |   |   |
    |     |   |   |__ If Name exists, Print Error Message
    |     |   |   |
    |     |   |   |__ If Name does not exist, Store details in Two-Dimensional Array
    |     |   |
    |     |   |__ End
    |     |
    |     |__ End
    |
    |__ Input: User selects option 2
    |     |
    |     |__ Call function to Display Details of Student
    |     |   |
    |     |   |__ Input: Name
    |     |   |
    |     |   |__ Search for Name in Static String Array
    |     |   |   |
    |     |   |   |__ If Name exists, Get Index of Name in Static String Array
    |     |   |   |
    |     |   |   |__ Use Index to Print Details from Two-Dimensional Array
    |     |   |   |
    |     |   |   |__ If Name does not exist, Print Error Message
    |     |   |
    |     |   |__ End
    |     |
    |     |__ End
    |
    |__ Input: User selects option 3
    |     |
    |     |__ End
    |
    |__ Input: User selects other options
    |     |
    |     |__ Print Error Message
    |     |
    |     |__ End
    |
End

//The visual Diagram Representation is being attached as a xml file in the repository.