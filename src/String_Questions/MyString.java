package String_Questions;

public class MyString {
    public static void main(String[] args) {
//        String s = "Sushil Gupta";
//        System.out.println(s);
//        int arr[] = new int[3];
//        arr[0] = 4;
//        System.out.println(arr[0]);
//        int brr[] = arr;
//        brr[0] = 8;
//        System.out.println(arr[0]);
//        int crr[] = new int[3];
//        crr[0] = 10;
//        System.out.println(arr[0]);
//        System.out.println(brr[0]);
//        System.out.println(crr[0]);

//        String name1 = "Sushil gupta";
//        System.out.println(name1);
//        String name2 = name1;
//        name2 = "Golu";
//        System.out.println(name2);                             //SCP
//        String name3 = "Sameer";
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);

//        String name1 = "Sushil";
//        String name2 = "Sushil";
//        String name3 = "Sushil";
//        String name4 = name1;                            //reference
//        System.out.println(name1 == name2);
//        System.out.println(name2 == name3);
//        System.out.println(name3 == name4);
//        System.out.println(name1 == name4);

//        String name1 = new String("Sushil");
//        String name2 = new String("Sushil");
//        String name3 = new String("Sushil");                       //new keyword
//        String name4 = name1;
//        System.out.println(name1 == name2);
//        System.out.println(name2 == name3);
//        System.out.println(name3 == name4);
//        System.out.println(name1 == name4);

//        String name1 = new String("Sushil");
//        String name2 = new String("Sushil");
//        String name3 = new String("Sushil");                       //Compare
//        String name4 = name1;
//        System.out.println(name1.equals(name2));
//        System.out.println(name2.equals(name3));
//        System.out.println(name3.equals(name4));
//        System.out.println(name1.equals(name4));


//        String name = "sUshiL Gupta";
//        System.out.println(name.toLowerCase());
//        System.out.println(name);
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(5));
//        System.out.println(name.indexOf('L'));
//        System.out.println(name.lastIndexOf('u'));
//        System.out.println(name.length());
//        char ch[] = name.toCharArray();
//        for(int i = 0; i < ch.length; i++){
//            System.out.print(ch[i] + " ");
//        }

//        System.out.println("Sushil".compareTo("Sush"));
//        System.out.println("Sush".compareTo("Sushil"));
//        System.out.println("Sushil".compareTo("Sushil"));
//
//        System.out.println("   Golu Gupta    ");
//        System.out.println("   Golu Gupta    ".trim());

//        System.out.println("Sushil gupta".startsWith("Sushil "));
//        System.out.println("Sushil gupta".startsWith("Sushil "));
//        System.out.println("Sushil gupta".endsWith("Sushil "));
//        System.out.println("Sushil gupta".endsWith("ta"));

//        System.out.println("Sushil".substring(2,5));

//        String myLocations = "bengaluru, hyderabad, chennai, noida, pune";
//        String myList[] = myLocations.split(",");
//        for(int i = 0; i < myList.length; i++){
//            System.out.print(myList[i] + " ");
//        }

        String email1 = "sushil.mriirs@gmail.com";
        String email2 = "golu.mriirs@hotmail.com";
        String emailArr[] =  email1.split("@");
        String lastPart = emailArr[emailArr.length-1];
        int dotIndex = lastPart.lastIndexOf('.');
        System.out.println(lastPart.substring(0,dotIndex));

    }
}
