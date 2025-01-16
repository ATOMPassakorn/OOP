public class Main { 
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1000,"61070033",0);
        a1.showAccount();
        a1.deposit(500);
        a1.setCredit(1000);
        System.out.println(a1);
        a1.withdraw(-1);
        System.out.println(a1);
        a1.withdraw("2000");
    }
}