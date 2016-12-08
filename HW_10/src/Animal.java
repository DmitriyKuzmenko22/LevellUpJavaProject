/*Создать объект класса Щенок, используя классы Животное, Собака. Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.*/
public class Animal {
  protected String kind;
  protected int ige;
  protected int weight;

  public void run(){

  }
  void jump(){

  }

    public Animal(String kind, int ige, int weight) {
        this.kind = kind;
        this.ige = ige;
        this.weight = weight;
    }

    public Animal(String kind, int ige) {
        this.kind = kind;
        this.ige = ige;
    }
    public Animal(String name) {
        this.kind = name;
    }

        public Animal() {

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getIge() {
        return ige;
    }

    public void setIge(int ige) {
        this.ige = ige;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (ige != animal.ige) return false;
        if (weight != animal.weight) return false;
        return kind != null ? kind.equals(animal.kind) : animal.kind == null;
    }

    @Override
    public int hashCode() {
        int result = kind != null ? kind.hashCode() : 0;
        result = 31 * result + ige;
        result = 31 * result + weight;
        return result;
    }
}
