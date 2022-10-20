package Unit2;

public class multipleInheritance {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.eating();
        A.traveling();
    }
}
interface AnimalEat {
    void eating();
}
interface AnimalTravel {
    void traveling();
}
class Animal implements AnimalEat, AnimalTravel {
    public void eating() {
        System.out.println("Animal is eating.");
    }
    public void traveling() {
        System.out.println("Animal is travelling.");
    }
}