package com.bazlur.tips.srp;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/12/16.
 */
public class Client {

    // Client code is tightly coupled with Type information
    public void performSomeOperation(String source) {
        Reader reader = ReaderFactory.getReader(source);

        String read = reader.read();
        System.out.println(read);
    }
}
