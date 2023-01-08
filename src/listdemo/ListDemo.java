package listdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>  userAgeList = new LinkedList<>();
        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2,51);

        System.out.println("size = " + userAgeList.size());
        userAgeList.remove(3);
        System.out.println("contains = " + userAgeList.contains(12));
        System.out.println("indexOf = " + userAgeList.indexOf(12));
        System.out.println("Get = " + userAgeList.get(2));
        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(userAgeArray));
        System.out.println(userAgeList);
    }
}