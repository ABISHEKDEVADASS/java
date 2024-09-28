
//run one socket using run java in terminal and another using output run

//best practice is to run server side frst and then run client side
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * socket_clinetSide
 * 1)create socket
 * 2)sent req to serverSide socket
 * 3)recive data from server after they accept our req
 */
import java.net.*;
import java.util.*;
public class socket {
public static void main(String[] args)throws IOException {
    Socket clinSocket=new Socket("localhost",12345);
    DataInputStream input=new DataInputStream(clinSocket.getInputStream());
    String msg=input.readUTF();
    System.out.println(msg);
    input.close();      //close is best practice
    clinSocket.close();
}
}