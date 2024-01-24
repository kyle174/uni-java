/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (50 marks in total)
    Use the Q1_TreeMapByBST to implement a WordCounter to count words in documents.
    You cannot use JCF provided map.
 */

import java.io.*;
import java.util.*;

public class Q2_WordCounter {
    // use the m_treemap as the data structure for word counting
    Q1_TreeMapByBST m_treemap = new Q1_TreeMapByBST();

    // Question 2.1 (15 marks) implement buildTreeMap() to build a treemap that stores
    // the words and word frequencies of a document into m_treemap.
    // "filename" is the path to the file. Please use the "JingleBell.txt" under folder "data".
    // You can ONLY modify the body of this method including the return statement.
    public void buildTreeMap(String filename) {
        try {
            File myFile = new File(filename);
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNext()) {
                String word = myScanner.next().toLowerCase();
                // Get rid of any characters
                word = word.replace(",","");
                word = word.replace("[","");
                word = word.replace("]","");
                // Check for hyphens
                if (word.contains("-")) {
                    String[] words = word.split("-");
                    // Add each subword of a hyphenated word
                    for (String subword : words) {
                        addWord(subword);
                    }
                }
                else {
                    // Add word
                    addWord(word);
                }
            }
        }
        // Error with file
        catch (IOException e) {
            System.out.println("An error occurred. Exiting...");
            System.exit(1);
        }
    }

    // Adds a word to the tree map
    public void addWord(String word) {
        // Confirm it is a word
        if (Character.isLetter(word.charAt(0))) {
            // Key does not exist
            if (m_treemap.get(word) == -1) {
                // Add new key with frequency 1
                m_treemap.put(word, 1);
            }
            // Key already exists
            else {
                // Increment frequency of key
                m_treemap.put(word, m_treemap.get(word) + 1);
            }
        }
    }

    // Question 2.2 (15 marks) print all the counted words in the document in alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public void printWordsAlphabetical(){
        ArrayList<String> words = m_treemap.getKeysInAlphabeticalOrder();
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Question 2.3 (15 marks) write an output file named "Output.txt" under folder "data"
    // The output of will consist of two lists.
    // Each list contains all the words from the file, along with the number of times
    // that the word occurred.
    // One list is sorted alphabetically.
    // The other list is sorted according to the number of occurrences, with the most
    // common words (i.e., a word with a larger frequency or count is said to be more common)
    // at the top and the least common at the bottom.
    // IMPORTANT: the output format is given in the file "Output_Example.txt" under folder "data".
    // Input parameter "filename" is the path to the output file.
    public void outputResult(String filename) {
        try {
            // Initialize writer and words
            FileWriter myWriter = new FileWriter(filename);
            ArrayList<String> wordsByAlpha = m_treemap.getKeysInAlphabeticalOrder();
            ArrayList<String> wordsByFreq = m_treemap.getKeysInFrequencyOrder();
            // Output total number of words
            myWriter.write(wordsByAlpha.size()+" words found in file:\n\n");
            // Output words in alphabetical order
            myWriter.write("List of words in alphabetical order (with counts in parentheses):\n\n");
            for (String wordA : wordsByAlpha) {
                myWriter.write("\t"+wordA+" ("+m_treemap.get(wordA)+")\n");
            }
            // Output words in order of frequency
            myWriter.write("\n\nList of words by frequency of occurrence (with counts in parentheses):\n\n");
            for (String wordF : wordsByFreq) {
                myWriter.write("\t"+wordF+" ("+m_treemap.get(wordF)+")\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote words to "+filename);
        }
        // Error with file
        catch (IOException e) {
            System.out.println("An error occurred. Exiting...");
            System.exit(1);
        }
    }

    // Question 2.4 (5 marks) call each of the above methods in the main() method to
    // successfully count the words and produce expected outputs.
    public static void main(String[] args){
        Q2_WordCounter wordCounter = new Q2_WordCounter();
        System.out.println("Building tree map...");
        wordCounter.buildTreeMap("C:/Users/User/Downloads/Assignment10/Assignment10/src/data/JingleBell.txt");
        System.out.println("\nPrinting words in alphabetical order...");
        wordCounter.printWordsAlphabetical();
        System.out.println("\nOutputting words to file...");
        wordCounter.outputResult("C:/Users/User/Downloads/Assignment10/Assignment10/src/data/Output.txt");
    }
}
