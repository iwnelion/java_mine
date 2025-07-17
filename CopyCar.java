public class CopyCar {
    private String make;
    private String model;
    private int year;
    
    CopyCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    //constructor for copying
    CopyCar(CopyCar textCar) {
        this.copy(textCar);
    }
    
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void copy(CopyCar x){
        this.make = x.getMake();
        this.model = x.getModel();
        this.year = x.getYear();
    }
}
