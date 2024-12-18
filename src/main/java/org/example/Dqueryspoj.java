/*
package org.example;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Dqueryspoj {
    public static int BLOCK_SIZE = 0;

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        final int q = in.nextInt();
        final Query queries[] = new Query[q];
        for (int i = 0; i < q; i++) {
            queries[i] = new Query(i, in.nextInt() - 1, in.nextInt() - 1);
        }

        for (int j = 0; j < q; j++)
            System.out.println(queries[j].left + " " + queries[j].right);

        System.out.println("------");

        BLOCK_SIZE = (int) Math.sqrt(a.length);
        System.out.println(Arrays.stream(new Dqueryspoj().solve(a, queries))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("\n")));

    }

    public int[] solve(final int[] a, final Query[] queries) {
        Arrays.parallelSort(queries);
        for (int j = 0; j < queries.length; j++)
            System.out.println(queries[j].left + " " + queries[j].right);
        int start = queries[0].left, end = start;
        final int frequencies[] = new int[1000001];
        final int answers[] = new int[queries.length];
        frequencies[a[start]]++;
        int count = 1;
        for (final Query query : queries) {
            while (start < query.left) {
                frequencies[a[start]]--;
                if (frequencies[a[start]] == 0) {
                    count--;
                }
                start++;
            }
            while (start > query.left) {
                start--;
                frequencies[a[start]]++;
                if (frequencies[a[start]] == 1) {
                    count++;
                }
            }
            while (end < query.right) {
                end++;
                frequencies[a[end]]++;
                if (frequencies[a[end]] == 1) {
                    count++;
                }
            }
            while (end > query.right) {
                frequencies[a[end]]--;
                if (frequencies[a[end]] == 0) {
                    count--;
                }
                end--;
            }
            answers[query.index] = count;
        }
        return answers;
    }
}

class Query implements Comparable<Query> {
    final int index, left, right;

    public Query(final int index, final int left, final int right) {
        this.index = index;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(final Query other) {
        final int leftBlockIndex = this.left / Dqueryspoj.BLOCK_SIZE;
        final int otherLeftBlockIndex = other.left / Dqueryspoj.BLOCK_SIZE;
        return leftBlockIndex - otherLeftBlockIndex != 0
                ? leftBlockIndex - otherLeftBlockIndex : right - other.right;
    }

    @Override
    public String toString() {
        return "Query{" +
                "index=" + index +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
*/
