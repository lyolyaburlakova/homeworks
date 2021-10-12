import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Numbers {

    public static ArrayList<Integer> scann (int t) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scanlist = new ArrayList<>();
        System.out.println("Введите числа:");

        int c = 0;
        int y = 0;

        while (c < t && y == 0) {
            boolean b = in.hasNextInt();
            if (b == true) {
                int num = in.nextInt();
                scanlist.add(num);
                c++;
            } else {
                System.out.println("Ошибка");
                y++;
            }

            if (c == t) {
                System.out.println("Введено " + t + " чисел");
            }
        }

        in.close();
        return(scanlist);
    }

    public static void main(String[] args) throws Exception{
        int t = 20;
        ArrayList<Integer> numbers = scann(t);

        ArrayList<Integer> numberstwo = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            if (numbers.get(i) % 2 == 0){
                numberstwo.add(numbers.get(i));
            }
        }
        ArrayList<Integer> numbersthree = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            if (numbers.get(i) % 3 == 0){
                numbersthree.add(numbers.get(i));
            }
        }
        ArrayList<Integer> othernumbers = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            if (numbers.get(i) % 3 != 0 && numbers.get(i) % 2 != 0){
                othernumbers.add(numbers.get(i));
            }
        }

        printlist(numbers);
        printlist(numberstwo);
        printlist(numbersthree);
        printlist(othernumbers);
    }

    public static void printlist(ArrayList<Integer> list){
        System.out.println(list);
    }
}
