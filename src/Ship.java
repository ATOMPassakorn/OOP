public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        if(this.getFuel()>=50){
            for(int i=0;i<distance;i++){
                this.fl0at();
            }
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void fl0at(){
        if(this.getFuel()>=50){
            this.setFuel(this.getFuel()-50);
            System.out.println("Ship moves");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        if(this.getFuel()>=10){
            this.setFuel(this.getFuel()-10);
            System.out.println("Engine starts");
        }else{
            System.out.println("Engine stops");
        }
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhhh");
    }
}
