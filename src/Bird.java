public abstract class Bird implements Flyable{
    private double wingSize;
    private double weight;
    private double height;
    public Bird(){
        this(0.0,0.0,0.0);
    }
    public Bird(double wingSize,double weight,double height){
        this.setWingSize(wingSize);
        this.setWeight(weight);
        this.setHeight(height);
    }
    public void eat(double food){
        if(food>0){
            this.setWeight(this.getWeight()+food);
        }else{
            System.out.println("Input cannot be negative number.");
        }
    }
    public void setWingSize(double wingSize){
        this.wingSize=wingSize;
    }
    public double getWingSize(){
        return wingSize;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }

}
