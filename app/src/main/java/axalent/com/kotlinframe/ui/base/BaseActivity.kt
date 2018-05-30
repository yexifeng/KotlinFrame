package axalent.com.kotlinframe.ui.base

import android.annotation.SuppressLint
import com.trello.rxlifecycle.components.support.RxAppCompatActivity
import java.lang.ref.WeakReference


@SuppressLint("Registered")
/**
 * Created by axalent on 2018/4/26.
 * BaseActivity
 */

//mViewRef:presenter
abstract class BaseActivity<T>: RxAppCompatActivity(){

    var mViewRef: WeakReference<T>? = null

    var mView:IBaseView? = null

    override fun onDestroy() {
        detachView()
        super.onDestroy()
    }

    fun attachView(viewAttach:T){
        mViewRef = WeakReference<T>(viewAttach)
    }

    fun detachView(){
        mViewRef?.clear()
        mViewRef = null
    }

}