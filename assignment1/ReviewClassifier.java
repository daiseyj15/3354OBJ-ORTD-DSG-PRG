package movieReviewClassification;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Class that supports Tweet Classification Mechanism
 * Dictionary of positive words, negative words and all tweets are kept in this class.
 */
public class ReviewClassifier{
    /**
     * Positive word dictionary. Import from file.
     */
    protected HashSet<String> positiveWords =  new HashSet<String>();
    /**
     * Negative word dictionary. Import from file.
     */
    protected HashSet<String> negativeWords = new HashSet<String>();

    /**
     * Number of positive review files
     */
    private int posFilesCount = 0;
    /**
     * Number of negative review files
     */
    private int negFilesCount = 0;
    /**
     * Number of correct classified positive files
     */
    private int correctPosCount = 0;
    /**
     * Number of correct classified negative files
     */
    private int correctNegCount = 0;


    /**
     * Read in files and start classification
     *
     * @param pathToPosWords Path to positive word file
     * @param pathToNegWords Path to negative word file
     * @param pathToPosReviewsFolder Path to folder holding positive reviews
     * @param pathToNegReviewsFolder Path to folder holding negative reviews
     *
     * @throws IOException
     *
     */
    public void readInFiles(String pathToPosWords, String pathToNegWords, String pathToPosReviewsFolder, String pathToNegReviewsFolder) throws IOException {
        //Read in positive words
        readInWords(pathToPosWords, positiveWords);
        System.out.println(positiveWords.size() + " positive words loaded.\n");

        //Read in negative words
        readInWords(pathToNegWords, negativeWords);
        System.out.println(negativeWords.size() + " negative words loaded.\n");

        //Classify positive reviews
        classifyReviews(pathToPosReviewsFolder, true);

        //Classify negative reviews
        classifyReviews(pathToNegReviewsFolder, false);
    }

    /**
     * Read positive/negative words in to HashSet
     *
     * @param fileName path to file containing words
     * @param dictionary word dictionary
     *
     * @throws IOException
     *
     */
    private void readInWords(String fileName, HashSet<String> dictionary) throws IOException {
        /*
         *  Write your code here.
         *  Description:
         *  1. Open the file with the name 'fileName', which is the positive-words.txt or negative-words.txt
         *  2. Read the file line by line
         *  3. Each line which is not empty and does not start with ';' is a word
         *  4. Put the word into the right HashSet (dictionary)
         */

    }

    /**
     * Read positive/negative reviews, and call for classification
     *
     * @param folderPath path to review folder containing words
     * @param target target polarity. True = positive, False = negative
     *
     * @throws IOException
     *
     */
    private void classifyReviews(String folderPath, boolean target) throws IOException {
        /*
         *  Write your code here.
         *  Description:
         *  1. Open the file with the name 'folderPath', which is a folder
         *  2. get the list of all files in the folder with built-in method .list()
         *  3. Create a string named fileSeparatorChar with method System.getProperty("file.separator"), for the separator is different based on OS
         *  4. Iteratively explore every file with in the file list in step 2
         *  4.1 If the file does not end with '.txt', ignore it
         *  4.2 Count the number of positive files or negative files
         *  4.3 Classify the file with method classifyReview. The input should be the full path of the file (folderPath + fileSeparatorChar + fileName)
         *  4.4 Count the number of correctly/not correctly classified file
         *  4.5 Output following information: Full path and name of the file, ground truth, and classification result
         */

    }

    /**
     * Read positive/negative reviews, and call for classification
     *
     * @param fileName path to review file
     *
     * @return True = positive review, False = negative review
     *
     * @throws IOException
     *
     */
    public boolean classifyReview(String fileName) throws IOException {

        int positive = 0;
        int negative = 0;
        /*
         *  Write your code here.
         *  Description:
         *  1. Open the file with the name 'fileName', which is a movie review txt file
         *  2. Read the file line by line (as a String named text)
         *  3. For each line, first replace all punctuation marks with following lines:
         *  3.1 text = text.replaceAll("<br />"," ");
         *  3.2 text = text.replaceAll("\\p{Punct}"," "); or text = text.replaceAll("[!\"#$%&'()*+,./:;<=>?@\\[\\]^_`{|}~]"," ");
         *  4. Convert all characters to lower case with a built-in method
         *  5. Split the text by space into tokens using white spaces as the separator character "\\s+". The returned String array is the tokens or "words" in the line
         *  6. Match the tokens with positive and negative dictionaries and count the result
         *  7. Close the file
         *  8. Return whether you have more positive words than negative words in the file
         *
         */

        return (positive > negative);

    }

    /**
     * Output the result
     *
     */
    public void outputResult() {
        /*
         *  Write your code here.
         *  Description:
         *  1. Output following information:
         *  1.1 Size of positive and negative dictionaries
         *  1.2 Classification result for positive reviews:
         *  1.2.1 How many files in total
         *  1.2.2 How many files are correct classified
         *  1.2.3 How many files are misclassified
         *  1.2.4 Correct classification rate in format of xx.x%
         *  1.3 Classification result for negative reviews:
         *  1.3.1 How many files in total
         *  1.3.2 How many files are correct classified
         *  1.3.3 How many files are misclassified
         *  1.3.4 Correct classification rate in format of xx.x%
         *  1.4 Classification result for all reviews:
         *  1.4.1 How many files in total
         *  1.4.2 How many files are correct classified
         *  1.4.3 How many files are misclassified
         *  1.4.4 Correct classification rate in format of xx.x%
         */

    }
}
