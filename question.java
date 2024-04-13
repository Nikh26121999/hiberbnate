public class question{
private int questionId;
private String question;
@OneToMany(mappedBy="question",fetch=fetchType.LAZY,cascade=cascadeType.ALL)
private list<answer>answers;
public int getQuestionId()
{
    return questionId;
}
public void set QuestionId(int questionId)
{
    this.questionId=questionId;
}

}