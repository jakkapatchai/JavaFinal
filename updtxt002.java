import java.io.*;
import java.util.regex.*;
class updtxt { 
  public static void main(String args[]) throws IOException {
    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10 ,11] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } else if (buf.equals("1")){
        addstudent ad = new addstudent();
        ad.addstd();
        buf = " ";
      } else if (buf.equals("2")){
        addsubject as = new addsubject();
        as.addsub();
        buf = " ";
      } else if (buf.equals("3")){
        addregister ar = new addregister();
        ar.addreg();
        buf = " ";
      } else if (buf.equals("4")){
        delstudent ds = new delstudent();
        ds.delstd();
        buf = " ";
      } else if (buf.equals("5")){
        delsubject dj = new delsubject();
        dj.delsub();
        buf = " ";
      } else if (buf.equals("6")){
        delregister dr = new delregister();
        dr.delreg();
        buf = " ";
      } else if (buf.equals("7")){
        editstudent ed = new editstudent();
        ed.editstd();
        buf = " ";
      } else if (buf.equals("8")){
        editsubject es = new editsubject();
        es.editsub();
        buf = " ";
      } else if (buf.equals("9")){
        editregister er = new editregister();
        er.editreg();
        buf = " ";
      } else if (buf.equals("10")){
        liststudent ld = new liststudent();
        ld.list();
        buf = " ";
      } else if (buf.equals("11")){
        listsubject ls = new listsubject();
        ls.list();
        buf = " ";
      } else if (buf.equals("12")){
        listregister lr = new listregister();
        lr.list();
        buf = " ";
      } else if (buf.equals("13")){
        listdata ld = new listdata();
        ld.list();
        buf = " ";
      } else if (buf.equals("14")){
        listaboutme la = new listaboutme();
        la.list();
        buf = " ";
      } else if (buf.equals("menu") || buf.equals("m")) {
        displaymenu();
        buf = " ";
      } else {
        System.out.print(waitopt);
        buf = stdin.readLine();
      }
    }
  }
  static void displaymenu () {
    System.out.println("0 : exit");
    System.out.println("1 : Add Student");
    System.out.println("2 : Add Subject");
    System.out.println("3 : Add Register");
    System.out.println("4 : Delete Student");
    System.out.println("5 : Delete Subject");
    System.out.println("6 : Delete Register");
    System.out.println("7 : Edit Student");
    System.out.println("8 : Edit Subject");
    System.out.println("9 : Edit Register");
    System.out.println("10 : List Student");
    System.out.println("11 : List Subject");
    System.out.println("12 : List Register");
    System.out.println("13 : List Data");
    System.out.println("14 : About me");
    System.out.println("");  
  }
}