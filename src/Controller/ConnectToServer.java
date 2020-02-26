package Controller;

import Controller.Gson.*;

import com.google.gson.*;

import java.io.*;
import java.net.*;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class ConnectToServer {

    public static void sendMessageToServer(String message) throws IOException {
        Socket out = new Socket("gpu2.usask.ca",10219); //sending to Main Server
        /* Write to server using printWriter */
        PrintWriter output = new PrintWriter(out.getOutputStream());
        output.print(message);
        output.flush();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        /* Get server's response using InputStream */
        Reader input = new InputStreamReader(out.getInputStream());
        char[] cb = new char[1024];
        int rc = input.read(cb);
        System.out.println(rc + "bytes read");
        if (-1 == rc) {
            throw new IOException("end of file");
        } else {
            String i = new String(cb).trim();
            System.out.println("Server's Response: " + i);
        }
    }
    public static void main(String[] args) throws IOException {
        CreateMessage create = new CreateMessage("create", "zhz028", 3,"wild", 30, false,
                "4df9f5e1d0edd37bf6943cecce6191a5");
        Gson createGson = new Gson();
        String msg = createGson.toJson(create);
        create.hashObject(msg);
        String json = createGson.toJson(create);
        sendMessageToServer(json);

        JoinMessage join = new JoinMessage("join", "yaw677", 930107, "TableLargeEvent",
                "5c3cebd356ae5224029014845f34876a"
        );
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES);
        Gson joinGson =  gsonBuilder.create();
        String joinMsg = joinGson.toJson(join);
        join.hashObject(joinMsg);
        String joinJosn = joinGson.toJson(join);
        sendMessageToServer(joinJosn);
    }
}
