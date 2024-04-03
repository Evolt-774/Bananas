

public class Concat {
    public void concatBananas(String first, String last){
        String tmp;
        StringBuilder sb = new StringBuilder();
        if(first == "" || last == ""){
            System.out.println("error!:空文字です．");
            return;
        }

        String firstLast = first.substring(first.length() - 1);
        String lastFirst = last.substring(0,1);

        if(!firstLast.equals(lastFirst)){
            System.out.println("error!:文字の前後が等しくありません．");
            return;
        }

        
        if (first.length() == 1) {
            tmp = last;
        }else if (last.length() == 1) {
            tmp = first;
        }else{
            tmp = last.substring(1);
            sb.append(first);
            sb.append(tmp);

            tmp = sb.toString();
        }
        

        System.out.println("");

        System.out.println(first + "の" + last);
        System.out.println("");
        System.out.println(tmp);
        System.out.println("");

    }
}
