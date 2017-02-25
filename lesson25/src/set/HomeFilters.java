package set;

import java.util.Comparator;

/**
 * Created by java on 10.02.2017.
 */
public class HomeFilters {
    // отдельній класс для сортировки
     public static Comparator<Home> streetComparator(){
         return new Comparator<Home>() { //можно лямбду
             @Override
             public int compare(Home h1, Home h2) {
                 int homeNumbers=Integer.compare(h1.getNumber(), h2.getNumber());//сравниваем номера домов и сохраняем переменную
                 int streetName =h1.getStreetName().compareToIgnoreCase(h2.getStreetName());

                 if (homeNumbers==0&& streetName==0) return 0; //номера домов одинакові , название улиц одинакові
                 else if (homeNumbers==0) return streetName;// если номера домов одинакові сортирууем по улиуе
                 else return streetName ==0? homeNumbers:streetName;//номера домов разніе , если одинаковіе уилці стритнаме=0 и учитіваем номер дома, в итоге сортируем по названию улиці
             } //else return homeNumbers сортируем по номеру дома
         };
     }
    //comparble сравнивает текущее значение переданное в условие
//compareToIgnoreCase игнорирует регистр
}
