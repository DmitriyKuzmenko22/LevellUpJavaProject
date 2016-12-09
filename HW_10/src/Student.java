/**
 * Created by Dmitriy on 04.12.2016.
 */
public class Student {
    String name;
    String lastName;
    int age;
    Lang language;
    Faculty faculty;

    public Student(String name, String lastName, int age, Lang language, Faculty faculty) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.language = language;
        this.faculty = faculty;
    }


/*Переопределить в классе студента метод toString() таким образом, чтобы в результате его вызова для объекта студента с выбранным языком EN возвращалась строка вида:
"Ron Weasley is 24 years old and studying at Griffindor faculty". Либо, если язык был выбран RU возвращалась строка вида: "Ron Weasley 24 лет, студент факультета Гриффиндор". */
    @Override
    public String toString() {
        switch (language){
            case EN:return name+" "+lastName+" id "+age+" years old and studying at "+faculty.getNameEn()+" faculty";
            case RU:return name+" "+lastName+" "+age+" лет, студент факультета "+faculty.getNameRu();
            default: return "Не правильно";
        }
    }
}
