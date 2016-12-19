<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8"> 
</head>
<body>
	home...
	
	path: <%=path %><br>
	basePath: <%=basePath %>
				<div align="center">
		<div>
			<c:url var="englishLocaleUrl" value="/">
				<c:param name="locale" value="en" />
			</c:url>
			<c:url var="spanishLocaleUrl" value="/">
				<c:param name="locale" value="es" />
			</c:url>
			<c:url var="chiniseLocaleUrl" value="/">
				<c:param name="locale" value="cn"/>
			</c:url>
			<a href="<c:out value="${chiniseLocaleUrl}"/>"> 
				<fmt:message key="locale.chinese"/>
			</a>
			<a href='<c:out value="${englishLocaleUrl}"/>'>
				<fmt:message key="locale.english" />
			</a> 
			<a href='<c:out value="${spanishLocaleUrl}"/>'>
				<fmt:message key="locale.spanish" />
			</a>
			
		</div>
		<div></div>
		<div>
			<h2><fmt:message key="home.welcome" /></h2>
		</div>
		
	</div>
	<form action="doLogin" method="post">

		<input type="text" name="username" value="test@xxx.com">
		<input type="text" name="password" value="test">
		<input type="submit" value="submit">
	</form>
</body>
</html>