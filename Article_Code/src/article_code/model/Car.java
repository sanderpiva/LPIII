package article_code.model;

public class Car extends Vehicle {

    private String color;
    private int year;
    private String engineType;
    private final double ADDITIONforCarSale;

    public Car(String type, String brand, String model) {
        super(type, brand, model);
        this.ADDITIONforCarSale = 1.3;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineType() {
        return engineType;
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
        return ADDITIONforCarSale;
    }

    @Override
    public String vehicleData() {
        return super.vehicleData() + "\nCor: " + this.color + "\nAno: " + this.year + "\nMotor: " + this.engineType;
    }

    @Override
    public String vehicleValue() {

        return "Valor venda do Carro: " + "R$" + (super.getValue() * ADDITIONforCarSale);
    }
}
