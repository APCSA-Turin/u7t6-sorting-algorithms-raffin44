package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A: Implementing selection sort for an integer array
    public static int[] selectionSort(int[] elements) {
        int n = elements.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }
        return elements;
    }

    // PART B: Implementing selection sort for an ArrayList of Strings
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int n = words.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum word with the first word
            String temp = words.get(minIndex);
            words.set(minIndex, words.get(i));
            words.set(i, temp);
        }
        return words;
    }

    // Call this method to load 1000 words into the list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
