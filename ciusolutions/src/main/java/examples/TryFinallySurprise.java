package examples;

public class TryFinallySurprise {
    static boolean surpriseTheProgrammer(boolean bVal) {
        while (bVal) {
            try {
                return true;
            }
            finally {
                break;
            }
        }
        return false;
    }

    static int giveMeThatOldFashionedBoolean(boolean bVal) {
        try {
            if (bVal) {
                return 1;
            }
            return 0;
        }
        finally {
            System.out.println("Got old fashioned.");
        }
    }

    static int hopAround() {
        int i = 0;
        while (true) {
            try {
                try {
                    i = 1;
                }
                finally { // the first finally clause
                    i = 2;
                }
                i = 3;
                return i; // this never completes, because of the continue
            }
            finally { // the second finally clause
                if (i == 3) {
                    continue;
                }
            }
        }
    }


    public static void main(String[] args) {
//        System.out.println(surpriseTheProgrammer(true));
//        boolean b = true;
//
//        System.out.println(giveMeThatOldFashionedBoolean(b));

        System.out.println(hopAround());
    }
}
