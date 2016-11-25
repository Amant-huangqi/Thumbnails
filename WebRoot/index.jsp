<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>上传文件</title>
</head>

<body>
	<div class="demo">
		<div>
			<h2>图片上传</h2>
		</div>
		<div>
			<form id="upload_form" enctype="multipart/form-data" method="post" action="${pageContext.request.contextPath}/thumbnail">
				<h2>请选择上传的文件</h2>
				<div>
					<input type="file" name="image" id="image" /> 
					<input type="submit" value="上传" />
				</div>
			</form>
		</div>
	</div>
</body>
</html>
