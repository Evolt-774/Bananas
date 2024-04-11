import com.ibm.icu.text.Transliterator;

public class Compare {
    public int compareBananas(String first, String last){

        if(first == "" || last == ""){
            System.out.println("error!:空文字です．");
            System.exit(1);
        }

        String firstLast = first.substring(first.length() - 1);
        String lastFirst = last.substring(0,1);

        if(!firstLast.equals(lastFirst)){
            System.out.println("error!:文字の前後が等しくありません．");
            System.exit(1);
        }
        return 1;
    }

    public int multiCompareBananas(String first, String last){
        int count = 0;
        int N = first.length();
        int M = last.length();
        int move = -1;
        String transFirst, transLast;
        boolean match = true;
        Transliterator tr = Transliterator.getInstance("Katakana-Hiragana");

        transFirst = tr.transliterate(first);
        transLast = tr.transliterate(last);

        if(transFirst.matches("(\s|　)") || transLast.matches("(\s|　)")){
            System.out.println("error!:引数が空白です.");
            System.exit(1);
        }

        if(N >= M){
            count = M;
        }else{
            count = N;
        }

        for(int i = 0; i < count; i++){
            match = true;
            
            for(int j = 0; j <= i; j++){
                if(transFirst.charAt((N - 1) - i + j) != transLast.charAt(j)){
                    
                    match = false;
                    break;
                }
            }

            if(match){
                move = i;
            }
        }

        if(move == -1){
            System.out.println("error!:文字の前後が等しくありません．");
            System.exit(1);
        }

        return move + 1;

    }
}
