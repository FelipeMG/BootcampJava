public final class ArithmeticOperations {

    private ArithmeticOperations() throws InstantiationException {
        throw new InstantiationException("class should not be instantiated");
    }

    public static boolean isMultiple(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException();
        }
        return a % b == 0;
    }

    public static boolean isEven(int number){
        return isMultiple(number, 2);
    }

    public static boolean isOdd(int number){
        return !isMultiple(number, 2);
    }

}
