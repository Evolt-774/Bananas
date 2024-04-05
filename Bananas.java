import java.util.*;

public class Bananas{
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        Concat cc = new Concat();

        String first, last;

        System.out.println("バナナのナス，バナナスを作ります");
        System.out.println("任意のAのBを入力してください");
        
        do{
            System.out.println("[A]");
            first = std.nextLine();
        }while((first == ""));
        
        do{
            System.out.println("[B]");
            last = std.nextLine();
        }while((last == ""));

        std.close();
        
        cc.concatBananas(first, last);

        
    }
}