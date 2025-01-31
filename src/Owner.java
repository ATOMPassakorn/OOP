/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ATOMPassakorn
 */
public class Owner {
    protected final String name;
    protected Animal animal;

    public Owner() {
        this("", null);
    }

    public Owner(String name) {
        this(name, null);
    }

    public Owner(Animal animal) {
        this("", animal);
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void feedFood(Food f) {
        this.animal.setPower(this.animal.getPower()+f.getPower());
    }

    @Override
    public String toString() {
        return "Owner : name = " + this.getName() +", "+ animal.toString();
    }

    public void protectOwnerFrom(Animal a) {
        if (this.animal instanceof Dog) {
            ((Dog) this.animal).kick(a);
        } else if (this.animal instanceof Pigeous) {
            ((Pigeous) this.animal).wingAttack(a);
        }
    }
}
