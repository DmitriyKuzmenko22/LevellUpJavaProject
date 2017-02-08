/**
 * Created by Дмитрий on 08.02.2017.
 */
public class Home implements Comparable<Home> {

    private Integer numberHouse;
    private String city;
    private Integer valueFloors;
    private Integer tenants;

    @Override
    public String toString() {
        return "Home{" +
                "numberHouse=" + numberHouse +
                ", city='" + city + '\'' +
                ", valueFloors=" + valueFloors +
                ", tenants=" + tenants +
                '}';
    }



    public Home(Integer numberHouse, String city, Integer valueFloors, Integer tenants) {
        this.numberHouse = numberHouse;
        this.city = city;
        this.valueFloors = valueFloors;
        this.tenants = tenants;
    }

    public Integer getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(Integer numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getValueFloors() {
        return valueFloors;
    }

    public void setValueFloors(Integer valueFloors) {
        this.valueFloors = valueFloors;
    }

    public Integer getTenants() {
        return tenants;
    }

    public void setTenants(Integer tenants) {
        this.tenants = tenants;
    }



//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Home home = (Home) o;
//
//        if (numberHouse != null ? !numberHouse.equals(home.numberHouse) : home.numberHouse != null) return false;
//        if (city != null ? !city.equals(home.city) : home.city != null) return false;
//        if (valueFloors != null ? !valueFloors.equals(home.valueFloors) : home.valueFloors != null) return false;
//        return tenants != null ? tenants.equals(home.tenants) : home.tenants == null;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        if (numberHouse != null ? !numberHouse.equals(home.numberHouse) : home.numberHouse != null) return false;
        if (city != null ? !city.equals(home.city) : home.city != null) return false;
        if (valueFloors != null ? !valueFloors.equals(home.valueFloors) : home.valueFloors != null) return false;
        return tenants != null ? tenants.equals(home.tenants) : home.tenants == null;
    }

    @Override
    public int hashCode() {
        int result = numberHouse != null ? numberHouse.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (valueFloors != null ? valueFloors.hashCode() : 0);
        result = 31 * result + (tenants != null ? tenants.hashCode() : 0);
        return result;
    }

//    @Override
//    public int compareTo(Home o) {
//        return numberHouse.compare(this.numberHouse,o.getNumberHouse());
//        return valueFloors.compare(this.valueFloors, o.getValueFloors());
//    }
    @Override
    public int compareTo(Home o) {
        int result;
        result = Integer.compare(this.numberHouse, o.getNumberHouse());
        if(result != 0) return result;
        result = Integer.compare(this.valueFloors, o.getValueFloors());
        if(result != 0) return result;
        result = city.compareTo(o.city);
        if(result != 0) return result;
        result = Integer.compare(this.tenants, o.getTenants());
        return result;
    }





//    @Override
//    public int hashCode() {
////        int result = numberHouse != null ? numberHouse.hashCode() : 0;
////        result = 31 * result + (city != null ? city.hashCode() : 0);
////        result = 31 * result + (valueFloors != null ? valueFloors.hashCode() : 0);
////        result = 31 * result + (tenants != null ? tenants.hashCode() : 0);
////        return result;
//        return city;
//    }
//    @Override
//    public int compareTo(Home o) {
//        return Integer.compare(this.city, o.getCity());
//    }
}
