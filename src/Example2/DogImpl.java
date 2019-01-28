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
    }

    @Override
    public void create(Dog dog) {
        System.out.println("Info " + "name :" + dog.getName()
                                        + " - type: "+ dog.getType() + " - "+  colorHair);
    }
}
