import java.util.ArrayList;
import java.util.List;

public class reduce {
    public static void reduce(Lambda lambda, int[] mas) {
        int a = mas.length;
        List list = new ArrayList<>();
        int value = lambda.lambda(mas[0], mas[1]);
        for (int i = 1; i < a - 1; i++) {
            int x = value;
            int y = mas[i + 1];
            value = lambda.lambda(x, y);
            list.add(value);

        }
            System.out.println(list.get(list.size() - 1));

    }

}
