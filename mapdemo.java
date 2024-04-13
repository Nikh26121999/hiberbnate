
import java.lang.module.Configuration;

public class mapdemo
{
    public static void main(String args[])
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        question q1=new question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java");
        list<answers>list=new arraylist<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        q1.setanswers(list);
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        question q=(question)s.get(question.class,1212);
        System.out.println(q.getQuestion());
        for(Answer a:q.getAnswers())
        {
            System.out.println(a.getAnswer());
        }

    }

}