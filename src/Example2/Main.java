package Example2;


public class Main {
    public static void main(String[] args) {
        // create 4 dog color red & 6 dog color black
        createDog(2,"red","Pit bulls");
        createDog(3,"red","Huskis");
        createDog(4,"black","Poodles");
        createDog(5,"black","NTT");
    }

    public static void createDog(int number, String colorHair,String type) {
        for (int i = 0; i < number; i ++) {
            Dog dog = new Dog(type);
            DogImpl dogImpl = DogFactory.createWithColorHair(colorHair);
            dogImpl.promote(dog);
        }
    }
}
