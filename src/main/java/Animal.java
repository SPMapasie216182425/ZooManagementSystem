import java.util.*;

public class Animal {
    private int age;
    private String name;
    private double height;
    private String color;

    public Animal(){
        super();
    }

    public Animal(int age, String name, double height, String color) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //method
    private void sound(){
        return;
    }

    @Override
    public String toString() {
        return "Animal" + " " +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", color='" + color + " ";
    }

}


