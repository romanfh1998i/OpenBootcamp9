class Persona{
  protected int edad;
  protected String nombre;
  protected String telefono;

  public Persona(int edad, String nombre,String telefono ){
    this.edad=edad;
    this.nombre=nombre ;
    this.telefono=telefono;
  }

  public void mostrarInformacion(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Edad: "+edad);
    System.out.println("Telefono: " + telefono);
  }
}
class Cliente extends Persona{
  private double credito;
  public Cliente (int edad,String nombre,String telefono,double credito){
    super(edad,nombre,telefono);
    this.credito=credito;
  }
  @Override 
  public void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Credito" + credito);
  }
  
}
class Trabajador extends Persona{
  private double salario;
  public Trabajador(int edad,String nombre,String telefono,double salario){
    super(edad,nombre,telefono);
    this.salario=salario;
  }
  @Override 
  public void mostrarInformacion(){
      super.mostrarInformacion();
      System.out.println("Salario"+salario);
  }
  
}

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente(35,"Rosa","9889889",5000);
    cliente.mostrarInformacion();
    System.out.println();
    Trabajador trabajador=new Trabajador(30,"Juan","1234564",5000);
    trabajador.mostrarInformacion();
  }
}