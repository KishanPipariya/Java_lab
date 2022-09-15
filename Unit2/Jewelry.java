package Unit2;

class Jewelry {
    String Jewelry_id;
    String Jewelry_type;
    int Price;
    static int Counter = 100;

    Jewelry(int price){
        this.Jewelry_id = String.valueOf(++Counter) + "G";
        this.Price = price;
    }
    Jewelry(){
        System.out.println("Super class");
    }

}
class Gold extends Jewelry {
    int discount;

    Gold(String Jewelry_type, int Price, int discount) {
        System.out.println("Sub-class");
        this.Jewelry_type = Jewelry_type;
        this.discount = discount;
        this.Price = Price;
    }

    void calculate_price() {
        Price = (int)(Price * 1.05) - (discount);
        System.out.println(Price);
    }
}
class Platinum extends Jewelry {
    int points;

    Platinum(String Jewelry_type, int Price) {
        System.out.println("Sub-class");
        this.Jewelry_type = Jewelry_type;
        this.Price = Price;
    }

    void calculate_price() {
        Price = (int)(Price*1.10);
        System.out.println(Price);
        points = 7;
        if(Price > 90000){
            points = 20;
        }
    }
}

class jewelry_test{
    public static void main(String args[]){
        Gold j = new Gold("Bangle",60000, 100);
        j.calculate_price();
    }
}

