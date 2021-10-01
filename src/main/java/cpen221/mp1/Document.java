package cpen221.mp1;

import cpen221.mp1.exceptions.NoSuitableSentenceException;
import cpen221.mp1.sentiments.SentimentAnalysis;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Document {

    /* ------- Task 0 ------- */
    /*  all the basic things  */

    /**
     * Create a new document using a URL
     * @param docId the document identifier
     * @param docURL the URL with the contents of the document
     */
    public Document(String docId, URL docURL) {
        try {
            Scanner urlScanner = new Scanner(docURL.openStream());
            StringBuilder fileText = new StringBuilder();
            while (urlScanner.hasNext()) {
                fileText.append(urlScanner.next());
            }
            System.out.println(fileText);
        } catch (IOException ioe) {
            System.out.println("Problem reading from URL.");
        }
    }

    /**
     *
     * @param docId the document identifier
     * @param fileName the name of the file with the contents of
     *                 the document
     */
    public Document(String docId, String fileName) {
        try {
            StringBuilder fileText = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            for (String fileLine = reader.readLine(); fileLine!= null; fileLine = reader.readLine()) {
                fileText.append(fileLine);
            }
            reader.close();
            System.out.println(fileText);
        }
        catch (IOException ioe) {
            System.out.println("Problem reading file.");
        }
    }

    /**
     * Obtain the identifier for this document
     * @return the identifier for this document
     */
    public String getDocId() {

        return null;
    }

    /* ------- Task 1 ------- */

    /**
     * Obtain the number of sentences in the document
     * @return the number of sentences in the document
     */
    public int numSentences() {


        return 0;
    }

    /**
     * Obtain a specific sentence from the document.
     * Sentences are numbered starting from 1.
     *
     * @param sentence_number the position of the sentence to retrieve,
     * {@code 1 <= sentence_number <= this.getSentenceCount()}
     * @return the sentence indexed by {@code sentence_number}
     */
    public String getSentence(int sentence_number) {
        // TODO: Implement this method
        return null;
    }

    public double averageSentenceLength() {
        // TODO: Implement this method
        return 0.0;
    }

    public double averageSentenceComplexity() {
        // TODO: Implement this method
        return 0.0;
    }

    /* ------- Task 2 ------- */

    public double averageWordLength() {

        return 0.0;
    }

    public double uniqueWordRatio() {
        // TODO: Implement this method
        return 0.0;
    }

    public double hapaxLegomanaRatio() {
        // TODO: Implement this method
        return 0.0;
    }


    /* ------- Task 3 ------- */

//    To implement these methods while keeping the class
//    small in terms of number of lines of code,
//    implement the methods fully in sentiments.SentimentAnalysis
//    and call those methods here. Use the getSentence() method
//    implemented in this class when you implement the methods
//    in the SentimentAnalysis class.

//    Further, avoid using the Google Cloud AI multiple times for
//    the same document. Save the results (cache them) for
//    reuse in this class.

//    This approach illustrates how to keep classes small and yet
//    highly functional.

    /**
     * Obtain the sentence with the most positive sentiment in the document
     * @return the sentence with the most positive sentiment in the
     * document; when multiple sentences share the same sentiment value
     * returns the sentence that appears later in the document
     * @throws NoSuitableSentenceException if there is no sentence that
     * expresses a positive sentiment
     */
    public String getMostPositiveSentence() throws NoSuitableSentenceException {
        // TODO: Implement this method
        return null;
    }

    /**
     * Obtain the sentence with the most negative sentiment in the document
     * @return the sentence with the most negative sentiment in the document;
     * when multiple sentences share the same sentiment value, returns the
     * sentence that appears later in the document
     * @throws NoSuitableSentenceException if there is no sentence that
     * expresses a negative sentiment
     */
    public String getMostNegativeSentence() throws NoSuitableSentenceException {
        // TODO: Implement this method
        return null;
    }

}
