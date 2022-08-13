package article_code.model;

public abstract class Vehicle {
    
    private String brand;
    private String model;
    private String type;
    private double value;
    
    public Vehicle(String type, String brand, String model){
        this.type = type; 
        this.brand = brand;
        this.model= model; 
        
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
   
    public String vehicleData(){
        return "Tipo: "+this.type+"\nMarca: "+this.brand+
                " Modelo: "+this.model;
    }
    
    public abstract String vehicleValue();
    
    public abstract double additionForSale();
             
}
