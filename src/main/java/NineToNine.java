public class NineToNine {
    public static void main(String[] args) {
        for (int r = 0; r < 9; r += 3) {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 4; j++) {
                    if (i * (j + r) < 10 && (j + r) != 1) {
                        System.out.printf( (j + r) + "*" + i + "=" + " " + i * (j + r) +"|" + "\t" + "\t");
                    } else {
                        System.out.printf( (j + r) + "*" + i + "=" + i * (j + r) +"|" + "\t" + "\t");
                    }

                    }
                    System.out.println();
                }
                System.out.println("--------------------------------------");

            }
        }
    }

