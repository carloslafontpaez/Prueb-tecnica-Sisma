public class Terrier extends Dog{

    String tipo;

    public Terrier(String raza, String tipo) {
        super(raza);

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String printDogInfo(){
        return "Raza: "+ raza +" Driver: "+ mascota.name;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
    
}

