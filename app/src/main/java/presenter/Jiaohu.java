package presenter;

import android.os.Handler;

import model.Denglu;
import model.Login;
import model.Onclick;
import test.bwie.com.myrikao108.Bean;

/**
 * Created by 白玉春 on 2017/10/8.
 */

public class Jiaohu {
    private Login denglu;
    private Fangfa fangfa;
    Handler handler = new Handler();

    public Jiaohu(Fangfa fangfa) {
        this.fangfa = fangfa;
        this.denglu = new Denglu();
    }

    public void loginss(){
                   denglu.logins(fangfa.getName(), fangfa.getMima(), new Onclick() {
                       @Override
                       public void Success(final Bean bean) {
                             handler.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     fangfa.Chenggong(bean);
                                     fangfa.show();
                                 }
                             });


                       }

                       @Override
                       public void Shibai() {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    fangfa.Full();
                                }
                            });
                       }
                   });

    }


}
