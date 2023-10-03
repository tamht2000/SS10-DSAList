package ra.bt.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n = (int) (Math.random()*10);
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 50));
        }
        System.out.println(list);

        System.out.println("Phần tử lớn nhất là: " + Collections.max(list));
        System.out.println("Phần tử nhỏ nhất là: " + Collections.min(list));
    }
}
