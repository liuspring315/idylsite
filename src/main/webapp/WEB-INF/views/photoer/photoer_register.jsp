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
        <li><a href="#">首页</a></li>
        <li><a href="#">加盟入驻</a></li>
        <li class="active">摄影师注册</li>
    </ol>
</div>


<div class="container marketing">
    <div class="row">
        <div class="col-lg-12 text-center">
            <h2>欢迎成为旅拍者</h2>
            <p>用你的镜头记录美丽，记录感动</p>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-lg-12 text-center">
            <form class="form-horizontal">
                <div class="form-group">
                    <label for="username" class="col-sm-4 control-label">用户名</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="username" placeholder="可使用英文字符、数字、汉字，最长××字符，必填">
                    </div>
                </div>
                <div class="form-group">
                    <label for="Email" class="col-sm-4 control-label">电子邮箱</label>
                    <div class="col-sm-5">
                        <input type="Email" class="form-control" id="Email" placeholder="请填写正确邮箱，进行验证，必填">
                    </div>
                </div>
                <div class="form-group">
                    <label for="Mobile" class="col-sm-4 control-label">移动电话</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="Mobile" placeholder="请填写正确手机号码，旅拍者服务专员会与您联系，必填">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-4 control-label">密码</label>
                    <div class="col-sm-5">
                        <input type="password" class="form-control" id="password" placeholder="设置密码，最少6位，且至少同时包含字母和数字，必填">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password2" class="col-sm-4 control-label">确认密码</label>
                    <div class="col-sm-5">
                        <input type="password" class="form-control" id="password2" placeholder="请确认密码，必填">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-1 col-sm-10">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> 我已阅读并同意
                            </label>

                            <button type="button" class="btn btn-info" data-toggle="modal" data-target="#bs-photographer-register-modal">
                                注册协议
                            </button>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-1 col-sm-5">
                        <button type="button" class="btn btn-default" data-toggle="modal" data-target="#bs-login">&nbsp;已有帐号？&nbsp;</button>
                    </div>
                    <div class="col-sm-1">
                        <button type="submit" class="btn btn-primary">&nbsp;注册&nbsp;</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!-- Three columns of text below the carousel -->
</div>


<!-- /服务协议提示框 -->
<div class="modal fade" id="bs-photographer-register-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog ">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                <h4 class="modal-title" id="mySmallModalLabel">注册协议</h4>
            </div>
            <div class="modal-body">
                用户注册服务条款：<br />
                北京旅拍者络科技有限公司（以下简称&quot;旅拍者&quot;）根据以下服务条款为您提供服务。用户在接受旅拍者服务之前，请务必仔细阅读本条款并同意本声明。如您不同意本使用协议及/或随时对其的修改，请您立即停止使用旅拍者所提供的全部服务；您一旦注册并开始使用旅拍者的服务，即视为您已了解并完全同意本使用协议，包括旅拍者对使用协议所做的任何修改，并成为旅拍者用户（以下简称&quot;用户&quot;）。<br />
                &nbsp;<br />
                一.&nbsp;提供的服务<br />
                旅拍者提供用户例如上传图片,填写档案,作品展示,服务发布，内容搜索，文章发布及评论等在线服务。本网站保留随时变更、中断或终止部分或全部旅拍者服务的权利。如因系统升级或维护而需要暂停服务,旅拍者会提前进行通知。<br />
                用户在接受旅拍者各项服务的同时，也同意接受旅拍者提供的各类信息服务，这些服务包括例如文字、图片、音频、视频等的各类信息推荐，该类信息的提供方式包括但不限于电子邮件、短信。若您希望退订来自旅拍者信息推荐的的邮件，可通过回复邮件的方式自行完成退阅。<br />
                &nbsp;<br />
                旅拍者上关于用户或其发布的相关服务（包括但不限于用户或机构名称、联系人及联络方式、产品描述、文字介绍、相关图片视频等）的信息均由用户自行提供，用户依法应对其提供的任何信息承担全部责任及风险。旅拍者在任何情况下不对任何直接、间接、特殊的、意外的、偶然的损害承担赔偿责任。<br />
                二．用户使用条款<br />
                用户在申请使用旅拍者服务时，必须向旅拍者网站提供准确的个人资料，如个人资料有任何变动，必须及时更新。<br />
                用户一旦注册为旅拍者的合法用户，将得到一个密码和用户名，用户对自己的密码和帐号所进行的一切活动负全部责任；由该等活动所导致的任何损失或损害由用户承担，旅拍者不承担任何责任。您可随时根据指示改变您的密码。用户若发现任何非法使用用户帐号或存在安全漏洞的情况，请立即通告旅拍者。<br />
                用户不得通过旅拍者或旅拍者的服务发送或传播敏感信息和违反国家法律法规政策的信息，此类信息包括但不限于：<br />
                1.&nbsp;违反中国宪法所确定的基本原则的，危害国家安全，损害国家荣誉和利益的，煽动民族情绪<br />
                2.&nbsp;破坏国家宗教政策，宣扬邪教和封建迷信的<br />
                3.&nbsp;侮辱、诽谤、歧视或过分粗俗言语针对包括但不限于：国籍、民族、年龄、身体、精神或智力障碍的<br />
                4.&nbsp;散布谣言、扰乱社会秩序。社会稳定，散步包括但不限于淫秽、色情、暴力、赌博或教唆犯罪的<br />
                5.&nbsp;侵害他人合法权益的，及含有各项法律、行政法规禁止的其他内容的<br />
                6.&nbsp;破坏危害自然环境、历史文化遗迹、传统民风民俗的相关内容<br />
                未成年人的特别注意事项：如果您未满18岁，你不应该使用本网站或输入个人信息，我们也不打算收集18岁以下公民的个人信息。<br />
                &nbsp;<br />
                三.隐私保护<br />
                旅拍者致力于保护您的隐私。旅拍者会按照本隐私权政策的规定使用和披露您的个人信息。旅拍者会不时更新本隐私权政策，您在同意旅拍者服务协议之时，即视为您已经同意本隐私权政策全部内容。<br />
                &nbsp;<br />
                旅拍者承诺绝不擅自将用户在本站的个人资料(包括用于登陆的电子邮件地址,身份信息,联络方式,好友名单,短信记录)对第三方泄露.除非是在以下几种情况下:<br />
                1.征得用户本人明确的授权<br />
                2.由用户本人对外公开<br />
                3.相关政府部门要求旅拍者提供有关用户的个人资料<br />
                4.为维护社会公众的利益<br />
                5.为维护旅拍者的合法权益<br />
                &nbsp;<br />
                四.免责声明<br />
                1.旅拍者对于他人网站非法转载,盗用本站资源此类行为不承担任何法律责任.但一经发现,有立即删除,并停止非法转载,盗用的权力和义务.<br />
                2.用户在旅拍者上发表的言论,发布的文字、图片、视频并不代表旅拍者赞同其观点并且不能保证在任何时候都100％准确<br />
                3.旅拍者尊重合法版权，反对侵权盗版。若发现部分文字、摄影作品等侵害了您的权益，请您及时向旅拍者提供身份证明、权属证明、原始链接及侵权情况说明邮件至我们的投诉邮箱：xxx@showtrue.cn，我们会尽快与您联系并解决。<br />
                4.本网站禁止制作、复制、发布、传播等具有反动、色情、暴力、淫秽等内容的信息，一经发现，立即删除。若您因此触犯法律，我们对此不承担任何法律责任。<br />
                5.旅拍者不保证本网站内容适合所有用户的使用要求，不保证用户经由本网站取得的任何服务符合用户的期望。<br />
                &nbsp;<br />
                &middot;&nbsp;四.免责条款（针对影像服务供应商）<br />
                要在旅拍者站上发布内容,&nbsp;你需要做到：<br />
                A.&nbsp;拥有你上传到网站的所有内容的版权或拥有内容所有者的上传许可;<br />
                B.&nbsp;能够根据这些条款和条件授予旅拍者相关的权利（例如，如果已经把独家版权授予他人，那你就不能再授权给我们了）；<br />
                C.&nbsp;如果你将他人内容合并编入您所上传的内容，你应该获得他人版权所有者的许可；<br />
                否则你有可能会引起法律纠纷。我们对此不承担任何法律责任。<br />
                对于因以下行为引起的法律传唤、指控、诉讼等，以及因此导致的一切损失、赔偿和费用，旅拍者将不负担法律责任(包括但不限于)：你不拥有作品的版权、你没有能力授予旅拍者相关版权、你在没有获得许可的情况下在自己的内容中使用他人的内容。<br />
                &nbsp;<br />
                五.知识产权声明<br />
                旅拍者拥有旅拍者站内所有信息内容（除旅拍者用户发布的作品、服务信息，包括但不限于文字、图片、视频、商号、域名、设计、专栏目录、话题、用户评论及任何信息或资料）的版权。<br />
                任何被授权的浏览、复制、打印和传播属于旅拍者站内信息内容都不得用于商业目的且所有信息内容及其任何部分的使用都必须包括此版权声明。<br />
                旅拍者所有的产品、技术与所有程序均属于绣球知识产权。&ldquo;Showtrue&rdquo;、&ldquo;旅拍者&rdquo;文字、标识等为北京旅拍者络科技有限公司的注册商标，受法律保护，北京旅拍者络科技有限公司拥有以上内容（包括但不限于）的专利、专利申请、商标、版权或其他知识产权。未经北京旅拍者络科技有限公司许可，任何人不得擅自（包括但不限于：以非法的方式复制、传播、展示、镜像、上载、下载）使用。凡侵犯本公司合法权益的，北京旅拍者络科技有限公司将依法追究法律责任。<br />
                &nbsp;<br />
                六．Cookies的使用<br />
                旅拍者使用&ldquo;Cookie&rdquo;，让您登录到我们的服务，旅拍者使用Cookie可以提供给您更加个性化在线体验。Cookie也节省您的时间无需反复输入相同的信息。&nbsp;<br />
                您有权选择接受或拒绝接受cookies。您可以通过修改浏览器设置的方式拒绝接受cookies。如果您选择拒绝Cookies，您可能无法依靠Cookie登录或使用其他互动功能的网站和服务。<br />
                七．供应商诚信<br />
                所有供应商应提供真实的、诚信的、详细的、体现职业道德和职业素养的服务、产品,应按照有关条款实行明码标价，所有服务内容和价格应完整体验在供应商所提供的信息中，保证信息的透明化、公开化。所有供应商不得发布任何违规服务、产品（包括但不限于任何侵犯他人知识产权的服务、产品，任何侵犯他人版权或专利权的产品，未授权的服务、产品等），不得存在任何隐性消费，供应商应保证消费者的知情权。<br />
                所有用户应在与供应商沟通前仔细阅读供应商所提供的信息内容，如遇任何不清楚的问题，请及时联系提供信息的供应商。<br />
                如果供应商与用户之间产生任何纠纷，我们对此不承担任何法律责任。<br />
                &nbsp;<br />
                *本条款的最终解释权归旅拍者所有<br />
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>

<!-- /服务协议提示框 -->
<div class="modal fade" id="bs-login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog ">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                <h4 class="modal-title" id="mySmallModalLabel">登录</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="inputEmail3" placeholder="请输入您的注册邮箱">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> 记住我
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group modal-footer">
                        <div class="col-sm-3">
                            <button type="submit" class="btn btn-default">忘记密码？</button>
                        </div>
                        <div class="col-sm-offset-1 col-sm-8">
                            <button type="submit" class="btn btn-primary">登录</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        </div>
                        <div class="sns">
                            <a class="js-bindweibo" href="#">
                                <span class="icon z-ico-sina-weibo"></span>微博登录
                            </a>
                            <a class="js-bindqq" href="#">
                                <span class="icon z-ico-qq"></span>QQ 登录
                            </a>
                        </div>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<jsp:include flush="true" page="/WEB-INF/views/include/footer.jsp"/>
</body>
</html>