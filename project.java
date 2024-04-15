
import java.lang.annotation.Inherited;

public class project
{
    @Id
    private int pid;
    @column(name="project_name")
    private String project_name;
    @ManyToMany(mappedBy="projects")
    private list<emp>emps;
    public int getpid()
    {
        return pid;
    }
    public void setpid()
    {
        this.pid=pid;
    }
}