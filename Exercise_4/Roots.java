
import java.util.ArrayList;
import java.util.List;

public class Roots {

    public static List<Double> solveQuadRoots(List<Double> list){
        List<Double> result = new ArrayList<>();
        Double a = list.get(0);
        Double b = list.get(1);
        Double c = list.get(2);
        Double x1 = (-b+Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5))/(2*a);
        result.add(x1);
        Double x2 = (-b-Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5))/(2*a);
        result.add(x2);
        return result;
    }
}