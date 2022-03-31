package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -3;
    private int maxFloor = 26;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return getCurrentFloor();
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        int minFloor = -3;
        int maxFloor = 26;
        if (minFloor > floor || maxFloor < floor) {
            System.out.println("не верно введен этаж!");
            return;
        }
        while (currentFloor != floor) {
            if (currentFloor < floor) {
                moveUp();
                System.out.println(currentFloor);
            } else {
                moveDown();
                System.out.println(currentFloor);
            }
        }
    }
}
