package Unit2;

class employee {
    String name;
    int salary;
    employee(String name, int salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterised constructor of superclass");
    }
    employee(){
        System.out.println("Default constructor");
    }
}

class professor extends employee{
    int noOfSubjects;
    professor(String name, int salary, int noOfSubjects){
        super(name,salary);
        this.noOfSubjects = noOfSubjects;
    }
    professor(String name){
        this.name = name;
    }
}

class test{
    public static void main(String[] args){
        professor ob1 = new professor("1");
        professor ob2 = new professor("2", 90000, 3);
    }
}
