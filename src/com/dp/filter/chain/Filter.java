package com.dp.filter.chain;

/**
 * Created by BLUEGHOST1 on 2018/6/4.
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
