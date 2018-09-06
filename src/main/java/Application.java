public class Application {
    private String userId;
    private int userPassword;
    private int total;

    public Application(String id, int pw){
        this.userId = id;
        this.userPassword = pw;
    }

    public Application(){}

    public void add(int income){
        total += income;
    }

    public void pay(int pay){
        if(total>0){
            total -=pay;
        }else{
            total =0;
        }

    }

    public void show(){
        System.out.println(total);
    }

    public int getTotal() {
        return total;
    }
}
