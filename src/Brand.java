import java.util.ArrayList;

public class Brand {
    String name;
    String description;

    public Brand(String description, String name){
        this.description = description;
        this.name = name;
    }

    public static void registerBrand(Brand b, ArrayList<Brand> brands){
        try{
            brands.add(b);
            System.out.println("Marca registrada com sucesso!!!");
        }catch(Exception e){
            System.out.println("Erro ao registrar marca: " + e.getMessage());
        }
    }

    public static void consultBrand(String name, ArrayList<Brand> brands){
        try{
           for(Brand b : brands){
            if(b.name.equals(name)){
                System.out.println("Marca:" + b.name);
                System.out.println("Descrição:" + b.description);
            }
           } 
        } catch (Exception e) {
            System.out.println("Erro ao buscar marca: " + e.getMessage());
        }
    }


}
