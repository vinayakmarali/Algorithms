package com.lc;

public class ReadNCharsGivenRead4 {

    public int read(char[] buf, int n) {
        boolean eof = false;
        int total = 0;
        char[] tmp = new char[4];

        while (!eof && total < n) {
            int count = read4(tmp);
            eof = count < 4;
            count = Math.min(count, n - total);
            for(int i = 0; i < count; i++) {
                buf[total++] = tmp[i];
            }
        }
        return total;
    }
}
