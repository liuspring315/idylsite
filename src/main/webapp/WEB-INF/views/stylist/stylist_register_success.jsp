<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <%@ include file="/WEB-INF/views/include/meta.jsp" %>
</head>

<body>
<%@ include file="/WEB-INF/views/include/menu.jsp" %>
<!-- 路径导航 -->
<div class="container">
    <ol class="breadcrumb">
        <li><a href="${ctx}/main">首页</a></li>
        <li><a href="${ctx}/server/register">加盟入驻</a></li>
        <li class="active">造型师注册</li>
    </ol>
</div>
<div class="container marketing">
    <div class="row">
        <div class="col-lg-12 text-center">
            <h2>感谢您注册成功：）</h2>
            <p>记录生活中精彩的瞬间</p>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-lg-12 text-center">
            注册成功！
        </div>
    </div>
    <div class="row lvpaizhe-margin-bottom">
        <div class="col-sm-12 text-center">
            您想作为<b>摄影师</b>或服务提供者加入我们？请移步<a href="${ctx}/server/register">加盟入驻</a>
        </div>
    </div>
    <!-- Three columns of text below the carousel -->
</div>
</div>

<%@ include file="/WEB-INF/views/include/login_modal.jsp" %>
<jsp:include flush="true" page="/WEB-INF/views/include/footer.jsp"/>
</body>
</html>