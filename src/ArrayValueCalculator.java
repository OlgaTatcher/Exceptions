public class ArrayValueCalculator {
    public static int doCalc(String[][] strings) throws ArrayDataException,ArraySizeException{
        if(strings.length!=4 || strings[0].length!=4 ){
            throw new ArraySizeException("The array must be 4x4 in size");
        }
        int totalAmount=0;
        for (int i=0;i< strings.length;i++){
            for (int j=0;j< strings.length;j++){
                totalAmount=Integer.parseInt(strings[i][j]);

            }
        }
        return totalAmount;
    }


}
