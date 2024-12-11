package SnakeAndLadder.snakeandladdergame;

public class Ladder {
    private final int start;
    private final int end;

    public Ladder(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("Start position must be less than end position for a ladder.");
        }
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
    public String toString() {
        return "Ladder [start=" + start + ", end=" + end + "]";
    }
}
