@entity
public class emp{
    @Id
    private int eid;
    private String name;
    @ManyToMany
    @JoinTable(name="emp_learn")
    private list<project>projects;
}