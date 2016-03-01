package com.bazlur.tips.generics;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public interface Function<A, B, X extends Throwable> {
    B apply(A x) throws X;
}
