public class Main {
    public static void main(String[] args) {
                            //0   1     2     3     4     5     6     7     8      9     10    11     12    13    14
        double[] massive = {2.5, 3.5, -4.5, -3.5, 12.5, -7.5, -8.5, 9.5, -23.5, -76.5, -67.5, 54.5, -34.5, 24.5, 9.5};
        int positive = 0;
        double negative = 0;
        boolean nums = false;
        for (double carrentElement:massive ){
           if (carrentElement<0){
               nums = true;
           } else if (nums && carrentElement>0) {
               positive++;
               negative+=carrentElement;
           }
        }
        System.out.println(negative/positive);

    }
}
