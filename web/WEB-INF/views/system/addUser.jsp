<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-03-10
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>${title}</title>
</head>
<body>
<article class="page-container">
    <form action="/addUser" method="post" class="form form-horizontal" id="form-user-add">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户代码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="userCode" name="USER_CODE">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="userName" name="USER_NAME">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>手机：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="mobile" name="MOBILE">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>微信：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" placeholder="@" name="wechatId" id="WECHAT_ID">
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交2&nbsp;&nbsp;">
            </div>
        </div>
    </form>
</article>


<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>

<script type="text/javascript">
    $(function(){
       <!--  console.log("init !");-->
        $("#form-user-add").validate({
            rules:{
                USER_CODE:{
                    required:true,
                    minlength:2,
                    maxlength:16
                },
                USER_NAME:{
                    required:true,
                    minlength:2,
                    maxlength:16
                },

                MOBILE:{
                    required:true,
                    minlength:2,
                    maxlength:16
                },
                WECHAT_ID:{
                    minlength:2,
                    maxlength:16
                },

            },
            onkeyup:false,
            focusCleanup:true,
            success:function (data) {
                console.log("data :"+data);
            },
            submitHandler:function(form){
                console.log('Save info');
                $.ajax(
                    {
                        type : "POST",
                        url :"/addUser",
                        data : form,
                        success : function (message) {
                            console.log("msg "+message);
                        },
                        error : function (message) {
                            console.log(message);
                        }
                    }

                );



            }
        });
    });
</script>
</body>

</html>
