import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Solution
 */


public class Solution {    
    public static void main(String[] args) {
        
        Function<Double, Double> centigradeToFahrenheit = i-> (i*(9.0/5.0))+32.0;
        Function<List<Double>, List<Double>> getQuadraticRoot = Roots::solveQuadRoots;
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(5.0);
        list.add(6.0);
        System.out.println(centigradeToFahrenheit.apply(50.0));
        System.out.println(getQuadraticRoot.apply(list));
    }
}