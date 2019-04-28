package com.xupt.edu.liulian.reams.util;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


/**
 * @author: liulian
 * @date: 2019/4/28
 * @description:
 */
public class ResponseUtil {
    /**
     * 将数据通过ajax的方式发送到浏览器
     * @param response
     * @param o
     * @throws Exception
     */
    public static void write(HttpServletResponse response, Object o)throws Exception
    {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println(o.toString());
        out.flush();
        out.close();
    }


}
