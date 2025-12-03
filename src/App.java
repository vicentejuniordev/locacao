import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Client Class
        Client client1 = new Client("Vicente", "12345678900", "123 Main St", "555-1234", "vicente@example.com");
        ArrayList<Client> clients = new ArrayList<>();
        client1.registerCliente(client1, clients);

        
        client1.consultClient("12345678900", clients);
    }
}
