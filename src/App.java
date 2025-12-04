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

        //Category Class
        System.out.println("\n--- Category Class Test ---");
        Category category1 = new Category("SUV", "Veículo utilitário esportivo", 150.0);
        ArrayList<Category> categories = new ArrayList<>();
        category1.registerCategory(category1, categories);
        Category.consultCategory("SUV", categories);

        //Model Class
        System.out.println("\n--- Model Class Test ---");
        Model model1 = new Model("Kicks", "SUV compacto da Nissan", brand1, category1);
        ArrayList<Model> models = new ArrayList<>();
        model1.registerModel(model1, models);
        Model.consultModel("Kicks", models);
        
        //Automobile Class
        System.out.println("\n--- Automobile Class Test ---");
        Automobile automobile1 = new Automobile("ABC1234", "Red", 2020, "Gasoline", 4, 15000.0, 123456789, "XYZ987654321", false, model1);
        ArrayList<Automobile> automobiles = new ArrayList<>();
        automobile1.registerAutomobile(automobile1, automobiles);
        Automobile.consultAutomobile("ABC1234", automobiles);

        
    }
}