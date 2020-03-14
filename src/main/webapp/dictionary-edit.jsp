<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
<meta charset="UTF-8">
<title>欢迎页面-X-admin2.2</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="stylesheet" href="./css/font.css">
<link rel="stylesheet" href="./css/xadmin.css">
<link rel="stylesheet" href="css/messagedetail.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="./lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript" src="./js/xadmin.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>

<body>
	<div class="layui-fluid">
		<form class="layui-form layui-form-pane" lay-filter="dic">
			<div class="layui-row">
				<fieldset
					class="layui-elem-field layui-field-title site-demo-button"
					style="margin-top: 30px;">
					<legend>修改数据字典</legend>
				</fieldset>
				<div class="layui-form-item">
					<label for="employeeNum" class="layui-form-label"> <span
						class="x-red">*</span>编号
					</label>
					<div class="layui-input-inline">
						<input type="text" id="id" name="id" lay-verify=""
							placeholder="系统自动填写" autocomplete="off" class="layui-input"
							disabled="true">
					</div>
				</div>

				<div class="layui-form-item">
					<label for="name" class="layui-form-label"> <span
						class="x-red">*</span>类别
					</label>
					<div class="layui-input-inline">
						<input type="text" id="classification" name="classification"
							lay-verify="" autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label for="name" class="layui-form-label"> <span
						class="x-red">*</span>条目
					</label>
					<div class="layui-input-inline">
						<input type="text" id="item" name="item" lay-verify=""
							autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label for="name" class="layui-form-label"> <span
						class="x-red">*</span>对应的值
					</label>
					<div class="layui-input-inline">
						<input type="text" id="value" name="value" lay-verify=""
							autocomplete="off" class="layui-input">
					</div>
				</div>
			</div>
			<div class="layui-form-item" id="btn">
				<button class="layui-btn" lay-filter="upt" lay-submit>确认修改</button>
			</div>
		</form>
	</div>

</body>
<script>
	function getRequest() {
		var url = location.search; //获取url中"?"符后的字串
		var theRequest = new Object();
		if (url.indexOf("?") != -1) {
			var str = url.substr(1);
			strs = str.split("&");
			for (var i = 0; i < strs.length; i++) {
				theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
			}
		}
		return theRequest;
	}

	layui.use([ 'form', 'layer', 'jquery', 'laydate' ], function() {
		var $ = layui.jquery;
		var form = layui.form, layer = layui.layer;
		var request = getRequest();

		console.log("获取的url参数：", request)
		$(function() {
			$.ajax({
				url : "/hrms/dictionary/get",
				type : 'post',//method请求方式，get或者post
				data : request,
				async : false,
				success : function(res) {//res为相应体,function为回调函数
					console.log("getbyid返回体" + res)
					var json = JSON.parse(res);
					var data = json.data[0];
					form.val("dic", { //formTest 即 class="layui-form" 所在元素属性 lay-filter="" 对应的值
						"id" : data.id,
						"classification" : data.classification,
						"item" : data.item,
						"value" : data.value
					});
				},
				error : function(error) {
					console.log(error)
					layer.alert('操作失败！！！', {
						icon : 5
					});
				}
			})

		})

		//监听表单提交事件
		form.on('submit(upt)', function(data) {
			console.log(data)
			var param = data.field;//定义临时变量获取表单提交过来的数据，非json格式
			console.log("修改的提交表单信息：", JSON.stringify(param));//测试是否获取到表单数据，调试模式下在页面控制台查看
			$.ajax({
				url : "/hrms/dictionary/upt",
				type : 'post',//method请求方式，get或者post
				data : param,//表格数据序列化
				async : false,
				success : function(res) {//res为相应体,function为回调函数
					if (res == "T") {
						layer.msg('修改成功', {
							icon : 1,
							time : 1000
						},
								function() {
									parent.location.reload();
									var index = parent.layer
											.getFrameIndex(window.name);
									//关闭当前frame
									parent.layer.close(index)

								});
						//$("#res").click();//调用重置按钮将表单数据清空
					} else {
						layer.alert("修改失败", {
							icon : 5
						});
						console.log("failed")
					}
				},
				error : function() {
					layer.alert('操作失败！！！', {
						icon : 5
					});
				}
			});
			return false;
		});

	});
</script>
</html>
