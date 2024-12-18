/*

package org.example;


import java.util.*;

class Player {
    String name;
    String piececolor;
    int position;

    Player(String name, String piececolor) {
        this.piececolor = piececolor;
        this.position = 0;
        this.name = name;
    }
}

class Board {
    int size;
    HashMap<Integer, Integer> snake = new HashMap<>();
    HashMap<Integer, Integer> ladder = new HashMap<>();


    Board(int size) {
        this.size = size;
    }

    void addLadder(int start, int end) {
        ladder.put(start, end);
    }

    void addSnake(int start, int end) {
        snake.put(start, end);
    }

    Player movePlayer(Player player, int dicenumber) {
        System.out.println("Moving the player to the position : ");
        player.position = player.position + dicenumber;
        if (IsSnakePresent(player.position)) {
            playerisHitBySnake(player);
        } else if (IsLadderPresent(player.position)) {
            playerIsClimbingtheLadder(player);
        }
        if (player.position > size) {
            player.position = size;
        }
        return player;

    }

    private void playerIsClimbingtheLadder(Player player) {
        System.out.println("Player" + player.name + " is climbing the ladder");
        player.position = ladder.get(player.position);

    }

    private void playerisHitBySnake(Player player) {
        System.out.println("Player" + player.name + " hit by snake");
        player.position = snake.get(player.position);
    }

    private boolean IsLadderPresent(int position) {
        if (ladder.containsKey(position))
            return true;
        return false;
    }

    private boolean IsSnakePresent(int position) {
        if (snake.containsKey(position))
            return true;
        return false;
    }
}


class Game {
    List<Player> playerList = new ArrayList<>();
    Board board;

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Player rollTheDice(Player player) {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        return board.movePlayer(player, randomNumber);

    }
}

class SnakeAndLadder {
    public static void main(String args[]) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the board :");
        int size = scanner.nextInt();
        Board board = new Board(size);

        System.out.println("Enter the ladders in the board :");
        int numberofLadders = scanner.nextInt();
        for (int i = 0; i < numberofLadders; i++) {
            System.out.println("Enter the starting positing of the ladder:");
            int start = scanner.nextInt();
            System.out.println("Enter the ending positing of the ladder:");
            int end = scanner.nextInt();
            board.addLadder(start, end);

        }
        System.out.println("Enter the snakes in the board :");
        int numberofSnakes = scanner.nextInt();
        for (int i = 0; i < numberofSnakes; i++) {
            System.out.println("Enter the starting positing of the snake:");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            board.addSnake(start, end);

        }

        game.board = board;
        System.out.println("Enter the number of player");
        int numberofPlayer = scanner.nextInt();

        for (int i = 0; i < numberofPlayer; i++) {
            String color = scanner.next();
            String name = scanner.next();
            Player player = new Player(name, color);
            game.addPlayer(player);
        }


        List<Player> playerList = game.getPlayerList();
        int nextplayer = 0;
        boolean gameWon = false;
        int rankOfthePlayer = 1;
        while (!gameWon) {

            Player player = playerList.get(nextplayer);
            System.out.println("Player " + player.name + " is rolling the dice...! ");
            Player currentplayer = game.rollTheDice(player);

            if (currentplayer.position == board.size) {
                System.out.println("Player " + player.name + " won the game with rank " + rankOfthePlayer + "..!");
                rankOfthePlayer++;
                playerList.remove(player);
                if (playerList.size() == 0) {
                    gameWon = true;
                }
            }
            nextplayer++;
            if (playerList.size() == nextplayer) {
                nextplayer = 0;
            }


        }

    }
}

*/
