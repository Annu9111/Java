public class lecture_34 {
    public static void main(String[] args) {
        String s1 = new String("Annu");
        String s2 = new String("Annu");

        // ✅ String Methods

        //👉🏻 length/Emptyness
        System.out.println(s1.length());  //4
        System.out.println(s1.isEmpty()); //false
        System.out.println(s1.isBlank());   //false

        //👉🏻 Character access
        System.out.println(s1.charAt(3));  //u
        char[] arr = s1.toCharArray();
        System.out.println(arr);  //Annu

        //👉🏻 Comparison
        System.out.println(s1.equals(s2));   //true 
        System.out.println(s1.equalsIgnoreCase(s2));  //true 
        //lexicographical comparison -->Dictionary
        System.out.println(s1.compareTo(s2));   //0

        //👉🏻 Searching
        System.out.println(s1.contains("nn"));  //true
        System.out.println(s1.indexOf("u")); //3
        System.out.println(s1.lastIndexOf('n')); //2
        System.out.println(s1.startsWith("An"));  //true
        System.out.println(s1.endsWith("nu"));  //true

        //👉🏻 Extraction / Transformation
        System.out.println(s1.substring(0,3)); //Ann
        System.out.println(s1.toUpperCase()); //ANNU
        System.out.println(s1.toLowerCase()); //annu
        System.out.println(s1.trim()); //Annu
        System.out.println(s1.strip()); //Annu
        System.out.println(s1.repeat(2)); //AnnuAnnu
        System.out.println(s1.replace("u","y"));  //Anny 
        System.out.println(s1.replaceAll("n", "p")); //Appu

        String s3 = "Annu , Anny , Appy";
        String[] list =  s3.split(",");
        for (String s : list){
            System.out.println(s);
        }

        System.out.println(String.join("-","a","b"));  //a-b


        //👉🏻 Conversion
        String s4 = new String(String.valueOf(10));
        System.out.println(s4);  //10 -->string type


        //👉🏻 Advance -> intern(), format()
        String s5 = new String("Hello");
        String s6 = s5.intern();
        System.out.println(s5 == s6);

        String name = "Annu";
        int age = 19;
        System.out.println(String.format("hello %s your age is %s", name,age));


    }
}
