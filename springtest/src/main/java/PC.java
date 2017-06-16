/**
 * Created by java on 16.06.2017.
 */
public class PC {

    public String HDD;
    public String RAM;
    public Owner owner;

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

   /* @Override
    public String toString() {
        return "PC{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", owner=" + owner +
                '}';
    }*/

    public void whatPC(){
        System.out.println(HDD + " " + RAM + " " + owner);
    }
}
