public class Beagle extends Hound{

    String country, characteristics, skills;
    
    public Beagle(String raza,  String tipo,String country,
     String characteristics, String skills, String other_characteristics) {

        super(raza, tipo, other_characteristics);

        this.country = country;
        this.characteristics = characteristics;
        this.skills = skills;
    }
    public String printDogInfo(){
        return "Raza: "+ raza +" Driver: "+ mascota.name;
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

}
