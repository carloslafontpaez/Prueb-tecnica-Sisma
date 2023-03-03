public class Working extends Dog{
    String tipo, other_characteristics;

    public Working(String raza,  String tipo, String other_characteristics) {
        super(raza);

        this.tipo = tipo;
        this.other_characteristics = other_characteristics;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String printDogInfo(){
        return "Raza: "+ raza +" Driver: "+ mascota.name;
    }
    public String getOther_characteristics() {
        return other_characteristics;
    }

    public void setOther_characteristics(String other_characteristics) {
        this.other_characteristics = other_characteristics;
    } 
}
