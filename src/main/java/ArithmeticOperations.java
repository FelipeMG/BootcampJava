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

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c){
        return max(a,max(b,c));
    }

    public static double firstSequence(int n){
        if(n == 1){
            return 1.0;
        }
        else{
            return 1.0/n + firstSequence(n-1 );
        }
    }

}
