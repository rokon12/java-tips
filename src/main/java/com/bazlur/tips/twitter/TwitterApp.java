package com.bazlur.tips.twitter;

public class TwitterApp {
    int total = 0;
    Tweet[] tweets = new Tweet[10];

    public void addTweets(Tweet tweet) {
        tweets[total] = tweet;
        total++;
    }

    public Tweet[] getTweets() {
        return tweets;
    }


    public static void main(String[] args) {

    }

}
