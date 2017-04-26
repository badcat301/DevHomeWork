package task1.packegeSecond;

import task1.packageFirst.ClassB;

/**
 * Created by Fylhtq on 22.04.2017.
 */
public class ClassC extends ClassB {

    public ClassC(int age, String addres) {
        super(age,addres);

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public static void main(String[] args) {
        ClassB b = new ClassB(12,"Dfdfd");
        ClassC c = new ClassC(23,"fdfdf");
        c.setAge(45);
        c.setName("dffffdfdf");
    }
}
