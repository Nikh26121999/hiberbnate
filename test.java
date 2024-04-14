
import javax.sql.rowset.spi.TransactionalWriter;

public class test
{
    public static void main(String args[])
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Person person=new Person(23,"nik","nds","591236");
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save();
    }
}