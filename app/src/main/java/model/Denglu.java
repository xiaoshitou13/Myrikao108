package model;

import test.bwie.com.myrikao108.Bean;

/**
 * Created by 白玉春 on 2017/10/8.
 */

public class Denglu implements Login {
    @Override
    public void logins(final String name, final String mima, final Onclick onclick) {
        new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if("hh".equals(name)&&"123".equals(mima)){
                    Bean bean = new Bean();
                    bean.setName(name);
                    bean.setMima(mima);
                    onclick.Success(bean);
                }else{
                    onclick.Shibai();
                }
            }
        }.start();
    }
}
