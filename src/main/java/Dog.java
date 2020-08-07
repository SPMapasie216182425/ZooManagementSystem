public class Dog extends Animal {

    private String food;

    public Dog(){
        super();
    }

    public Dog(int age, String name, double height, String color, String food){
        super();
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString() + "Food=" + food;
    }
}
