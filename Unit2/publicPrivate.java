package Unit2;

class User {
    public String username;
    private String password;
    User(String uname, String pwd) {
        this.username = uname;
        this.password = pwd;
    }
}
public class publicPrivate {
    public static void main(String[] args) {
        User u1 = new User("Denil", "hello123");
        try {
            System.out.println("Username: " + u1.username);
        } catch (Exception err) {
            System.out.println(err);
        }
        try {
            //System.out.println("Password: " + u1.password);
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}