package Week3;


import java.util.ArrayList;

public class Course {

    String courseName;
    int credit;
    int studentNumber;
    Course()
    {
        this.courseName=courseName;
        this.credit=credit;
        this.studentNumber=studentNumber;
    }
    int numberCourse=1;
    ArrayList<Student> numberStudent=new ArrayList<>();
    public  void studentCourse (Student student)
    {
        if(numberCourse<20)
        {
            for(int i=20; i>=numberCourse; numberCourse++)
            {
                numberStudent.add(student);
            }
        }
        else
            System.out.println("A maximum of 20 students can enroll in a course.");
    }


}
