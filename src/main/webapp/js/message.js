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
		start_time : TimeMilltoDate(sch_start_time),
		end_time : TimeMilltoDate(sch_end_time),
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
		start_time : TimeMilltoDate(pro_start_time),
		end_time :TimeMilltoDate(pro_end_time),
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
var position_arr = [], relationship_arr = [], relationship_arr = [], graduation_arr = [];
/**
 * 初始化各种信息并显示！！
 * 
 * @returns
 */
layui
		.use(
				[ 'form', 'layer', 'jquery', 'laydate' ],
				function() {
					var $ = layui.jquery;
					var laydate = layui.laydate;
					var form = layui.form, layer = layui.layer;
					var request = getRequest();
					// 获取数据字典和对应行信息
					$
							.ajax({
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
										var content = '<option value="'
												+ data[i].item + '">'
												+ data[i].value + '</option>'
										switch (cfct) {
										case "婚姻状况":
											$('#marital').prepend(content);
											break;
										case "学历":
											$('#education_background').prepend(
													content);
											break;
										case "职位":
											$('#position').prepend(content);
											position_arr.push({
												item : data[i].item,
												value : data[i].value
											})
											break;
										case "血型":
											$('#blood').prepend(content);
											break;
										case "部门":
											$('#department').prepend(content);
											break;
										case "关系":
											$('#relationship').prepend(content);
											relationship_arr.push({
												item : data[i].item,
												value : data[i].value
											})
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
									form
											.val(
													"message",
													{
														"employeeNum" : json.employeeNum,
														"birthday" : TimeMilltoDate(json.birthday),
														"birthplace" : json.birthplace,
														"blood" : json.blood,
														"current_address" : json.current_address,
														"current_postcode" : json.current_postcode,
														"department" : json.department,
														"education_background" : json.education_background,
														"email" : json.email,
														"employeeNum" : json.employeeNum,
														"enrollday" : TimeMilltoDate(json.enrollday),
														"enrollplace" : json.enrollplace,
														"haveChildren" : json.haveChildren,
														"height" : json.height,
														"householdtype" : json.householdtype,
														"idnumber" : json.idnumber,
														"joinJobDay" : TimeMilltoDate(json.joinJobDay),
														"marital" : json.marital,
														"name" : json.name,
														"nation" : json.nation,
														"nativePlace" : json.nativePlace,
														"position" : json.position,
														"postcode" : json.postcode,
														"sex" : json.sex,
														"telephone" : json.telephone,
													});
									/**
									 * 显示家庭信息
									 */
									var families = jsonObj.families;
									for (var i = 0; i < families.length; i++) {
										var id = families[i].id
										var relationship = families[i].relationship;
										var name = families[i].name;
										var company = families[i].company;
										var position = families[i].position;
										var address = families[i].address;
										var idnumber = families[i].idnumber;
										var telephone = families[i].telephone;
										var familyContent = "";
										var familyContent = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="family'
												+ id
												+ '"><form class="layui-form" lay-filter="family'
												+ id
												+ '"><input type="hidden" name="id" id="familyid'
												+ id
												+ '"/><div class="layui-form-item"><div class="layui-col-md3">	<label for="relationship" class="layui-form-label"> <span class="x-red">*</span>与本人的关系	</label>	<div class="layui-input-inline">		<select id="relationship'
												+ id
												+ '" name="relationship" class="relationship">'
												+ '<option value=""></option>';
										for (var j = 0; j < relationship_arr.length; j++) {
											familyContent += '<option value="'
													+ relationship_arr[j].item
													+ '">'
													+ relationship_arr[j].value
													+ '</option>		'
										}
										familyContent += '</select> <div class="layui-unselect layui-form-select"><div class="layui-select-title"><input type="text" placeholder="请选择" value="" readonly="" class="layui-input layui-unselect"><i class="layui-edge"></i></div><dl class="layui-anim layui-anim-upbit"><dd lay-value="" class="layui-select-tips">请选择</dd>';
										for (var j = 0; j < relationship_arr.length; j++) {
											familyContent += '<dd lay-value="'
													+ relationship_arr[j].item
													+ '" class="">'
													+ relationship_arr[j].value
													+ '</dd>';
										}
										familyContent += '</dl></div>	</div></div><div class="layui-col-md3">	<label for="relativename" class="layui-form-label"> <span class="x-red">*</span>姓名	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="他/她的大名" name="relativename" id="relativename'
												+ id
												+ '">	</div></div><div class="layui-col-md3">	<label for="company" class="layui-form-label"> <span class="x-red">*</span>工作单位	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="工作单位" name="company" id="company'
												+ id
												+ '">	</div></div><div class="layui-col-md3">	<label for="position" class="layui-form-label"> <span class="x-red">*</span>职位	</label>	<div class="layui-inline">		<select id="position'
												+ id
												+ '" name="position" class="position">			<option value=""></option>			';
										for (var j = 0; j < position_arr.length; j++) {
											familyContent += '<option value="'
													+ position_arr[j].item
													+ '">'
													+ position_arr[j].value
													+ '</option>'
										}

										familyContent += '</select>	</div></div>						</div>						<div class="layui-form-item"><div class="layui-col-md3">	<label for="address" class="layui-form-label"> <span class="x-red">*</span>家庭详细地址	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="请填写详细家庭地址" name="address" id="address'
												+ id
												+ '">	</div></div><div class="layui-col-md3">	<label for="idnumber" class="layui-form-label"> <span class="x-red">*</span>身份证号码	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="请填写身份证号" name="idnumber" id="idnumber'
												+ id
												+ '">	</div></div><div class="layui-col-md3">	<label for="telephone" class="layui-form-label"> <span class="x-red">*</span>联系方式	</label>	<div class="layui-inline">		<input class="layui-input" autocomplete="off" placeholder="请填写她/他联系方式" name="telephone" id="telephone'
												+ id
												+ '">	</div></div><div class="layui-col-md3">	<div class="layui-inline"><button type="button" class="layui-btn layui-btn-radius" id="familyadd'
												+ id
												+ '" onclick="addfamily('
												+ id
												+ ')")>保存</button>		<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="familydel'
												+ id
												+ '" onclick="delfamily('
												+ id
												+ ')")>删除</button>	</div></form></div>'

										$('#family').prepend(familyContent)

										var form_name = "family" + id
										form.val(form_name, {
											"id" : id,
											"relationship" : relationship,
											"relativename" : name,
											"company" : company,
											"position" : position,
											"address" : address,
											"idnumber" : idnumber,
											"telephone" : telephone
										});
									}
									/**
									 * 显示工作信息
									 */
									var experiences = jsonObj.experiences;
									for (var j = 0; j < experiences.length; j++) {
										var id = experiences[j].id;
										var experiencesContent = "";
										var experiencesContent = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="experience'
												+ id
												+ '"><form class="layui-form" lay-filter="experience'
												+ id
												+ '"><input type="hidden" name="id" id="experienceid'
												+ id
												+ '"/><div class="layui-form-item"><div class="layui-col-md3"><label for="exp_start_time" class="layui-form-label"> <span	class="x-red">*</span>开始日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="开始时间"		name="exp_start_time" id="exp_start_time'
												+ id
												+ '"></div></div><div class="layui-col-md3"><label for="exp_start_time" class="layui-form-label"> <span class="x-red">*</span>结束日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="结束时间" name="exp_end_time" id="exp_end_time'
												+ id
												+ '"></div></div><div class="layui-col-md3"><label for="exp_company" class="layui-form-label"> <span class="x-red">*</span>单位名称</label><div class="layui-input-inline">	<input type="text" id="exp_company'
												+ id
												+ '" name="exp_company" lay-verify="" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md3"><label for="exp_position" class="layui-form-label"> <span class="x-red">*</span>岗位</label>	<div class="layui-inline">		<select id="exp_position'
												+ id
												+ '" name="exp_position" class="exp_position">			<option value=""></option>';
										for (var i = 0; i < position_arr.length; i++) {
											experiencesContent += '<option value="'
													+ position_arr[i].item
													+ '">'
													+ position_arr[i].value
													+ '</option>'
										}
										experiencesContent += '</select>	</div></div>					</div>					<div class="layui-form-item"><div class="layui-col-md9"><label for="description" class="layui-form-label"> <span class="x-red">*</span>具体工作描述</label><div class="layui-input-inline" style="width: 1018px;" id="decp">	<input type="text" name="description" id="description'
												+ id
												+ '" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md3">	<div class="layui-inline">	<button type="button" class="layui-btn layui-btn-radius" id="experienceadd'
												+ id
												+ '" onclick="addexperience('
												+ id
												+ ')")>保存</button>			<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="experiencedel'
												+ id
												+ '" onclick="delexperience('
												+ id
												+ ')">删除</button>	</div></form></div>'

										$('#experience').prepend(
												experiencesContent)

										var form_name = "experience" + id;
										var start_time = TimeMilltoDate(experiences[j].start_time);
										var end_time = TimeMilltoDate(experiences[j].end_time);
										var company = experiences[j].company;
										var position = experiences[j].position;
										var description = experiences[j].description;

										form.val(form_name, {
											"id" : id,
											"exp_start_time" : start_time,
											"exp_end_time" : end_time,
											"exp_company" : company,
											"exp_position" : position,
											"description" : description
										});

										laydate.render({
											elem : '#exp_start_time' + id + '' // 指定元素
										});

										laydate.render({
											elem : '#exp_end_time' + id + '' // 指定元素
										});

									}

									/**
									 * 显示银行信息
									 */
									var banks = jsonObj.banks;
									for (var i = 0; i < banks.length; i++) {
										var id = banks[i].id;
										var bankContent = "";

										var bankContent = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="bank'
												+ id
												+ '"><form class="layui-form" lay-filter="bank'
												+ id
												+ '"><input type="hidden" name="id" id="bankid'
												+ id
												+ '"/><div class="layui-form-item"><div class="layui-col-md4"><label for="bank_name" class="layui-form-label"> <span class="x-red">*</span>开户人姓名</label><div class="layui-input-inline"><input type="text" id="bank_name'
												+ id
												+ '" name="bank_name"autocomplete="off" class="layui-input"></div></div><div class="layui-col-md4"><label for="bank_account" class="layui-form-label"> <span class="x-red">*</span>账号</label><div class="layui-input-inline"><input type="text" id="bank_account'
												+ id
												+ '" name="bank_account"autocomplete="off" class="layui-input"></div></div><div class="layui-col-md4"><label for="bank_openbank" class="layui-form-label" > <span class="x-red">*</span>开户银行</label><div class="layui-input-inline"><input type="text" id="bank_openbank'
												+ id
												+ '" name="bank_openbank" autocomplete="off" class="layui-input"></div></div></div><div class="layui-form-item"><div class="layui-col-md4"><label for="bank_idnumber" class="layui-form-label"> <span class="x-red">*</span>身份证号</label><div class="layui-input-inline"><input type="text" id="bank_idnumber'
												+ id
												+ '" name="bank_idnumber" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md4"><button type="button" class="layui-btn layui-btn-radius" id="bankadd'
												+ id
												+ '" onclick="addbank('
												+ id
												+ ')")>保存</button><button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="bankdel'
												+ id
												+ '" onclick="delbank('
												+ id
												+ ')")>删除</button></div></form></div>'

										$('#bank').prepend(bankContent)

										var form_name = "bank" + id
										var name = banks[i].name;
										var account = banks[i].account;
										var openbank = banks[i].openbank;
										var idnumber = banks[i].idnumber;
										form.val(form_name, {
											"id" : id,
											"bank_name" : name,
											"bank_account" : account,
											"bank_openbank" : openbank,
											"bank_idnumber" : idnumber
										});

									}

									/**
									 * 显示学历信息
									 */
									var schools = jsonObj.schools;
									for (var i = 0; i < schools.length; i++) {
										var id = schools[i].id
										var start_time = schools[i].start_time;
										var end_time = schools[i].end_time;
										var school = schools[i].school;
										var major = schools[i].major;
										var type = schools[i].type;
										var graduation = schools[i].graduation;
										var reason = schools[i].reason;
										var schoolContent = "";
										var schoolContent = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="school'
												+ id
												+ '"><form class="layui-form" lay-filter="school'+id+'"><input type="hidden" name="id" id="schoolid'
												+ id
												+ '"/><div class="layui-form-item"><div class="layui-col-md3"><label for="sch_start_time" class="layui-form-label"> <span	class="x-red">*</span>开始日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="开始时间"		name="sch_start_time" id="sch_start_time'
												+ id
												+ '"></div></div><div class="layui-col-md3"><label for="sch_start_time" class="layui-form-label"> <span class="x-red">*</span>结束日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="结束时间" name="sch_end_time" id="sch_end_time'
												+ id
												+ '"></div></div><div class="layui-col-md3"><label for="sch_school" class="layui-form-label"> <span class="x-red">*</span>院校名称</label><div class="layui-input-inline">	<input type="text" id="sch_school'
												+ id
												+ '" name="sch_school" lay-verify="" autocomplete="off" class="layui-input"></div></div><div class="layui-col-md3"><label for="sch_major" class="layui-form-label"> <span class="x-red">*</span>专业名称</label><div class="layui-input-inline">	<input type="text" id="sch_major'
												+ id
												+ '" name="sch_major" lay-verify="" autocomplete="off" class="layui-input"></div></div>				</div>'

										schoolContent += '<div class="layui-form-item"><div class="layui-col-md3"><label for="sch_type" class="layui-form-label"> <span class="x-red">*</span>教育类型</label><div class="layui-inline">	<input type="radio"  value="全日制" title="全日制" checked name="sch_type'
												+ id
												+ '"><input type="radio" name="sch_type'
												+ id
												+ '" value="非全日制" title="非全日制"></div></div><div class="layui-col-md3"><label for="sch_graduation" class="layui-form-label"> <span class="x-red">*</span>毕业情况</label>	<div class="layui-inline">		<select id="sch_graduation'
												+ id
												+ '" name="sch_graduation">			<option value=""></option>';

										for (var j = 0; j < graduation_arr.length; j++) {
											schoolContent += '<option value="'
													+ graduation_arr[j].value
													+ '">'
													+ graduation_arr[j].item
													+ '</option>'
										}

										schoolContent += '</select>	</div></div><div class="layui-col-md6"><label for="sch_reason" class="layui-form-label"> <span class="x-red">*</span>原因说明</label><div class="layui-input-inline" style="width: 605px;" id="decp">	<input type="text" name="sch_reason" id="sch_reason'
												+ id
												+ '" autocomplete="off" class="layui-input"></div></div> <div class="layui-form-item"><div class="layui-col-md3" style="    float: right;margin-top: 10px;">	<div class="layui-inline">	<button type="button" class="layui-btn layui-btn-radius" id="schooladd'
												+ id
												+ '" onclick="addschool('
												+ id
												+ ')")>保存</button>			<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="schooldel'
												+ id
												+ '" onclick="delschool('
												+ id
												+ ')">删除</button>	</div></div></form></div>'

										$('#school').prepend(schoolContent)

										var form_name = "school" + id
										form.val(form_name, {
											"id" : id,
											"sch_start_time" : TimeMilltoDate(start_time),
											"sch_end_time" : TimeMilltoDate(end_time),
											"sch_school" : school,
											"sch_major" : major,
											"sch_type" : type,
											"sch_graduation" : graduation,
											"sch_reason" : reason
										});
										form.render();
									}
									/**
									 * 显示项目信息
									 */
									var projects = jsonObj.projects;
									for (var i = 0; i < projects.length; i++) {
										var id = projects[i].id
										var start_time = projects[i].start_time;
										var end_time = projects[i].end_time;
										var company = projects[i].company;
										var description= projects[i].description;
										var result= projects[i].result;
										
										var projectContent = "";
										var projectContent = '<div style="border-bottom: 1px solid black;margin-bottom: 16px;" id="project'
												+ id
												+ '"><form class="layui-form" lay-filter="project'+id+'"><input type="hidden" id="projectid'
												+ id
												+ '"/><div class="layui-form-item"><div class="layui-col-md3"><label for="pro_start_time" class="layui-form-label"> <span	class="x-red">*</span>开始日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="开始时间"		name="pro_start_time" id="pro_start_time'
												+ id
												+ '"></div></div><div class="layui-col-md3"><label for="pro_start_time" class="layui-form-label"> <span class="x-red">*</span>结束日期</label><div class="layui-inline">	<input class="layui-input" autocomplete="off" placeholder="结束时间" name="pro_end_time" id="pro_end_time'
												+ id
												+ '"></div></div><div class="layui-col-md6"><label for="pro_project" class="layui-form-label" style="    width: 260px;"> <span class="x-red">*</span>公司名称(院校名称)</label><div class="layui-input-inline">	<input type="text" style="width: 527px;" id="pro_company'
												+ id
												+ '" name="pro_company" lay-verify="" autocomplete="off" class="layui-input"></div></div></div>'

												projectContent += '<div class="layui-form-item"><div class="layui-col-md12"><label for="description" class="layui-form-label"> <span class="x-red">*</span>项目简述</label><div class="layui-input-inline" style="width: 605px;">	<textarea name="pro_description" style="width: 1435px;height: 100px;" id="pro_description'
												+ id
												+ '" autocomplete="off" placeholder="字数不得超过500字！！！！" class="layui-input"></textarea></div></div> </div><div class="layui-form-item"><div class="layui-col-md9"><label for="pro_result" class="layui-form-label"> <span class="x-red">*</span>主要成果/业绩</label><div class="layui-input-inline" style="width: 1004px;">	<input type="text" name="pro_result" id="pro_result'
												+ id
												+ '" autocomplete="off" class="layui-input"></div></div> <div class="layui-col-md3">	<div class="layui-inline">	<button type="button" class="layui-btn layui-btn-radius" id="projectadd'
												+ id
												+ '" onclick="addproject('
												+ id
												+ ')")>保存</button>			<button type="button" class="layui-btn layui-btn-radius layui-btn-danger" id="projectdel'
												+ id
												+ '" onclick="delproject('
												+ id
												+ ')">删除</button>	</div></div></form></div>';

										$('#project').prepend(projectContent)

										var form_name = "project" + id
										form.val(form_name, {
											"id" : id,
											"pro_start_time" : TimeMilltoDate(start_time),
											"pro_end_time" : TimeMilltoDate(end_time),
											"pro_company" : company,
											"pro_description" : description,
											"pro_result" : result
										});
										form.render();
									}

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
					form.on('submit(upt)', function(data) {
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
										var index = parent.layer
												.getFrameIndex(window.name);
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
		elem : '#exp_start_time'
	});

	laydate.render({
		elem : '#exp_end_time'
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
												+ '" name="bank_openbank" autocomplete="off" class="layui-input"></div></div></div><div class="layui-form-item"><div class="layui-col-md4"><label for="bank_idnumber" class="layui-form-label"> <span class="x-red">*</span>身份证号</label><div class="layui-input-inline"><input type="text" id="bank_idnumber'
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

/**
 * 重写Date的toLocalString的方法,自定义返回格式
 */
Date.prototype.toLocaleString = function() {
	// 补0 例如 2018/7/10 14:7:2 补完后为 2018/07/10 14:07:02
	function addZero(num) {
		if (num < 10)
			return "0" + num;
		return num;
	}
	// 按自定义拼接格式返回
	return this.getFullYear() + "-" + addZero(this.getMonth() + 1) + "-"
			+ addZero(this.getDate());
};
/**
 * 传入时间戳，返回yyyy-MM-dd格式日期
 * 
 * @param timeMill
 * @returns
 */
function TimeMilltoDate(timeMill) {
	var date = new Date(timeMill);
	return date.toLocaleString();
}
