import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*2 * Отсортировать второй список методом sort списка и компаратором по уменьшению. */
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        task1.getList(list1,20);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());   //сортировка в обратном направлении
        System.out.println("Отсортированный первый список: " + list1);
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();
        task1.getList(list2,20);
        System.out.println(list2);
        list2.sort(new Comparator <Integer>(){
            @Override
            public int compare(Integer t0, Integer t1){
                return t1-t0;
            }
        });
        System.out.println("Отсортированный второй список: " + list2);
    }
}
