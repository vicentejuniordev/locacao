import java.time.LocalDateTime;
import java.util.ArrayList;

public class Lease {
    Automobile automobile;
    Client client;
    LocalDateTime dateHourLease;
    LocalDateTime dateHourPrevDelivery;
    LocalDateTime dateHourDelivery = null;
    double totalFuel;
    double totalFuelDelivered;
    double locationValue = 0.0;

    public Lease(Automobile automobile, Client client, LocalDateTime dateHourLease, LocalDateTime dateHourPrevDelivery, LocalDateTime dateHourDelivery, double totalFuel, double totalFuelDelivered, double locationValue){
        this.automobile = automobile;
        this.client = client;
        this.dateHourLease = dateHourLease;
        this.dateHourPrevDelivery = dateHourPrevDelivery;
        this.dateHourDelivery = dateHourDelivery;
        this.totalFuel = totalFuel;
        this.totalFuelDelivered = totalFuelDelivered;
        this.locationValue = locationValue;
    }


    public static void registerLocation(Lease l, ArrayList<Lease> locations){
        try{
            if(l.automobile.isLeased == true){
                System.out.println("Erro: Automóvel já está locado.");
                return;
            }
            l.automobile.isLeased = true;
            locations.add(l);
            System.out.println("Locação registrada com sucesso!!!");
        }catch(Exception e){
            System.out.println("Erro ao registrar locação: " + e.getMessage());
        }
    }

    public static void consultLocation(Client client, ArrayList<Lease> locations){
        try{
            for(Lease loc : locations){
                if(loc.client.cpf.equals(client.cpf)){
                    System.out.println("Cliente: " + loc.client.name);
                    System.out.println("Automóvel: " + loc.automobile.model.nome);
                    System.out.println("Data e Hora da Locação: " + loc.dateHourLease);
                    System.out.println("Data e Hora Prevista de Entrega: " + loc.dateHourPrevDelivery);
                    System.out.println("Data e Hora da Entrega: " + loc.dateHourDelivery);
                    System.out.println("Total de Combustível no Momento da Locação: " + loc.totalFuel);
                    System.out.println("Total de Combustível na Entrega: " + loc.totalFuelDelivered);
                    System.out.println("Valor da Locação: " + loc.locationValue);
                }
            }
        }catch(Exception e){
            System.out.println("Erro ao buscar locação: " + e.getMessage());
        }
    }

    public static void calculateLocationValue(Lease loc, long daysRented){
        loc.locationValue = daysRented * loc.automobile.model.category.dailyRate;
        if(loc.totalFuelDelivered < loc.totalFuel){
            double fuelDifference = loc.totalFuel - loc.totalFuelDelivered;
            double fuelCharge = fuelDifference * 5.0; 
            loc.locationValue += fuelCharge;
            System.out.println("Valor total da locação com cobrança de combustível: " + loc.locationValue);
        }else{
            System.out.println("Valor total da locação: " + loc.locationValue);
        }
        
    }

}
