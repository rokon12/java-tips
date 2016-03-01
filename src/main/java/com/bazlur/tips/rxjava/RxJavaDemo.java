package com.bazlur.tips.rxjava;

import rx.Observable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/3/15.
 */
public class RxJavaDemo {

    public static void hello(String... names) {
    }

    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        List<Double> doubles = new ArrayList<>();
//
//        if (integers.getClass().equals(doubles.getClass())){
//            System.out.println("You blew it up! ah, damn you!!");
//        }else {
//            System.out.println("No Luck!");
//        }

        String keys = "Hello World";
        String json = "{\"importAuthKey\":{\"authKey\":\"" + keys + "\"}}";

        Pattern pattern = Pattern.compile("\\b\\w{4}[-.]?\\w{4}[-.]?\\w{4}[-.]?\\w{4}\\b");
        String authKeys = "vW1u-ppep-JJJt-JJiN,2Wzu-ppep-JJJt-JJiN,3Wzu-ppep-JJJt-JJiN,4Wzu-ppep-JJJt-JJiN,5Wzu-ppep-JJJt-JJiN,6Wzu-ppep-JJJt-JJiN";

        String key2 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<importAuthKey>" +
                "  <authKey>" + keys + "</authKey>" +
                "</importAuthKey>";

        Matcher matcher = pattern.matcher(authKeys);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    private static Observable<?> getTitle(String s) {
        return Observable.create(op -> {
            op.onNext(s.toUpperCase());
            op.onCompleted();
        });
    }

    private static Observable<String> query(String s) {
        return Observable.from(s);
    }
}
