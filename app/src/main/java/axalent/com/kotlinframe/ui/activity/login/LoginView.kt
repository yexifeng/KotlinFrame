package axalent.com.kotlinframe.ui.activity.login

import axalent.com.kotlinframe.ui.base.IBaseView


/**
 * Created by axalent on 2018/4/26.
 * 登陆view
 */
interface LoginView{

    interface View : IBaseView {

        fun showDialog()//显示dialog

        fun dismissDialog()//消失dialog

        fun inputAction()//进入下一个界面

        fun toastInfor()//显示登陆消息(包括错误信息)

    }

    interface Presenter{

        fun getCategoryData()
    }

}