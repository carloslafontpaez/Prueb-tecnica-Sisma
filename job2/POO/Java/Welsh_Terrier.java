public class Welsh_Terrier extends Terrier {

    String country, characteristics, skills;
    
    public Welsh_Terrier(String raza, String tipo,String country, String characteristics, String skills) {

        super(raza,  tipo);

        this.country = country;
        this.characteristics = characteristics;
        this.skills = skills;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String printDogInfo(){
        return "Raza: "+ raza +" Driver: "+ mascota.name;
    }
    
}
