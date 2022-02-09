package com.wg.authority.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wg.authority.common.bean.ResultBean;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtil {
    public static void out(HttpServletResponse response, ResultBean resultBean) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType("text/html; charset=UTF-8");//"text/html; charset=UTF-8",MediaType.APPLICATION_JSON_UTF8_VALUE
        try {
            mapper.writeValue(response.getWriter(), resultBean);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
