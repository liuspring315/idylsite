<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/views/include/manager/meta.jsp" %>
</head>
  <body class="skin-blue">
    <div class="wrapper">
      
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
              <!-- Messages: style can be found in dropdown.less-->
              <li class="dropdown messages-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-envelope-o"></i>
                  <span class="label label-success">4</span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">You have 4 messages</li>
                  <li>
                    <!-- inner menu: contains the actual data -->
                    <ul class="menu">
                      <li><!-- start message -->
                        <a href="#">
                          <div class="pull-left">
                            <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image"/>
                          </div>
                          <h4>
                            Support Team
                            <small><i class="fa fa-clock-o"></i> 5 mins</small>
                          </h4>
                          <p>Why not buy a new awesome theme?</p>
                        </a>
                      </li><!-- end message -->
                      <li>
                        <a href="#">
                          <div class="pull-left">
                            <img src="dist/img/user3-128x128.jpg" class="img-circle" alt="user image"/>
                          </div>
                          <h4>
                            AdminLTE Design Team
                            <small><i class="fa fa-clock-o"></i> 2 hours</small>
                          </h4>
                          <p>Why not buy a new awesome theme?</p>
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <div class="pull-left">
                            <img src="dist/img/user4-128x128.jpg" class="img-circle" alt="user image"/>
                          </div>
                          <h4>
                            Developers
                            <small><i class="fa fa-clock-o"></i> Today</small>
                          </h4>
                          <p>Why not buy a new awesome theme?</p>
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <div class="pull-left">
                            <img src="dist/img/user3-128x128.jpg" class="img-circle" alt="user image"/>
                          </div>
                          <h4>
                            Sales Department
                            <small><i class="fa fa-clock-o"></i> Yesterday</small>
                          </h4>
                          <p>Why not buy a new awesome theme?</p>
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <div class="pull-left">
                            <img src="dist/img/user4-128x128.jpg" class="img-circle" alt="user image"/>
                          </div>
                          <h4>
                            Reviewers
                            <small><i class="fa fa-clock-o"></i> 2 days</small>
                          </h4>
                          <p>Why not buy a new awesome theme?</p>
                        </a>
                      </li>
                    </ul>
                  </li>
                  <li class="footer"><a href="#">See All Messages</a></li>
                </ul>
              </li>
              <!-- Notifications: style can be found in dropdown.less -->
              <li class="dropdown notifications-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-bell-o"></i>
                  <span class="label label-warning">10</span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">You have 10 notifications</li>
                  <li>
                    <!-- inner menu: contains the actual data -->
                    <ul class="menu">
                      <li>
                        <a href="#">
                          <i class="fa fa-users text-aqua"></i> 5 new members joined today
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the page and may cause design problems
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <i class="fa fa-users text-red"></i> 5 new members joined
                        </a>
                      </li>

                      <li>
                        <a href="#">
                          <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <i class="fa fa-user text-red"></i> You changed your username
                        </a>
                      </li>
                    </ul>
                  </li>
                  <li class="footer"><a href="#">View all</a></li>
                </ul>
              </li>
              <!-- Tasks: style can be found in dropdown.less -->
              <li class="dropdown tasks-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-flag-o"></i>
                  <span class="label label-danger">9</span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">You have 9 tasks</li>
                  <li>
                    <!-- inner menu: contains the actual data -->
                    <ul class="menu">
                      <li><!-- Task item -->
                        <a href="#">
                          <h3>
                            Design some buttons
                            <small class="pull-right">20%</small>
                          </h3>
                          <div class="progress xs">
                            <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                              <span class="sr-only">20% Complete</span>
                            </div>
                          </div>
                        </a>
                      </li><!-- end task item -->
                      <li><!-- Task item -->
                        <a href="#">
                          <h3>
                            Create a nice theme
                            <small class="pull-right">40%</small>
                          </h3>
                          <div class="progress xs">
                            <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                              <span class="sr-only">40% Complete</span>
                            </div>
                          </div>
                        </a>
                      </li><!-- end task item -->
                      <li><!-- Task item -->
                        <a href="#">
                          <h3>
                            Some task I need to do
                            <small class="pull-right">60%</small>
                          </h3>
                          <div class="progress xs">
                            <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                              <span class="sr-only">60% Complete</span>
                            </div>
                          </div>
                        </a>
                      </li><!-- end task item -->
                      <li><!-- Task item -->
                        <a href="#">
                          <h3>
                            Make beautiful transitions
                            <small class="pull-right">80%</small>
                          </h3>
                          <div class="progress xs">
                            <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                              <span class="sr-only">80% Complete</span>
                            </div>
                          </div>
                        </a>
                      </li><!-- end task item -->
                    </ul>
                  </li>
                  <li class="footer">
                    <a href="#">View all tasks</a>
                  </li>
                </ul>
              </li>
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image"/>
                  <span class="hidden-xs">王君毅</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                    <p>
                      Alexander Pierce - Web Developer
                      <small>Member since Nov. 2012</small>
                    </p>
                  </li>
                  <!-- Menu Body -->
                  <li class="user-body">
                    <div class="col-xs-4 text-center">
                      <a href="#">Followers</a>
                    </div>
                    <div class="col-xs-4 text-center">
                      <a href="#">Sales</a>
                    </div>
                    <div class="col-xs-4 text-center">
                      <a href="#">Friends</a>
                    </div>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href="#" class="btn btn-default btn-flat">Sign out</a>
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
              <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
              <p>王君毅</p>

              <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
          </div>
          <!-- search form -->
          <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
              <input type="text" name="q" class="form-control" placeholder="Search..."/>
              <span class="input-group-btn">
                <button type='submit' name='search' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
              </span>
            </div>
          </form>
          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
            <li class="active treeview">
              <a href="photographer_main.html">
                <i class="fa fa-dashboard"></i> <span>仪表盘</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
            </li>
            <li>
              <a href="photographer_order.html">
                <i class="fa fa-files-o"></i> 
                <span>待确认订单</span>
                <span class="label label-primary pull-right">4</span>
              </a>
            </li>
            <li>
              <a href="photographer_info.html">
                <i class="fa fa-edit"></i> 
                <span>我的个人信息</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
            </li>
            <li>
              <a href="photographer_goods.html">
                <i class="fa fa-camera"></i>
                <span>拍摄服务</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
            </li>             
            <li>
              <a href="photographer_authenticate.html">
                <i class="fa fa-check"></i>
                <span>申请认证</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>          
            </li>
            <li>
              <a href="photographer_works.html">
                <i class="fa fa-picture-o"></i>
                <span>作品管理</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
            </li>
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- Right side column. Contains the navbar and content of the page -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            仪表盘
            <small>综合信息控制台</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
          <!-- Small boxes (Stat box) -->
          <div class="row">
            <div class="col-xs-2">
              <div class="form-group">
                <label>认证等级</label>
                <span class="label label-danger">未认证</span>
              </div>     
            </div>
            <div class="col-xs-2">
              <div class="form-group">
                <label>用户名</label>
                <span>王君毅</span>
              </div>     
            </div>
            <div class="col-xs-2">
              <div class="form-group">
                <label>邮箱</label>
                <span>lvpaizhe@126.com</span>
              </div>  
            </div>
            <div class="col-xs-2">
              <div class="form-group">
                <label>手机号码</label>
                <span>15801234051</span>
              </div>
            </div>
            <div class="col-xs-2">
              <div class="form-group">
                <label>所在地</label>
                <span>北京</span>
              </div>      
            </div>
          </div>
          <div class="row">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">订单状态一览</h3>
                  <div class="box-tools">
                    <div class="input-group">
                      <input type="text" name="table_search" class="form-control input-sm pull-right" style="width: 150px;" placeholder="搜索">
                      <div class="input-group-btn">
                        <button class="btn btn-sm btn-default"><i class="fa fa-search"></i></button>
                      </div>
                    </div>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                  <table class="table table-hover">
                    <tbody>
                    <tr>
                      <th>#</th>
                      <th>用户名</th>
                      <th>真实姓名</th>
                      <th>服务名称</th>
                      <th>拍摄日期</th>
                      <th>提供项目</th>
                      <th>拍摄类型</th>
                      <th>拍摄地</th>
                      <th>片数</th>
                      <th>价格</th>
                      <th>预付款</th>
                      <th>状态</th>
                    </tr>
                    <tr>
                      <td>1</td>
                      <td>John Doe</td>
                      <td>李森</td>
                      <td><a>婚纱摄影泰国普吉岛婚纱照拍摄</a></td>
                      <td>2015-03-15</td>
                      <td>
                        <span class="fa fa-fw fa-truck"></span>
                        <span class="fa fa-fw fa-female"></span>
                        <span class="fa fa-fw fa-video-camera"> </span>
                        <span class="glyphicon glyphicon-scissors"> </span>
                        <span class="glyphicon glyphicon-bed"> </span>
                      </td>
                      <td>婚纱摄影</td>
                      <td>泰国-普吉岛</td>
                      <td>200</td>
                      <td>￥5888</td>
                      <td>￥1000</td>
                      <td><span class="label label-success">全款已付</span></td>
                    </tr>
                    <tr>
                      <td>2</td>
                      <td>John Doe</td>
                      <td>李森</td>
                      <td><a>婚纱摄影泰国普吉岛婚纱照拍摄</a></td>
                      <td>2015-03-15</td>
                      <td>
                        <span class="fa fa-fw fa-truck"></span>
                        <span class="fa fa-fw fa-female"></span>
                        <span class="fa fa-fw fa-video-camera"> </span>
                        <span class="glyphicon glyphicon-scissors"> </span>
                        <span class="glyphicon glyphicon-bed"> </span>
                      </td>
                      <td>婚纱摄影</td>
                      <td>泰国-普吉岛</td>
                      <td>200</td>
                      <td>￥5888</td>
                      <td>￥1000</td>
                      <td><span class="label label-warning">完成预付款</span></td>
                    </tr>
                    <tr>
                      <td>3</td>
                      <td>John Doe</td>
                      <td>李森</td>
                      <td><a>婚纱摄影泰国普吉岛婚纱照拍摄</a></td>
                      <td>2015-03-15</td>
                      <td>
                        <span class="fa fa-fw fa-truck"></span>
                        <span class="fa fa-fw fa-female"></span>
                        <span class="fa fa-fw fa-video-camera"> </span>
                        <span class="glyphicon glyphicon-scissors"> </span>
                        <span class="glyphicon glyphicon-bed"> </span>
                      </td>
                      <td>婚纱摄影</td>
                      <td>泰国-普吉岛</td>
                      <td>200</td>
                      <td>￥5888</td>
                      <td>￥1000</td>
                      <td><span class="label label-primary">已确认</span></td>
                    </tr>
                    <tr>
                      <td>4</td>
                      <td>John Doe</td>
                      <td>李森</td>
                      <td><a>婚纱摄影泰国普吉岛婚纱照拍摄</a></td>
                      <td>2015-03-15</td>
                      <td>
                        <span class="fa fa-fw fa-truck"></span>
                        <span class="fa fa-fw fa-female"></span>
                        <span class="fa fa-fw fa-video-camera"> </span>
                        <span class="glyphicon glyphicon-scissors"> </span>
                        <span class="glyphicon glyphicon-bed"> </span>
                      </td>
                      <td>婚纱摄影</td>
                      <td>泰国-普吉岛</td>
                      <td>200</td>
                      <td>￥5888</td>
                      <td>￥1000</td>
                      <td><span class="label label-danger">待确认</span></td>
                    </tr>
                  </tbody></table>
                </div><!-- /.box-body -->
                <div class="box-footer clearfix">
                  <ul class="pagination pagination-sm no-margin pull-right">
                    <li><a href="#">«</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">»</a></li>
                  </ul>
                </div>
              </div><!-- /.box -->
            </div>
          </div>
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
        <jsp:include flush="true" page="/WEB-INF/views/include/manager/footer.jsp"/>

    </div><!-- ./wrapper -->
  </body>
</html>