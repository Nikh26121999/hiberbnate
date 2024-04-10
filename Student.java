@Entity
public class Student
{
    @Id
    private int usn;
    private String name;
    private double marks;
    public int getusn()
    {
        return usn;
    }
    public void setusn(int usn)
    {
        this.usn=usn;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public double getMarks()
    {
        return marks;
    }
    public void setMarks(double marks)
    {
        this.marks=marks;
    }
}