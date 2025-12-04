import java.util.ArrayList;

public class Client{
    String name;
    String cpf;
    String adress;
    String phone;
    String email;

    public Client (String name, String cpf, String adress, String phone, String email){
        this.name = name;
        this.cpf = cpf;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }

    public static void registerCliente(Client c, ArrayList<Client> clients){
        try{
            clients.add(c);
            System.out.println("Cliente registrado com sucesso!!!");
        }catch(Exception e){
            System.out.println("Erro ao registrar cliente: " + e.getMessage());
        }

    }

    public static Client consultClient(String cpf, ArrayList<Client> clients){
        for(Client c : clients){
            if(c.cpf.equals(cpf)){
                System.out.println("Cliente encontrado: " + c.name);
                return c;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }



}