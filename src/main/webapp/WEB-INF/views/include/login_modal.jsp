<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglibs.jsp" %>

<!-- /登录弹出框 -->
<div class="modal fade" id="bs-login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog ">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                <h4 class="modal-title" id="mySmallModalLabel">登录</h4>
            </div>
            <div class="modal-body">
                <div class="login-box-body">
                    <p class="login-box-msg">欢迎您回到旅拍者</p>
                    <form action="${ctx}/login" method="post">
                        <div class="form-group has-feedback">
                            <input type="text" name="userName" id="userName" class="form-control" placeholder="手机&nbsp;&frasl;用户名&nbsp;&frasl;邮箱">
                            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                        </div>
                        <div class="form-group has-feedback">
                            <input type="password" name="password" id="password" class="form-control" placeholder="密码">
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                        </div>
                        <div class="row">
                            <div class="col-xs-8">
                                <div class="checkbox icheck">
                                    <label class="">
                                        <input type="checkbox" id="rememberMe"> 记住我
                                    </label>
                                </div>
                            </div><!-- /.col -->
                            <div class="col-xs-4">
                                <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                            </div><!-- /.col -->
                        </div>
                    </form>
                    <div class="modal-footer">
                        <div class="col-xs-6 text-left">
                            <a href="#">忘记密码？</a>
                        </div>
                        <div class="col-xs-6 text-right">
                            <a href="${ctx}/user/register" class="text-center">注册新用户</a>
                        </div>
                    </div><!-- /.social-auth-links -->
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
