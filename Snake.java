package SnakeAndLadder.snakeandladdergame;

public class Snake {
    private final int start;
    private final int end;

    public Snake(int start, int end) {
        if (start <= end) {
            throw new IllegalArgumentException("Start position must be greater than end position for a snake.");
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
        return "Snake [start=" + start + ", end=" + end + "]";
    }
}
