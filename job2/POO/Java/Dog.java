public abstract class Dog {

    Integer id;
    String raza;
   
    public Pet mascota;

    public Dog(String raza) {
        
        this.raza = raza;
    

    }
    

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public Pet getMascota() {
        return mascota;
    }


    public void setMascota(Pet mascota) {
        this.mascota = mascota;
    }


    public abstract String printDogInfo();
       
    
}
