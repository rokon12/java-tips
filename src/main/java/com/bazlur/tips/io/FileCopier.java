package com.bazlur.tips.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopier {

    public void copy(InputStream source, OutputStream destination) throws IOException {
        try {
            int c;
            while ((c = source.read()) != -1) {
                destination.write(c);
            }
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }

}
