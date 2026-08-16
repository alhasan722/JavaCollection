package OOP.homeWork.day_02.MethodOverride;


class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat sound");
    }
}

class cow extends Animal {
    void sound() {
        System.out.println("cow sound");
    }
}

public class Animal_sound {

    public static void main(String[] args) {
        ////Animal_sound AS = new Animal_sound();
        Dog dg=new Dog();
        Cat ct=new Cat();
        cow cw=new cow();
        cw.sound();
        dg.sound();
        ct.sound();


    }
}
