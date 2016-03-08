package com.bazlur.tips.twitter;

import java.time.LocalDateTime;

public class Tweet {
  private String text;
  private String name;
  private LocalDateTime dateTime;

  public Tweet(String text, String name) {
    this.text = text;
    this.name = name;
    this.dateTime = LocalDateTime.now();
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public String toString() {

    return text + " - by " + name + " on " + dateTime.toString();
  }
}