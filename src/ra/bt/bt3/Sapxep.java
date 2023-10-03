package ra.bt.bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sapxep {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(3);
        lists.add(4);
        lists.add(40);
        lists.add(6);
        lists.add(12);
        lists.add(25);

        Collections.sort(lists);
        Collections.reverse(lists);
        System.out.println(lists);


    }
}
