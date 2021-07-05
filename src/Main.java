import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("*********************")
                .setOAuthConsumerSecret("******************************************")
                .setOAuthAccessToken("**************************************************")
                .setOAuthAccessTokenSecret("******************************************");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        Trends trends = twitter.getPlaceTrends(00000000);//23424969
        //String stringTrends = trends.toString();
        //System.out.println(stringTrends);
        Trend[] trendS = trends.getTrends();
        //String[] trendSArray = new String[50];
        for (int i = 0; i < trendS.length; i++) {
            if (trendS[i].toString() == "Getir" || trendS[i].toString() == "getir" || trendS[i].toString() == "#getir") {
                System.out.printf("Getir is a trending topic");
            }
        }
    }
}