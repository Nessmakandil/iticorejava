import java.util.Random;

public class arraySearch {

    public static double minSearch(double[] arr) {
        double min = arr[0];
        for (double i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Min= "+min);
        return min;
    }
    public static double maxSearch(double[] arr) {
        double max = arr[0];
        for (double i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max= "+max);
        return max;
    }
    public static void main(String[] args) {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(5000)/1.0;
        }
        long start1 = System.currentTimeMillis();
        maxSearch(arr);
        long end1 = System.currentTimeMillis();
        System.out.println("max method started at "+start1+" and ended at "+end1);
        System.out.println("maxSearch execution time "+ (end1-start1)+" ms");
        
        long start2 = System.currentTimeMillis();
        minSearch(arr);
        long end2 = System.currentTimeMillis();
        System.out.println("min method started at "+start2+" and ended at "+end2);
        System.out.println("minSearch execution time "+ (end2-start2)+" ms");
        
    }
    
}