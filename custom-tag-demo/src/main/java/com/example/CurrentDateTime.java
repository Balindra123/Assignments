package com.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime extends SimpleTagSupport {
    String fontColor;
    String size;

    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        if ( fontColor != null)
            out.write(String.format("<span style='color:%s; font-size:%s'>%s</span>",  fontColor, size, ft.format(dNow)));
        else
            out.write(String.format("<span>%s</span>", ft.format(dNow)));
    }

    // Setters
    public void setFontColor(String  fontColor) {
        this. fontColor =  fontColor;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
