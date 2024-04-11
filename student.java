
import java.security.Certificate;

@entity
public class student
{
    @Id
    private int id;
    private String name;
    private String coty;
    private Certificate certi;
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getname()
    {
        retunr name;
    }
    public void getname(String name)
    {
        this.name=name;
    }
    public String getcity()
    {
        return city;
    }
    public void setcity(String city)
    {
        this.city=city;
    }
    public Certificate getcerti()
    {
        return certi;
    }
    public void setcerti(Certificate certi)
    {
        this.certi=certi;
    }
    @Override
    public String toString()
    {
        return this.id+":"+this.name+":"+this.city;
    }
}