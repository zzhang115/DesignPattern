package com.dp.filter.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BLUEGHOST1 on 2018/6/4.
 */
public class FilterChain implements Filter {
    private List<Filter> filters;
    private int index = 0;

    public FilterChain() {
        filters = new ArrayList<Filter>();
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public Filter getFilter(int i) {
        return filters.get(i);
    }

    public void removeFilter(Filter filter) {
        filters.remove(filter);
    }

    public void doFilter(Request request, Response response, FilterChain fc) {
        if (index == filters.size()) {
            return ;
        };
        Filter filter = fc.getFilter(index);
        index ++;
        filter.doFilter(request, response, fc);
    }
}
