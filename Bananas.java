import java.util.Scanner;
import java.io.File;

public class Bananas{
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String first, last;
        String result;
        File outputPath;

        System.out.println("バナナのナス，バナナスを作ります");
        outputPath = Output.bananasOutput(std);

        while(true){
            System.out.println("任意のAのBを入力してください");
            System.out.println("終了する場合は両方に何も入力しないでください．");

            System.out.println("[A]");
            first = std.nextLine();

            System.out.println("[B]");
            last = std.nextLine();

            if((first == "") && (last == "")){
                System.out.println("バナナスを終了します");
                System.exit(0);
            }
    
    
            result = Concat.concatBananas(first, last);
    
    
            System.out.println("");
    
            System.out.println(result);
    
            System.out.println("");
    
            Output.writeToFile(outputPath, result);
        }
    }
}