package EjerciciosInterfacesII;

import java.util.stream.IntStream;

public class CharClass implements java.lang.CharSequence {
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return java.lang.CharSequence.super.isEmpty();
    }

    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return java.lang.CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return java.lang.CharSequence.super.codePoints();
    }
}
