
/* 
1)creat server socket
2)accept req from client socket for particular client
3)sent data to client
4)write data
*/import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class serverSide_socket {
    public static void main(String[] args)throws IOException {
        ServerSocket server=new ServerSocket(12345);
        Socket clinSocket =server.accept();
        DataOutputStream data=new DataOutputStream(clinSocket.getOutputStream());
        data.writeUTF("hi this is client server");
        server.close();
        data.close();

    }
}
