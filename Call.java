import java.util.Scanner;

public class Call{
    public static void main(String[] args) {

        CoinCase MyCase = new CoinCase();

        for(int i = 0; i < 6; i++){
            System.out.println("硬貨の種類を入力してください。");
            Scanner sc  = new Scanner(System.in);
            int input = sc.nextInt();
            int kind = input;

            System.out.println("硬貨の枚数を入力してください。");
            sc  = new Scanner(System.in);
            input = sc.nextInt();
            int count = input;

            MyCase.AddCoins(kind, count);
        }

        System.out.print("500円は" + MyCase.GetCount(500) + "枚　" );
        System.out.print("100円は" + MyCase.GetCount(100) + "枚　" );
        System.out.print("50円は" + MyCase.GetCount(50) + "枚　" );
        System.out.print("10円は" + MyCase.GetCount(10) + "枚　" );
        System.out.print("5円は" + MyCase.GetCount(5) + "枚　" );
        System.out.println("1円は" + MyCase.GetCount(1) +"枚" );

        System.out.print("総計は" + MyCase.GetAmount() +"円です。" );
    }
}