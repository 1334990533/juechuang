package cn.funwx.mall.pojo;

import java.util.Date;

/**
 * @author chj
 * @description 商城用户信息
 * @date 2018/8/23 10:35
 */
public class User {
    /**
     * 主键ID
     **/
    private Long id;
    /**
     * 唯一ID
     **/
    private String uuid;
    /**
     * 微信ID
     **/
    private String unionId;
    /**
     * QQID
     **/
    private String openId;
    /**
     * 登录名 手机 qq号 微信号
     **/
    private String loginName;
    /**
     * 密码
     **/
    private String password;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String avatarUrl;
    /**
     * 真实姓名
     **/
    private String realName;
    /**
     * 手机 备用
     **/
    private String phoneNum;
    /**
     * 性别
     **/
    private Integer gender;
    /**
     * 毕业学校
     **/
    private String graduateCollege;
    /**
     * 主修课程
     **/
    private String major;
    /**
     * 省
     **/
    private String province;
    /**
     * 市
     **/
    private String city;
    /**
     * 区
     **/
    private String district;
    /**
     * 邮箱地址
     **/
    private String emailAddress;
    /**
     * 权限名称
     **/
    private String roleName;
    /**
     * 上次登录IP
     **/
    private String lastLoginIpAddr;
    /**
     * 创建时间
     **/
    private Date createTime;
    /**
     * 操作时间
     **/
    private Date operateTime;
    /**
     * 账户状态 accountStatusEnum 默认为0-正常
     **/
    private Integer accountStatus;
    /**
     * 权限编码
     */
    private Integer authorityCode;
    /**
     * 注册类型 accountRegTypeEnum
     */
    private Integer accountRegType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getGraduteCollege() {
        return graduateCollege;
    }

    public void setGraduteCollege(String graduteCollege) {
        this.graduateCollege = graduteCollege;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getLastLoginIpAddr() {
        return lastLoginIpAddr;
    }

    public void setLastLoginIpAddr(String lastLoginIpAddr) {
        this.lastLoginIpAddr = lastLoginIpAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(Integer authorityCode) {
        this.authorityCode = authorityCode;
    }

    public Integer getAccountRegType() {
        return accountRegType;
    }

    public void setAccountRegType(Integer accountRegType) {
        this.accountRegType = accountRegType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
