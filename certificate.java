public class Certificate
{
    private String course;
    private String duration;
    public String getcourse()
    {
        return course;
    }
    public void setcourse(String course)
    {
        this.course=course;
    }
     public String getduration()
    {
        return duration;
    }
    public void setduration(String duration)
    {
        this.duration=duration;
    }
     public Certificate getcerti()
    {
        return certi;
    }
    public void setcerti(Certificate certi)
    {
        this.certi=certi;
    }
    public Certificate()
    {
        System.out.println(".()");
    }
    public Certificate(String course,String duration)
    {
        System.out.println(".()");
        this.course=course;
        this.duration=duration;
    }
}