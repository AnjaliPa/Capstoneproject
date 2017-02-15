<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Login Information</title>
	<style>
		.error {
		    font-size: 0.8em;
			color: #ff0000;
		}
	</style>
</head>
<body>


<form:form action="./processLoginRequest" method="POST" commandName="jobseeker">
  <table>
  	<tr>
  	<td>user id : <input type = "text" name="email" value="" style="border: 1px solid #1E3755;width: 150px;"/></td>
            <form:errors path="email" cssClass="error"/>
       </td>
    </tr>
   <tr>
  	<td>password : <input type = "text" name="password" value="" style="border: 1px solid #1E3755;width: 150px;"/></td>
            <form:errors path="password" cssClass="error"/>
       </td>
    </tr>
	<tr>
    <td><input type='submit' value='Submit'/></td>
    </tr>
    <h2>
	${errors}
</h2>
    </table>
  </form:form>
 
</body>
</html>


<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>

</head>
<form action="./processLoginRequest" method="POST" commandName="jobseeker">
<body>

<table width="100%" height="50%" border="0px">
		
				<TR>
					<td width="100%"  bgcolor="#99CCFF"  align="left" width="13%" height="31" ><span style= " font-size:52px">Login Page</span></Td>
				</TR>
				
	<table width="100%" height="50%" border="0px">
			
			<TR>
						<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" ></span></font><font color="#333333" style="font:bolder;"></font></Td>
						<TD align="left" width="54%" height="300">
						</TD>
				</TR>
					

				<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">User ID</font></Td>
						<TD align="left" width="54%" height="31"><input type = "text" name="userid" value="" style="border: 1px solid #1E3755;width: 150px;"/>
						</TD>
					</TR>
				<tr>
				<td height="11">
				</td>
				</tr>
				
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31"><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Password</font></Td>
						<TD align="left" width="54%" height="31"><input type="password" name="password" value=""  style="border: 1px solid #1E3755;width: 150px;" /></TD>
					</TR>
				<TR>
				
			<TR>
						<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" ></span></font><font color="#333333" style="font:bolder;"></font></Td>
						<TD align="left" width="54%" height="30">
						</TD>
				</TR>
				
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><input type='submit' value='Submit'/></Td>
						<TD align="left" width="54%" height="31">
						</TD>
					</TR>
					<tr><td> <font size="3" color="red">${errorMsg}</font></td></tr>
					<TR>
						<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" ></span></font><font color="#333333" style="font:bolder;"></font></Td>
						</TD>
				</TR>
				
			</table>
			
		 --%>	
</body>
</form>
</html>