package sentiment;

import java.io.File;
import solution.Assignment2.MovieReview;


public class Sentiment {


    public Sentiment(File file) { };

    public int classifyText(String text )
    {
        int pos = 1;
        int neg = 0;
        int unknown = 2;
        MovieReview review = new MovieReview(0,text,0);

        if (review.getPredictedPolarity() == pos){
            return pos;
        }
        else if (review.getPredictedPolarity() == neg){
            return neg;
        }
        else {
            return unknown;
        }

    }
}
