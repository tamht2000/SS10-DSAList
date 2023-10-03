package ra.bt.bt2;

import java.util.ArrayList;
import java.util.List;

public class DaoNguoc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        int n = (int) (Math.random()*20);
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 30));
        }
        System.out.println("List ban đầu: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        System.out.println("List mới khi đã đảo ngược: " + newList);
    }
}
