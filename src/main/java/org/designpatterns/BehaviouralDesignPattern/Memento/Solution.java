package org.designpatterns.BehaviouralDesignPattern.Memento;

import java.util.List;

public class Solution {

        public static void main(String[] args) {
            Game game = new Game();
            game.play(1, 100, List.of("Sword", "Shield"));
            game.printStatus();
            game.play(2, 200, List.of("Bow", "Arrow"));
            game.printStatus();
            game.undoLastPlay();
            game.printStatus();
        }

}
