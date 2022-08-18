package article_code_view;

import article_code.model.Car;
import article_code.model.VehicleStock;
import article_code.model.Vehicle;
import article_code.model.Motorcycle;
import java.util.*;

public class Menu {

    private String type;
    private String brand;
    private String model;
    private String color;
    private String engineType;
    private double value;
    private int year;

    public void receptionMenu() {
        int inputAnswer = 1;
        int operationAnswer = 0;
        Scanner scan = new Scanner(System.in);
        VehicleStock pushInStock = new VehicleStock();

        try {

            while (inputAnswer != 0) {
                System.out.println("Cadastrar veículo [1] - Consulta Estoque [2] Sair? [0]");
                inputAnswer = scan.nextInt();
                switch (inputAnswer) {

                    case 1:
                        System.out.println("Cadastra veiculos");
                        do {
                            System.out.println("Cadatrar carro [1] moto [2] sair? [0]");
                            operationAnswer = scan.nextInt();
                        } while (operationAnswer != 0 && operationAnswer != 1 && operationAnswer != 2);
                        if (operationAnswer == 1) {
                            this.type = "Carro";
                            registerVehicle();
                            Car c = new Car(this.type, this.brand, this.model);
                            c.setYear(this.year);
                            c.setColor(this.color);
                            c.setValue(this.value);
                            c.setEngineType(this.engineType);
                            pushInStock.setStock(c);
                        } else if (operationAnswer == 2) {
                            this.type = "Moto";
                            registerVehicle();
                            Motorcycle mt = new Motorcycle(this.type, this.brand, this.model);
                            mt.setYear(this.year);
                            mt.setColor(this.color);
                            mt.setValue(this.value);
                            mt.setEngineType(this.engineType);
                            pushInStock.setStock(mt);

                        } else {
                            System.out.println("Saindo do cadastramento...");
                        }
                        break;
                    case 2:
                        System.out.println("---Consulta Estoque---\n");

                        for (Vehicle aux : pushInStock.getStock()) {

                            System.out.println(aux.vehicleData());
                            System.out.println("Ajuste aplicado para revenda: " + ((aux.additionForSale() * 100) - 100) + "%\n");
                            System.out.println(aux.vehicleValue());
                            System.out.println("---");
                        }
                        break;
                }
            }
            System.out.println("Fim");
        } catch (Exception excp1) {
            System.out.println("Erro! Sistema encerrado");
        }
    }

    public void registerVehicle() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Marca: ");
            this.brand = scan.nextLine();
            System.out.println("Modelo: ");
            this.model = scan.nextLine();
            System.out.println("Cor: ");
            this.color = scan.nextLine();
            System.out.println("Tipo motor: ");
            this.engineType = scan.nextLine();
            do {
                System.out.println("Valor de compra R$: ");
                this.value = scan.nextDouble();
            } while (this.value <= 0);
            do {
                System.out.println("Ano: [1999->2023]: ");
                this.year = scan.nextInt();
            } while (this.year < 1999 || this.year > 2023);
            System.out.println("----");

        } catch (Exception excp2) {

            System.out.println("Erro no cadastramento");
        }
    }
}
