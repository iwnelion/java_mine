public class AppDrivers {
    public static void main(String[] args) {
        //uses: Driver, Charles, Max, Lando
        //polymorphism: the ability of an object to identify as more than one type
        Lando lando = new Lando();
        Max max = new Max();
        Charles charles = new Charles();

        //array of Driver objects since they all extend Driver
        Driver[] drivers={lando, max, charles};

        for(Driver driver : drivers){
            driver.move();      //calls the move method of each driver
        }
    }
}
