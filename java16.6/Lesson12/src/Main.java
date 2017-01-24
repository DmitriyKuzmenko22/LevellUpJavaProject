public class Main {

    public static void main(String[] args) {
        System.out.println(convertToString(1356));
    }
    public static String convertToString(int n){
        String res=null;

        String[]units={"","one","two","three","four","five","six",
                "seven","eight","nine","ten","eleven","tewlve","thirteen",
                "fourten","fifteen","sixteen","seventeen","eightten"
                ,"ne=ineteen"};
        String[] tens ={"","","tewnty","thirty","fourty","fifty","sixty","seventy",
        "eighty","ninety"};

        String[] hundreds = {"","one hundred",""};
        String[] thousand ={"","one thousand"};


        String un=n%100<20? units[n%100] :tens[100/10]+" "+units[n%10];
        String th=n/1000%100<20? units[n%100]+" thousand(s)" :hundreds[n/1000/100%10]+" "+units[n/1000%10];
        return thousand[n/1000%10]+" "+hundreds[n/100%10]+" "+un;
    }
}
