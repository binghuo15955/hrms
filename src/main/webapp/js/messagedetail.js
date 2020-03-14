function addfamily(i) {
	// 获取到对应index的Family信息并添加到后端
	var list = [];
	var relationship = document.getElementById("relationship" + i).value;
	var relativename = document.getElementById("relativename" + i).value;
	var company = document.getElementById("company" + i).value;
	var position = document.getElementById("position" + i).value;
	var address = document.getElementById("address" + i).value;
	var idnumber = document.getElementById("idnumber" + i).value;
	var telephone = document.getElementById("telephone" + i).value;
	var id = $('#familyid' + i).val();
	list.push({
		employeeNum : getRequest().employeeNum,
		name : relativename,
		relationship : relationship,
		company : company,
		position : position,
		address : address,
		idnumber : idnumber,
		telephone : telephone,
		id : id
	})
	console.log("id:", id)
	if (id != null && id != "") {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/family/edit",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res == "success") {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	} else {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/family/add",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res > 0) {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					}, function() {
						$('#familyid' + i).val(res)
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	}
}
// 删除对应index的div和数据库记录
function delfamily(index) {
	var id = $('#familyid' + index).val()
	console.log("删除的id:", id)
	if (id == '') {
		$('#family' + index).remove();
	} else {
		$.ajax({
			url : "/hrms/family/del",
			type : "post",
			async : false,
			data : {
				"id" : id
			},
			success : function(res) {
				if (res == "success") {
					layer.msg('删除成功', {
						icon : 1,
						time : 500
					})
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
		$('#family' + index).remove();
	}
}

// 获取到对应index的Family信息并添加到后端
function addexperience(i) {
	var list = [];
	var exp_start_time = document.getElementById("exp_start_time" + i).value;
	var exp_end_time = document.getElementById("exp_end_time" + i).value;
	var exp_company = document.getElementById("exp_company" + i).value;
	var exp_position = document.getElementById("exp_position" + i).value;
	var description = document.getElementById("description" + i).value;
	var id = $('#experienceid' + i).val();
	list.push({
		employeeNum : getRequest().employeeNum,
		start_time : exp_start_time,
		end_time : exp_end_time,
		company : exp_company,
		position : exp_position,
		description : description,
		id : id
	});
	console.log("id:", id)
	if (id != null && id != "") {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/experience/edit",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res == "success") {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	} else {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/experience/add",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res > 0) {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					}, function() {
						$('#experienceid' + i).val(res)
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	}
}
// 删除对应的index的experience记录和数据库记录
function delexperience(index) {
	var id = $('#experienceid' + index).val()
	console.log("删除的id:", id)
	if (id == '') {
		$('#experience' + index).remove();
	} else {
		$.ajax({
			url : "/hrms/experience/del",
			type : "post",
			async : false,
			data : {
				"id" : id
			},
			success : function(res) {
				if (res == "success") {
					layer.msg('删除成功', {
						icon : 1,
						time : 500
					})
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
		$('#experience' + index).remove();
	}
}
// 获取到对应index的Bank信息并添加到后端
function addbank(i) {
	var list = [];
	var name = document.getElementById("bank_name" + i).value;
	var account = document.getElementById("bank_account" + i).value;
	var openbank = document.getElementById("bank_openbank" + i).value;
	var idnumber = document.getElementById("bank_idnumber" + i).value;
	var id = $('#bankid' + i).val();
	list.push({
		employeeNum : getRequest().employeeNum,
		name : name,
		account : account,
		openbank : openbank,
		idnumber : idnumber,
		id : id
	})
	console.log("id:", id)
	if (id != null && id != "") {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/bank/edit",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res == "success") {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	} else {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/bank/add",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res > 0) {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					}, function() {
						$('#bankid' + i).val(res)
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	}
}
// 删除对应的index的bank记录和数据库记录
function delbank(index) {
	var id = $('#bankid' + index).val()
	console.log("删除的id:", id)
	if (id == '') {
		$('#bank' + index).remove();
	} else {
		$.ajax({
			url : "/hrms/bank/del",
			type : "post",
			async : false,
			data : {
				"id" : id
			},
			success : function(res) {
				if (res == "success") {
					layer.msg('删除成功', {
						icon : 1,
						time : 500
					})
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
		$('#bank' + index).remove();
	}
}
// 获取到对应index的School信息并添加到后端
function addschool(i) {
	var list = [];
	var sch_start_time = document.getElementById("sch_start_time" + i).value;
	var sch_end_time = document.getElementById("sch_end_time" + i).value;
	var sch_school = document.getElementById("sch_school" + i).value;
	var sch_major = document.getElementById("sch_major" + i).value;
	var sch_type = $("input[name='sch_type" + i + "']:checked").val();
	console.log("sch_type:", sch_type)
	var sch_graduation = document.getElementById("sch_graduation" + i).value;
	var sch_reason = document.getElementById("sch_reason" + i).value;
	var id = $('#schoolid' + i).val();
	list.push({
		employeeNum : getRequest().employeeNum,
		start_time : sch_start_time,
		end_time : sch_end_time,
		school : sch_school,
		major : sch_major,
		type : sch_type,
		graduation : sch_graduation,
		reason : sch_reason,
		id : id
	});
	console.log("id:", id)
	if (id != null && id != "") {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/school/upt",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res == "T") {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	} else {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/school/add",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res > 0) {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					}, function() {
						$('#schoolid' + i).val(res)
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	}
}
// 删除对应的index的school记录和数据库记录
function delschool(index) {
	var id = $('#schoolid' + index).val()
	console.log("删除的id:", id)
	if (id == '') {
		$('#school' + index).remove();
	} else {
		$.ajax({
			url : "/hrms/school/del",
			type : "post",
			async : false,
			data : {
				"id" : id
			},
			success : function(res) {
				if (res == "T") {
					layer.msg('删除成功', {
						icon : 1,
						time : 500
					})
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
		$('#school' + index).remove();
	}
}
// 获取到对应index的Project信息并添加到后端
function addproject(i) {
	var list = [];
	var pro_start_time = document.getElementById("pro_start_time" + i).value;
	var pro_end_time = document.getElementById("pro_end_time" + i).value;
	var pro_company = document.getElementById("pro_company" + i).value;
	var pro_description = document.getElementById("pro_description" + i).value;
	var pro_result = document.getElementById("pro_result" + i).value;
	var id = $('#projectid' + i).val();
	list.push({
		employeeNum : getRequest().employeeNum,
		start_time : pro_start_time,
		end_time : pro_end_time,
		company : pro_company,
		description : pro_description,
		result : pro_result,
		id : id
	});
	console.log("id:", id)
	if (id != null && id != "") {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/project/upt",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res == "T") {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	} else {
		console.log("传送到后端的值:", list[0])
		$.ajax({
			url : "/hrms/project/add",
			type : "post",
			async : false,
			data : list[0],
			success : function(res) {
				if (res > 0) {
					layer.msg('保存成功', {
						icon : 1,
						time : 500
					}, function() {
						$('#projectid' + i).val(res)
					});
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
	}
}
// 删除对应的index的project记录和数据库记录
function delproject(index) {
	var id = $('#projectid' + index).val()
	console.log("删除的id:", id)
	if (id == '') {
		$('#project' + index).remove();
	} else {
		$.ajax({
			url : "/hrms/project/del",
			type : "post",
			async : false,
			data : {
				"id" : id
			},
			success : function(res) {
				if (res == "T") {
					layer.msg('删除成功', {
						icon : 1,
						time : 500
					})
				} else {
					layer.alert("系统错误,请重试！！", {
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
		})
		$('#project' + index).remove();
	}
}
// 退出当前页面
function exit() {
	var index = parent.layer.getFrameIndex(window.name)
	parent.layer.close(index);// 关闭当前页
}
// 获取url中的参数
function getRequest() {
	var url = location.search; // 获取url中"?"符后的字串
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
// 定义几个list接收dictionary，用在后面的追加元素上！
var position_arr = [], relationship_arr = [], graduation_arr = [];

layui.use([ 'form', 'layer', 'jquery', 'laydate' ], function() {
	var $ = layui.jquery;
	var form = layui.form, layer = layui.layer;
	var request = getRequest();
	// 获取数据字典和对应行信息
	$.ajax({
		url : "/hrms/message/init_editPage",
		type : "post",
		async : false,
		data : {
			"employeeNum" : request.employeeNum
		},
		success : function(res) {
			var jsonObj = JSON.parse(res);
			console.log("jsonObj:", jsonObj)
			var data = jsonObj.dictionaries;
			for (var i = 0; i < data.length; i++) {
				var cfct = data[i].classification;
				var content = '<option value="' + data[i].item + '">'
						+ data[i].value + '</option>'
				switch (cfct) {
				case "婚姻状况":
					$('#marital').append(content);
					break;
				case "学历":
					$('#education_background').append(content);
					break;
				case "职位":
					$('#position').append(content);
					position_arr.push({
						item : data[i].item,
						value : data[i].value
					})
					// console.log(position_arr[0].item)
					break;
				case "血型":
					$('#blood').append(content);
					break;
				case "部门":
					$('#department').append(content);
					break;
				case "关系":
					relationship_arr.push({
						item : data[i].item,
						value : data[i].value
					})
					// console.log(relationship_arr[0].item)
					break;
				case "毕业情况":
					graduation_arr.push({
						item : data[i].item,
						value : data[i].value
					})
					break;
				default:
					break;
				}
			}
			form.render('select')
			console.log("字典渲染完成！")
			var json = jsonObj.message;
			id = json.employeeNum;
			console.log(id)
			form.val("message", { // formTest 即 class="layui-form"
				// 所在元素属性 lay-filter="" 对应的值
				"employeeNum" : json.employeeNum,
				"birthday" : json.birthday,
				"birthplace" : json.birthplace,
				"blood" : json.blood,
				"current_address" : json.current_address,
				"current_postcode" : json.current_postcode,
				"department" : json.department,
				"education_background" : json.education_background,
				"email" : json.email,
				"employeeNum" : json.employeeNum,
				"enrollday" : json.enrollday,
				"enrollplace" : json.enrollplace,
				"haveChildren" : json.haveChildren,
				"height" : json.height,
				"householdtype" : json.householdtype,
				"idnumber" : json.idnumber,
				"joinJobDay" : json.joinJobDay,
				"marital" : json.marital,
				"name" : json.name,
				"nation" : json.nation,
				"nativePlace" : json.nativePlace,
				"position" : json.position,
				"postcode" : json.postcode,
				"sex" : json.sex,
				"telephone" : json.telephone,
			});

		},
		error : function(res) {
			console.log(res)
		}
	})

	// 自定义验证规则
	form.verify({
		nikename : function(value) {
			if (value.length < 5) {
				return '昵称至少得5个字符啊';
			}
		},
		pass : [ /(.+){6,12}$/, '密码必须6到12位' ],
		repass : function(value) {
			if ($('#L_pass').val() != $('#L_repass').val()) {
				return '两次密码不一致';
			}
		}
	});

	// calender
	var laydate = layui.laydate;
	var form = layui.form;

	// 执行一个laydate实例
	laydate.render({
		elem : '#birthday' // 指定元素
	});
	laydate.render({
		elem : '#enrollday' // 指定元素
	});
	laydate.render({
		elem : '#joinJobDay' // 指定元素
	});

	// 监听表单提交事件
	form.on('submit(add)', function(data) {
		var param = data.field;// 定义临时变量获取表单提交过来的数据，非json格式
		console.log(JSON.stringify(param));// 测试是否获取到表单数据，调试模式下在页面控制台查看
		$.ajax({
			url : "/hrms/message/edit",
			type : 'post',// method请求方式，get或者post
			data : param,// 表格数据序列化
			async : false,
			success : function(res) {// res为相应体,function为回调函数
				if (res == "success") {
					layer.msg('保存成功', {
						icon : 1,
						time : 1000
					}, function() {
						parent.location.reload();
						var index = parent.layer.getFrameIndex(window.name);
						// 关闭当前frame
						parent.layer.close(index)

					});
				} else {
					layer.alert(data.msg, {
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

layui.use([ 'form', 'layer', 'jquery', 'laydate' ], function() {
	var $ = layui.jquery;
	var form = layui.form, layer = layui.layer;
	var request = getRequest();
	var laydate = layui.laydate;
	laydate.render({
		elem : '#exp_start_time0'
	});

	laydate.render({
		elem : '#exp_end_time0'
	});

});

/**
 * 添加各种信息按钮事件
 * 
 * @returns
 */
layui
		.use(
				[ 'form', 'layer', 'jquery', 'laydate' ],
				function() {
					var lmrIndex = 0;

					// 新增家庭信息
					layui
							.$('#familyadd')
							.on(
									'click',
									function() {
										var form = layui.form;
										lmrIndex++;
										console.log(lmrIndex)
										var wholeappend = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="family'
												+ lmrIndex
												+ '"><input type="hidden" id="familyid'
												+ lmrIndex
												+ '"/><div class="layui-form-item"><div class="layui-col-md3">	<label for="relationship" class="layui-form-label"> <span class="x-red">*</span>与本人的关系	</label>	<div class="layui-input-inline">		<select id="relationship'
												+ lmrIndex
												+ '" name="relationship" class="relationship">'
												+ '<option value=""></option>';
										for (var i = 0; i < relationship_arr.length; i++) {
											wholeappend += '<option value="'
													+ relationship_arr[i].item
													+ '">'
													+ relationship_arr[i].value
													+ '</option>		'
										}
										wholeappend += '</select> <div class="layui-unselect layui-form-select"><div class="layui-select-title"><input type="text" placeholder="请选择" value="" readonly="" class="layui-input layui-unselect"><i class="layui-edge"></i></div><dl class="layui-anim layui-anim-upbit"><dd lay-value="" class="layui-select-tips">请选择</dd>';
										for (var i = 0; i < relationship_arr.length; i++) {
											wholeappend += '<dd lay-value="'
													+ relationship_arr[i].item
													+ '" class="">'
													+ relationship_arr[i].value
													+ '</dd>';
										}
										wholeappend += '</dl></div>	</div></div><div class="layui-col-md3">	<label for="relativename" class="layui-form-label"> <span class="x-red">*</span>姓名	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="他/她的大名" name="relativename" id="relativename'
												+ lmrIndex
												+ '">	</div></div><div class="layui-col-md3">	<label for="company" class="layui-form-label"> <span class="x-red">*</span>工作单位	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="工作单位" name="company" id="company'
												+ lmrIndex
												+ '">	</div></div><div class="layui-col-md3">	<label for="position" class="layui-form-label"> <span class="x-red">*</span>职位	</label>	<div class="layui-inline">		<select id="position'
												+ lmrIndex
												+ '" name="position" class="position">			<option value=""></option>			';
										for (var i = 0; i < position_arr.length; i++) {
											wholeappend += '<option value="'
													+ position_arr[i].item
													+ '">'
													+ position_arr[i].value
													+ '</option>'
										}

										wholeappend += '</select>	</div></div>						</div>						<div class="layui-form-item"><div class="layui-col-md3">	<label for="address" class="layui-form-label"> <span class="x-red">*</span>家庭详细地址	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="请填写详细家庭地址" name="address" id="address'
												+ lmrIndex
												+ '">	</div></div><div class="layui-col-md3">	<label for="idnumber" class="layui-form-label"> <span class="x-red">*</span>身份证号码	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="请填写身份证号" name="idnumber" id="idnumber'
												+ lmrIndex
												+ '">	</div></div><div class="layui-col-md3">	<label for="telephone" class="layui-form-label"> <span class="x-red">*</span>联系方式	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="请填写她/他联系方式" name="telephone" id="telephone'
												+ lmrIndex
												+ '">	</div></div><div class="layui-col-md3">	<div class="layui-inline"><button type="button" class="layui-btn layui-btn-radius" id="familyadd'
												+ lmrIndex
												+ '" onclick="addfamily('
												+ lmrIndex
												+ ')")>保存</button>		<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="familydel'
												+ lmrIndex
												+ '" onclick="delfamily('
												+ lmrIndex
												+ ')")>删除</button>	</div></div>'

										$('#family').prepend(wholeappend);
										form.render(); // 重新渲染一遍
									});

					var expIndex = 0;
					// 新增工作简历
					layui
							.$('#experienceadd')
							.on(
									'click',
									function() {
										var form = layui.form;
										var laydate = layui.laydate;
										expIndex++;
										console.log(expIndex)
										var wholeappend = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="experience'
												+ expIndex
												+ '"><input type="hidden" id="experienceid'
												+ expIndex
												+ '"/><div class="layui-form-item"><div class="layui-col-md3"><label for="exp_start_time" class="layui-form-label"> <span	class="x-red">*</span>开始日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="开始时间"		name="exp_start_time" id="exp_start_time'
												+ expIndex
												+ '"></div></div><div class="layui-col-md3"><label for="exp_start_time" class="layui-form-label"> <span class="x-red">*</span>结束日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="结束时间" name="exp_end_time" id="exp_end_time'
												+ expIndex
												+ '"></div></div><div class="layui-col-md3"><label for="exp_company" class="layui-form-label"> <span class="x-red">*</span>单位名称</label><div class="layui-input-inline">	<input type="text" id="exp_company'
												+ expIndex
												+ '" name="exp_company" lay-verify="" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md3"><label for="exp_position" class="layui-form-label"> <span class="x-red">*</span>岗位</label>	<div class="layui-inline">		<select id="exp_position'
												+ expIndex
												+ '" name="exp_position" class="exp_position">			<option value=""></option>';
										for (var i = 0; i < position_arr.length; i++) {
											wholeappend += '<option value="'
													+ position_arr[i].item
													+ '">'
													+ position_arr[i].value
													+ '</option>'
										}
										wholeappend += '</select>	</div></div>					</div>					<div class="layui-form-item"><div class="layui-col-md9"><label for="description" class="layui-form-label"> <span class="x-red">*</span>具体工作描述</label><div class="layui-input-inline" style="width: 1018px;" id="decp">	<input type="text" name="description" id="description'
												+ expIndex
												+ '" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md3">	<div class="layui-inline">	<button type="button" class="layui-btn layui-btn-radius" id="experienceadd'
												+ expIndex
												+ '" onclick="addexperience('
												+ expIndex
												+ ')")>保存</button>			<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="experiencedel'
												+ expIndex
												+ '" onclick="delexperience('
												+ expIndex
												+ ')">删除</button>	</div></div>'

										$('#experience').prepend(wholeappend);

										// calender
										for (var i = 0; i < expIndex; i++) {
											// 执行一个laydate实例
											laydate.render({
												elem : '#exp_start_time'
														+ expIndex + '' // 指定元素
											});

											laydate.render({
												elem : '#exp_end_time'
														+ expIndex + '' // 指定元素
											});
										}

										form.render(); // 重新渲染一遍
									});

					var bankIndex = 0;
					// 新增员工银行账户信息
					layui
							.$('#bankadd')
							.on(
									'click',
									function() {
										var form = layui.form;
										bankIndex++;
										console.log(bankIndex)
										var wholeappend = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="bank'
												+ bankIndex
												+ '"><input type="hidden" id="bankid'
												+ bankIndex
												+ '"/><div class="layui-form-item"><div class="layui-col-md4"><label for="bank_name" class="layui-form-label"> <span class="x-red">*</span>开户人姓名</label><div class="layui-input-inline"><input type="text" id="bank_name'
												+ bankIndex
												+ '" name="bank_name"autocomplete="off" class="layui-input"></div></div><div class="layui-col-md4"><label for="bank_account" class="layui-form-label"> <span class="x-red">*</span>账号</label><div class="layui-input-inline"><input type="text" id="bank_account'
												+ bankIndex
												+ '" name="bank_account"autocomplete="off" class="layui-input"></div></div><div class="layui-col-md4"><label for="bank_openbank" class="layui-form-label" > <span class="x-red">*</span>开户银行</label><div class="layui-input-inline"><input type="text" id="bank_openbank'
												+ bankIndex
												+ '" name="bank_openbank" autocomplete="off" class="layui-input">提示：按照格式xx分行-xx支行</div></div></div><div class="layui-form-item"><div class="layui-col-md4"><label for="bank_idnumber" class="layui-form-label"> <span class="x-red">*</span>身份证号</label><div class="layui-input-inline"><input type="text" id="bank_idnumber'
												+ bankIndex
												+ '" name="bank_idnumber" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md4"><button type="button" class="layui-btn layui-btn-radius" id="bankadd'
												+ bankIndex
												+ '" onclick="addbank('
												+ bankIndex
												+ ')")>保存</button><button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="bankdel'
												+ bankIndex
												+ '" onclick="delbank('
												+ bankIndex
												+ ')")>删除</button></div></div>'
										$('#bank').prepend(wholeappend);
										form.render(); // 重新渲染一遍
									});

					var schIndex = 0;
					// 新增学历信息
					layui
							.$('#schooladd')
							.on(
									'click',
									function() {
										var form = layui.form;
										var laydate = layui.laydate;
										schIndex++;
										console.log(schIndex)
										var wholeappend = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="school'
												+ schIndex
												+ '"><input type="hidden" id="schoolid'
												+ schIndex
												+ '"/><div class="layui-form-item"><div class="layui-col-md3"><label for="sch_start_time" class="layui-form-label"> <span	class="x-red">*</span>开始日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="开始时间"		name="sch_start_time" id="sch_start_time'
												+ schIndex
												+ '"></div></div><div class="layui-col-md3"><label for="sch_start_time" class="layui-form-label"> <span class="x-red">*</span>结束日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="结束时间" name="sch_end_time" id="sch_end_time'
												+ schIndex
												+ '"></div></div><div class="layui-col-md3"><label for="sch_school" class="layui-form-label"> <span class="x-red">*</span>院校名称</label><div class="layui-input-inline">	<input type="text" id="sch_school'
												+ schIndex
												+ '" name="sch_school" lay-verify="" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md3"><label for="sch_major" class="layui-form-label"> <span class="x-red">*</span>专业名称</label><div class="layui-input-inline">	<input type="text" id="sch_major'
												+ schIndex
												+ '" name="sch_major" lay-verify="" autocomplete="off" class="layui-input"></div></div>				</div>'

										wholeappend += '<div class="layui-form-item"><div class="layui-col-md3"><label for="sch_type" class="layui-form-label"> <span class="x-red">*</span>教育类型</label><div class="layui-inline">	<input type="radio"  value="全日制" title="全日制" checked name="sch_type'
												+ schIndex
												+ '"><input type="radio" name="sch_type'
												+ schIndex
												+ '" value="非全日制" title="非全日制"></div></div><div class="layui-col-md3"><label for="sch_graduation" class="layui-form-label"> <span class="x-red">*</span>毕业情况</label>	<div class="layui-inline">		<select id="sch_graduation'
												+ schIndex
												+ '" name="sch_graduation">			<option value=""></option>';

										for (var i = 0; i < graduation_arr.length; i++) {
											wholeappend += '<option value="'
													+ graduation_arr[i].value
													+ '">'
													+ graduation_arr[i].item
													+ '</option>'
										}

										wholeappend += '</select>	</div></div><div class="layui-col-md6"><label for="sch_reason" class="layui-form-label"> <span class="x-red">*</span>原因说明</label><div class="layui-input-inline" style="width: 605px;" id="decp">	<input type="text" name="sch_reason" id="sch_reason'
												+ schIndex
												+ '" autocomplete="off" class="layui-input"></div></div> <div class="layui-form-item"><div class="layui-col-md3" style="    float: right;margin-top: 10px;">	<div class="layui-inline">	<button type="button" class="layui-btn layui-btn-radius" id="schooladd'
												+ schIndex
												+ '" onclick="addschool('
												+ schIndex
												+ ')")>保存</button>			<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="schooldel'
												+ schIndex
												+ '" onclick="delschool('
												+ schIndex
												+ ')">删除</button>	</div></div></div>'
										$('#school').prepend(wholeappend);

										// calender
										for (var i = 0; i < schIndex; i++) {
											// 执行一个laydate实例
											laydate.render({
												elem : '#sch_start_time'
														+ schIndex + '' // 指定元素
											});

											laydate.render({
												elem : '#sch_end_time'
														+ schIndex + '' // 指定元素
											});
										}

										form.render(); // 重新渲染一遍
									});

					var proIndex = 0;
					// 新增项目信息
					layui
							.$('#projectadd')
							.on(
									'click',
									function() {
										var form = layui.form;
										var laydate = layui.laydate;
										proIndex++;
										console.log(proIndex)
										var wholeappend = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="project'
												+ proIndex
												+ '"><input type="hidden" id="projectid'
												+ proIndex
												+ '"/><div class="layui-form-item"><div class="layui-col-md3"><label for="pro_start_time" class="layui-form-label"> <span	class="x-red">*</span>开始日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="开始时间"		name="pro_start_time" id="pro_start_time'
												+ proIndex
												+ '"></div></div><div class="layui-col-md3"><label for="pro_start_time" class="layui-form-label"> <span class="x-red">*</span>结束日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="结束时间" name="pro_end_time" id="pro_end_time'
												+ proIndex
												+ '"></div></div><div class="layui-col-md6"><label for="pro_project" class="layui-form-label" style="    width: 260px;"> <span class="x-red">*</span>公司名称(院校名称)</label><div class="layui-input-inline">	<input type="text" style="width: 527px;" id="pro_company'
												+ proIndex
												+ '" name="pro_company" lay-verify="" autocomplete="off" class="layui-input"></div></div></div>'

										wholeappend += '<div class="layui-form-item"><div class="layui-col-md12"><label for="description" class="layui-form-label"> <span class="x-red">*</span>项目简述</label><div class="layui-input-inline" style="width: 605px;">	<textarea name="pro_description" style="width: 1435px;height: 100px;" id="pro_description'
												+ proIndex
												+ '" autocomplete="off" placeholder="字数不得超过500字！！！！" class="layui-input"></textarea></div></div> </div><div class="layui-form-item"><div class="layui-col-md9"><label for="pro_result" class="layui-form-label"> <span class="x-red">*</span>主要成果/业绩</label><div class="layui-input-inline" style="width: 1004px;">	<input type="text" name="pro_result" id="pro_result'
												+ proIndex
												+ '" autocomplete="off" class="layui-input"></div></div> <div class="layui-col-md3">	<div class="layui-inline">	<button type="button" class="layui-btn layui-btn-radius" id="projectadd'
												+ proIndex
												+ '" onclick="addproject('
												+ proIndex
												+ ')")>保存</button>			<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="projectdel'
												+ proIndex
												+ '" onclick="delproject('
												+ proIndex
												+ ')">删除</button>	</div></div></div>';

										$('#project').prepend(wholeappend);

										// calender
										for (var i = 0; i < proIndex; i++) {
											// 执行一个laydate实例
											laydate.render({
												elem : '#pro_start_time'
														+ proIndex + '' // 指定元素
											});

											laydate.render({
												elem : '#pro_end_time'
														+ proIndex + '' // 指定元素
											});
										}

										form.render(); // 重新渲染一遍
									});
				});