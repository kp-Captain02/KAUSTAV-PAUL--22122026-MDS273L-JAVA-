import java.util.Scanner;

class lab3{
    static String[][] details = new String[1024][5]; // 2-dimensional array to store the details of up to 1024 students
    static String[] names = new String[1024]; // static array to store the names that the user has entered
    static int count = 0; // to keep track of the number of students entered

    // function to collect the details of the student
    static void collectDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = input.nextLine();
        int index = searchDetails(name);
        if (index == -1) { // if the details of the student is not already entered
            names[count] = name;
            System.out.print("Enter the Register Number: ");
            details[count][0] = input.nextLine();
            System.out.print("Enter the Email: ");
            details[count][1] = input.nextLine();
            System.out.print("Enter the Class: ");
            details[count][2] = input.nextLine();
            System.out.print("Enter the Department: ");
            details[count][3] = input.nextLine();
            count++;
            System.out.println("Details successfully entered!");
        } else {
            System.out.println("Details already entered! Enter new details.");
        }
    }

    // function to display the details of the student
    static void displayDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = input.nextLine();
        int index = searchDetails(name);
        if (index == -1) { // if the name is not found
            System.out.println("Details not found!");
        } else {
            System.out.println("Name: " + names[index]);
            System.out.println("Register Number: " + details[index][0]);
            System.out.println("Email: " + details[index][1]);
            System.out.println("Class: " + details[index][2]);
            System.out.println("Department: " + details[index][3]);
        }
    }

    // function to search the details of the student
    static int searchDetails(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return i; // returns the index of the student in the 2-dimensional array
            }
        }
        return -1; // returns -1 if the name is not found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Collect Details");
            System.out.println("2. Display Details");
            System.out.println("3. Search Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    collectDetails();
                    continue;
                case 2:
                    displayDetails();
                    break;
                case 3:
                    searchDetails(String name);
                    break;
                case 4:
                    System.exit(choice);
                default:
                    System.out.println("Invalid Choice ! ! !");
            }
        }
    }
}