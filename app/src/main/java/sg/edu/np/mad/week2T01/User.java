package sg.edu.np.mad.week2T01;

public class User {
    public String Name;
    public String Description;
    public int id;
    public boolean followed;

    public User(){}

    public User(String name, String description, int id, boolean followed) {

        Name = name;
        Description = description;
        this.id = id;
        this.followed = followed;
    }
}
