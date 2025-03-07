public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit=0;
    }
    public CheckingAccount(double balance,String name,double credit){
        super(balance, name);
        this.credit=credit;
    }
    public void setCredit(double credit){
        if(credit>=0){
            this.credit=credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double a) throws WithdrawException{
        if(this.getBalance()+this.getCredit()<a){
            throw new WithdrawException("Account "+ this.getName() +" has not enough money!");
        }
        if(a>=0){
            if(this.getBalance()-a>=0){
                this.setBalance(this.getBalance()-a);
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
            }else if(this.getBalance()-a<0 & (this.getBalance()-a)+this.getCredit()>=0) {
                this.setCredit(this.getCredit()+this.getBalance()-a);
                this.setBalance(0);
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
            }else if(this.getBalance()-a<0 & (this.getBalance()-a)+this.getCredit()<0){
                System.out.println("Not enough money!");
            }
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(String a) throws WithdrawException {
        double amount = Double.parseDouble(a);
        this.withdraw(amount);
    }
    public String toString(){
        return "The "+this.getName()+" account has "+this.getBalance()+" baht and "+this.getCredit()+" credits.";
    }
}
