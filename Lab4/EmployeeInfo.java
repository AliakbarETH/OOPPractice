public class EmployeeInfo {
    String name  ;
    String dateOfJoining ;
    String address ;
    int salary ;
    int noOfHours ;
    
    EmployeeInfo(){
        this.name = "" ;
        this.dateOfJoining = "";
        this.address = "" ;
        this.salary = 0 ;
        this.noOfHours = 0 ;


    }

    EmployeeInfo( String name, String dateOfJoining, String address, int salary, int noOfHours){
        this.name = name  ;
        this.dateOfJoining = dateOfJoining ;
        this.address = address ;
        this.salary = salary ;
        this.noOfHours = noOfHours ;


    }

    public void getInfo(int salary, int noOfHours){
        System.out.println(this.name + " " + this.address + " " + this.dateOfJoining + " "  + salary + noOfHours);
        
    }

    public void addWork(){
        
    }

    public static void main (String args []) {

    }

}
