class Vehicle{
    // variables

    int noOfSeats ;
    int noOfWheels ;

    // constructos

    Vehicle(){
        noOfSeats = 0 ;
        noOfWheels = 0 ;
    }

    Vehicle( int noOfSeats , int noOfWheels){
        this.noOfSeats = noOfSeats ;
        this.noOfWheels = noOfWheels ;
    }

    // methods

    // public String toString(){
    //     return this.noOfSeats + " " + this.noOfWheels ;
    // }

    public void printall() {
        System.out.println(this.noOfSeats + " " + this.noOfWheels) ;
    }

    
    public static void main(String args []) {
        Vehicle car = new Vehicle(4, 4) ;
        Vehicle motorcycle = new Vehicle(2, 2) ;

        // System.out.println(car.toString()) ;
        car.printall(); ;
    }
}