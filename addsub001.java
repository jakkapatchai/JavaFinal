import java.io.*;
class addsubject {
    public static void addsub () throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String bufSub,bufSubj;
        System.out.print("Wait Subjectid : ");
        bufSub = stdin.readLine();
        System.out.print("Wait Subject : ");
        bufSubj = stdin.readLine();
        String b;
        String ar[] = new String[10];
        FileReader fin = new FileReader("subject.txt");
        BufferedReader bin = new BufferedReader (fin);
        int i = 0;
        while ((b =  bin.readLine()) != null) {      
            ar[i] = b; 
            i = i + 1;
        }    
        fin.close();
        int tot = i;
        FileOutputStream fout = new FileOutputStream("subject.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        PrintStream pout = new PrintStream(bout);
        i = 0;
        while (i < tot) {      
            pout.println(ar[i]);     
            i = i + 1;
        }
        pout.println(bufSub + "," + bufSubj);
        System.out.println("Add : completely");
        pout.close();
    }
}