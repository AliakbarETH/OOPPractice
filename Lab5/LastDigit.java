public class LastDigit {

    int num ;

    public static int LastDigit(int num) {
        int reminder ;
        reminder = num % 10 ;

        return reminder ;
    }

    public static void main(String args []) {

        System.out.println(LastDigit.LastDigit(445455)) ;

    }
    
}
