package com.example;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        try (
            InputStream inputStream =
                Main.class.getResourceAsStream("/testing.txt")
        ) {

            if (inputStream == null) {
                throw new FileNotFoundException("testing.txt not found");
            }

            System.out.println("testing.txt content:");

            new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .forEach(System.out::println);
        }
    }
}
