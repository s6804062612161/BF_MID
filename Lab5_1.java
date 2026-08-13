import java.util.Scanner;
import java.util.ArrayList;

public class Lab5_1 {

    public static double getAverage(ArrayList<Integer> list) {
        double sum=0;
        for (int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

    public static int getMax(ArrayList<Integer> list) {
        int max=list.get(0);
        for (int i=1; i<list.size();i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static int getMin(ArrayList<Integer> list) {
        int min=list.get(0);
        for (int i=1; i<list.size();i++){
            if (list.get(i)<min){
                min = list.get(i);
            }
        }
        return min;
    }

    // 4. เมธอดลบเลขคู่
    public static void removeEvenNumbers(ArrayList<Integer> list) {
        for (int i=0;i<list.size();i++){
            if (list.get(i)%2 == 0){
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        double avg = getAverage(list);
        int max = getMax(list);
        int min = getMin(list);
        
        removeEvenNumbers(list); 

        System.out.printf("%.2f\n", avg);
        System.out.println(max);
        System.out.println(min);
        
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}