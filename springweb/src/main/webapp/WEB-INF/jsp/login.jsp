<%@ include file="/WEB-INF/jsp/includes/taglibs.jsp" %>
<commons:headerPublic id="login" />

<!-- Main -->
<div class="container-fluid">
    <div class="row">
    				<div class="col-sm-4"></div>
					<div class="col-sm-4">
					<div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <i class="glyphicon glyphicon-lock pull-right"></i>
                                <h4>Iniciar Session</h4>
                            </div>
                        </div>
                        <div class="panel-body">
		            	<c:if test="${error == true}">
							<b class="error">Usuario o contrase&ntildea Invalidos.</b>
						</c:if>                        
                            <form id="loginForm" name="loginForm" method="post" action="<c:url value='j_spring_security_check'/>" class="form form-vertical">
                                <div class="form-group">
                                    <label>Usuario</label>
                                    <div class="controls">
                                        <input type="text" name="j_username" id="j_username" class="form-control" placeholder="Usuario">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label>Contrase&ntildea</label>
                                    <div class="controls">
                                        <input type="text" name="j_password" id="j_password" class="form-control" placeholder="Contraseña">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label></label>
                                    <div class="controls">
                                        <button type="submit" class="btn btn-default">
                                            Aceptar
                                        </button>
                                    </div>
                                </div>
                            </form>
	                <a href="${pageContext.request.contextPath}/recoverPassword">¿Olvido su contrase&ntildea?</a>	                                   
		            <script type="text/javascript">
		                $(document).ready(
		                    function() {
		                        $("#loginForm #j_username").focus();
		                    }
		                );
		            </script>                            
                        </div>
                        <!--/panel content-->
                    </div>
                    </div>
    </div>
</div>
<!-- /Main -->                    

<commons:footer />