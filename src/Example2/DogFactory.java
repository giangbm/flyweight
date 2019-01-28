package Example2;

import java.util.HashMap;
import java.util.Map;

public class DogFactory {

    private static  final  Map<String, DogImpl> map = new HashMap<>();

    public static DogImpl createWithColorHair(String colorHair) {
        DogImpl dog = map.get(colorHair);
        if (dog == null) {
            dog = new DogImpl(colorHair);
            map.put(colorHair, dog);
        }
        return dog;
    }
}
