/*3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов. */
import java.util.ArrayList;
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        task1.getList(list1,20);
        System.out.println(list1);
        sortList(list1);
        System.out.println(list1);
    }

    public static void sortList(ArrayList<Integer> list1) {
        int index = list1.size();
        int buf;
        for(int i = 0; i < index - 1; i++) {
            boolean sort = false;
            for (int j = 0; j < index-i-1; j++) {
                if(list1.get(j) > list1.get(j + 1)){ 
                
                buf = list1.get(j);
                list1.set(j, list1.get(j+1));
                list1.set(j+1, buf);
                sort = true;
                }   
            }
            if (!sort) break;
        }}
    }
