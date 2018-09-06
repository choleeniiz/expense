import java.util.HashMap;
import java.util.Map;

public class User {
    private String userId;
    private int userPassword;
    private Application app;
    private Account account;
    private Map<String, Account> user;
    private User current;


    public boolean checkUser(String id, int pw){
        if(user.containsKey(id)&& user.get(id).checkPassword(pw)){
            return true;
        }
        return false;
    }

    public void addAcccount(Account a){
        user = new HashMap<String,Account>();
        user.put(a.getUserId(), a);
    }


    public Map<String, Account> getUser() {
        return user;
    }
}
