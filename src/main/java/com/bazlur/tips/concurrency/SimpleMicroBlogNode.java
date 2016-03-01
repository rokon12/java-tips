package com.bazlur.tips.concurrency;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/5/15.
 */
public interface SimpleMicroBlogNode {
    void propagateUpdate(Update upd_, SimpleMicroBlogNode backup_);

    void confirmUpdate(SimpleMicroBlogNode other_, Update update_);

    String getIdent();
}
