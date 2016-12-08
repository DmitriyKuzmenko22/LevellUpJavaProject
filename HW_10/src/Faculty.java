/**
 * Created by Dmitriy on 04.12.2016.
 */
public enum Faculty {
    GRYFFINDOR("GRYFFINDOR","Грфиндор"),
    SLYTHERIN("SLYTHERIN","Слитрейн"),
    HUFFLEPUFF("HUFFLEPUFF","Хэхелпуф"),
    RAVENCLAW("RAVENCLAW","Равенклан");

    String NameEn;
    String NameRu;

    Faculty(String nameEn, String nameRu) {
        NameEn = nameEn;
        NameRu = nameRu;
    }

    public String getNameRu() {
        return NameRu;
    }

    public String getNameEn() {
        return NameEn;
    }
}
