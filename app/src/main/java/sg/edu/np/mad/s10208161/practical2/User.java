package sg.edu.np.mad.s10208161.practical2;

public class User {
    String name;
    String description;
    int id;
    boolean followed;


    public User(String n, String desc, int idn, boolean fllw) {
        name = n;
        description = desc;
        id = idn;
        followed = fllw;
    }
    // method created in the user class - to change the followed value in this object when called.
    public void toggleFollow() {
        if (followed) {
            followed = false;
        }
        else {
            followed = true;
        }
    }
}
