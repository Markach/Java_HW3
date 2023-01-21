import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. Удалить из первого списка элементы отсутствующие во втором списке.
 Отсортировать первый список методом sort класса Collections. */
public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getList(list1,20);
        getList(list2,20);
        System.out.print("Первый список: "+ list1);
        System.out.println();
        System.out.println("Второй список: "+ list2);
        list1.retainAll(list2);
        System.out.println("Новый первый список: "+ list1);
        Collections.sort(list1);          //сортировка списка в порядке возрастания
        System.out.println("Отсортированный новый первый список: "+ list1);
        }  

    public static ArrayList <Integer> getList(ArrayList<Integer> list, int len) {
        Random rnd = new Random(); 
        for (int index = 0; index < len; index++) {
            list.add(rnd.nextInt(0, 25));
        }
        return list;
    }   
}
