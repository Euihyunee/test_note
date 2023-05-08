package com.example.tdd;

public class Study2 {

    private StudyStatus status = StudyStatus.DRAFT;

    private int limit;


    public Study2(int limit){
        if(limit < 0){
            throw new IllegalArgumentException("limit은 0보다 커야 한다. ");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit(){
        return limit;
    }

}
