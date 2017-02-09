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
                "Номер дома =" + numberHouse +
                ", Город ='" + city + '\'' +
                ", Количество этажей =" + valueFloors +
                ", Количество жителей =" + tenants +
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


//сортировка по нескольким параметрам
//    @Override
//    public int compareTo(Home o) {
//        int result;
//        result = Integer.compare(this.numberHouse, o.getNumberHouse());
//        if(result != 0) return result;
//        result = Integer.compare(this.valueFloors, o.getValueFloors());
//        if(result != 0) return result;
//        result = city.compareTo(o.city);
//        if(result != 0) return result;
//        result = Integer.compare(this.tenants, o.getTenants());
//        return result;
//    }

    //сортируем по году и по номеру дома
//    @Override
//    public int compareTo(Home o){
//        if (this.city.equals(o.getCity())){
//            if (this.numberHouse==o.getNumberHouse()){
//                return 0;
//            }
//            return Integer.compare(this.numberHouse,o.getNumberHouse());
//        }
//        return this.city.compareTo(o.getCity());
//    }


    //по убываю сортировка номер дома и разные улицы
//    @Override
//    public int compareTo(Home o){
//        if (this.numberHouse==o.getNumberHouse()){
//            if (this.city.equals(o.getCity())){
//                return 0;
//            }
//                return o.getCity().compareTo(this.city);
//        }
//        return Integer.compare(o.getNumberHouse(), this.numberHouse);
//    }
//сортировка по убыванию 1.количество жителей. 2.город. 3.номер дома.
    @Override
    public int compareTo(Home o){
        if (this.tenants==o.getTenants()){
            if (this.city.equals(o.getCity())){
                if (this.numberHouse==o.getNumberHouse()){
                    return 0;
                }
                return Integer.compare(o.getNumberHouse(),this.numberHouse);
            }
            return o.getCity().compareTo(this.city);
        }
        return Integer.compare(o.getTenants(),this.tenants);
    }






}
