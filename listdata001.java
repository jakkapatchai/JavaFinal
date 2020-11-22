import java.io.*;
class listdata {
    public static void list() throws IOException {
        char c;
        String b = "";
        String[] fields;
        System.out.print("Enter Student ID : ");
        c = (char)System.in.read();
        FileReader fin = new FileReader("register.txt");
        BufferedReader bin = new BufferedReader(fin);
        while((b = bin.readLine()) != null){
            fields = b.split(",");
            System.out.println("Subject ID : " + fields[1]); 
        }
        fin.close();
    }
}
