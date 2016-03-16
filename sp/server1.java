import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;

public class server1 {
    public static void main(String args[])
    {
        String str;
        try{
            ServerSocket serversocket= new ServerSocket(3010);
            Socket clientsocket=serversocket.accept();
            PrintWriter out=new PrintWriter(clientsocket.getOutputStream(),true);
            BufferedReader in=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            while((str=in.readLine())!=null)
            {
               
                if(str.equals("what is your name?"))
                {
                   out.println("my name is athira");
                    
                }
                else if(str.equals("how old are you?"))
                {
                    out.println("i am 19 years old");
                    break;
                }
                 else if(str.equals("where are you comming from?"))
                {
                    out.println("i am from trivandrum");
                    break;
                }
                if(str.equals("i am going"))
                {
                    break;
                }
                
                }
            }
        catch(Exception e)
        {
            System.out.println(e);
        
        }

  }
    
}