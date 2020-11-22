import java.io.*;
class delsubject {
public static void delsub () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait sub : ");
    bufid = stdin.readLine();
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
      if (bufid.equals(ar[i].substring(0,7))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
}