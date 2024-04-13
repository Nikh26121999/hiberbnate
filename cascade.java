
import java.lang.module.Configuration;

public class cascade
{
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session s=factory.openSession();
        Question q1=new Question();
        q1.setQuestionId(562);
        q1.setQuestion("what is swing framework");
        answer a1=new answer(2314,"ans1");
        answer a2=new answer(2515,"ans2");
        answer a3=new answer(315,"ans3");
        list<answer>list=new arraylist<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        q1.setanswers(list);
        transaction tx=s.beginTransaction();
        tx.commit();
    }
}