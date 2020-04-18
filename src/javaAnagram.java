import java.util.Scanner;

public class javaAnagram {
    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        int[] arr=new int[26];
        int[] arr2=new int[26];
        for(int i=0; i<a.length();i++){
            arr[a.charAt(i)-97]= arr[a.charAt(i)-97]+1;
        }
        for(int i=0;i<b.length();i++){
            arr2[b.charAt(i)-97]= arr2[b.charAt(i)-97]+1;
        }
        for (int i = 0; i <26; i++)
            if (arr[i] != arr2[i])
                return false;

        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
