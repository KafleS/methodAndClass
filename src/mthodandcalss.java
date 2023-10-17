public class mthodandcalss {
    public  static  void main(String[] args) {
        aircraft.wings = 2;
        aircraft boeing = new aircraft(400,200,82.9,5.2);
        aircraft fighterplane = new aircraft(5,610,50,6.1);

        double boeingendurance = boeing.fuelcapacity / boeing.fuelburnrate;


//        boeing.passengers = 400;
//        boeing.cruiseSpeed = 200;
//        boeing.fuelcapacity = 82.9;
//        boeing.fuelburnrate = 5.2;
//
//        fighterplane.passengers = 5;
//        fighterplane.cruiseSpeed = 610;
//        fighterplane.fuelcapacity = 50;
//        fighterplane.fuelburnrate = 6.1;


        System.out.println(" boeing passengers: " + boeing.passengers+"\n");
       boeing.calculateEndurance();
        System.out.println(boeing.wings);







    }
}
class aircraft{
    int passengers;
    int cruiseSpeed;
    double fuelcapacity;
    double fuelburnrate;
    static int wings ;

     aircraft( int p, int c, double fc, double fbr){
         passengers = p;
         cruiseSpeed = c;
         fuelcapacity = fc;
         fuelburnrate = fbr;


     }

    public void calculateEndurance(){
        double enduranance = fuelcapacity/fuelburnrate;
        System.out.println("the endurance is "+ enduranance);
    }

}
