import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Client Class
        System.out.println("--- Client Class Test ---");
        Client client1 = new Client("Vicente", "12345678900", "Rua 5", "(89) 99999-9999", "vicente@example.com");
        ArrayList<Client> clients = new ArrayList<>();
        Client.registerCliente(client1, clients);
        Client.consultClient("12345678900", clients);

        //Brand Class
        System.out.println("\n--- Brand Class Test ---");
        Brand brand1 = new Brand("Marca de Carros", "Nissan");
        ArrayList<Brand> brands = new ArrayList<>();
        Brand.registerBrand(brand1, brands);
        Brand.consultBrand("Nissan", brands);

        //Category Class
        System.out.println("\n--- Category Class Test ---");
        Category category1 = new Category("SUV", "Veículo utilitário esportivo", 150.0);
        ArrayList<Category> categories = new ArrayList<>();
        Category.registerCategory(category1, categories);
        Category.consultCategory("SUV", categories);

        //Model Class
        System.out.println("\n--- Model Class Test ---");
        Model model1 = new Model("Kicks", "SUV compacto da Nissan", brand1, category1);
        ArrayList<Model> models = new ArrayList<>();
        Model.registerModel(model1, models);
        Model.consultModel("Kicks", models);
        
        //Automobile Class
        System.out.println("\n--- Automobile Class Test ---");
        Automobile automobile1 = new Automobile("ABC1234", "Red", 2020, "Gasoline", 4, 15000.0, 123456789, "XYZ987654321", false, model1);
        ArrayList<Automobile> automobiles = new ArrayList<>();
        Automobile.registerAutomobile(automobile1, automobiles);
        Automobile.consultAutomobile("ABC1234", automobiles);

        //Location Class
        System.out.println("\n--- Location Class Test ---");
        Lease location1 = new Lease(automobile1, client1, LocalDateTime.parse("2024-07-01T10:00:00"), LocalDateTime.parse("2024-07-05T10:00:00"), null, 5.0, 5.0, 0.0);
        ArrayList<Lease> locations = new ArrayList<>();
        Lease.registerLocation(location1, locations);
        Lease.calculateLocationValue(location1, 4);
        Lease.consultLocation(client1, locations);

        //Test try location Automobile already located
        System.out.println("\n--- Test try location Automobile already located ---");
        Lease location2 = new Lease(automobile1, client1, LocalDateTime.parse("2024-07-10T10:00:00"), LocalDateTime.parse("2024-07-15T10:00:00"), null, 5.0, 5.0, 0.0);
        Lease.registerLocation(location2, locations);

        

    }
}