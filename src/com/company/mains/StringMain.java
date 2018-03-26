package com.company.mains;

import com.company.StringAlgorithm.SpaceReplace;

/**
 * Created by lipeiyuan on 2018/3/26.
 */
public class StringMain {

    public static void main(String[] agrs) {
        String str = "a b c d";
        SpaceReplace spaceReplace = new SpaceReplace();
        String newStr = spaceReplace.replaceSpace(str);
        System.out.println(newStr);

    }
}
