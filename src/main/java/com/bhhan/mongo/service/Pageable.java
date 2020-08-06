package com.bhhan.mongo.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

/**
 * Created by hbh5274@gmail.com on 2020-08-06
 * Github : http://github.com/bhhan5274
 */

@Getter
@NoArgsConstructor
public class Pageable {
    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_SIZE = 50;
    private static final int DEFAULT_PAGE = 0;

    private int page = DEFAULT_PAGE;
    private int size = DEFAULT_SIZE;

    public PageRequest toPageRequest(){
        return PageRequest.of(page - 1, getSize());
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        if(isOverSize(size)){
            this.size = DEFAULT_SIZE;
        }else{
            this.size = size;
        }
    }

    private boolean isOverSize(int size) {
        return size > MAX_SIZE;
    }
}
