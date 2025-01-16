public class Account {
    public double balance;
    public String name;
    public Account(double balance,String name){
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double a){
        if(a>=0){
            this.setBalance(this.getBalance()+a);
            System.out.println(a+" baht is deposited to "+this.getName()+".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if(a>=0){
            this.setBalance(this.getBalance()-a);
            System.out.println(a+" baht is withdrawn from "+this.getName()+".");
        }else if(a<0) {
            System.out.println("Input number must be a positive integer.");
        }else if(this.getBalance()-a<0){
            System.out.println("Not enough money!");
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(this.getName()+" account has "+this.getBalance()+" baht.");
    }
}