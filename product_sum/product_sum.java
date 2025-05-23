import java.util.List;

public class Main {

    public static int productSum(List<Object> array, int depth) {
        int sum = 0;
        
        for (Object item : array) {
            if (item instanceof List<?>) {
                sum += productSum((List<Object>) item, depth + 1);
            } else {
                sum += (int) item;
            }
        }

        return sum * depth;
    }

    public static void main(String[] args) {
        List<Object> array = List.of(1, List.of(2, 1));
        System.out.println(productSum(array, 1));  
    }
}
