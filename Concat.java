

public class Concat {
    public void concatBananas(String first, String last){
        String tmp;
        StringBuilder sb = new StringBuilder();
        Compare cp = new Compare();
        
        cp.compareBananas(first, last);
        
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
