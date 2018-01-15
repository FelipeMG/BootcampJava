import java.util.Arrays;

public final class TriangleOperations {

    public static boolean sideValidation(Length[] sides) {
        Length[] orderedSides = Arrays.copyOf(sides,sides.length);
        Arrays.sort(orderedSides);
        return orderedSides[2].getMeasure() < orderedSides[1].getMeasure() + orderedSides[0].getMeasure();
    }
}
