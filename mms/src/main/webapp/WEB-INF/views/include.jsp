<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib  prefix="s" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html; charset=utf-8"%>
<%
// path ---> /mms
String path = request.getContextPath();
// basePath ---> http://localhost:7777/mms/
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<script src="<%=path %>/resources/plug-in/jquery/jquery-3.1.1.min.js" ></script>
<link rel="stylesheet" href="<%=path %>/resources/plug-in/bootstrap/css/bootstrap.min.css">
<script src="<%=path %>/resources/plug-in/bootstrap/js/bootstrap.min.js" ></script>


