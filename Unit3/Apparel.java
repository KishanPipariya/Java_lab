package Unit3;

import java.util.Arrays;

public class Apparel {
    String itemId, itemType;
    double price;
    static int counter = 100;

    Apparel(double price, String itemType){
        this.price = price;
        this.itemType = itemType;
        itemId = String.valueOf(itemType.charAt(0)) + String.valueOf(++counter);
    }

    void calculatePrice(){
        price = 1.05 * price;
    }

    String getItemId(){
        return itemId;
    }

    void set_price(int price){
        this.price = price;
    }
}

class Cotton extends Apparel{

    double discount=0.1;

    Cotton(double price){
        super(price, "Cotton");
    }

    void calculatePrice(){
        super.calculatePrice();
        price = price * (1 - discount);
        price = 1.05 * price;
    }

    double getDiscount(){
        return discount;
    }
}

class Silk extends Apparel{

    int points;

    Silk(double price){
        super(price, "Silk");
    }

    void calculatePrice(){
        super.calculatePrice();
        if(price > 10000){
            points = 10;
        }
        else{
            points = 3;
        }
        price = 1.1 * price;
    }

    int getPoints(){
        return points;
    }
}

class ApparelTest{
    public static void main(String[] args){
        Cotton ob1 = new Cotton(1000);
        System.out.println("ID:" + ob1.getItemId() );
        ob1.calculatePrice();
        System.out.println("Price" +  ob1.price);
        Silk ob2 = new Silk(2000);
        System.out.println("ID:" + ob2.getItemId() );
        ob2.calculatePrice();
        System.out.println("Price" +  ob2.price);
    }
}
