package SnakeAndLadder.snakeandladdergame;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameManager {
    
    private static GameManager instance;
    private final List<SnakeAndLadderGame> games;


    private GameManager() {
        games = new ArrayList<>();
    }

   
    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    private final ExecutorService gameExecutor = Executors.newCachedThreadPool();

    public void startNewGame(List<String> playerNames) {
        SnakeAndLadderGame game = new SnakeAndLadderGame(playerNames);
        games.add(game);
        gameExecutor.submit(game::play); // Use the executor to manage threads
    }
    
    public List<SnakeAndLadderGame> getActiveGames() {
        return new ArrayList<>(games);
    }
    
    public void endGame(SnakeAndLadderGame game) {
        games.remove(game);
    }

    public void shutdown() {
        gameExecutor.shutdown();  // Gracefully shuts down the executor
    }
    
    
}
