<%@ page import="com.idyl.site.service.account.ShiroDbRealmService" %>
<%@ page import="com.idyl.site.data.UserGeneralInfo" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglibs.jsp" %>
<%UserGeneralInfo user = ShiroDbRealmService.getSessionUser();request.setAttribute("user",user);%>
<header class="main-header">
    <!-- Logo -->
    <a href="index2.html" class="logo"><b>旅拍者后台管理系统</b></a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <%--<!-- Messages: style can be found in dropdown.less-->--%>
                <%--<li class="dropdown messages-menu">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                        <%--<i class="fa fa-envelope-o"></i>--%>
                        <%--<span class="label label-success">4</span>--%>
                    <%--</a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li class="header">You have 4 messages</li>--%>
                        <%--<li>--%>
                            <%--<!-- inner menu: contains the actual data -->--%>
                            <%--<ul class="menu">--%>
                                <%--<li><!-- start message -->--%>
                                    <%--<a href="#">--%>
                                        <%--<div class="pull-left">--%>
                                            <%--<img src="${resourceUrl}/manager/img/user2-160x160.jpg" class="img-circle" alt="User Image"/>--%>
                                        <%--</div>--%>
                                        <%--<h4>--%>
                                            <%--Support Team--%>
                                            <%--<small><i class="fa fa-clock-o"></i> 5 mins</small>--%>
                                        <%--</h4>--%>
                                        <%--<p>Why not buy a new awesome theme?</p>--%>
                                    <%--</a>--%>
                                <%--</li><!-- end message -->--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<div class="pull-left">--%>
                                            <%--<img src="${resourceUrl}/manager/img/user3-128x128.jpg" class="img-circle" alt="user image"/>--%>
                                        <%--</div>--%>
                                        <%--<h4>--%>
                                            <%--AdminLTE Design Team--%>
                                            <%--<small><i class="fa fa-clock-o"></i> 2 hours</small>--%>
                                        <%--</h4>--%>
                                        <%--<p>Why not buy a new awesome theme?</p>--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<div class="pull-left">--%>
                                            <%--<img src="${resourceUrl}/manager/img/user4-128x128.jpg" class="img-circle" alt="user image"/>--%>
                                        <%--</div>--%>
                                        <%--<h4>--%>
                                            <%--Developers--%>
                                            <%--<small><i class="fa fa-clock-o"></i> Today</small>--%>
                                        <%--</h4>--%>
                                        <%--<p>Why not buy a new awesome theme?</p>--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<div class="pull-left">--%>
                                            <%--<img src="${resourceUrl}/manager/img/user3-128x128.jpg" class="img-circle" alt="user image"/>--%>
                                        <%--</div>--%>
                                        <%--<h4>--%>
                                            <%--Sales Department--%>
                                            <%--<small><i class="fa fa-clock-o"></i> Yesterday</small>--%>
                                        <%--</h4>--%>
                                        <%--<p>Why not buy a new awesome theme?</p>--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<div class="pull-left">--%>
                                            <%--<img src="${resourceUrl}/manager/img/user4-128x128.jpg" class="img-circle" alt="user image"/>--%>
                                        <%--</div>--%>
                                        <%--<h4>--%>
                                            <%--Reviewers--%>
                                            <%--<small><i class="fa fa-clock-o"></i> 2 days</small>--%>
                                        <%--</h4>--%>
                                        <%--<p>Why not buy a new awesome theme?</p>--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                            <%--</ul>--%>
                        <%--</li>--%>
                        <%--<li class="footer"><a href="#">See All Messages</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<!-- Notifications: style can be found in dropdown.less -->--%>
                <%--<li class="dropdown notifications-menu">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                        <%--<i class="fa fa-bell-o"></i>--%>
                        <%--<span class="label label-warning">10</span>--%>
                    <%--</a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li class="header">You have 10 notifications</li>--%>
                        <%--<li>--%>
                            <%--<!-- inner menu: contains the actual data -->--%>
                            <%--<ul class="menu">--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the page and may cause design problems--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<i class="fa fa-users text-red"></i> 5 new members joined--%>
                                    <%--</a>--%>
                                <%--</li>--%>

                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<i class="fa fa-shopping-cart text-green"></i> 25 sales made--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">--%>
                                        <%--<i class="fa fa-user text-red"></i> You changed your username--%>
                                    <%--</a>--%>
                                <%--</li>--%>
                            <%--</ul>--%>
                        <%--</li>--%>
                        <%--<li class="footer"><a href="#">View all</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<!-- Tasks: style can be found in dropdown.less -->--%>
                <%--<li class="dropdown tasks-menu">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
                        <%--<i class="fa fa-flag-o"></i>--%>
                        <%--<span class="label label-danger">9</span>--%>
                    <%--</a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li class="header">You have 9 tasks</li>--%>
                        <%--<li>--%>
                            <%--<!-- inner menu: contains the actual data -->--%>
                            <%--<ul class="menu">--%>
                                <%--<li><!-- Task item -->--%>
                                    <%--<a href="#">--%>
                                        <%--<h3>--%>
                                            <%--Design some buttons--%>
                                            <%--<small class="pull-right">20%</small>--%>
                                        <%--</h3>--%>
                                        <%--<div class="progress xs">--%>
                                            <%--<div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">--%>
                                                <%--<span class="sr-only">20% Complete</span>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</a>--%>
                                <%--</li><!-- end task item -->--%>
                                <%--<li><!-- Task item -->--%>
                                    <%--<a href="#">--%>
                                        <%--<h3>--%>
                                            <%--Create a nice theme--%>
                                            <%--<small class="pull-right">40%</small>--%>
                                        <%--</h3>--%>
                                        <%--<div class="progress xs">--%>
                                            <%--<div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">--%>
                                                <%--<span class="sr-only">40% Complete</span>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</a>--%>
                                <%--</li><!-- end task item -->--%>
                                <%--<li><!-- Task item -->--%>
                                    <%--<a href="#">--%>
                                        <%--<h3>--%>
                                            <%--Some task I need to do--%>
                                            <%--<small class="pull-right">60%</small>--%>
                                        <%--</h3>--%>
                                        <%--<div class="progress xs">--%>
                                            <%--<div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">--%>
                                                <%--<span class="sr-only">60% Complete</span>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</a>--%>
                                <%--</li><!-- end task item -->--%>
                                <%--<li><!-- Task item -->--%>
                                    <%--<a href="#">--%>
                                        <%--<h3>--%>
                                            <%--Make beautiful transitions--%>
                                            <%--<small class="pull-right">80%</small>--%>
                                        <%--</h3>--%>
                                        <%--<div class="progress xs">--%>
                                            <%--<div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">--%>
                                                <%--<span class="sr-only">80% Complete</span>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</a>--%>
                                <%--</li><!-- end task item -->--%>
                            <%--</ul>--%>
                        <%--</li>--%>
                        <%--<li class="footer">--%>
                            <%--<a href="#">View all tasks</a>--%>
                        <%--</li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<!-- User Account: style can be found in dropdown.less -->--%>
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="${resourceUrl}/manager/img/user2-160x160.jpg" class="user-image" alt="User Image"/>
                        <span class="hidden-xs">${user.familyName} ${user.lastName}</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="${resourceUrl}/manager/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                            <p>
                                ${user.userName} - ${user.userTypeName}
                                <small>注册于 ${user.addTime}</small>
                            </p>
                        </li>
                        <!-- Menu Body -->
                        <%--<li class="user-body">--%>
                            <%--<div class="col-xs-4 text-center">--%>
                                <%--<a href="#">Followers</a>--%>
                            <%--</div>--%>
                            <%--<div class="col-xs-4 text-center">--%>
                                <%--<a href="#">Sales</a>--%>
                            <%--</div>--%>
                            <%--<div class="col-xs-4 text-center">--%>
                                <%--<a href="#">Friends</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="${ctx}/manager/photographer/info" class="btn btn-default btn-flat">个人信息</a>
                            </div>
                            <div class="pull-right">
                                <a href="${ctx}/logout" class="btn btn-default btn-flat">退出登录</a>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${resourceUrl}/manager/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
                <p>${user.familyName} ${user.lastName}</p>

                <%--<a href="#"><i class="fa fa-circle text-success"></i> Online</a>--%>
            </div>
        </div>
        <!-- search form -->
        <%--<form action="#" method="get" class="sidebar-form">--%>
            <%--<div class="input-group">--%>
                <%--<input type="text" name="q" class="form-control" placeholder="Search..."/>--%>
              <%--<span class="input-group-btn">--%>
                <%--<button type='submit' name='search' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>--%>
              <%--</span>--%>
            <%--</div>--%>
        <%--</form>--%>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">导航栏</li>
            <%--<li class="treeview">--%>
                <%--<a href="photographer_main.html">--%>
                    <%--<i class="fa fa-dashboard"></i> <span>仪表盘</span>--%>
                    <%--<i class="fa fa-angle-left pull-right"></i>--%>
                <%--</a>--%>
            <%--</li>--%>
            <li class="active">
                <a href="${ctx}/manager/photographer/order">
                    <i class="fa fa-files-o"></i>
                    <span>待确认订单</span>
                    <span class="label label-primary pull-right">4</span>
                </a>
            </li>
            <li>
                <a href="${ctx}/manager/photographer/info">
                    <i class="fa fa-edit"></i>
                    <span>我的个人信息</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
            </li>
            <li>
                <a href="${ctx}/manager/photographer/goods">
                    <i class="fa fa-camera"></i>
                    <span>拍摄服务</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
            </li>
            <li>
                <a href="${ctx}/manager/photographer/authenticate">
                    <i class="fa fa-check"></i>
                    <span>申请认证</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
            </li>
            <li>
                <a href="${ctx}/manager/photographer/works">
                    <i class="fa fa-picture-o"></i>
                    <span>作品管理</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>