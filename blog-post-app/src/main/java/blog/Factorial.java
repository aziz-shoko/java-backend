package blog;

class Factorial {
    static int fact(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            return fact(n-1, acc*n);
        }
    }
}

// 5 1 -> 4 5 -> 3 20 -> 2 60 -> 1 120 -> 0 -> 120