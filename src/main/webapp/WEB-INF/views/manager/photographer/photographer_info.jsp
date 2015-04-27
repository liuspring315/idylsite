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
            我的个人信息
            <small>请保持个人信息及时更新</small>
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
              <div class="box box-primary lvpaizhe-a-info-padding">
                <div class="row">
                  <div class="col-xs-6">
                    <!-- form start -->
                    <form class="form-horizontal"  role="form">
                      <div class="form-group">
                        <label for="inputRealname" class="col-sm-2 control-label">真实姓名</label>
                        <div class="col-sm-4">
                          <input type="text" class="form-control" id="inputRealname" >
                        </div>
                        <div class="col-sm-6">
                          <span id="helpBlock" class="help-block">请填写真实姓名，与有效证件保持一致</span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputSex" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-1 radio">                        
                          <label>
                            <input type="radio" name="optionsRadios" id="inputSex" value="option1" checked="">
                            男
                          </label>
                        </div>
                        <div class="col-sm-1 radio">
                          <label>
                            <input type="radio" name="optionsRadios" id="inputSex" value="option2">
                            女
                          </label>
                        </div>
                        <div class="col-sm-4 col-md-offset-2">
                          <span id="helpBlock" class="help-block">请填写性别</span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputEmail" class="col-sm-2 control-label">电子邮箱</label>
                        <div class="col-sm-4">
                          <input type="email" class="form-control" id="inputEmail">
                        </div>
                        <div class="col-sm-6">
                          <span id="helpBlock" class="help-block">请填写您的常用邮箱</span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputMobile" class="col-sm-2 control-label">手机</label>
                        <div class="col-sm-4">
                          <input type="tel" class="form-control" id="inputMobile"  placeholder="000 0000 0000">
                        </div>
                        <div class="col-sm-6">
                          <span id="helpBlock" class="help-block">为保证您及时接收到重要信息，请正确填写手机号码</span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputDate" class="col-sm-2 control-label">出生日期</label>
                        <div class="col-sm-4">
                          <input type="tel" class="form-control" id="inputDate"  placeholder="yyyy/mm/dd">
                        </div>
                        <div class="col-sm-6">
                          <span id="helpBlock" class="help-block">非必填</span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputLocation" class="col-sm-2 control-label">所在地</label>
                        <div class="col-sm-4">
                          <input type="tel" class="form-control" id="inputLocation">
                        </div>
                        <div class="col-sm-6">
                          <span id="helpBlock" class="help-block">所在地信息与摄影地关联  <span class="label label-danger">重要</span></span>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputMobile" class="col-sm-2 control-label">个人简介</label>
                        <div class="col-sm-8">
                          <textarea class="form-control" rows="4" placeholder="字数限制：***"></textarea>
                        </div>
                        <div class="col-sm-6 col-md-offset-2">
                          <span id="helpBlock" class="help-block">请填写自我简述，将被客户查看</span>
                        </div>
                      </div>
                    </form>
                    <form class="form-inline" role="form">
                      <div class="box-footer">
                        <button type="submit" class="btn btn-primary">保存</button>
                      </div>
                    </form>
                  </div>
                  <div class="col-xs-4">
                    <form class="form-inline" role="form">
                      <div>
                        <img src="${resourceUrl}/manager/img/user1-128x128.jpg">
                      </div>
                      <div class="box-body">                        
                        <div class="form-group">                      
                          <input type="file" id="exampleInputFile">
                          <p class="help-block">选择头像上传</p>
                        </div>                      
                      </div><!-- /.box-body -->


                    </form>
                  </div>
                </div>
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