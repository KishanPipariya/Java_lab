package Unit2;

class bank {
    double interestRate;
    bank(){
    }

    public double getInterestRate() {
        return interestRate;
    }

    public boolean lockerAvailability(){
        return false;
    }

    public void print(){
        System.out.println("Bank");
    }
}

class axis extends bank {
    public double getInterestRate() {
        interestRate = 7;
        return interestRate;
    }

    public boolean lockerAvailability() {
        return false;
    }
}

class sbi extends bank {
    public double getInterestRate() {
        interestRate = 7.2;
        return interestRate;
    }

    public boolean lockerAvailability() {
        return true;
    }

}

class icici extends bank {
    public double getInterestRate() {
        interestRate = 7.1;
        return interestRate;
    }

    public boolean lockerAvailability() {
        return false;
    }
}

class Test{
    public static void main(String[] args){
        icici ob1 = new icici();
        sbi ob2 = new sbi();
        axis ob3 = new axis();
        double f1;
        f1 = ob1.getInterestRate();

    }
}


