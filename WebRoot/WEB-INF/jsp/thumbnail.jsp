<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>操作结果</title>
    

  </head>
  
  <body>
    <h4>图片信息</h4>
    <hr />
    <table>
        <tr>
           <td width="50%" align="center"><img alt="" src="${pageContext.request.contextPath}${imageURL}" width="500" /></td>
           <td width="50%" align="center"><img alt="" src="${pageContext.request.contextPath}${thumImageUrl}"  /></td>
        </tr>
    </table>
  </body>
</html>
