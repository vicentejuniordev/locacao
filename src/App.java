import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Client Class
        System.out.println("--- Client Class Test ---");
        Client client1 = new Client("Vicente", "12345678900", "Rua 5", "(89) 99999-9999", "vicente@example.com");
        ArrayList<Client> clients = new ArrayList<>();
        client1.registerCliente(client1, clients);
        Client.consultClient("12345678900", clients);

        //Brand Class
        System.out.println("\n--- Brand Class Test ---");
        Brand brand1 = new Brand("Marca de Carros", "Nissan");
        ArrayList<Brand> brands = new ArrayList<>();
        brand1.registerBrand(brand1, brands);
        Brand.consultBrand("Nissan", brands);

        
    }
}