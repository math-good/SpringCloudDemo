package org.example.service.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private long user_id;
    private int type;
    private int status;
    private Date create_time;
    private int create_user_id;
    private Date last_modify_time;
    private int last_modify_user_id;
    private int is_deleted;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(int create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Date getLast_modify_time() {
        return last_modify_time;
    }

    public void setLast_modify_time(Date last_modify_time) {
        this.last_modify_time = last_modify_time;
    }

    public int getLast_modify_user_id() {
        return last_modify_user_id;
    }

    public void setLast_modify_user_id(int last_modify_user_id) {
        this.last_modify_user_id = last_modify_user_id;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }
}
