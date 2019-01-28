package Example2;

/**
 * Concrete Flyweight
 */
public class DogImpl implements IAnimal {

    // Intrinsic State
    private String colorHair;

    public DogImpl(String colorHair) {
        this.colorHair = colorHair;
        System.out.println("Create dog with color hair: "+ colorHair);
        System.out.println("---------------");
    }

    @Override
    public void promote(Dog dog) {
        System.out.println("Name: "+ dog.getName() + " - type: "+ dog.getType() + " - "+  colorHair);
    }
}
