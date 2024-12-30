package org.designpatterns.BehaviouralDesignPattern.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Game {
    private int level = 0;
    private int score = 0;
    private List<String> inventory = new ArrayList<>();
    private Stack<GameSave> saves = new Stack<>();

    public void play(int levelIncrement, int scoreIncrement, List<String> newItems) {
        level += levelIncrement;
        score += scoreIncrement;
        inventory.addAll(newItems);
        saves.push(new GameSave(level, score, inventory));
    }

    public void undoLastPlay() {
        if (!saves.isEmpty()) {
            GameSave save = saves.pop();
            level = save.getLevel();
            score = save.getScore();
            inventory = save.getInventory();
        }
    }

    public void printStatus() {
        System.out.println("Level: " + level + ", Score: " + score + ", Inventory: " + inventory);
    }
}
