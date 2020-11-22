import java.io.*;
class editsubject {
public static void editsub () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufsubid,bufsubname;
    System.out.print("Wait subjectid : ");
    bufsubid = stdin.readLine();
    System.out.print("Wait subjectname : ");
    
    bufsubname = stdin.readLine();
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
      if (bufsubid.equals(ar[i].substring(0,7))) {
        pout.println(bufsubid + "," + bufsubname);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
}