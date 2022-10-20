package Unit2;

public interface Travelling {
    int percentage_advance_price = 10;
    double Calc_discount(int packageprice);
    void setPackage(int price);
    int getPackage();
}

class Domestic implements Travelling{
    String SeasonName;
    int percentage_advance_price = 1000;
    public double Calc_discount(int packageprice){
        return 0.2*packageprice;
    }
    public void setPackage(int price){
        System.out.println(price*2000);
    }

    public int getPackage(){
        return percentage_advance_price;
    }
}

class International implements Travelling{
    int percentage_advance_price = 10000;
    public double Calc_discount(int packageprice){
        return 0.2*packageprice;
    }
    public void setPackage(int price){
        System.out.println(price*2000);
    }

    public int getPackage(){
        return percentage_advance_price;
    }

    boolean getVisa(String CountryName){
        if(CountryName.equals("Bulgaria")){
            return true;
        }
        else{
            return false;
        }
    }
}
