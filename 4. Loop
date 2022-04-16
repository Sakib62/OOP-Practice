class Main {

    public static void main(String[] args) {
        loop();
    }

    static void loop() {
        System.out.println("First 10 Fibonacchi Number: ");
        int n = 10, a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");

        for(int i = 1; i <= n - 2; i++) {
            c = a + b; a = b; b = c;
            System.out.print(c + " ");
        } 
        System.out.println("\n");
        
        System.out.println("Number Square");
        int count = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.format("%02d ", ++count);
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Number pattern");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Mirrored Right Triangle");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i + j <= 5) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Right Triangle");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("_");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Inverted Right Triangle");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Inverted Mirrored Right Triangle");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j >= i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Number Traingle");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Diamond Shape");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i + j > 5) System.out.print("* ");
                else System.out.print("  "); //one portion
            }
            for(int j = 1; j <= i; j++) {
                if(j < i) System.out.print("* "); //second portion
            }
            System.out.println("");
        }
        //to make it diamond shaped
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j <= i) System.out.print("  ");
                else System.out.print("* ");
            }
            for(int j = 1; j <= 3 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
}
