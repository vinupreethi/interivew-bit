package org.example;

import java.util.*;

class Query {
    int start;
    int end;

    Query(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class DQuery {
    private static int BLOCK_SIZE = 0;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int[] frequency = new int[1000001];
        Arrays.fill(frequency, 0);

        BLOCK_SIZE = (int) Math.sqrt(a.length - 1);
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int query = scanner.nextInt();

        List<Query> lst = new ArrayList<>();
        for (int i = 0; i < query; i++)
            lst.add(new Query(scanner.nextInt(), scanner.nextInt()));

//        List<Query> lst1 = lst;
//        Collections.sort(lst, new Comparator<>() {
//                    @Override
//                    public int compare(Query o1, Query o2) {
//                        return ((o1.start / BLOCK_SIZE < o2.start / BLOCK_SIZE) ? -1 : ((o1.start / BLOCK_SIZE > o2.start / BLOCK_SIZE) ? 1 : 0));
//                    }
//                }
//        );
        HashMap<Query, Integer> hashMap1 = new HashMap<>();
        int left = lst.get(0).start-1;
        int right = lst.get(0).end-1;
        int cnt = 0;
        for (int i = left ; i <= right; i++) {
            if (frequency[a[i]] == 0)
                cnt++;
            frequency[a[i]]++;

        }
        hashMap1.put(lst.get(0), cnt);
        int i = 1;
        while (i < lst.size()) {
            int leftindex = lst.get(i).start - 1;
            int rightindex = lst.get(i).end - 1;

            while (leftindex < left) {

                if (frequency[a[left]] == 0)
                    cnt++;
                frequency[a[left]]++;
                left++;
            }

            while(rightindex > right) {

                if (frequency[a[right]] == 0)
                    cnt++;
                frequency[a[right]]++;
                right++;
            }

            while (leftindex > left) {

                if (frequency[a[left]] >= 0) {
                    frequency[a[left]]--;
                    if (frequency[a[left]] <= 0) {
                        frequency[a[left]] = 0;
                        cnt--;
                    }

                }
                left++;
            }

            while(rightindex < right) {

                if (frequency[a[right]] >= 0) {
                    frequency[a[right]]--;
                    if (frequency[a[right]] <= 0) {
                        frequency[a[right]] = 0;
                        cnt--;
                    }

                }
                right--;
            }
            if (left == leftindex && right == rightindex) {
                hashMap1.put(lst.get(i), cnt);
            }
            i++;

        }
        for (Map.Entry<Query, Integer> hm : hashMap1.entrySet())
            System.out.println(hm.getKey().start + " " + hm.getKey().end + " " + hm.getValue());


    }
}
