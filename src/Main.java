public class Main {
    public static void main(String[] args) {
                            //0   1     2     3     4     5     6     7     8      9     10    11     12    13    14
        double[] massive = {2.5, 3.5, -4.5, -3.5, 12.5, -7.5, -8.5, 9.5, -23.5, -76.5, -67.5, 54.5, -34.5, 24.5, 9.5};
        for (double carrentElement:massive ){
            System.out.println("hi "+ carrentElement);

            System.out.println("gog "+(((massive[4])+(massive[7])+(massive[11])+(massive[13])+(massive[14]))/5));
        }
        

    }
}