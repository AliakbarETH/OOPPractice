public class Employee {
    String name  ;
    String dateOfJoining ;
    String address ;
    int salary ;
    
    Employee(){
        this.name = "" ;
        this.dateOfJoining = "";
        this.address = "" ;
        this.salary = 0 ;

    }

    Employee( String name, String dateOfJoining, String address, int salary){
        this.name = name  ;
        this.dateOfJoining = dateOfJoining ;
        this.address = address ;
        this.salary = salary ;

    }

    public String toString(){

        return (this.name + " " + this.dateOfJoining + " " + this.address + " " + this.salary) ;
    }

    public static void main(String args []) {
        Employee e1 = new Employee("Asif" , "2022" , "Daharki", 0);
        Employee e2 = new Employee("Ahmed" , "2021" , "Ghotki", 0);
        Employee e3 = new Employee("Shoaib" , "2010" , "Sukkur", 0);
        Employee e4 = new Employee("Shahzaib" , "2020" , "Hyderabad", 0);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

    }
}
