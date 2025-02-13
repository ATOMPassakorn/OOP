public class Customer2 {
    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount;
    public Customer2(){
        this("","");
        acct = new Account[5];
    }
    public Customer2(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        acct = new Account[5];
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount(int index){
        return acct[index];
    }

    public int getNumOfAccount(){
        return numOfAccount;
    }

    public void addAccount(Account acct){
        this.acct[numOfAccount]=acct;
        numOfAccount+=1;
    }

    public String toString(){
        return this.getFirstName()+" "+this.getLastName()+" has "+this.getNumOfAccount()+" accounts.";
    }
}
