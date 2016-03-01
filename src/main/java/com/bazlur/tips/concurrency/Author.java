package com.bazlur.tips.concurrency;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/5/15.
 */
public class Author {
    private final String name;

    public String getName() {
        return name;
    }

    public Author(String name_) {
        name = name_;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + "]";
    }
}
