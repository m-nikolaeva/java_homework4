/* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> taskList = new LinkedList<>();
        taskList.add("Один");
        taskList.add("2");
        taskList.add("3");
        taskList.add("Пять");
        taskList.add("7");
        System.out.println("Изначальный список:");
        System.out.println(taskList.toString());
        System.out.println("Перевернутый список:");
        System.out.println(reverseLst(taskList).toString());
    }

    public static LinkedList<String> reverseLst(LinkedList<String> lst) {
        LinkedList<String> resultLst = new LinkedList<>();
        for (int i = lst.size() - 1; i >= 0; i--) {
            resultLst.add(lst.get(i));
        }
        return resultLst;
    }
}
