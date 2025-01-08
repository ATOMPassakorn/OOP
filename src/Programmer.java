public class Programmer extends Employee {
    private int happiness;
    public void coding(String str){
        if(this.getEnergy()>=30){
            System.out.println("Your code is "+str);
            this.setEnergy(this.getEnergy()-30);
            this.setHappiness(this.getHappiness()-30);
        } else{
            System.out.println("Error Error Error");
            this.setEnergy(this.getEnergy()-30);
            this.setHappiness(this.getHappiness()-30);
        }
        }
    public void coding(char str){
        if (this instanceof SeniorProgrammer) {
            if(this.getEnergy()>=10){
                System.out.println("I'm coding about "+str);
                this.setEnergy(this.getEnergy()-5);
                this.setHappiness(this.getHappiness()-5);
            } else {
                System.out.println("ZzZzZz");
                this.setEnergy(this.getEnergy()-5);
                this.setHappiness(this.getHappiness()-5);
            }
        } else{
            if (this.getEnergy() >= 30) {
                System.out.println("Your code is " + str);
                this.setEnergy(this.getEnergy()-30);
                this.setHappiness(this.getHappiness()-30);
            } else {
                System.out.println("Error Error Error");
                this.setEnergy(this.getEnergy()-30);
                this.setHappiness(this.getHappiness()-30);
            }
        }
    }
    public void setHappiness(int happiness){
        this.happiness=happiness;
    }
    public int getHappiness(){
        return happiness;
    }
}
