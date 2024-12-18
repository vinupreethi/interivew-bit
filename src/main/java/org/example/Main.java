package org.example;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine());  // Read number of test cases

        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine());  // Read the size of the array
            n--;
            // Compute the smallest sum according to the formula
            long s = 1 + (n) * (n - 1);

            // Output the result
            writer.write(s + "\n");
        }

        writer.flush();  // Ensure all output is written
        reader.close();  // Close the reader
        writer.close();  // Close the writer
    }


}