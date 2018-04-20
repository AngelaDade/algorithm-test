package com.company.DesignPatterns.DesignPatternBeans.Decoraters;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lipeiyuan on 2018/4/11.
 */
public class LowerCaseInputStream extends FilterInputStream{


    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c:Character.toLowerCase((char)c));
    }
}
