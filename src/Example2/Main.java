package Example2;

public class Main {
    public static void main(String[] args) {
        // create 3 dog color red & 5 dog color black
        createDog("apple",ColorHair.RED,"Pit bulls");
        createDog("orange",ColorHair.RED,"Huskis");
        createDog("coconut",ColorHair.RED,"Huskis");

        createDog("apricot",ColorHair.BLACK,"Poodles");
        createDog("blue berry",ColorHair.BLACK,"NTT");
        createDog("banana",ColorHair.BLACK,"NTT");
        createDog("mango",ColorHair.BLACK,"Poodles");
        createDog("strawberry",ColorHair.BLACK,"Huskis");
    }

    public static void createDog(String name, ColorHair colorHair, String type) {
            Dog dog = new Dog(name, type);
            DogImpl dogImpl = DogFactory.createWithColorHair(colorHair.name());
            dogImpl.promote(dog);
    }
}
