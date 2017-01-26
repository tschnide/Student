import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author travisschnider
 * @version 1.0 1/25/17
 *          StudentApp gives the user 6 options that allow them to manipulate create
 *          Student objects, store them, find them, and delete them.
 */
public class StudentApp
{
    public static void main(String[] args)
    {
        // Create three Student objects and add them to the ArrayList.
        //This is required by the assignment.

        Student mike = new Student("Mike", "Bowen", "Art", 2.0);
        Student sue = new Student("Sue", "McGuire", "Science", 3.0);
        Student jon = new Student("John", "Schnider", "Architecture", 3.6);

        ArrayList<Student> al = new ArrayList();
        al.add(mike);
        al.add(sue);
        al.add(jon);
        System.out.println(jon.getSNumber());

        //  ExitCommand takes a (y/n) option after running the first time.
        String exitCommand = "n";

        do
        {

            System.out.println("Enter an option number from the menu below.");
            System.out.println("1.  Add a student.");
            System.out.println("2.  Find a student.");
            System.out.println("3.  Delete a student.");
            System.out.println("4.  Display all students.");
            System.out.println("5.  Display number of students in list.");
            System.out.println("6.  Exit.");
            System.out.print("Enter your selection (1 - 6): ");
            System.out.println("\n");

            //  One scanner will use "enter" as an input and skip the first input withing the switch block
            //  Scanner "input" used only for the number selection
            //  Scanner "menuInput" is for all the user input from within the switch case

            Scanner input = new Scanner(System.in);
            int numberInput = input.nextInt();

            Scanner menuInput = new Scanner(System.in);
            String stringInput;
            Double gpaInput;

            switch (numberInput)
            {

                case 1:
                {
                    System.out.print("Enter the student's first name: ");
                    String fname = menuInput.nextLine();
                    System.out.print("Enter the sudent's last name: ");
                    String lname = menuInput.nextLine();
                    System.out.print("Enter the student's major: ");
                    String maj = menuInput.nextLine();
                    System.out.print("Enter the student's gpa: ");
                    double gpa = menuInput.nextDouble();
                    System.out.println("\n");

                    //  Add the variables as parameters to a Student object in al (ArrayList)
                    al.add(new Student(fname, lname, maj, gpa));

                    //  Ouputs the toString() method of the most recent Student object
                    System.out.println("Your record was added as: " + al.get(al.size() - 1));
                    System.out.println("\n");
                    break;
                }

                case 2:
                {
                    System.out.print("Find a student with sNumber: ");
                    int sNum = menuInput.nextInt();

                    //  Compares the user's input to the actual student numbers
                    //  Outputs the toString() method of the matching Student object
                    for (int i = 0; i <= al.size(); i++)
                    {
                        if (sNum == al.get(i).getSNumber())
                        {
                            System.out.println(al.get(i));
                            System.out.println("\n");
                            break;
                        }
                        //  This is one more than the total length of size meaning it has checked all possible student numbers
                        if (i + 1 == al.size())
                        {
                            System.out.println("No such student number");
                        }
                    }
                    break;
                }

                case 3:
                {
                    System.out.print("Delete student with sNumber: ");
                    int sNum = menuInput.nextInt();

                    //  Compares the user's input to the actual student numbers
                    //  Removes if a match is found
                    for (int i = 0; i < al.size(); i++)
                    {
                        if (sNum == al.get(i).getSNumber())
                        {
                            System.out.print(al.get(i).getSNumber() + " " + al.get(i).getFirstName() + " " + al.get(i).getLastName() + " has been deleted");
                            System.out.println("\n");
                            al.remove(i);
                        }

                    }
                    break;
                }

                case 4:
                {
                    //  Automatically outputs toString() of every student in al (ArrayList)
                    for (int i = 0; i < al.size(); i++)
                    {
                        System.out.println(al.get(i).getSNumber() + " " + al.get(i).getFirstName() + " " + al.get(i).getLastName());
                    }
                    System.out.println("\n");
                    break;
                }

                case 5:
                {
                    // The length of al (ArrayList) is the same as the number of Student objects
                    System.out.println("Number of students is: " + al.size());
                    System.out.println("\n");
                    break;

                }

                case 6:
                {
                    // exitCommand is initialized as "n" to begin with. Changing to "y" exits at the while statement.
                    System.out.println("Exit(y/n)");
                    exitCommand = menuInput.nextLine();
                    System.out.println("Program closing...");
                    break;
                }

                default:
                    System.out.println("Invalid user input");
                    break;
            }
        }
        while (exitCommand == "n");
    }

}
