/**
 * Created by Dmitriy on 07.12.2016.
 */
public class Dog extends Animal {
    protected String name;
    protected String species;


    public void bark(){
        System.out.println("Dog "+getName()+" is barking.");
    }
    public void bite(){
      System.out.println("Dog "+getName()+" has just bitten somebody.");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Dog "+getName()+" is runing");
    }

    @Override
    void jump() {
        System.out.println("Dog "+getName()+" is jumpinggg ");
    }

    public Dog(String kind, int ige, int weight, String name, String species) {
        super(kind, ige, weight);
        this.name = name;
        this.species = species;
    }

    public Dog(String kind, int ige, String name, String species) {
        super(kind, ige);
        this.name = name;
        this.species = species;
    }

    public Dog(String name, String name1, String species) {
        super(name);
        this.name = name1;
        this.species = species;
    }
    public Dog(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return species != null ? species.equals(dog.species) : dog.species == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (species != null ? species.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Dog " +
                 name  +
                ", species='" + species + '\'' +
                '}';
    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder("Dog ");
//        sb.append("name is ").append(name);
//        sb.append(", species ").append(species);
//        return sb.toString();
//    }
}
