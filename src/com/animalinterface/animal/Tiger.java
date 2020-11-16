package com.animalinterface.animal;

import com.animalinterface.animal.Animal;
import com.animalinterface.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrr!";
    }

    @Override
    public String howToEat() {
        return "could be boiled";
    }
}
