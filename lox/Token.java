package com.craftinginterpreters.lox;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int lineNum;

    Token(TokenType type, String lexeme, Object literal, int lineNum) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.lineNum = lineNum;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
