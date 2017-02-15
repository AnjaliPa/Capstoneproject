<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>JobRecruitmentSystem</title>
</head>
<body>
<form action="./processJobSeekerRegistrationRequest" method="POST" commandName="jobseeker">

<table width="100%" height="20%" border="0px">
		
				<TR>
					<td width="100%"  bgcolor="#99CCFF"  align="left" width="13%" height="31" ><span style= " font-size:52px">Registration Form</span></Td>
				</TR>
				
					</table>

			<table width="100%" height="80%" border="0px">
			
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
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">First Name</font></Td>
						<TD align="left" width="54%" height="31"><input type="text" name="firstName" value="" style="border: 1px solid #1E3755;width: 150px;"/>
						</TD>
					</TR>
				
				
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Last Name</font></Td>
						<TD align="left" width="54%" height="31"><input type="text" name="lastName" value="" style="border: 1px solid #1E3755;width: 150px;"/>
						</TD>
					</TR>
					
					
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Email ID</font></Td>
						<TD align="left" width="54%" height="31"><input type="text" name="email" value="" style="border: 1px solid #1E3755;width: 150px;"/>
						</TD>
					</TR>
					
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Password</font></Td>
						<TD align="left" width="54%" height="31"><input type="password" name = "password" value="" style="border: 1px solid #1E3755;width: 150px;"/>
						</TD>
					</TR>
				
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
					<tr>	<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><a href="login.jsp">Sign In</a>
</Td>
						<TD align="left" width="54%" height="31">
						</TD>
					</TR>
				
			</table>
		</form>	
</body>
</html>
