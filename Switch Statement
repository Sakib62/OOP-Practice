class Main {

public static void main(String[] args) {
  switchOperation();
}

    static void switchOperation() {
        int n = 3;
        String decide = "save";     
    //switch is branch-control statement //if we don't use break, then fall through
    //used in menubar apps. //executes faster than ladder if else where each statement is checked
    //in switch, it only executes the matched statement. so time is saved.
    //more like, directly pressing the switch of fan rather than checking every switch in a board.
        switch(decide) {
            case "open": System.out.println("ONE"); break;
            case "save": System.out.println("Two"); break;
            case "new" : System.out.println("Four");
            default    : System.out.println("Invalid");
        }

        int a = 5, b = 14, c = 10; //find larger of a, b, c
        if(a >= b && a >= c) System.out.println(a + " is largest.");
        else if(b >= c) System.out.println(b + " is largest.");
        else System.out.println(c + " is largest.");

        int year = 1700; //Find it is leap year
        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");
   
//        if(year % 4 == 0) {
//            if(year % 100 == 0) {
//                if(year % 400 == 0) System.out.println(year + " is a leap year.");
//                else System.out.println(year  + " is not a leap year.");
//            }
//            else System.out.println(year + " is a leap year.");
//        }
//        else System.out.println(year + " is not a leap year.");
    }
}
