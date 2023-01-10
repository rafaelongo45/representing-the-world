public class Company {
  private int cnpj = 123456789;
  public String name = "Responde aí";
  private Address address = new Address();

  public int getCnpj(){
    return this.cnpj;
  }

  public Address getAddress(){
    return this.address;
  }
}
