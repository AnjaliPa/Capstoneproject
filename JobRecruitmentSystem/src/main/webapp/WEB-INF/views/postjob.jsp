<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<title>Stylish Portfolio - Start Bootstrap Theme</title>

<!-- Bootstrap Core CSS -->
<link href="<c:url value="resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<c:url value="resources/css/stylish-portfolio.css"/>"
	rel="stylesheet">
<link href="<c:url value="resources/css/archana.css"/>" rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<c:url value="resources/font-awesome/css/font-awesome.min.css"/>"
	rel="stylesheet" type="text/css">
<link
	href="<c:url value="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"/>"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<form action="./processPostJobRequest" method="POST" commandName="postjob">
<body>		
	<!-- Header -->
	<header id="top" class="header">
		<div class ="topcorner">
			<a href="./gotoLoginProfile">
			<img class="profile-img" src="http://bbsimg.ngfiles.com/2/4415000/ngbbs420f87bbdc87d.gif" alt="HTML5 Icon">
			</a>
			<label class="profile-name">${jobseeker.firstName}</label>
		</form>
		</div>
			<div class="text-vertical-center">
            <h1>Post Job</h1>
            <br>
            <div class="loginmodal-container">
           			<!-- <TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Remote Work</font></Td>
						<TD align="left" width="54%" height="31"><select name="remotework">
																		  <option value="yes">Yes</option>
																		  <option value="no">No</option>
																		  </select>
						</TD>
					</TR>
					
					
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Visa Sponsorship</font></Td>
						<TD align="left" width="54%" height="31"><select name="visasponsorship">
																		   <option value="yes">Yes</option>
																		  <option value="no">No</option>
																		  </select>

						</TD>
					</TR>
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="20%" height="31" ><font color="red" face="PT Sans" size="6" >Preferences</font></Td>
						
						<TD align="left" width="14%" height="31">
						</TD>
					</TR>
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Skills</font></Td>
						<TD align="left" width="54%" height="31"><input type="text" name="skills" value="" style="border: 1px solid #1E3755;width: 150px;"/>
						</TD>
					</TR>
					
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><font color="red" face="Trebuchet MS" size="2"><span id="help" >*</span></font><font color="#333333" style="font:bolder;">Experience Type</font></Td>
						<TD align="left" width="54%" height="31"><select name="experiencetype">
																		  <option value="software">Software</option>
																		  <option value="design">Design</option>
																		  </select>
						</TD>
					</TR>
					
										
					<TR>
					<td width="33%">
					</td>
						<Td align="left" width="20%" height="31" ><font color="red" face="PT Sans" size="6"></font></Td>
						
						<TD align="left" width="14%" height="31">
						</TD>
					</TR>
					<td width="33%">
					</td>
						<Td align="left" width="13%" height="31" ><input type='submit' value='Submit'/></Td>
						<TD align="left" width="54%" height="31">
						</TD>
					</TR>
					
				
			</table>
			
 -->      			<!-- Section -->
      			 <section id="bio">
      			 	  <h3>Company Details</h3>
	      			 
						<p class="caption">Company Name<p>
						<input type="text" class="details" name="companyName" placeholder="CompanyName">
						<p class="caption">Your Role<p>
						<select name="userrole" class="details"> <option value="">Select</option>
											  <option value="NPUAlumni">NPU Alumni</option>
											  <option value="Employer">Employer</option>
											  <option value="Founder">Founder</option>
						</select>
						<p class="caption">Company Website<p>
						
						<input type="text" class="details" name="website" placeholder="Company Website">
												<p class="caption">Market<p>
						
						<input type="text" class="details" name="market" placeholder=" e.g. Software">
						<p class="caption">Company Size<p>
						<select name="companysize" class="details">
												  <option value="1-10">1-10</option>
												  <option value="11-50">11-50</option>
												  <option value="51-200">51-200</option>
												   <option value="201-500">201-500</option>
												  <option value="501-1000">501-1000</option>
												  <option value="1001-5000">1001-5000</option>
												  <option value="5000+">5000+</option>
						</select>
						      			 	  <h3>Job Details</h3>
						<p class="caption">Job Title<p>
						<input type="text" name="jobtitle"  class="details" >
						<p class="caption">Description</p>
						<textarea type="text" name="description" class="details"></textarea>
					  <p class="caption">Primary Role<p>
						<select name="primaryRole" class="details">

						  <option value="SoftwareEngineer">Software Engineer</option>
						  <option value="FrontEndDeveloper">Front-End Developer</option>
						  <option value="UI/UXDesigner">UI/UX Designer</option>
						  </select>      			 	  

					<p class="caption">Job Type<p>
						<select name="jobType" class="details">
						  <option value="FullTimeEmployee">Full Time Employee</option>
						  <option value="ContractBased">ContractBased</option>
						  <option value="Intern">Intern</option>
						 </select>	
						 <p class="caption">Job Location<p>
						<input type="text" name="joblocation" class="details" placeholder="San Francisco">
						<p class="caption">Job Description</p>
						<textarea type="text" name="jobdescription" class="details"></textarea>		
						<input type="submit" class="savebtn" name="sign" class="login loginmodal-submit" value="Save">
									
      			 </section>
      			 
      			</div>		
		</div>
	</header>
	

	<!-- jQuery -->
	<script src="resources/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	$(function(){
	  $('#profiletabs ul li a').on('click', function(e){
	    e.preventDefault();
	    var newcontent = $(this).attr('href');
	    
	    $('#profiletabs ul li a').removeClass('sel');
	    $(this).addClass('sel');
	    
	    $('#content section').each(function(){
	      if(!$(this).hasClass('hidden')) { $(this).addClass('hidden'); }
	    });
	    
	    $(newcontent).removeClass('hidden');
	  });
	});
</script>




			
</body>
</form>
</html>
