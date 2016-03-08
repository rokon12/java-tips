package com.bazlur.tips;

public class ArithmeticDemo {
  public static void main(String[] args) {

    int result = 1 + 2;
    // এখানে result এর মান হচ্ছে 3
    System.out.println("1 + 2 = " + result);
    int result2 = result;

    result = result - 1;
    // এখানে result থেকে ১ সাবস্ট্রাক্ট করায়
    // এর মান ২
    System.out.println(result2 + " - 1 = " + result);
    result2 = result;

    result = result * 2;
    // এখানে result এর সাথে ২ মাল্টিপ্লাই
    // করার ফলে এর মান 4
    System.out.println(result2 + " * 2 = " + result);
    result2 = result;

    result = result / 2;
    // আবার result ডিভাইড করার ফলে
    // এর মান হয়ে গেল 2
    System.out.println(result2 + " / 2 = " + result);
    result2 = result;

    result = result + 8;
    // ৮ যোগ করার ফলে এর result হলো 10
    System.out.println(result2 + " + 8 = " + result);
    result2 = result;

    result = result % 7;
    // result এর সাথে ৭ রিমাইন্ডার অপারেটর
    // ব্যবহার করার ফলে এর মান হয়ে গেল
    // 3, কারণ এটি শুধু মাত্র রিমানইন্ডার বা
    // ভাগশেষ রিটার্ন করে
    System.out.println(result2 + " % 7 = " + result);
  }
}