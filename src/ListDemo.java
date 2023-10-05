import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Uy");
//        list.add("Thắng");
//        list.add("Tâm");
//        System.out.println(list);
//        list.set(1, "Nam");
//        list.remove("Nam");
//        System.out.println(list);
//        System.out.println(list.size());
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.contains("Tâm"));
//        System.out.println(list.isEmpty());

        LinkedList<String> linkerList = new LinkedList<>();
        linkerList.add("Tâm");
        linkerList.add(0,"Nam");
        System.out.println(linkerList);
        linkerList.addFirst("Khanh");
        linkerList.addLast("Hoàng");
        System.out.println(linkerList);
//        linkerList.pollFirst();
        linkerList.pop();
        System.out.println(linkerList);
        for (int i = 0; i < linkerList.size(); i++) {
            System.out.println(linkerList.get(i));
        }
        for (String s:linkerList) {
            System.out.println(s);
        }

    }
}
