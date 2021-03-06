package com.dp.filter.chain;

/**
 * Created by BLUEGHOST1 on 2018/6/4.
 */
public class SymbolFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain fc) {
        String str = request.getMsg().replace('!', ' ')
                .replace('@', ' ');
        str += "---SymbolFilter";
        request.setMsg(str);
        fc.doFilter(request, response, fc);
        response.setMsg(response.getMsg() + "---SymbolFilter");
    }
}
