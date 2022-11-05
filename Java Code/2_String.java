class Main {
public static void main(String[] args) {
  string();
}
static void string() {
        
        int x = 10, y = 20; float b = 12.55f; char c = 'A';
        String str = "Hello";
        //print method overloading. //we can even pass expression.
        System.out.println(x+y); //pass only one parameter.
        
        //if used string literal, then all other things //get concatanated. '+' used for concatanation
        System.out.println("Number is " + y);
        System.out.println(x+y+"Sum: "); //first + will add the numbers, second + will concatanate 
            //operator overloading
        System.out.println("Sum: " + x + y); //x will be concatanated first, then y will be concatanated
        //so we need to use  bracket for precedence.
        
        System.out.println("Sum of " + x + " and " + y + " is " + (x+y));//need to use bracket
        
        System.out.format("Sum of %d and %d is %d\n", x, y, x+y);
        System.out.printf("Sum of %d and %d is %d\n", x,y,x+y);
        //format specifier or control character.
        
        // %[argument_index&][flags][width][precision]conversion
        // argument index 1$, 2$, 3$.. // flag -, +, 0, ' ', (
        
                //conversion: 
        //char - c //int - d,o,x //float- f,e,g //string- s //e for scientific representation
        
        System.out.printf("%2$9.3e %1$15s\n", str, b); //chnaging the order
        //argument index to specify which sequence to print.
        //argument in any order, can use it in any place by giving the index
        //print in the order as you like
        
        //String is a collection of characters //variable of type object is reference
        //String str1 = "Java"; //ins tring pool //str1 is a reference holding "java" obejcts.
        
                //constructors()
        // String (char[]) // String (byte[])
        // String (String) //when used new keyword, it is created in heap  
        char cj[] = {'S', 'A', 'K', 'I', 'B'};
        byte by[] = {65, 66, 67, 68, 69, 70};
        
        String str2 = new String(cj, 0, 5);
        String str3 = new String(by, 0, 5); //starting index and how many letters from that that index to print   
        //System.out.println(new String(by));
        
        String str4 = new String("Sakib");  //literal will be created in string constant pool
        // str3 will refer to the new ibjects created in heap. //so two objects created.
        
        String str1 = "Java program";
        //if using same literal, java will not create another literal. //rather refer to the same string objects
        
        System.out.println( str1 + " " + str2 + " " + str3 + " " + str4);
        //java maintain a pool of string. //if two reference hols same objects , they will be equal
        
        String str5 = "Java", str6 = "Java";
        String str7 = new String("Java");
        System.out.println(str5 == str6); //no new object created in pool.
        System.out.println(str5 == str7); //one in pool, another in heap, so refering to different objects.
        
        //String methods
        int len = str5.length(); //calling string methods doesn't chnage the original string.
        //rather creates new chnaged string in pool. String is immutable.
        
        String str8 = str6.toUpperCase();
        //String str6 = str6.toLowerCase(); //str6 points to new create string
        System.out.println(str8);
        
        String str9 = "    Welcome    ";
        System.out.println(str9);
        
        str9 = str9.trim(); //useful when taking input from users //Creates new object and str9 refers to that.
        System.out.println(str9);
        
        String str10 = str9.substring(3);
        System.out.println(str10);
        
        str10 = str9.substring(3, 5);
        System.out.println(str10);
        
        str10 = str9.replace('e', 'S');
        System.out.println(str10);
        
        String tr1 = "www.sust.org"; //Mr. sakib //https
        System.out.println(tr1.startsWith("www"));
        System.out.println(tr1.startsWith("sust", 4));
        System.out.println(tr1.endsWith("org")); //.net .com
 
        System.out.println(tr1.charAt(5));
        System.out.println(tr1.indexOf('d', 5));//not found, starts searching from 5th index
        System.out.println(tr1.indexOf("org"));
        
        System.out.println(tr1.lastIndexOf("."));
        System.out.println(tr1.lastIndexOf('.', 5)); //start searching from 5 in the leftwards direction.
        
        String tr2 = "python", tr3 = "Python", tr4 = "java";
        
        System.out.println(tr2.equals(tr3));
        System.out.println(tr3.equalsIgnoreCase(tr2));
        
        System.out.println(tr4.compareTo(tr2)); //return negative difference if first string is smaller lexicographicaaly
        System.out.println(tr2.compareTo(tr4)); //first string is larger.     
        System.out.println(tr2.compareToIgnoreCase(tr3)); //returns 0 if same string     
        
        //equals method and == is not same.
        // == checks if both references pointing to same object
        // equals check if the content is same.
        
        String tr5 = "java", tr6 = "java";
        String tr7 = new String("java");
        String tr8 = "Java", tr9 = "The great wall of China.";
        //tr5.equals(tr6) //comparison with contents
        //(tr5 == tr6) //comparison of references
        
        System.out.println(tr7.equals(tr5));//true as content same
        System.out.println(tr7 == tr5); // false as not refering to same object
            //tr7 refers to heap, tr5 refers to string pool
        // So == is not a proper way of comparing string. //it compares references
        
        System.out.println(tr5);
        System.out.println(tr5.compareTo(tr6));
        System.out.println(tr5.compareTo(tr8));
        
        System.out.println(tr5.compareTo(tr9)); //tr5 ascii value high, so diff is pos
        System.out.println(tr9.compareTo(tr5)); //tr9 ascii is lower, so diff is neg.
        System.out.println(tr9.contains("wall")); //if a string contains another string.
        
        System.out.println(tr9.concat(tr8)); //neither of tr9 or tr8 will be modified, //new string will be created.
        System.out.println(tr9 + tr8); //concatanation 
        System.out.println(String.valueOf(133)); //to convert any data type into string
        
        //Regular Expression are used for defining patterns for string
        //check whether a string is matching a pattern or not.
        //by using matches method.
        
                //these are for only single character
        // . - any character
        // [abc] - only from a, b, c
        // [abc] [xy] - first digit from a,b,c second digit from x,y
        // [^abc] - not from a,b,c
        // [a-z1-9] - from a to z or 1-9
        // A|B - either A or B
        // AB - exactly AB
        
                //meta characters for single character
        // \d - digits.
        // \D - not digits.
        // \s - space.
        // \S - not space.
        // \w - alphabets or digit.
        // \W - not alphabets or digit.
        
        // when using these meta characters, use double \
        // if used one \, it will assume as escape sequence, not meta character
        
        String oo = "5";
        System.out.println(oo.matches("\\w")); //meaning digit or alpha
        System.out.println(oo.matches("\\s"));
        
                //Qunatifier
        //used for defining how many symbols you want
        //till now, regular expression were checked for single character
        
        // * - 0 or more (any characters any number of time- true for anything we can type from keyboard)
        // + - 1 or more
        // ? - 0 or 1
        // {x} - x times
        // {x,y} - between x and y times
        
        //[abc]* - letters must be a, b, c  but they can be of any number of time
        System.out.println("a".matches("[abc]?"));
        System.out.println("ab".matches("[abc]?"));
        
        System.out.println("abcc".matches("[abc]*"));
        System.out.println("abc".matches("[abc]{1}"));
        System.out.println("a".matches("[abc]{1}")); //exactly 1 letter
        System.out.println("apple".matches("[a-z]*"));
        
        System.out.println("accbaab".matches("[abc]{3,7}"));
        String op = "john3@gmail.com";
        System.out.println(op.matches(".*gmail.*"));
        System.out.println(op.matches("\\w*@gmail.*"));
        
            //String methods challenge
        String mail = "programmer@gmail.com";
        int ind = mail.indexOf('@');
        String surName = mail.substring(0, ind);
        System.out.println(surName);
        String domainName = mail.substring(ind + 1, mail.length());
        System.out.println(domainName);

        int ind2 = domainName.indexOf('.');
        String check = domainName.substring(0, ind2);
        if(check.equals("gmail")) System.out.println("ok");
        if(domainName.startsWith("gmail")) System.out.println("Yes, it is a gmail id.");
        else System.out.println("No, it is not a gmial id.");
        
        //Regular expression challenge
        int bin = 1010101;
        String tp = bin + "";
        System.out.println(tp.matches("[01]+"));
        
        int hex = 0xF5A;
        String tp2 = hex + ""; // tp2 = String.valueOf(hex); //it's a static method.
        System.out.println(tp2.matches("[0-9A-F]+"));
        
        String date = "29/03/2022";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        
        String sr = "a&B%c#1@2(3";
        System.out.println(sr.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(sr.replaceAll("\\W+", "")); //W meaning not alphabet and digits.
        
        String er = " abc  de    fgh      ijk ";
        System.out.println(er.replaceAll("[ ]+", " ").trim()); //can use two methods 
        System.out.println(er.replaceAll("\\W+", " ").trim()); //without alphabet and digits
        er = er.replaceAll("\\s+", " ").trim();
        System.out.println(er);

        String words[] = er.split("[\\s]"); //spaces
        System.out.println(words.length);
        
        String url = "http://www.google.com";
        String protocol = url.substring(0, url.indexOf(":"));
        if(protocol.equals("http")) System.out.println("Hyper text transfer protocol");
        else System.out.println("File transfer protocol");
        
        String ext = url.substring(url.lastIndexOf(".") + 1); //starting after .
        if(ext.equals("com")) System.out.println("Commercial");
        else if(ext.equals("net")) System.out.println("network");
    }
    }
