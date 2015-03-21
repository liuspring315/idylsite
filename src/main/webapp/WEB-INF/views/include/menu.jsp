<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- NAVBAR================================================== -->
<nav class="navbar navbar-lvpaizhe navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <span  class="visible-lg-block visible-xs-block"><a class="navbar-brand" href="#">旅拍者</a></span>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.html">首页</a></li>
                <li><a href="#about">摄影师</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">拍摄地<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">国内拍摄地</a></li>
                        <li><a href="#">国外拍摄地</a></li>
                    </ul>
                </li>
                <li><a href="#contact">造型师</a></li>
                <li><a href="#contact">摄影机构</a></li>
                <li class="visible-lg-block"><a href="#contact">火热团购</a></li>
                <li class="visible-lg-block"><a href="#contact">免费活动</a></li>
                <li><a href="#contact">客片欣赏</a></li>
                <li class="visible-lg-block"><a href="#contact">关于旅拍者</a></li>
                <li><a href="${ctx}/server/register">加盟入驻</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${ctx}/login">登录</a></li>
                <li><a href="${ctx}/user/register">注册</a></li>
                <ul>
        </div>
    </div>
</nav>