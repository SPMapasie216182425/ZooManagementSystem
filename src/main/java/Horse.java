public class Horse extends Animal {

    private String food;

    public Horse(){
        super();
    }
    public Horse(int age, String name, double height, String color, String food){
        super();
        this.food = food;
    }



    @Override
    public String toString() {
        return super.toString() + "Food=" + food;
    }
}
