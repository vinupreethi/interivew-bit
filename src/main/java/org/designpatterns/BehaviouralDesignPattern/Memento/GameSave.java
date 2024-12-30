package org.designpatterns.BehaviouralDesignPattern.Memento;

import java.util.List;

public class GameSave {
    private final int level;
    private final int score;
    private final List<String> inventory;

    public GameSave(int level, int score, List<String> inventory) {
        this.level = level;
        this.score = score;
        this.inventory = inventory;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public List<String> getInventory() {
        return inventory;
    }
}
