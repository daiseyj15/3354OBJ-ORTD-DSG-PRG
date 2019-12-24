package solution.Assignment2;

import movieReviewClassification.AbstractReviewHandler;

public class MovieReview  {
    /**
     * Constructor.
     * @param id
     * @param text
     * @param realPolarity
     */
    /**
     *
     * @return Tweet id field
     */
        public MovieReview(int id, String text, int realPolarity)
        {
            this.id = id;
            this.text = text;
            this.realPolarity = realPolarity;
            this.predictedPolarity = 0; // Set a default value. To be changed later.
        }

        private static final long serialVersionUID = 1L;

        /**
         * The id of the review (e.g. 2087).
         */
        private final int id;


        /**
         *  The text of the review.
         */
        private final String text;

        /**
         * The predicted polarity of the tweet (0 = negative, 1 = positive).
         */
        private int predictedPolarity;

        /**
         * The ground truth polarity of the tweet (0 = negative, 1 = positive, 2 = unknown).
         */
        private final int realPolarity;


        public int getId()
        {
            return id;
        }


        /**
         *
         * @return Tweet text field
         */
        public String getText()
        {

            return text;

        }



        /**
         *
         * @return predictedPolarity field
         */
        public int getPredictedPolarity()
        {
            return predictedPolarity;
        }



        /**
         *
         * @param predictedPolarity
         */
        public void setPredictedPolarity(int predictedPolarity)
        {
            this.predictedPolarity = predictedPolarity;
        }

        /**
         *
         * @return realPolarity
         */
        public int getRealPolarity()
        {
            return realPolarity;
        }


        public String toString()
        {
            return  "\n["+
                    "ID:"+ id+"\n"
                    +"TEXT: "+text+"\n"
                    +"REAL POLARITY: " +realPolarity+"\n"
                    +"PREDICTED POLARITY: "+predictedPolarity+"]\n";
        }
    }

