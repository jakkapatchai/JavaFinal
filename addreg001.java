import java.io.*;
class addregister {
    public static void addreg () throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String bufid,bufsubj,bufgrade;
        System.out.print("Wait id : ");
        bufid = stdin.readLine();
        System.out.print("Wait subject : ");
        bufsubj = stdin.readLine();
        System.out.print("Wait grade : ");
        bufgrade = stdin.readLine();
        String b;
        String ar[] = new String[10];
        FileReader fin = new FileReader("register.txt");
        BufferedReader bin = new BufferedReader (fin);
        int i = 0;
        while ((b =  bin.readLine()) != null) {      
            ar[i] = b; 
            i = i + 1;
        }    
        fin.close();
        int tot = i;
        FileOutputStream fout = new FileOutputStream("register.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        PrintStream pout = new PrintStream(bout);
        i = 0;
        while (i < tot) {      
            pout.println(ar[i]);     
            i = i + 1;
        }
        pout.println(bufid + "," + bufsubj + "," + bufgrade);
        System.out.println("Add : completely");
        pout.close();
    }
}