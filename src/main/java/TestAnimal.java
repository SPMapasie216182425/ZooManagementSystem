public class TestAnimal {

    public static void main(String args[]){

        Animal[] myAnimal = new Animal[8];
        myAnimal[0] = new Cat(3,"Kit-kat",0.2,"Stripped","Cat Food");
        myAnimal[1] = new Dog(7,"Snoopy",0.4,"Black","Dog Food");
        myAnimal[2] = new Horse(14,"Champion",1.8,"Red and Black","Grass");
        myAnimal[3] = new Lion(5,"Simba",1.5,"Merron","Male");
        myAnimal[4] = new Cat(12,"Happy",0.04 ,"Gray","Milk");
        myAnimal[5] = new Dog(8,"Rova",0.6,"light red","Steak");
        myAnimal[6] = new Horse(34,"Reverse",1.3,"All Black","Salt");
        myAnimal[7] = new Lion(17,"Uber",2.0,"Red","Male");

        for(int k = 0; k < myAnimal.length; k++){

            System.out.println(myAnimal[k]);
         //   System.out.println();

        }



    }
}
