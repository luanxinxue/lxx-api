package com.lxx.controller.test;

public class TestA extends InsureFlowPath{

    @Override
    public  String insure() {
        return "a";
    }

    @Override
    public String pay() {
        return "b";
    }

    @Override
    public Integer sum(Integer x) {
        return 11;
    }
}
