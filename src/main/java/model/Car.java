package model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move() {
        if (createRandomNumber() >= 4) {
            this.position++;
        }
    }

    public int createRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }


}
