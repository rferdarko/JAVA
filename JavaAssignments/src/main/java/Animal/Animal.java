package Animal;

public class Animal {

    String name;
    String sort;

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        animal1.name = "Tiger";
        animal1.sort = "predator ";

        animal2.name = "Dog";
        animal2.sort = "pet ";

        animal3.name = "Cow";
        animal3.sort = "farm animal";

        System.out.println(animal1.name +", "+animal1.sort);
        System.out.println(animal2.name +", "+animal2.sort);
        System.out.println(animal3.name +", "+animal3.sort);
    }
}
