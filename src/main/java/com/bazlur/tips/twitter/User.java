package com.bazlur.tips.twitter;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/27/16.
 */
public class User {
    private String name;
    private Tweet[] tweets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tweet[] getTweets() {
        return tweets;
    }

    public void setTweets(Tweet[] tweets) {
        this.tweets = tweets;
    }
}
