package com.ohgiraffers.section03.references;

public class Member {
    private String memverId;
    public Member (String memverId){
        this.memverId = memverId;
    }

    public String getMemverId() {
        return memverId;
    }

    public void setMemverId(String memverId) {
        this.memverId = memverId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memverId='" + memverId + '\'' +
                '}';
    }
}
