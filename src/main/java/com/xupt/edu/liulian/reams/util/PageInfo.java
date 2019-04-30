
package com.xupt.edu.liulian.reams.util;

import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 对Page<E>结果进行包装
 *
 * @author wanyue.zhao
 */
@Data
public class PageInfo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    //当前页
    private Integer pageNum;

    //总记录数
    private Long total;

    //总页数
    private Integer pages;

    //结果集
    private List<T> list;

    public PageInfo() {
    }

    /**
     * 包装Page对象
     *
     * @param list
     */
    public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();

            this.pages = page.getPages();
            this.list = page;
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;

            this.pages = 1;
            this.list = list;
            this.total = Long.valueOf(list.size());
        }
    }


}