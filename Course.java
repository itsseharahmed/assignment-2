import java.util.Vector;

public class Course {
  //variable declarations
    private Department dept;
    private String title;
    private String code;
    private int number;
    Vector<Student> classList;

    public Department getDept()
    {
        return dept;
    }
    public String getCode()
    {
        return code;
    }
    public int getNumber()
    {
        return number;
    }
    public String getTitle()
    {
        return title;
    }
    public Course(String code, int number, Department dept, String title)
    {
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        //classList initialisaiton
        classList = new Vector<>();
    }

    public String toString()
    {
        // returns a string representation of the course details
        return code + " " + number + " " + title + ", Enrollment = " + String.valueOf(classList.size());
    }
}
