

public class Concat {
    public void concatBananas(String first, String last){

        int move = 0;
        String tmp;
        StringBuilder sb = new StringBuilder();
        Compare cp = new Compare();
        
        move = cp.multiCompareBananas(first, last);
        
        if (first.length() == 1) {
            tmp = last;
        }else if (last.length() == 1) {
            tmp = first;
        }else{
            tmp = last.substring(move);
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
