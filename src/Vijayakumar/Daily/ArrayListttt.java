package Vijayakumar.Daily;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListttt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(n);
        for (int i = 0; i <n; i++) {
            list.add(i,new ArrayList<>());
            for (int j = 0; j <n; j++) {
                list.get(i).add(j,sc.nextInt());
            }

        }
        System.out.println(list);
    }
}
