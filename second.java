public class second
{
    public static void main(String args[])
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session1=factory.openSession();
        Student student1=session1.get(Student.class,12412);
        System.out.println(Student1);
        Session.close();
        Session session2=factory.openSession();
        Student student2=session2.get(Student.class);
        System.out.println(student2);
        Session2.close();

    }
}