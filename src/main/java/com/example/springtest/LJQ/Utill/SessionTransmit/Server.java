package com.example.springtest.LJQ.Utill.SessionTransmit;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 服务端代码
 */
public class Server {

    public static void main(String[] args) {

        final String QUIT = "quit";
        final int DEFAULT_PORT = 8848;
        ServerSocket serverSocket = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // 绑定监听端口
            serverSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("启动服务器，监听服务器本地端口" + DEFAULT_PORT);

            while (true) {
                // 等待客户端连接
                Socket socket = serverSocket.accept();
                System.out.println("客户端["+socket.getInetAddress()+":"+ socket.getPort() + "]已连接");

                reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream())
                );

                writer = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream())
                );

                String msg = null;
                while ((msg = reader.readLine()) != null) {
                    // 读取客户端发送的消息
                    System.out.println("客户端["+socket.getInetAddress()+":"+ socket.getPort() + "]: " + msg);

                    // 回复客户发送的消息
                    writer.write("服务器已收到: " + msg + "\n");
                    //防止消息遗留到本地缓冲区，保证马上发送出去
                    writer.flush();

                    // 查看客户端是否退出
                    if (QUIT.equalsIgnoreCase(msg)) {
                        System.out.println("客户端["+socket.getInetAddress()+":"+ socket.getPort() + "]已断开连接");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                reader.close();
                writer.close();
                System.out.println("关闭serverSocket");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
