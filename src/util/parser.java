package util;

public class parser {

    public static void main(String[] args) {
            System.out.println(countSeperators("as" + '#' + "df" + '#' + "gh" + '#'));
    } // end of main

    public static String arrayToString(String[] a) {
        String s = "";
        for (int i = 1; i < a.length - 1; i++) s += a[i] + '#';
        return s;
    }

    private static int countSeperators(String a ){
        String temp = a ;
        int k = 0;
        while (temp.indexOf('#') > 0){
            k++;
            System.out.println(temp.indexOf('#'));
            temp = temp.substring( temp.indexOf('#')+1) ;
            System.out.println(temp);
            System.out.println(temp.indexOf('#'));
        }
        return k ;
    }


    public static String[] StringtoArray(String a){
       int seperators = countSeperators(a);
       String[] t =  new String[seperators] ;
       for(int i = 0 ; a.indexOf('#')>0; i++){
           t[i] = a.substring(0,a.indexOf('#')) ;
        }
        return t ;

}

}