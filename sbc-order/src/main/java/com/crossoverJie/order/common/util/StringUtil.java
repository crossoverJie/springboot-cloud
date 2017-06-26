package com.crossoverJie.sbcuser.common.util;
/**
 * Function:字符串工具类
 * @author chenjiec
 * Date: 2017/6/7 下午11:45
 * @since JDK 1.8
 */
public class StringUtil {

    /**
     * 字符串是否为空，包括blank
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str){
        return null != str && 0 != str.trim().length() ? false : true;
    }

    /**
     * 判断是否是空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str==null||"".equals(str.trim())){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 判断是否不是空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        if((str!=null)&&!"".equals(str.trim())){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 格式化模糊查询
     * @param str
     * @return
     */
    public static String formatLike(String str){
        if(isNotEmpty(str)){
            return "%"+str+"%";
        }else{
            return null;
        }
    }
}
