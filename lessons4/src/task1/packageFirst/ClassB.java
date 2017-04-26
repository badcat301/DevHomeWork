package task1.packageFirst;

/**
 * Created by Fylhtq on 22.04.2017.
 */
public class ClassB {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    protected int age;
    public String addres;

    public ClassB(int age, String adres) {
        this.age = age;
        this.addres= adres;
    }
    public void doSomting(){

    }
}
