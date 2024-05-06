package top.gongshuai.homeassistant.Utils;

import java.util.ArrayList;
import java.util.List;

public class BeanUtils {

    /**
     * Bean复制，换用Spring的copyProperties方法,防止目标bean使用@Accessors(chain=true)后,CGLib的对象拷贝有问题
     *
     * @param srcBean    源bean对象
     * @param targetBean 目标bean对象
     */
    public static void copyBean(Object srcBean, Object targetBean) {
        if (srcBean == null || targetBean == null) {
            return;
        }
        org.springframework.beans.BeanUtils.copyProperties(srcBean, targetBean);
    }

    /**
     * Bean复制,浅复制
     *
     * @param srcBean     源Bean对象
     * @param targetClass 目标对象Class
     * @param <T>         目标类型
     * @return 目标Bean
     */
    public static <T> T copyBean(Object srcBean, Class<T> targetClass) {
        if (srcBean == null) {
            return null;
        }
        try {
            T targetBean = targetClass.newInstance();
            copyBean(srcBean, targetBean);
            return targetBean;
        } catch (Exception e) {
            throw new RuntimeException("对象拷贝异常", e);
        }
    }

    /**
     * List复制，属浅复制
     *
     * @param srcList     源List对象
     * @param targetClass 目标列表Bean类
     * @param <T>         列表Bean Type
     * @return 目标列表
     */
    public static <T> List<T> copyBeanList(List srcList, Class<T> targetClass) {
        List<T> targetBeanList = new ArrayList<>();
        if (srcList == null || srcList.isEmpty()) {
            return targetBeanList;
        }
        try {
            for (Object srcObj : srcList) {
                T targetBean = targetClass.newInstance();
                copyBean(srcObj, targetBean);
                targetBeanList.add(targetBean);
            }
        } catch (Exception e) {
            throw new RuntimeException("对象拷贝异常", e);
        }
        return targetBeanList;
    }

    /**
     * Bean复制，深度复制
     *
     * @param srcBean     源Bean对象
     * @param targetClass 目标对象Class
     * @param <T>         目标类型
     * @return 目标Bean
     */

}