import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    public static void bananasOutput(String Bananas, Scanner scanner) {
        JFileChooser ch = new JFileChooser();
        ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String strclass = System.getProperty("user.dir");
        String select;

        ch.setSelectedFile(new File(strclass));

        System.out.println("【現在の.txtファイル出力先】" + strclass);

        do {
            System.out.println("変更しますか? [Y/n]");
            select = scanner.nextLine().toLowerCase();
        } while (!(select.equals("y") || select.equals("n")));

        if (select.equals("y")) {
            int result = ch.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = ch.getSelectedFile();
                writeToFile(file, Bananas);
            } else {
                System.out.println("ファイルの選択がキャンセルされました．");
            }
        } else {
            File file = ch.getSelectedFile();
            writeToFile(file, Bananas);
        }
    }

    private static void writeToFile(File file, String content) {
        System.out.println(file.toString() + "/Bananas.txtにバナナスを出力しました．");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.toString() + "/Bananas.txt", true))) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("ファイルへの書き込み中にエラーが発生しました: " + e.getMessage());
        }
    }
}
