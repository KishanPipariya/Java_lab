package Unit2;
abstract class Food {
    String test;
    abstract void recipe(String ... a);
}

class Veg_Food extends Food{
    String SeasonName="Summer";
    void recipe(String...a){
        System.out.println(SeasonName);
        for (String i:a) {
            System.out.println(i);
        }
    }
}

class Dairy_product extends Veg_Food{
    Boolean availibility;
}
class NonVeg_Food extends Food{
    String Animal_Source="Pig";
    void recipe(String...a){
        System.out.println(Animal_Source);
        for (String i:a) {
            System.out.println(i);
        }
    }
}

class TestFood{
    public static void main(String[] args){
        Veg_Food v = new Veg_Food();
        v.recipe("h", "b");
        v.recipe("h");

    }
}
