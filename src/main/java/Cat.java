public class Cat extends Animal {

    private String food;

    public Cat(){

        super();
    }
    public Cat(int age, String name, double height, String color, String food){
        super();
        this.food = food;
    }




    @Override
    public String toString() {
        return super.toString() + "food=" + food;
    }
}
