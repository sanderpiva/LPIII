package article_code.model;

public class Car extends Vehicle {

    private String type, brand, model, color;
    private int year;
    private String engineMotor;
    private double additionForCarSale = 1.3;

    public Car(String type, String brand, String model) {
        super(type, brand, model);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineMotor() {
        return engineMotor;
    }

    public void setEngineMotor(String engineMotor) {
        this.engineMotor = engineMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double additionForSale() {
        return this.additionForCarSale;
    }

    @Override
    public String vehicleData() {
        return super.vehicleData() + "\nCor: " + this.color + "\nAno: " + this.year + "\nMotor: " + this.engineMotor;
    }

    @Override
    public String vehicleValue() {
        return "Valor venda do Carro: " + "R$" + (super.getValue() * additionForCarSale);
    }
}
