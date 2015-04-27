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
            申请认证
            <small>更高等级的认证会让更多的客户信任，但也意味着更大的责任：）</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">申请认证</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
          <!-- Small boxes (Stat box) -->
          <div class="row">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">选择认证</h3>
                </div><!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                  <table class="table table-bordered">
                    <tbody>
	                    <tr>
	                      <td><button class="btn btn-block btn-info btn-lg text-center " data-toggle="modal" data-target="#bs-authenticate1">初级认证</button></td>
	                      <td>上传清晰证件照片并填写证件号码，待审核通过后，您将取得初级认证</td>
	                    </tr>
	                    <tr>
	                      <td><button class="btn btn-block btn-primary btn-lg text-center">中级认证</button></td>
	                      <td>暂未开放</td>
	                    </tr>
	                    <tr>
	                      <td><button class="btn btn-block btn-success btn-lg text-center">高级认证</button></td>
	                      <td>暂未开放</td>
	                    </tr>                    
                  	</tbody>
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div>
          </div>
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
        <jsp:include flush="true" page="/WEB-INF/views/include/manager/footer.jsp"/>

    </div><!-- ./wrapper -->

     <!-- /初级认证申请框 -->
    <div class="modal fade" id="bs-authenticate1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog ">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            <h4 class="modal-title" id="mySmallModalLabel">申请初级认证</h4>
          </div>
          <div class="modal-body">
          	<form class="form-horizontal" role="form">
              <div class="form-group">
                <label for="inputCertificate" class="col-sm-3 control-label">证件类型</label>
                <div class="radio col-sm-5">                        
                  <label>
                    <input type="radio" name="optionsRadios" id="inputCertificate" value="option1" checked="">
                    中国大陆居民身份证
                  </label>
                 </div>
                 <div class="radio col-sm-3">
                  <label>
                    <input type="radio" name="optionsRadios" id="inputCertificate" value="option2">
                    护照
                  </label>
                </div>
              </div>
              <div class="form-group">
                <label for="inputCertificateNo" class="col-sm-3 control-label">证件号码</label>
                <div class="col-sm-8">
                  <input type="text" class="form-control" id="inputCertificateNo">
                </div>
              </div>
              <div class="form-group">
                <label for="inputCertificateImage1" class="col-sm-3 control-label">证件照正面</label>
                <div class="col-sm-8">
                  <img src="${resourceUrl}/manager/img/user1-128x128.jpg">
                </div>
              </div>
              <div class="form-group">
                <label for="inputCertificateImage2" class="col-sm-3 control-label">证件照背面</label>
                <div class="col-sm-8">
                  <img src="${resourceUrl}/manager/img/user1-128x128.jpg">
                </div>
              </div>
              <div class="modal-footer">
				        <button type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
				        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				      </div>
            </form>
					</div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div>

  </body>
</html>