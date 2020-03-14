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
					<legend>新增数据字典</legend>
				</fieldset>
				
				<div class="layui-form-item">
					<label for="name" class="layui-form-label"> <span
						class="x-red">*</span>分类
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
						class="x-red">*</span>对应值
					</label>
					<div class="layui-input-inline">
						<input type="text" id="value" name="value" lay-verify=""
							autocomplete="off" class="layui-input">
					</div>
				</div>
				
				<div class="layui-form-item">
					<label for="employeeNum" class="layui-form-label"> <span
						class="x-red">*</span>是否可编辑
					</label>
					<div class="layui-input-inline">
						<input type="checkbox" checked="" name="editable" lay-skin="switch" lay-text="是|否">
					</div>
				</div>
				
			</div>
			<div class="layui-form-item" id="btn">
				<button class="layui-btn" style="width: 100%;" lay-filter="add" lay-submit>确认添加</button><hr/>
				<button class="layui-btn" style="width: 100%;background: orange;" lay-filter="continue_add" lay-submit>提交并继续添加</button>
			</div>
		</form>
	</div>

</body>
<script>		
		layui.use([ 'form', 'jquery' ], function() {
			var form = layui.form, $ = layui.jquery;
			//监听提交
			form.on('submit(add)', function(data) {
				var param = data.field;
				console.log(JSON.stringify(param))
				$.ajax({
					url : "/hrms/dictionary/add",
					type : "post",
					data : param,
					async : false,
					success : function(obj) {
						if(obj=="T"){
							console.log("server-->" + obj)
							console.log("添加成功")
							layer.msg('添加成功', {
								icon : 1,
								time : 700
							},
									function() {
								parent.location.reload();
										//关闭当前frame
										var index = parent.layer
												.getFrameIndex(window.name);
										//关闭当前frame
										parent.layer.close(index)
										return false;
									});
						}else{
							console.log("server-->" + obj)
							console.log("添加失败！")
							layer.msg('添加失败', {
								icon : 3,
								time : 1000
							})
						}
						
					},
					error : function() {
						layer.alert('系统错误！！！', {
							icon : 5
						});
					}
				})
				return false;
			});  
			form.on('submit(continue_add)', function(data) {
				var param = data.field;
				console.log(JSON.stringify(param))
				$.ajax({
					url : "/hrms/dictionary/add",
					type : "post",
					data : param,
					async : false,
					success : function(obj) {
						if(obj=="T"){
							console.log("server-->" + obj)
							console.log("添加成功")
							layer.msg('添加成功', {
								icon : 1,
								time : 700
							},
							function() {
								//window.location.reload();//param.classification
								$('#classification').val(param.classification);
								$('#value').val('');
								$('#item').val('');
							});
						}else{
							console.log("server-->" + obj)
							console.log("添加失败！")
							layer.msg('添加失败', {
								icon : 3,
								time : 1000
							})
						}
						
					},
					error : function() {
						layer.alert('系统错误！！！', {
							icon : 5
						});
					}
				})
				return false;
			});  
		});
	</script>
</html>
