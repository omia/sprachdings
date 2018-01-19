package util;

public class parser {

    public static void main(String[] args) {

    } // end of main

    public parser(){}

    public static String arrayToString(String[] a) {
        String s = "<begin>";
        for (int i =0 ;i < a.length;i++) s += "<" + i + ">" + a[i] + "</" + i + ">";
        s += "<end>";
        return s ;
    }

    private static  boolean Message_isComplete(String p){
        if(p.indexOf("<begin>")!=1 &&  p.indexOf("<end>")!=1  ) return true;
        return false;

    }

    public static  String[] StringtoArray(String a){
        String[] outputString;
        outputString = new String[1];
        if(Message_isComplete(a)) {
            int arguments_num = Integer.parseInt("" + a.charAt(a.indexOf("<end>") - 2)) + 1;
            outputString = new String[arguments_num];
            for (int i = 0; i < arguments_num; i++) {
                outputString[i] = a.substring(a.indexOf("<" + i + ">") + 3, a.indexOf("</" + i + ">"));
            }
            return outputString;
        }
        return outputString;
        }

    private static void teststringtoArray(){
        String[] b = StringtoArray("<begin><0>a</0><1>d</1><2>a</2><end>");
        for (int i = 0 ; i<b.length;i++){
            System.out.println(b[i]);

        }

    }

}