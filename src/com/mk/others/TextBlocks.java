package com.mk.others;

public class TextBlocks {
    public static void main(String[] args) {
        System.out.println("JAVA: Text blocks");

        // can have spaces, indent, lines and quotes
        // use of variables with format method
        System.out.println("""
                line1...
                line2...    
                    "fun"
                    "%d" and "%s"
                """.formatted(1001, "some data"));

        System.out.println("after text block");

    }
}
