<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <%@ include file="/WEB-INF/views/include/meta.jsp" %>
</head>

<body>
<%@ include file="/WEB-INF/views/include/menu.jsp" %>
<!-- 幻灯片 -->
<div class="container lvpaizhe-background-color homepage-carousel-margin-top">
    <div class="carousel slide" id="carousel-example-generic" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="${resourceUrl}/img/DSC02930.JPG" alt="...">
                <div class="carousel-caption">
                    <h2>亚洲-泰国</h2>
                    <p>在泰国清莱找到一家美丽而隐秘的住处，享受私家游泳池的任性</p>
                </div>
            </div>
            <div class="item">
                <img src="${resourceUrl}/img/DSC02951.JPG" alt="...">
                <div class="carousel-caption">
                    <h2>亚洲-泰国-曼谷</h2>
                    <p>走在曼谷街头，你会发现遍地都是寺庙……</p>
                </div>
            </div>
            <div class="item">
                <img src="${resourceUrl}/img/DSCF4654.JPG" alt="...">
                <div class="carousel-caption">
                    <h2>亚洲-泰国-清莱</h2>
                    <p>白庙是清莱最著名的景点，远观璀璨无比，晶莹剔透</p>
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

<!-- 搜索 -->
<div class="container lvpaizhe-background-color lvpaizhe-padding-bottom">
    <div class="row">
        <div class="col-md-8 col-xs-12">
            <form class="form-inline">
                <div class="form-group">
                    <label for="searchPlace">搜索目的地</label>
                    <div class="input-group">
                        <input type="text" class="form-control" id="searchPlace" placeholder="普吉岛">
                  <span class="input-group-btn">
                    <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                  </span>
                    </div>
                    <label>新增地点：</label><a herf="#">马尔代夫</a>  <a herf="#">北海道</a>
                </div>
            </form>
        </div>
        <div class="col-md-4 col-xs-12">
            <form class="form-inline">
                <div class="form-group">
                    <label for="searchPhotographer">筛选摄影师</label>
                    <div class="form-group dropdown ">
                        <button class="btn btn-default dropdown-toggle" type="button" id="searchPhotographer" data-toggle="dropdown" aria-expanded="true">
                            性别
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="searchPhotographer">
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">男</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">女</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">不限</a></li>
                        </ul>
                    </div>
                    <div class="form-group dropdown ">
                        <button class="btn btn-default dropdown-toggle" type="button" id="searchPhotographer" data-toggle="dropdown" aria-expanded="true">
                            所在地
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="searchPhotographer">
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">国内</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">国外</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">不限</a></li>
                        </ul>
                    </div>
                    <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- 主体内容 -->
<!-- 摄影师 -->
<div class="container">
    <div class="row">
        <div class="col-lg-12 text-center lvpaizhe-padding-bottom">
            <h1>遍布世界各地的优秀摄影师</h1>
            <a href="#">更多摄影师 &gt;</a>
        </div>
    </div>
    <div class="row lvpaizhe-background-color">
        <div class="col-lg-3 col-sm-6 lvpaizhe-margin-top-bottom">

            <div class="row">
                <div class="col-sm-4">
                    <img class="img-circle" src="${resourceUrl}/img/3801213fb80e7bec12b00fef2f2eb9389b506b51.jpg" alt="..." width="80" height="80">
                </div>
                <div class="col-sm-8">
                    <table class="photoer-table">
                        <tr>
                            <td>刘朝春</td>
                            <td>泰国普吉</td>
                        <tr>
                        <tr>
                            <td>高级认证</td>
                            <td>25次拍摄</td>
                        <tr>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <img src="${resourceUrl}/img/4473131_183410472000_2.jpg" width="262" height="175">
                </div>
            </div>
        </div>
        <div class="col-lg-3 col-sm-6 lvpaizhe-margin-top-bottom">

            <div class="row">
                <div class="col-sm-4">
                    <img class="img-circle" src="${resourceUrl}/img/3801213fb80e7bec12b00fef2f2eb9389b506b51.jpg" alt="..." width="80" height="80">
                </div>
                <div class="col-sm-8">
                    <table class="photoer-table">
                        <tr>
                            <td>刘朝春</td>
                            <td>泰国普吉</td>
                        <tr>
                        <tr>
                            <td>高级认证</td>
                            <td>25次拍摄</td>
                        <tr>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <img src="${resourceUrl}/img/4473131_183410472000_2.jpg" width="262" height="175">
                </div>
            </div>
        </div>
        <div class="col-lg-3 col-sm-6 lvpaizhe-margin-top-bottom">

            <div class="row">
                <div class="col-sm-4">
                    <img class="img-circle" src="${resourceUrl}/img/3801213fb80e7bec12b00fef2f2eb9389b506b51.jpg" alt="..." width="80" height="80">
                </div>
                <div class="col-sm-8">
                    <table class="photoer-table">
                        <tr>
                            <td>刘朝春</td>
                            <td>泰国普吉</td>
                        <tr>
                        <tr>
                            <td>高级认证</td>
                            <td>25次拍摄</td>
                        <tr>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <img src="${resourceUrl}/img/4473131_183410472000_2.jpg" width="262" height="175">
                </div>
            </div>
        </div>
        <div class="col-lg-3 col-sm-6 lvpaizhe-margin-top-bottom">

            <div class="row">
                <div class="col-sm-4">
                    <img class="img-circle" src="${resourceUrl}/img/3801213fb80e7bec12b00fef2f2eb9389b506b51.jpg" alt="..." width="80" height="80">
                </div>
                <div class="col-sm-8">
                    <table class="photoer-table">
                        <tr>
                            <td>刘朝春</td>
                            <td>泰国普吉</td>
                        <tr>
                        <tr>
                            <td>高级认证</td>
                            <td>25次拍摄</td>
                        <tr>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <img src="${resourceUrl}/img/4473131_183410472000_2.jpg" width="262" height="175">
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 拍摄地 -->
<div class="container">
    <div class="row">
        <div class="col-lg-12 text-center lvpaizhe-padding-bottom">
            <h1>令人神往的拍摄地</h1>
            <a href="#">更多拍摄地 &gt;</a>
        </div>
    </div>
    <div class="row lvpaizhe-background-color">
        <div class="col-lg-12">
            <h3>国内</h4>
        </div>
    </div>
    <div class="row lvpaizhe-background-color">
        <div class="col-sm-4  place" >
            <img src="${resourceUrl}/img/3(2).jpg" alt="..."  width="370" height="250">
            <p class="text-center">三亚</p>
        </div>
        <div class="col-sm-4  place" >
            <img src="${resourceUrl}/img/3(2).jpg" alt="..."  width="370" height="250">
            <p class="text-center">三亚</p>
        </div>
        <div class="col-sm-4  place" >
            <img src="${resourceUrl}/img/3(2).jpg" alt="..." width="370" height="250" >
            <p class="text-center">三亚</p>
        </div>
    </div>
    <div class="row lvpaizhe-background-color">
        <div class="col-lg-12">
            <h3>国外</h4>
        </div>
    </div>
    <div class="row lvpaizhe-background-color">
        <div class="col-sm-4  place" >
            <img src="${resourceUrl}/img/3(2).jpg" alt="..."  width="370" height="250">
            <p class="text-center">三亚</p>
        </div>
        <div class="col-sm-4  place" >
            <img src="${resourceUrl}/img/3(2).jpg" alt="..."  width="370" height="250">
            <p class="text-center">三亚</p>
        </div>
        <div class="col-sm-4  place" >
            <img src="${resourceUrl}/img/3(2).jpg" alt="..." width="370" height="250" >
            <p class="text-center">三亚</p>
        </div>
    </div>
</div>
<!-- 活动 -->
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="text-center">活动</h1>
        </div>
    </div>
</div>
<jsp:include flush="true" page="/WEB-INF/views/include/footer.jsp"/>

</body>
</html>