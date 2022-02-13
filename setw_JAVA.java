import java.util.*;

public class setw_JAVA {
    static StringBuilder setw(int n, int z){
        StringBuilder str = new StringBuilder();
        String blank = " ";
        String val = String.valueOf(z);
        int length = val.length();

        int diff = n - length;

        for( int i=0 ; i<diff ; i++ ){
            str.append(blank);
        }

        str.append(val);

        return str;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 11;
        a[2] = 111;
        a[3] = 1111;

        for( int i=0 ; i<4 ; i++){
            System.out.println("\t" + setw(4,a[i]));
        }

        input.close();
        
    }
}
