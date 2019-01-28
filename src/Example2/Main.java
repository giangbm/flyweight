package Example2;

public class Main {
    public static void main(String[] args) {
        // create 3 dog color red & 5 dog color black
        createDog("apple","red","Pit bulls");
        createDog("orange","red","Huskis");
        createDog("coconut","red","Huskis");
        createDog("apricot","black","Poodles");
        createDog("blue berry","black","NTT");
        createDog("banana","black","NTT");
        createDog("mango","black","Poodles");
        createDog("strawberry","black","Huskis");
    }

    public static void createDog(String name, String colorHair,String type) {
            Dog dog = new Dog(name, type);
            DogImpl dogImpl = DogFactory.createWithColorHair(colorHair);
            dogImpl.promote(dog);
    }
}
