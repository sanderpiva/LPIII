package article_code.model;

public class Motorcycle extends Vehicle {

    private String type, brand, model, color;
    private int year;
    private String engineType;
    private double additionForMotoSale = 1.2;

    public Motorcycle(String type, String brand, String model) {
        super(type, brand, model);
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double additionForSale() {
        return this.additionForMotoSale;
    }

    @Override
    public String vehicleData() {
        return super.vehicleData() + "\nCor: " + this.color + "\nAno: " + this.year + "\nMotor: " + this.engineType;
    }

    @Override
    public String vehicleValue() {
        return "Valor venda da moto: " + "R$" + (super.getValue() * additionForMotoSale);
    }
}
