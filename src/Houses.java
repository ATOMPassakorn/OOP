/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ATOMPassakorn
 */
public abstract class Houses {
    private String color;
    private String name;
    public Houses(){
        this("", "");
    }
    public Houses(String name,String color){
        this.name=name;
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[House] : "+this.getName()+" , Color : "+this.getColor();
    }
    
}
