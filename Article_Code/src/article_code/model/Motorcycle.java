package article_code.model;

public class Motorcycle extends Vehicle {

    private String color;
    private int year;
    private String engineType;
    private final double ADDITIONforMotoSale;

    public Motorcycle(String type, String brand, String model) {
        super(type, brand, model);
        this.ADDITIONforMotoSale = 1.2;
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
        return this.ADDITIONforMotoSale;
    }

    @Override
    public String vehicleData() {
        return super.vehicleData() + "\nCor: " + this.color + "\nAno: " + this.year + "\nMotor: " + this.engineType;
    }

    @Override
    public String vehicleValue() {
        return "Valor venda da moto: " + "R$" + (super.getValue() * ADDITIONforMotoSale);
    }
}
