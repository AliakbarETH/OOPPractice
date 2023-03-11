class Info {
    String name ;
    String qual ;
    static String dept = "CS" ;
    int val = 1;

    Info (String name, String qual){
        this.name = name ;
        this.qual = qual ;
        this.dept = dept ;
    }

    public void PassByValue(int val){
        val = val+5 ;
        System.out.println("Pass by Value : " + val ) ;
    } 
    public String toString()
    {
        return (this.name + " " + this.qual + " " + this.dept ) ;
    }

    public static void main(String args[]){
        Info e1 = new Info("Ali", "BSCS") ;
        e1.PassByValue(44);
        System.out.println(e1.val) ;

        System.out.println(e1.toString()) ;

        System.out.println(StaticClass.print()) ;
    }
    
}

class StaticClass {
    public static String print(){
        return" Hello I am static mthod of class Static class";
    }
}
