package com.example.springtest.LJQ.Utill.SessionTransmit;

import java.io.*;
import java.net.Socket;


/**
 * 客户端代码
 */
public class Client {


    public static void main(String[] args) {

        final String QUIT = "quit";
        final String DEFAULT_SERVER_HOST = "127.0.0.1";
        final int DEFAULT_SERVER_PORT = 8848;
        Socket socket = null;

        BufferedWriter writer = null;
        BufferedReader reader = null;
        BufferedReader consoleReader = null;

        try {
            // 创建socket
            socket = new Socket(DEFAULT_SERVER_HOST, DEFAULT_SERVER_PORT);

            // 创建IO流
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );

            // 等待用户输入信息
            consoleReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String input = consoleReader.readLine();

                // 发送消息给服务器
                writer.write(input + "\n");
                writer.flush();

                // 读取服务器返回的消息
                String msg = reader.readLine();
                System.out.println(msg);

                // 查看用户是否退出
                if (QUIT.equalsIgnoreCase(input)) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                writer.close(); //关闭之前还会flush一次
                socket.close();
                reader.close();
                consoleReader.close();
                System.out.println("关闭socket");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

