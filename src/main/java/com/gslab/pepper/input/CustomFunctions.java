package com.gslab.pepper.input;

/**
 * The CustomFunctions allows users to write custom functions and then it can be used in template.
 *
 * @Author Satish Bhor<satish.bhor@gslab.com>, Nachiket Kate <nachiket.kate@gslab.com>
 * @Version 1.0
 * @since 01/03/2017
 */
public class CustomFunctions {
    public static String createMsgBody(int msgSize) {
        int charCount = 1024 * msgSize - 100; //in kilobytes
        StringBuilder sb = new StringBuilder(charCount);
        for (int i=0; i<charCount; i++) {
            sb.append('x');
        }
        return sb.toString();
    }

}
