package SnakeAndLadder.snakeandladdergame;

public class Dice {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 6;

    public int roll() {
        int rollValue = (int) (Math.random() * (MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
        System.out.println("Dice rolled: " + rollValue); // For debugging
        return rollValue;
    }
}
