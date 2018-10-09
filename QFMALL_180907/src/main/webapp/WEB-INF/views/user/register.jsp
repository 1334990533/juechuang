<%--
  Created by IntelliJ IDEA.
  User: chj
  Date: 2018/8/24
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/head.jsp" %>
<html>
<head>
    <title>注册</title>
</head>
<body style="background-color: #f9f9f9;">
<div class="page_login_container">
    <div class="login_main_wrapper">
        <a href="index.html" class="logo_img"><img src="images/login/logo.png" alt=""></a>
        <div class="form_wrapper">
            <div class="form_item">
                <p class="item_title">手机号</p>
                <div class="item_value">
                    <input type="text" placeholder="请输入手机号" id="loginName">
                    <div class="item_warn">你输入的手机号有误</div>
                </div>
            </div>
            <div class="form_item">
                <p class="item_title" >密码</p>
                <div class="item_value">
                    <input type="password" placeholder="请输入密码" id="password">
                    <div class="item_warn">请输入密码</div>
                </div>
            </div>
            <div class="form_item verify_item">
                <p class="item_title">手机验证</p>
                <div class="item_value">
                    <input type="text" placeholder="请输入验证码" id="vCode" maxlength="4">
                    <div class="verify_wrapper disable">
                        <input id="sendVcodeBtn" type="button" onclick="sendVerifyCode()" value="发送验证码" />
                    </div>
                    <div class="item_warn">验证码输入错误</div>
                </div>
            </div>
            <button id="regBtn" type="button" class="submit_btn" onclick="doReg()">注册</button>
            <div class="has_account">已有账户？<a href="login.html">立即登录</a></div>
        </div>
    </div>
</div>
<script type="application/javascript">
    var pReg = /1[3578]\d{9}/;
    var second = 60;//倒计时
    /**
     * 发送验证码
     */
    function sendVerifyCode() {
        var loginName = $("#loginName").val();
        if (loginName == null || loginName == "") {
            alert("手机号不能为空！")
            return;
        }
        if (!(pReg.test(loginName))) {
            alert("请输入正确的手机号！")
            return;
        }
        $.ajax({
            url: "getVerifyCode.do",
            type: "POST",
            data: {
                "loginName": loginName,
            },
            async: false,
            dataType: "json",
            success: function (r) {
                console.log(r)
                if (r.resultCode == 200) {
                    var verifyCode = r.data
                    $("#vCode").val(verifyCode);
                } else {
                    alert(r.message);
                }
            }, error: function () {
                alert("获取验证码失败，网络异常");
            }, complete:function () {
                //设置无法点击
                $("#sendVcodeBtn").attr("disabled", "disabled");
                var timeout = setInterval(function () {
                    $("#sendVcodeBtn").val(second + " s");
                    if (second > 0) {
                        second --;
                    } else {
                        clearInterval(timeout);
                        $("#sendVcodeBtn").val("发送验证码");
                        $("#sendVcodeBtn").removeAttr("disabled");
                        second = 60;
                    }
                }, 1000)
            }
        });

    }

    /**
     * 注册
     */
    function doReg() {
        var loginName = $("#loginName").val();
        var password = $("#password").val();
        var verifyCode = $("#vCode").val();
        if (loginName == null || loginName == "") {
            alert("手机号不能为空！")
            return;
        }
        if (!(pReg.test(loginName))) {
            alert("请输入正确的手机号！")
            return;
        }
        if (password == null || password == "") {
            alert("请输入密码！");
            return;
        }
        if (password.length < 6) {
            alert("请输入正确长度密码！");
            return;
        }
        if (verifyCode == null || verifyCode == "") {
            alert("请输入验证码！");
            return;
        }
        if (verifyCode.length != 4) {
            alert("验证码长度错误！")
            return;
        }
        $.ajax({
            url: "${ctx}/doRegister.do",
            type: "POST",
            data: {
                "loginName": loginName,
                "password": password,
                "verifyCode": verifyCode,
                "regType": 0
            },
            async: false,
            dataType: "json",
            success: function (r) {
                if (r.resultCode == 200) {
                    alert("注册成功！正在跳转登陆页面...")
                    setTimeout(function () {
                        window.location.href = "";
                    }, 400)
                } else {
                    alert(r.msg);
                    $("#regBtn").removeAttr("disabled", "disabled");
                }
            }, error: function () {
                alert("注册失败，网络异常");
                $("#regBtn").removeAttr("disabled", "disabled");
            }, complete: function(){
                $("#regBtn").attr("disabled", "disabled");
            }
        });
    }
</script>
</body>
</html>
