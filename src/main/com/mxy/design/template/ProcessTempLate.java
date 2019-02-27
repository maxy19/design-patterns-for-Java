package com.mxy.design.template;

/**
 * 抽象模板
 */
public abstract class ProcessTempLate {

    /**
     * 校验参数
     */
    protected void checkParam(String... arg) {
          if( null == arg){
              System.out.println("参数为null");
              return;
          }
    }

    /**
     * 主逻辑业务
     */
    protected abstract void mainLogic();

    /**
     * 执行模板
     */
    protected void invoke(String... param) {
        try {
            checkParam(param);
            mainLogic();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
