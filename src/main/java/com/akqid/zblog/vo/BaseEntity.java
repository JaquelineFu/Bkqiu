package com.akqid.zblog.vo;

import com.akqid.zblog.util.JsonUtil;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3699663004699390889L;
    public String toJson() {
        return JsonUtil.toJson(this);
    }

    public String toString() {
        return this.toJson();
    }

    public BaseEntity() {
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseEntity)) {
            return false;
        } else {
            BaseEntity other = (BaseEntity)o;
            return other.canEqual(this);
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseEntity;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }
}
