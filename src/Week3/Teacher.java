package Week3;

import java.util.ArrayList;

public class Teacher extends  Person
{
    public Teacher()
    {
        super();
    }
    int numberCourse=1;
    ArrayList<Course> teacherCourseNumber=new ArrayList<Course>();
    public  void teacherCourse (Course courseTeacher)
    {
        if(numberCourse<3)
        {
            for(int i=3; i>=numberCourse; numberCourse++)
            {
                teacherCourseNumber.add(courseTeacher);
            }
        }
        else
            System.out.println("The teacher can give 3 courses");
    }
}

