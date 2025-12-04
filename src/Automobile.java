import java.util.ArrayList;

public class Automobile {
    String  plate;
    String  color;
    int   year;
    String typeFuel;
    int numberDoors;
    double mileage;
    int renavam;
    String chassis;
    boolean isLocated;
    Model   model;

    public Automobile(String plate, String color, int year, String typeFuel, int numberDoors, double mileage, int renavam, String chassis, boolean isLocated, Model model){
        this.plate = plate;
        this.color = color;
        this.year = year;
        this.typeFuel = typeFuel;
        this.numberDoors = numberDoors;
        this.mileage = mileage;
        this.renavam = renavam;
        this.chassis = chassis;
        this.isLocated = isLocated;
        this.model = model;
    }

    public void registerAutomobile(Automobile a, ArrayList<Automobile> automobiles){
        try{
            automobiles.add(a);
            System.out.println("Automóvel registrado com sucesso!!!");
        }catch(Exception e){
            System.out.println("Erro ao registrar automóvel: " + e.getMessage());
        }
    }

    public static void consultAutomobile(String plate, ArrayList<Automobile> automobiles){
        try{
            for(Automobile a : automobiles){
                if(a.plate.equals(plate)){
                    System.out.println("Placa: " + a.plate);
                    System.out.println("Cor: " + a.color);
                    System.out.println("Ano: " + a.year);
                    System.out.println("Tipo de combustível: " + a.typeFuel);
                    System.out.println("Número de portas: " + a.numberDoors);
                    System.out.println("Quilometragem: " + a.mileage);
                    System.out.println("Renavam: " + a.renavam);
                    System.out.println("Chassi: " + a.chassis);
                    System.out.println("Está locado: " + a.isLocated);
                    System.out.println("Modelo: " + a.model.nome);
                }
            }
        }catch(Exception e){
            System.out.println("Erro ao buscar automóvel: " + e.getMessage());
        }
    }
}