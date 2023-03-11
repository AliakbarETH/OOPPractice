class Bank{
    String name, typeOfAccount , depositDate , withdrawDate ;
    int balance , depositAmount, withdrawAmount ;

    Bank(String name, String typeOfAccount, int balance ){
        this.name =  name ;
        this.typeOfAccount = typeOfAccount ;
        this.balance = balance ;
    }

    Bank( String depositDate, int depositAmount){
        this.depositAmount = depositAmount;
        this.depositDate = depositDate ;
    }

    Bank(int withdrawAmount, String withdrawDate){
        this.withdrawAmount = withdrawAmount ;
        this.withdrawDate = withdrawDate ;
    }

    Bank(int balance){
        this.balance = balance ;
    }

    public void getInfo(){
        System.out.println("This is the name of the person " + name );
        System.out.println("This is the type of the person " + typeOfAccount );
        System.out.println("This is the balance of the person " + balance );
    }

    public void cashDeposit(){
        System.out.println("This is the Deposit Amount of the person " + depositAmount );
        System.out.println("This is the Deposit Date of the person " + depositDate );
        
    }

    public void withdraw(){
        System.out.println("This is the withdraw Amount of the person " + withdrawAmount );
        System.out.println("This is the withdrawDate of the person " + withdrawDate );
        
    }

    public void statement(){
        System.out.println("This is the Final Balance of the person " + balance );
    
    }

    public static void main(String args []) {

        Bank b1 = new Bank("Ali", "Saving", 222) ;
        Bank b2 = new Bank("22 Dec 2022", 3333) ;
        Bank b3 = new Bank(3333, "33 jan") ;
        Bank b4 = new Bank(333333) ;

    }
}