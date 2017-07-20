$(document).ready(function(){
    });

$(function(){
	$('#showAllStubtn').click(showAllStudent);	
});

$(function(){
	$("#showLimitbtn").click(showLimitStudent);
});

$(function(){
	$("#showInbtn").click(showInStudent);
});

$(function(){
	$("#showAgebtn").click(showScoreAndStudent);
});

/**
 * 查询2到4行的学生
 */
function showLimitStudent(){
	var url = "findLimitStu";
	var data = "";
	$.post(url,data,function(result){
		show(result);
	});
}

/**
 * 查询所有学生
 * @returns
 */
function showAllStudent(){
	console.log("123");
	var url = "showStudentTest";
	var data = "";
	$.post(url,data,function(result){
		console.log("123");
		console.log(result);
		show(result);
	});
}


function showInStudent(){
	 $.ajax({
		url:"findInStu",//地址
		//data:json,//参数
		type:"post",//提交方式get/post
		async:true,//同步异步
		dataType:"json",//返回数据类型
		success:function(result){
			show(result);
		}
	});
}

function showScoreAndStudent(){
	$.ajax({
		url:"findScoreAndStu",
		type:"post",
		success:function(result){
			//showEval(result);
		}
	})
}

function showEval(result){
	var json = eval("("+result+")");
	var item;
	$.each(result,function(i,domEle){
		item = "<tr><td>" + domEle['id'] + "</td><td>"
				+ domEle['name'] + "</td><td>" 
				+ domEle['sex'] + "</td><td>"
				+ domEle['birth'] + "</td><td>"
				+ domEle['department'] + "</td><td>"
				+ domEle['address'] + "</td></tr>"; eval
}

function show(result){
	var item;
	$.each(result,function(i,domEle){
		item = "<tr><td>" + domEle['id'] + "</td><td>"
				+ domEle['name'] + "</td><td>" 
				+ domEle['sex'] + "</td><td>"
				+ domEle['birth'] + "</td><td>"
				+ domEle['department'] + "</td><td>"
				+ domEle['address'] + "</td></tr>";
		$("#showStudentTable").append(item);
	});
}
	

