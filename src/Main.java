import java.util.Scanner;


//Kicik kalkulyator programi yazin:
//Telebler: Proqram baslayan kimi ekranda edilebilecek operasiyalar cap olunmalidi
//(1. Add, 2. Subtract, 3. Multiply, 4. Divide).
//Userden her hansi bir secim etmesini isteyin, user yuxaridaki reqemlerden 1ni yazabiler,
//1,2,3 ve ya 4 Istifadeciden iki eded daxil etmesini isteyin (ilk once birini daha sonra digerini)
//Secimin ve ededlerin esasinda emeliyyati icra edin. Hesablamadan cixan cavabi ekranda cap edin
//Cavabi cap edenden sonra istifadeciden davam etmek isteyib istemediyini sorusun,
//eger davam etmek istese yeni hesablamaya baslayin
// Proqramda olmali metodlar:
//add: parametrinde iki eded alib hemin ededlerin cemini qaytarmalidir
//subtract: parametrinde iki eded alib birinci ededden ikincini cixib cavabi qaytarmalidir
//multiply: parametrinde iki eded alib hemin ededlerin hasilini qaytarmalidir
//divide: parametrinde iki eded alib ilk ededi ikinci edede bolub cavabi qaytarmalidir
//


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        boolean check = true;
        while (check) {

            Scanner task = new Scanner(System.in);
            System.out.println("1 - Add. ");
            System.out.println("2 - Subtract. ");
            System.out.println("3 - Multiply. ");
            System.out.println("4 - Divide. ");
            System.out.print("Prosesi secin: ");
            int proses = task.nextInt();

            System.out.print("1-ci ededi daxil edin: ");
            int eded1 = task.nextInt();
            System.out.print("2-ci ededi daxil edin: ");
            int eded2 = task.nextInt();

            switch (proses) {
                case 1 -> System.out.println(add(eded1, eded2));
                case 2 -> System.out.println(subtract(eded1, eded2));
                case 3 -> System.out.println(multiply(eded1, eded2));
                case 4 -> System.out.println(divide(eded1, eded2));
            }

            boolean check2 = true;
            while (check2) {

                System.out.println("davam etmek isteyirsizmi:(yes - 1 / no - 2) ");
                int choose = task.nextInt();

                if (choose == 1) {
                    check = true;
                    check2 = false;
                } else if (choose == 2) {
                    check = false;
                    check2 = false;
                } else{
                    check2 = true;
                }
            }
        }
    }

    public static int add(int eded1, int eded2) {
        return eded1 + eded2;
    }

    public static int subtract(int eded1, int eded2) {
        return eded1 - eded2;
    }

    public static int multiply(int eded1, int eded2) {
        return eded1 * eded2;
    }

    public static int divide(int eded1, int eded2) {
        return eded1 / eded2;
    }
}