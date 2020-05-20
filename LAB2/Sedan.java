/**
 * 
 * @author Tom Bill Glinton Omuom
 * Admission Number: 097292
 * Email : tom.omuom@strathmore.edu
 * @author Mandy Achieng
 * Admission Number : 093058 
 * Email : mandy.achieng@strathmore.edu
 * @author Dennis Gikunyu
 * Admission Number : 
 * Email : dennis.gikunju@strathmore.edu
 */

/**
 * 
 * Sedan is a type of Automible and a Subclass of Vehicle
 */
class Sedan extends Vehicle implements Automobile {    
    /**
     * 
     * This is how to accelerate the car
     */
    public void accelerate(int newIncrement){
        speed = speed + newIncrement;
        System.out.println("Acceleration speed: "+speed+" km/h");
    }

    /**
     * 
     * This is how to stop the car
     */
    public void stop(int newDecrement){
        speed = speed - newDecrement;
        System.out.println("Deceleration speed: "+speed+" km/h");
    }

    /**
     * 
     * This is how to check for gas
     */
    public void gas(int newfuelCapacity){
        fuelCapacity = newfuelCapacity;
        System.out.println("Gas: "+fuelCapacity+" litres");
    }

    @Override
    void accelerate() {
        //
        System.out.println("The vehicle is accelerating"); 

    }

    @Override
    void stop() {
        // 

    }

    @Override
    void gas() {
        // 
    }

}