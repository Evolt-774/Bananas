import java.util.*;

public class Bananas{
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        Concat cc = new Concat();

        String first, last;

        System.out.println("バナナのナス，バナナスを作ります");
        System.out.println("任意のAのBを入力してください");
        System.out.println("[A]");
        do{
            first = std.nextLine();
        }while((first == ""));
        System.out.println("[B]");
        do{
            last = std.nextLine();
        }while((last == ""));

        cc.concatBananas(first, last);

        std.close();
    }
}