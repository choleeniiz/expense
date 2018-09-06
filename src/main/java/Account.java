public class Account{
    private String userId;
    private int userPassword;
    private Application app;

    public Account(String id, int pw){
        this.userId = id;
        this.userPassword = pw;
        app = new Application();
    }

    public String getUserId() {
        return userId;
    }

    public int getUserPassword() {
        return userPassword;
    }

    public boolean checkPassword(int pw) {
        return userPassword == pw;
    }

    public Application getApp() {
        return app;
    }
}
