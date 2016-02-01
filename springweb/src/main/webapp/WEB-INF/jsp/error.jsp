<%@ include file="/WEB-INF/jsp/includes/taglibs.jsp" %>
<commons:header id="login" />

	<div id="login-container">
	
		<c:if test="${ status eq 'Error' }">
			<div><strong>${mensaje}</strong></div>
		</c:if>	
		
	</div>
<commons:footer />