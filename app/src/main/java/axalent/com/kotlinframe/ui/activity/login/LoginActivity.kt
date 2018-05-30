package axalent.com.kotlinframe.ui.activity.login

import android.os.Bundle
import axalent.com.kotlinframe.ui.base.BaseActivity
import axalent.com.kotlinframe.utils.Compont.CompontAnnotation


/**
 * Created by axalent on 2018/4/26.
 * 登陆界面
 */

@CompontAnnotation(value = "upper")
class LoginActivity: BaseActivity<LoginPresenterImpl>(),LoginView.View{


    override fun showLoading() {
    }

    override fun dismissLoading() {
    }

    override fun showDialog() {
    }

    override fun dismissDialog() {
    }

    override fun inputAction() {
    }

    override fun toastInfor() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        attachView(LoginPresenterImpl())
        super.onCreate(savedInstanceState)
    }





}