package Example2;


public class Main {
    public static void main(String[] args) {
        createDog("red", "meo meo", "Pit bulls");
        createDog("red", "gau gau", "Huskis");
        createDog( "red", "name1", "type5");
        createDog( "red", "name2", "type6");
        createDog( "black", "mickey", "Poodles");
        createDog( "black", "jerry", "NTT");
        createDog( "black", "name3", "type1");
        createDog( "black", "name4", "type2");
        createDog( "black", "name5", "type3");
        createDog( "black", "name6", "type4");
    }

    public static void createDog( String colorHair, String name, String type) {
            Dog dog = new Dog(name, type);
            DogImpl dogImpl = DogFactory.createWithColorHair(colorHair);
            dogImpl.create(dog);
    }
}
