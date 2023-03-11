

public class PassByRef {
    int a = 220 ;

    public void print(PassByRef p) {
        System.out.println("Pass by reference is : " + p.a) ;
    }

    public static void main(String args[]) {
        PassByRef obj = new PassByRef();
        obj.print(obj) ;

        System.out.println("The origional value is : " + obj.a) ;
        
    }
}
