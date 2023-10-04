public class Main {
    public static void main(String[] args) {
        String[][] strings={
                {"58"},
                {"1","2","3","4"},
                {"12","22","32","42"},
                {"15","25","35","45"},
                {"18","28","38","48"},

        };
        try {
            int result= ArrayValueCalculator.doCalc(strings);
            System.out.println(result);
        }catch (ArraySizeException exception){
            System.err.println("The array's size: "+exception.getMessage());
        }catch (ArrayDataException exception){
            System.err.println("The array's data: "+exception.getMessage());
        }

        String[][] strings2={
                {"fatality","2","3","4"},
                {"12","22","32","42"},
                {"15","25","35","45"},
                {"18","28","38","48"},

        };

        try {
            int result= ArrayValueCalculator.doCalc(strings2);
            System.out.println(result);
        }catch (ArraySizeException ex){
            System.err.println("The array's size: "+ex.getMessage());
        }catch (ArrayDataException ex){
            System.err.println("The array's data: "+ex.getMessage());
        }


    }
}