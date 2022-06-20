import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner array=new Scanner(System.in);
        System.out.println ("enter int");
        int userInput=array.nextInt();
        int []array2 = new int[userInput];
        int counter =1;

        for (int i = 0; i <array2.length; i++) {
            array2[i] = counter;
            counter *= 2;

            System.out.println(array2[i]);

        }
}
}