/**
 * Created by Dmitriy on 08.12.2016.
 */
public class Puppy extends Dog{

    protected int ageMonth;
//
    public void destroy(){
        System.out.println("Puppy "+getName()+ " has just destroyed your flat.");
    }

    @Override
    public void bark() {
        System.out.println("Puppy "+getName()+ " is barking.");
    }

    @Override
    public void bite() {
        System.out.println("Puppy "+getName()+" has just bitten somebody.");
    }

    @Override
    public void run() {
        System.out.println("Puppy "+getName()+" is running.");
    }

    @Override
    void jump() {
        System.out.println("Puppy "+getName()+" is jumping.");
    }

    public Puppy(String kind, int ige, int weight, String name, String species, int ageMonth) {
        super(kind, ige, weight, name, species);
        this.ageMonth = ageMonth;
    }

    public Puppy(String kind, int ige, String name, String species, int ageMonth) {
        super(kind, ige, name, species);
        this.ageMonth = ageMonth;
    }

    public Puppy(String name, String name1, String species, int ageMonth) {
        super(name, name1, species);
        this.ageMonth = ageMonth;
    }
    public Puppy(int cuteness, int ageMonth) {

        this.ageMonth = ageMonth;
    }

    public Puppy(int ageMonth) {
        this.ageMonth = ageMonth;
    }
    public Puppy(){

    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    @Override
    public String toString() {
        return "Puppy is a very cute and he" +
                " ageMonth= " + ageMonth +
                '}';
    }
}
