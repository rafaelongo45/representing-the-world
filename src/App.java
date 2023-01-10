public class App {
    public static void main(String[] args) throws Exception {
        Company respondeAi = new Company();
        System.out.println("Company name: " + respondeAi.name);
        System.out.println("Cnpj: " + respondeAi.getCnpj());
        System.out.println("Street: " + respondeAi.getAddress().street);
        System.out.println("City: " + respondeAi.getAddress().city);
        System.out.println("State: " + respondeAi.getAddress().state);
        System.out.println("Cep: " + respondeAi.getAddress().cep);
    }
}
