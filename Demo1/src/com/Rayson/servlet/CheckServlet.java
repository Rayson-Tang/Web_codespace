package com.Rayson.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width = 100;
        int height = 30;
        // 创建图片对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

        // 美化图片
        Graphics g = image.getGraphics();
        g.setColor(Color.pink);
        g.fillRect(0, 0, width, height);

        // 画边框
        g.setColor(Color.blue);
        g.drawRect(0, 0, width - 1, height - 1);

        // 验证码
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            sb.append(c);
            g.drawString(c + "", width / 5 * i, height / 2);
        }

        // 将验证码存入session
        req.getSession().setAttribute("checkCode_session", sb.toString());


        // 干扰线
        int x1 = random.nextInt(width);
        int x2 = random.nextInt(width);
        int y1 = random.nextInt(height);
        int y2 = random.nextInt(height);
        g.setColor(Color.green);
        for (int i = 0; i < 10; i++) {
            g.drawLine(x1, y1, x2, y2);
        }

        // 将图片输入网页
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }


}
