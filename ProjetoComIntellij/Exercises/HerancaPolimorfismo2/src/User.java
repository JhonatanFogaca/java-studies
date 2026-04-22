public abstract class User {

    protected String name;
    protected String email;
    protected String password;
    private final boolean isAdmin = true;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void login(){
        System.out.println(name + " fez login.");
    }

    public void logoff(){
        System.out.println(name + " fez logoff.");
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public void updateData(String name, String email){
        this.name = name;
        this.email = email;
    }
}
