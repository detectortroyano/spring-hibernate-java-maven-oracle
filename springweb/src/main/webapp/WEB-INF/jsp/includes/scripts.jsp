<%@ include file="/WEB-INF/jsp/includes/taglibs.jsp" %>

<c:if test="${!jsonUiInRequest}">	 
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/ui/jquery-ui-1.10.3.min.js"></script>
    
	<!-- BOOTSTRAP -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.min.js"></script>    
    
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery.validate.min.js"></script>

	<script type="text/javascript" src="${pageContext.request.contextPath}/js/public.js"></script>

	<c:set var="jsonUiInRequest" scope="request" value="true"/>
</c:if>
