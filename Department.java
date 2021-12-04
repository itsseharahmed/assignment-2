 import java.util.HashSet;
import java.util.Vector;


public class Department {
   private String name;
   private String id;
   Vector<Course> courseList;
   Vector<Student> registerList;

   public String getName()
   {
      return name;
   }
   public String getId()
   {
      return id;
   }
   public Department(String name, String id)
   {
      this.name = name;
      this.id = id;
      //Vector initialisaiton
      courseList = new Vector<>();
      registerList = new Vector<>();
   }

   // adds course to the course list
   public void offerCourse(Course course)
   {
      courseList.add(course);
   }

   // displays courses offered
   public void printCoursesOffered()
   {
      for (Course course : courseList)
      {
         System.out.println(course.toString());
      }
   }

   // displays students in the department
   public void printStudentsByName()
  {
      for (Student student: registerList)
      {
         System.out.println(student.toString());
      }
   }


   // checks if the given student is registered
   public boolean isStudentRegistered(Student student)
   {
      return registerList.contains(student);
   }

   // returns all the students registered in a given course
   public Vector<Student> studentsRegisteredInCourse(int number)
   {
      for (Course course : courseList)
      {
         if (course.getNumber() == number)
            return course.classList;
      }
      return null;
   }

   // displays students registered in a course
   public void printStudentsRegisteredInCourse(int number)
  {
      // if there are no students registered, prints None
      if (studentsRegisteredInCourse(number).isEmpty())
      {
         System.out.println("None");
         return;
      }
      for (Student student : studentsRegisteredInCourse(number)) {
         System.out.println(student.getId() + ", " + student.getName());
      }
   }

   // returns course with highest number of students
   public Course largestCourse()
   {
     //variable declaration
      int max = 0;
      Course largCourse = new Course();

      for (Course course : courseList)
      {
         if (course.classList.size() > max)
         {
            max = course.classList.size();
            largCourse = course;
         }
      }
      return largCourse;
   }

   public String toString()
   {
      // returns a string representation of department name, number
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students
      return id + ": " + String.valueOf(courseList.size()) + " courses, " + String.valueOf(registerList.size()) + " students";
   }
}
