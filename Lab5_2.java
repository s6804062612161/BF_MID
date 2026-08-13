import java.util.ArrayList;
import java.util.Scanner;

class Star {
    
    // 1. เมธอดเพิ่ม * ต่อท้ายสมาชิกทุกตัว
    public static void addStars(ArrayList<String> list) {
        for(int i=list.size()-1; i>=0; i--){
            list.add(i+1,"*");
        }
    }

    public static void removeStars(ArrayList<String> list) {
        for (int i=0; i<list.size();i++){
            if (list.get(i).equals("*")){
                list.remove(i);
                i--;
            }
        }
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                break;
            }
            list.add(sc.next());
        }

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int cmd = sc.nextInt();
                if (cmd == 1) {
                    Star.addStars(list);
                    System.out.println(list);
                } else if (cmd == 2) {
                    Star.removeStars(list);
                    System.out.println(list);
                }
            }
        }
        sc.close();
    }
}