package com.github.cwh.common.msg;

import lombok.Data;

@Data
public class ObjectRestResponse<T> {
    T data;
    boolean rel;

    public boolean isRel() {
        return rel;
    }

    public ObjectRestResponse data(T data) {
        this.setData(data);
        return this;
    }

    public ObjectRestResponse rel(boolean rel) {
        this.setRel(rel);
        return this;
    }

}
