package cn.funwx.mall.enums;

/**
 * @author chj
 * @description 账户状态
 * @date 2018/8/26 18:26
 */
public enum AccountStatusEnum {

    NORMAL(0, "正常"),
    FORBID(1, "停用"),
    DELETE(2, "删除");

    private AccountStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
