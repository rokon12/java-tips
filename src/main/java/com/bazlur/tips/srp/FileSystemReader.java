package com.bazlur.tips.srp;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/12/16.
 */
public class FileSystemReader implements Reader {
    private String source;

    public FileSystemReader(String source) {
        this.source = source;
    }

    @Override
    public String read() {
        // implement this method

        return null;
    }

    @Override
    public String getSource() {
        return this.source;
    }
}
