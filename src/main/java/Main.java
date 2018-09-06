import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        User u = new User();
        Account a = new Account("nana" , 1234);
        u.addAcccount(a);
        Scanner sc = new Scanner(System.in);

        while(true){
            //
            System.out.println("Your id: ");
            String x = sc.next();
            System.out.println("Your password: ");
            int y = sc.nextInt();
            if(u.checkUser(x,y)){
                System.out.println("this id can access");
                while(true) {
                    System.out.println("Do you want to add[a], remove[r], show[s], exit[x]: ");
                    String o = sc.next();
                    if (o.equals("a")) {
                        System.out.println("How much do you want to add?: ");
                        int add = sc.nextInt();
                        u.getUser().get(x).getApp().add(add);
                    }else if (o.equals("r")) {
                        System.out.println("How much do you paid?: ");
                        int remove = sc.nextInt();
                        u.getUser().get(x).getApp().pay(remove);
                    }else if (o.equals("s")){
                        System.out.println("You have: ");
                        u.getUser().get(x).getApp().show();
                    }else if (o.equals("x")){
                        System.out.println("Good bye");
                        break;
                    }else{
                        System.out.println("Wrong command");
                    }
                }

            }
            else{
                System.out.println("This id or password is not match");
            }
        }
    }
}
