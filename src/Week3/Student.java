package Week3;

import java.util.ArrayList;

public class Student extends  Person {
    int year;

    Student()
    {
        super();
        this.year=year;
    }
    int numberCredit=0;
    ArrayList<Course> extraCourse=new ArrayList<>();
    public  void studentCourse (Course courseStudent)
    {
        if(numberCredit<20)
        {
            for(int i=20; i>=numberCredit; numberCredit++)
            {
                extraCourse.add(courseStudent);
            }
        }
        else
            System.out.println("The student can take a maximum of 20 credits.");
    }

}

