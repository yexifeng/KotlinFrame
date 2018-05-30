package axalent.com.kotlinframe.utils;

import java.lang.reflect.Method;
import  axalent.com.kotlinframe.utils.Compont.CompontAnnotation;

/**
 * Created by axalent on 2018/4/27.
 * 处理compont注解
 */

public class DealWithCompont {

    public static void dealCompont(){

           /* Method[] DecloareMethod = cl.getDeclaredMethods();
            for(Method method:DecloareMethod){
                CompontAnnotation annotation = (CompontAnnotation) method.getAnnotation(Compont.class);
                if(annotation!=null){
                   return annotation.value();
                }
            }*/
        Class cl = null;
        try {
            cl = Class.forName("axalent.com.kotlinframe.utils.Compont");
            if(cl.isAnnotationPresent(Compont.class)){
                CompontAnnotation annotation = (CompontAnnotation) cl.getAnnotation(Compont.class);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
