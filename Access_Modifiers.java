
class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters --> used for prvate Access Modifiers
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "SBI Naini";
        a1.email = "sbinaini@gmail.com";
        System.out.println(a1.name);

        // a1.password = "ad"; //-> can't be done because it is private
        a1.setPassword("abcd");

        System.out.println(a1.getPassword());
    }

}