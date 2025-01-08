public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public boolean equals(Employee e){
        return this.name.equals(e.name);
    }
    public String toString(){
        return "My name is "+ name +". \n" + "I have "+ energy +" energy left.\n" + "I have a balance of "+ wallet.getBalance() + " baht.";
    }
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if(food!=null){
            this.eat(food);
            return true;
        }else {
            return false;
        }
    }
    public void eat(Food f){
        this.energy+=Food.getEnergy();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setWallet(Wallet wallet){
        this.wallet=wallet;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }
    public int getEnergy(){
        return energy;
    }
    public static void setNationality(String nationality){
        Employee.nationality=nationality;
    }
    public static String getNationality(){
        return nationality;
    }
}
