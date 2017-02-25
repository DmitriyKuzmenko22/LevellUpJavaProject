package set

import spock.lang.Specification

/**
 * Created by java on 10.02.2017.
 */
class HomeTest extends Specification {

    List<Home> list = Arrays.asList(
    new Home(1, "Gagarina",2,4),
    new Home(2, "Lenina",2,4),
    new Home(3, "Panikahi",2,4),
    new Home(4, "Rabjchaya",2,4),
    new Home(5, "Glinki",2,4), new Home(6, "Artema",2,4),
    new Home(1, "Gagarina",2,4),
    new Home(4, "Rabjchaya",2,4),
    new Home(1, "Gagarina",2,4),
    new Home(2, "Lenina",2,4),
    );

    def 'check steetName comapr'(){
        when:
        Set<Home> homeSet = new TreeSet<>(HomeFilters.streetComparator());
        homeSet.addAll(list);
        println(homeSet.size()+" " +  homeSet)

        then:
        homeSet.size()==6
    }
}
