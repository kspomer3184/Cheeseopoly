/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChristmasServer;

/**
 *
 * @author kylespomer
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;



public class Client {

    public static void main(String[] args) throws IOException {
        
        Socket s = new Socket("cop3330.hpc.lab", 2016);
        System.out.println(s.isConnected());
        System.out.println();

        DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
        BufferedReader input =
            new BufferedReader(new InputStreamReader(s.getInputStream()));        
        outToServer.writeBytes("color \n");
        
        String answer = input.readLine();
        System.out.println(answer);
    }


}
