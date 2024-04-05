public class Compare {
    public void compareBananas(String first, String last){

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
        return;
    }
}
