package com.dp.filter.chain;

/**
 * Created by BLUEGHOST1 on 2018/6/4.
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request("hello world! --- <h> I am coming !</h> --- symbol @@@");
        Response response = new Response("response");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new StopWordFilter())
                .addFilter(new SymbolFilter());
        filterChain.doFilter(request, response, filterChain);
        System.out.println(request.getMsg());
        System.out.println(response.getMsg());
    }
}
