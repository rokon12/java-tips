package com.bazlur.tips.srp;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/12/16.
 */
public class ReaderFactory {
    public static Reader getReader(String source){
        if (source.contains("http://")) {
            return new HttpReader(source);
        }else if (source.contains("")){

            return null;//new SomeReader();
        }

        else {
            return new FileSystemReader(source);
        }
    }
}
