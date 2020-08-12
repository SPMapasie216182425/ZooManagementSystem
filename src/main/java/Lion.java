public class Lion extends Animal {

    private String sex;

    public Lion() {
        super();
    }

    public Lion(int age, String name, double height, String color, String sex) {
        super(age, name, height, color);
        this.sex = sex;

    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    @Override
    public String toString() {
        return super.toString() +"Lion" +
                "sex='" + sex + '\'';

    }
}
