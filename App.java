
import jdk.jfr.Configuration;

public class App
{
    public static void main(String[] args) {
        Student st=new Student();
        st.setusn(10);
        st.setname("nikita");
        st.setMarks(99.10);
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory buildSessionFactory=configuration.buildSessionFactory();
        Session session=buildSessionFactory.openSession();
        session.save(st);
        Transaction tx=session.beginTransaction();
        tx.commit();
        session.close();
        buildSessionFactory.close();

    }
}