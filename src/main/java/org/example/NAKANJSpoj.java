package org.example;

import java.util.*;

public class NAKANJSpoj {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            String start = scanner.next();
            String destination = scanner.next();
            int[][] directions = {{-1, -2}, {-1, 2}, {-2, -1}, {-2, 1},
                    {1, -2}, {1, 2}, {2, -1}, {2, 1}};
            Queue<String> queue = new LinkedList<>();
            queue.offer(start);
            int cnt = 0;
            Set<String> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                int size=queue.size();
                int flag=0;
                while(size!=0) {
                    String node = queue.poll();

                    if (node.equals(destination)) {
                        flag=1;
                        System.out.println(cnt);
                        break;
                    }
                    visited.add(node);
                    for (int dir[] : directions) {
                        char i = (char) (node.charAt(0) + dir[0]);
                        int j = Integer.parseInt(String.valueOf(node.charAt(1))) + dir[1];
                        String answer = "";
                        if ((i >= 'a' && i <= 'h') && (j <= 8 && j >= 1)) {
                            answer += i;
                            answer += j;
                            if (!visited.contains(answer))
                                queue.add(answer);
                        }

                    }
                    size--;
                }
                if(flag==1)
                    break;
                cnt++;
            }


            t--;
        }
    }
}
