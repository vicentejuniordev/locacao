import java.util.ArrayList;

public class Category {
    String name;
    String description;
    double dailyRate;
    
    public Category(String name, String description, double dailyRate){
        this.name = name;
        this.description = description;
        this.dailyRate = dailyRate;
    }

    public void registerCategory(Category cat, ArrayList<Category> categories){
        try{
            categories.add(cat);
            System.out.println("Categoria registrada com sucesso!!!");
        }catch(Exception e){
            System.out.println("Erro ao registrar categoria: " + e.getMessage());
        }
    }

    public static void consultCategory(String name, ArrayList<Category> categories){
        try{
            for(Category c : categories){
                if(c.name.equals(name)){
                    System.out.println("Categoria: " + c.name);
                    System.out.println("Descrição: " + c.description);
                    System.out.println("Taxa diária: " + c.dailyRate);
                }
            }
        }catch(Exception e){
            System.out.println("Erro ao buscar categoria: " + e.getMessage());
        }
    }
}