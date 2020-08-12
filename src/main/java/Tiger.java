public class Tiger extends Animal{

    private String weight;

    public Tiger(){
        super();
    }
    public Tiger(int age, String name, double height, String color,String weight){
        super(age,name,height,color);
        this.weight = weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + " " +"Tiger" +
                "weight='" + weight + '\'';
    }
}
