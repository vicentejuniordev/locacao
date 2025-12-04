import java.util.ArrayList;

public class Model {
    String nome;
    String description;
    Brand brand;
    Category category;

    public Model(String nome, String description, Brand brand, Category category){
        this.nome = nome;
        this.description = description;
        this.brand = brand;
        this.category = category;
    }

    public static void registerModel(Model m, ArrayList<Model> models){
        try{
            models.add(m);
            System.out.println("Modelo registrado com sucesso!!!");
        }catch(Exception e){
            System.out.println("Erro ao registrar modelo: " + e.getMessage());
        }
    }

    public static void consultModel(String nome, ArrayList<Model> models){
        try{
            for(Model m : models){
                if(m.nome.equals(nome)){
                    System.out.println("Modelo: " + m.nome);
                    System.out.println("Descrição: " + m.description);
                    System.out.println("Marca: " + m.brand.name);
                    System.out.println("Categoria: " + m.category.name);
                }
            }
        }catch(Exception e){
            System.out.println("Erro ao buscar modelo: " + e.getMessage());
        }
    }
}