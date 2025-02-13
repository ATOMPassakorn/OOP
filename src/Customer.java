import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    public Customer(){
        this("","");
        acct = new ArrayList();
    }
    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        acct = new ArrayList();
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
        return (Account)acct.get(index);
    }

    public int getNumOfAccount(){
        return acct.size();
    }

    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount+=1;
    }

    public String toString(){
        return this.getFirstName()+" "+this.getLastName()+" has "+this.getNumOfAccount()+" accounts.";
    }
}
