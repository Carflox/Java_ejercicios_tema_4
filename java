public class SmartDevice {
    private String brand;
    private String model;
    private double price;
    
    public SmartDevice() {
        this.brand = "";
        this.model = "";
        this.price = 0.0;
    }
    
    public SmartDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public double getPrice() {
        return this.price;
    }
}

public class SmartPhone extends SmartDevice {
    private String operatingSystem;
    
    public SmartPhone() {
        super();
        this.operatingSystem = "";
    }
    
    public SmartPhone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
}

public class SmartWatch extends SmartDevice {
    private String color;
    
    public SmartWatch() {
        super();
        this.color = "";
    }
    
    public SmartWatch(String brand, String model, double price, String color) {
        super(brand, model, price);
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 12", 999.0, "iOS");
        System.out.println(phone.getBrand() + " " + phone.getModel() + " - " + phone.getOperatingSystem() + " - $" + phone.getPrice());
        
        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch 4", 249.99, "Black");
        System.out.println(watch.getBrand() + " " + watch.getModel() + " - " + watch.getColor() + " - $" + watch.getPrice());
    }
}
