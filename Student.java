/**
 * @author travisschnider
 * @verion 1.0 1/23/17.
 * This class creates a student object with a few attributes that students have.
 *
 */
public class Student
{
    private String firstName;
    private String lastName;
    private int sNumber;
    private String major;
    private double gpa;
    private static int count = 0;

    /**
     * Constructs a Student object with an sNumber
     */
    public Student()
    {
        sNumber = 1234567 + count++;
    }

    /**
     *
     * @param fName First Name
     * @param lName Last Name
     * @param maj Major
     * @param gradePointAverage Grade point average
     */
    public Student(String fName, String lName, String maj, double gradePointAverage)
    {
        firstName = fName;
        lastName = lName;
        major = maj;
        gpa = gradePointAverage;
        sNumber = 1234567 + count++;

    }

    /**
     * Gets the first name of the Student object
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the first name of the Student object
     * @param fName First name
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * Gets the last name of the Student object
     * @return
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the last name of the Student object
     * @param lName
     */
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    /**
     * Gets the student number of the Student object
     * @return
     */
    public int getSNumber()
    {
        return sNumber;
    }

    /**
     * Gets the major of the Student object
     * @return
     */
    public String getMajor()
    {
        return major;
    }

    /**
     * Sets the Major of the Student object
     * @param maj
     */
    public void setMajor(String maj)
    {
        major = maj;
    }

    /**
     * Getst the grade point average of the Student object
     * @return
     */
    public double getGpa()
    {
        return gpa;
    }

    /**
     * Sets the grade point average of the Student object
     * @param gradePointAverage Grade Point Average
     */
    public void setGpa(double gradePointAverage)
    {
        gpa = gradePointAverage;
    }

    /**
     * Concatenates all parameters to a string with a descriptive word before each
     * @return
     */
    @Override
    public String toString()
    {
        return  "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sNumber=" + sNumber +
                ", major='" + major + '\'' +
                ", gpa=" + gpa;

    }
}
