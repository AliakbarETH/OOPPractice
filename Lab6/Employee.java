public class Employee{
    public String name ;
    public String qual ;
    public String grad ;

    public void intro(){
        System.out.println(this.name) ;
        System.out.println(this.qual) ;
        System.out.println(this.grad) ;
    }

    public static void main(String args[]) {
        Employee e1 = new Employee() ;
        e1.name = "Ali" ;
        e1.qual = "BS" ;
        e1.grad = "CS" ;

        e1.intro();

        Teacher t1 = new Teacher() ;
        t1.subject = "ABC" ;
        t1.techingMethod();

       
    }
}

class Professor extends Employee{
    public String publications ;
    public String experience ;

    public void ResearchPublications(){
        System.out.println(this.publications) ;
    }

    public void Experience(){
        System.out.println(this.experience) ;
    }
}

class Teacher extends Employee{
    public String subject ;

    public void techingMethod(){
        System.out.println(this.subject) ;
    }
}



