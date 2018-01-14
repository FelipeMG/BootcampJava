public final class YearOperations {

    private YearOperations() throws InstantiationException {
        throw new InstantiationException("class should not be instantiated");
    }

    public static boolean isLeapYear(int year){
        if(year == 0 ){
            throw new IllegalArgumentException();
        }
        return ArithmeticOperations.isMultiple(year,4) && (ArithmeticOperations.isMultiple(year,400) || !ArithmeticOperations.isMultiple(year,100));
    }
}
