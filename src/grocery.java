public class grocery {
    public static void main(String[] args) {
        grocerry houstonstore= new grocerry();
        grocery seattlestore = new grocery();
        grocery orlandstore = new grocery();

        houstonstore.numberofapplesold = 50;
        houstonstore.numberoforangesold = 500;
        houstonstore.priceofapple = 29.6;
        houstonstore.priceoforange = 12.9;

        System.out.println( "houston store apples sold :"+houstonstore.numberofapplesold);


    }
}

class grocerry{
    int numberofapplesold ;
    double priceofapple;

    int numberoforangesold;
    double priceoforange;
}


