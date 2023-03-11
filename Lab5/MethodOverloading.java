class MethodOverloading {
    
    int length , width , age;
    String name ;
    double mass, acceleration ;

    MethodOverloading(
        int length,
        int  width, 
        int age,
        String name,
        double mass,
        double acceleration){
            this.length = length ;
            this.name = name ;
            this.age = age ;
            this.width = width ;
            this.mass = mass ;
            this.acceleration = acceleration ;
        }

    public int AreaRectangle(int length , int width){
        return length * width ;
    }

    public String Intro(String name, int age) {
        return (this.name + " " + this.age ) ;
    }

    public double Force(double mass, double acceleration) {
        return ( mass * acceleration) ;
    }

    public static void main(String args[]) {

        MethodOverloading m1 = new MethodOverloading(22,33, 44, "Ali", 44, 55) ;

        System.out.println(m1.AreaRectangle(33, 55));
        System.out.println(m1.Intro("Ali", 55));
        System.out.println(m1.Force(33, 55));



    }
    
}
