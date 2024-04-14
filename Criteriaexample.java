
import java.lang.module.Configuration;

public class Criteriaexample
{
    public static void main(String[] args) 
    {
        Session s=new Configuration().configure().buildSessionFactory().openSession();
        Criteria c=js.createCriteria(Student.class);
        c.add(Restrictions.eq("certi.course","android"));
        list<Student>students=c.list();
        for(Student st:Students)
        {
            System.out.println(st);
        }
        
    }
}