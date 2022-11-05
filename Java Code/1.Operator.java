    import java.util.Scanner;
    class Main {
    
    public static void main(String[] args) {
      operator();
    }
    
    static void operator() {
        
        float area, base, height;
        //System.out.println("Enter base & height: ");
        Scanner sc = new Scanner(System.in);
        //base = sc.nextFloat(); height = sc.nextFloat();
        base = 5f; height = 6f;
        
        //area = base * height / 2;
        area = 1f / 2f * base * height;
        System.out.println("Area of the triangle is: " + area);
        
        int a, b, c;
        //a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        a = 10; b = 20; c = 20;
        float s = (a + b + c) / 2f;
        double area2 = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        System.out.println("Area of the traingle is: " + area2);
        
        //solving quadratic equations.
        int d, e, f;
        //d = sc.nextInt(); e = sc.nextInt(); f = sc.nextInt();
        d = 1; e = -5; f = 6;
        
        double r1, r2;
        r1 = (-e + Math.sqrt(e * e - 4 * d * f)) / (2 * d);
        r2 = (-e - Math.sqrt(e * e - 4 * d * f)) / (2 * d);
        System.out.println("The roots are r1 = " + r1 + " and r2 = " + r2);
        
        int g1 = 5, g2 = 6, g3 = 9;
        System.out.println("The result of the expression is: "  + (g1++ + ++g2 + ++g3 + ++g1));
        //pre/post incr/decr operator: if used independently behaves same.
        //if used in expression, behaves differently.
        
        char g4 = 'A';
        float g5 = 9.43f;
        g5++; g4++;
        System.out.println("Result is: " + g4 + " " + g5);
        
        byte w1 = 5;
        w1 += 4;//works!
        //w1 = w1 + 4; //doesn't work. because 4 is integral literal. thus w1 need to be int.
        //But in pre/post incr/decr operator, data type doesn't change.
        System.out.println("After increment operation the byte var w1 = : " + w1);
        
        int h4 = 9, h5 = 10;
        h4 = h4 ^ h5; 
        h5 = h4 ^ h5;
        h4 = h4 ^ h5;
        //h4 = 10, h5 = 9
        System.out.println("After swapping using bitwise xor, the values are: " + h4 + " " + h5);  
        System.out.println("Applying some bitwise operation " + (h4 & h5) + " " + (h4 | h5) + " " + (h4 ^ h5) + " " + (-10 >>> 1) + " " + (~10));
        
        //bitwise right shift.
        int h6 = -10, h7;
        h7 = h6;
        h6 >>= 1;
        System.out.println(String.format("%s", Integer.toBinaryString(h7)));
        System.out.println(String.format("%32s", Integer.toBinaryString(h6)));
        
        //merging & masking
        //merging is setting a bit, via or operation
        //masking is checking whether a bit is on or not. by performing and operation
        
        //4 bit is nibble.
        byte hi = 0;
        hi |= 9; //last 4 bit for 9.
        hi <<= 4; // 4 bit left shift
        hi |= 5; //last 4 bit for 5.
        System.out.println(Integer.toBinaryString(hi));
        //we can see which nibble holds which number via masking.
        
        //reading those numbers by bitwise masking.
        byte tmp = (byte)(9 << 4);
        tmp = (byte)(tmp | 12); //tmp = 9 12
        //by left shifting and or we can store two num(0 - 15) in nibble. 
        
        //retrieving data
        //left 4 bits, right 4 bits
        System.out.println(tmp & 0b1111); //12
        System.out.println((tmp >> 4) & 0b1111); //9
        
        System.out.println((tmp & 0b11110000) >> 4);
        System.out.println(tmp & 0b00001111);
        //by and and right shifting, we can retriev the value.  
    }
  
    }
