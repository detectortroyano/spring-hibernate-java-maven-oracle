<%@ include file="/WEB-INF/jsp/includes/taglibs.jsp" %>
<%@attribute name="id" required="false"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <title><fmt:message key="console.header.browser.title"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <jsp:include page="/WEB-INF/jsp/includes/scripts.jsp" />
        <jsp:include page="/WEB-INF/jsp/includes/css.jsp" />
    </head>
    <body>

        <input type="hidden" id="url" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}"/>
        <input type="hidden" id="languajeSmall" value="<fmt:message key="label.languaje.small"/>"/>
        <input type="hidden" id="role" value="${role}"/>
        
		<!-- header -->
		<div id="top-nav" class="navbar navbar-inverse navbar-static-top">
		    <div class="container-fluid">
		        <div class="navbar-header">
		            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		            </button>
		            <a class="navbar-brand" href="#">TARIFARIO</a>
		        </div>
		        <div class="navbar-collapse collapse">
		            <ul class="nav navbar-nav navbar-right">
		                <li class="dropdown">
		                    <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#"><i class="glyphicon glyphicon-user"></i> User <span class="caret"></span></a>
		                    <ul id="g-account-menu" class="dropdown-menu" role="menu">
		                        <li><a href="#">My Profile</a></li>
		                    </ul>
		                </li>
		                <li><a href="<c:url value="/j_spring_security_logout" />"><i class="glyphicon glyphicon-lock"></i>CERRAR SESSION</a></li>
		            </ul>
		        </div>
		    </div>
		    <!-- /container -->
		</div>
		<!-- /Header -->         