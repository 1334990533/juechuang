package cn.funwx.mall.service;

import cn.funwx.mall.pojo.User;

/**
 * @author chj
 * @description
 * @date 2018/8/23 17:52
 */
public interface UserLoginService {

    /**
     * 根据手机号获取登录用户
     *
     * @param phoneNum
     * @return
     */
    User getUserByPhoneNum(String phoneNum);

    /**
     * 获取验证码
     *
     * @param key
     * @return
     */
    Integer getVerifyCode(String key);

    /**
     * 根据unionid获取用户
     * @param unionId
     * @return
     */
    User getUserByUnionId(String unionId);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int update(User user);
}
