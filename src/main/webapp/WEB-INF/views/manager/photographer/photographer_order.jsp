<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/views/include/manager/meta.jsp" %>
</head>
  <body class="skin-blue">
    <div class="wrapper">

      <%@ include file="/WEB-INF/views/include/manager/menu.jsp" %>
      <!-- Right side column. Contains the navbar and content of the page -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            待确认订单
            <small>请及时确认用户订单哦</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">待确认订单</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
          <!-- Small boxes (Stat box) -->
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
                      <th>操作</th>
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
                      <td><button class="btn btn-primary btn-xs"><span class="fa fa-edit"></span><strong>&nbsp;&nbsp;确认<strong></button></td>
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
                      <td><button class="btn btn-primary btn-xs"><span class="fa fa-edit"></span><strong>&nbsp;&nbsp;确认<strong></button></td>
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
                      <td><button class="btn btn-primary btn-xs"><span class="fa fa-edit"></span><strong>&nbsp;&nbsp;确认<strong></button></td>
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
                      <td><button class="btn btn-primary btn-xs"><span class="fa fa-edit"></span><strong>&nbsp;&nbsp;确认<strong></button></td>
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