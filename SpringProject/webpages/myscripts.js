function colorChange() {
	document.getElementById("div2_1").style.background = "black";
}
function revertColor() {
	document.getElementById("div2_1").style.background = "blue";
}
function signUP() {
	document.getElementById("div2_21").style.display = "block";
	document.getElementById("div2_22").style.display = "none";
	document.getElementById("kiranVid").style.display = "none";
}
function recovery() {
	document.getElementById("div2_22").style.display = "block";
	document.getElementById("div2_21").style.display = "none";
	document.getElementById("kiranVid").style.display = "none";
}
function passValidate() {
	var password = document.getElementById("signupNewPassword").value;
	if (password.length < 8)
		// alert("Please enter password length atleast 8 ");
		document.getElementById("passwordSide").innerHTML = "Length should be atleast 8";
	else
		document.getElementById("passwordSide").style.display = "none";

}
function repassValidate() {

	var repassword = document.getElementById("signupNewPassword1").value;
	var password = document.getElementById("signupNewPassword").value;
	if (repassword != password) {
		// alert("Please enter password length atleast 8 ");
		document.getElementById("signupNewPassword1").value = null;
		document.getElementById("passwordSide1").innerHTML = "Password must match";

	} else
		document.getElementById("passwordSide1").style.display = "none";

}
function repassValidate1() {

	var repassword = document.getElementById("NewPassword1").value;
	var password = document.getElementById("repass").value;
	if (repassword != password) {
		// alert("Please enter password length atleast 8 ");
		document.getElementById("NewPassword1").value = null;
		document.getElementById("newpasswordSide2").innerHTML = "Password must match";
		return false;

	} else {
		document.getElementById("newpasswordSide2").style.display = "none";
		return true;
	}

}
// password check

function validatePassword() {
	var passwrd = document.getElementById("signupNewPassword").value;
	var decimal = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	var fullname = document.getElementById("signupName").value;
	var password = passwrd.toLowerCase();
	var name = fullname.toLowerCase();
	if (decimal.test(passwrd) == false) {
		// document.getElementById("signupNewPassword").value=null;
		document.getElementById("passwordSide").innerHTML = "password must have atleast 1 upper,lower case,digit and a special character and "
				+ "length must be atleast 8";

		// alert("password must have atleast 1 upper,lower case,digit and a
		// special character");
		return false;

	} else if (password.match(/[A-Za-z]+/).includes(name)) {
		// document.getElementById("passwordSide").innerHTML="password should
		// not contain your full name";
		document.getElementById("signupNewPassword").value = null;
		alert("password should not contain your full name");

		return false;

	}

	else {
		document.getElementById("passwordSide").style.display = "none";
		return true;
	}

}

function validatePassword1() {
	var passwrd = document.getElementById("repass").value;
	var decimal = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	// var fullname=document.getElementById("signupName").value;
	// var password=passwrd.toLowerCase();
	// var name=fullname.toLowerCase();
	if (decimal.test(passwrd) == false) {
		// document.getElementById("repass").value=null;
		document.getElementById("newpasswordSide").innerHTML = "password must have atleast 1 upper,lower case,digit and a special character"
				+ "and length must be atleast 8";
		// alert("password must have atleast 1 upper,lower case,digit and a
		// special character");

		return false;

	}
	// else if(password.match(/[A-Za-z]+/).includes(name)) {
	// //document.getElementById("passwordSide").innerHTML="password should not
	// contain your full name";
	// alert("password should not contain your full name");
	// return false;
	//							 
	//							
	// }

	else {
		document.getElementById("newpasswordSide").style.display = "none";
		return true;
	}

}

// function unamepasswordValidate()
// {
// var uname=document.getElementById("uName").value;
// var password=document.getElementById("password").value;
// if(uname==null&&password==null)
// {
// alert("please enter valid details");
// return false;
// }
// else if(uname==null||uname=="")
// {
// alert("please enter valid UserName");
// return false;
// }
// else if(password==null||password=="")
// {
// //response.redirect();
// alert("please enter valid password");
// return false;
// }
// else
// {
// console.log("vaild details are entered");
// }
// }

// function passwordValidate()
// {
// var password=document.getElementById("password").value;
// if(password==null||password=="")
// {
// alert("please enter valid password");
// }
// else
// {
// console.log("valid password is entered");
// }
// }

// function signupValidate()
// {
// var signupName=document.getElementById("signupName").value;
// var signupEmail=document.getElementById("signupEmail").value;
// var signupNewPassword=document.getElementById("signupNewPassword").value;
// var signupNewPassword1=document.getElementById("signupNewPassword1").value;
// var SexM=document.getElementById("SexM").value;
// var SexF=document.getElementById("SexF").value;
// var date=document.getElementById("date").value;
// var security=document.getElementById("security").value;
// var
// signupsecurityanswer=document.getElementById("signupsecurityanswer").value;
// if(signupName==null||signupEmail==null||signupNewPassword==null||signupNewPassword1==null||SexM==null||
// SexF==null||date==null||security==null||signupsecurityanswer==null||)
// {
// alert("Please enter all details");
// }
// }

function date1() {
	var chkdate = document.getElementById("date").value;

	var edate = chkdate.split("/");
	var spdate = new Date();
	var sdd = spdate.getDate();
	var smm = spdate.getMonth();
	var syyyy = spdate.getFullYear();
	var today = new Date(syyyy, smm, sdd).getTime();
	var e_date = new Date(edate[2], edate[1] - 1, edate[0]).getTime();
	if (e_date > today) {
		alert("Date is not valid");
		return false;
	}
}
// console.log(year);
function signupValidate() {
	var SexF = document.getElementById("SexF").value;
	var SexM = document.getElementById("SexM").value;
	if (SexF == null || SexM == null)
		alert("please choose male or female")
		// else
		// window.location="http://localhost:8081/ServletWorld1/index.html#";
}

var xmlHttp;
function ajaxCheck1() {
	xmlHttp = GetXmlHttpObject();
	var email = document.getElementById("signupEmail").value;
	// var
	// url="http://ec2-52-88-255-255.us-west-2.compute.amazonaws.com:8080/SpringProject/FirstServletAjax";
	// var url="http://localhost:8081/SpringProject/FirstServletAjax";
	var url = "FirstServletAjax";
	xmlHttp.open("POST", url, true);
	xmlHttp.setRequestHeader("Content-type",
			"application/x-www-form-urlencoded");
	xmlHttp.send("signupEmail=" + email);
	xmlHttp.onreadystatechange = ajaxServletResponse;
}
function ajaxServletResponse() {
	if (xmlHttp.readyState == 4) {
		if (xmlHttp.status == 200) {
			var response = xmlHttp.responseText;
			// var resParse=JSON.parse(response);
			if (response == "yes") {
				document.getElementById("signupEmail").value = null;
				alert("EmailId already used,please enter other EmailId");
			}
		} else
			document.getElementById("signupEmail").addEventListener("click",
					function(event) {
						event.preventDefault()
					});
	}
}

function GetXmlHttpObject() {
	var xmlHttp = null;
	try { // create xhttp object in following browser Firefox, Opera 8.0+,
		// Safari
		xmlHttp = new XMLHttpRequest();
	} catch (e) {// create xhttp object in Internet Explorer browser
		try {
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	return xmlHttp;
}

function emailSecurity() {
	xmlHttp = GetXmlHttpObject();
	var email = document.getElementById("recoveryName").value;
	// var
	// url="http://ec2-52-88-255-255.us-west-2.compute.amazonaws.com:8080/SpringProject/EmailQuestionAjax";
	// var url="http://localhost:8081/SpringProject/EmailQuestionAjax";
	var url = "EmailQuestionAjax";
	xmlHttp.open("POST", url, true);
	xmlHttp.setRequestHeader("Content-type",
			"application/x-www-form-urlencoded");
	xmlHttp.send("email=" + email);
	xmlHttp.onreadystatechange = ajaxServletResponse1;
}

function ajaxServletResponse1() {
	if (xmlHttp.readyState == 4) {
		if (xmlHttp.status == 200) {
			var response1 = xmlHttp.responseText;
			// var resParse=JSON.parse(response);
			if (response1 == "") {
				document.getElementById("recoveryName").value = null;
				alert("Please enter valid EmailId");
			} else
				document.getElementById("recoveryQuestion").value = response1;
		}
	}
}

function passwordCheck() {
	xmlHttp = GetXmlHttpObject();
	var email = document.getElementById("recoveryName").value;
	var answer = document.getElementById("recoverysecurityanswer").value;
	// var
	// url="http://ec2-52-88-255-255.us-west-2.compute.amazonaws.com:8080/SpringProject/SecurityAnswerAjax";
	// var url="http://localhost:8081/SpringProject/SecurityAnswerAjax";
	var url = "SecurityAnswerAjax";
	xmlHttp.open("POST", url, true);
	xmlHttp.setRequestHeader("Content-type",
			"application/x-www-form-urlencoded");
	xmlHttp.send("email=" + email + "&answer=" + answer);
	xmlHttp.onreadystatechange = ajaxPassCheckResponse;
}

function ajaxPassCheckResponse() {
	if (xmlHttp.readyState == 4) {
		if (xmlHttp.status == 200) {
			var response1 = xmlHttp.responseText;
			// var resParse=JSON.parse(response);
			if (response1 == "no") {
				document.getElementById("recoverysecurityanswer").value = null;
				alert("Please enter valid security answer");
			}
			// else
			// document.getElementById("recoveryQuestion").value=response1;
		}
	}
}

function loginValidate() {
	xmlHttp = GetXmlHttpObject();
	var email = document.getElementById("uName").value;
	var password = document.getElementById("password").value;
	// var
	// url="http://ec2-52-88-255-255.us-west-2.compute.amazonaws.com:8080/SpringProject/SecurityAnswerAjax";
	// var url="http://localhost:8081/SpringProject/SecurityAnswerAjax";
	var url = "LoginValidation";
	xmlHttp.open("POST", url, true);
	xmlHttp.setRequestHeader("Content-type",
			"application/x-www-form-urlencoded");
	xmlHttp.send("uname1=" + email + "&password1=" + password);
	xmlHttp.onreadystatechange = loginResponse;
}

function loginResponse() {
	if (xmlHttp.readyState == 4) {
		if (xmlHttp.status == 200) {
			var response1 = xmlHttp.responseText;
			// var resParse=JSON.parse(response);
			if (response1 == "yes") {
				window.location="welcome.html";
			} else{
				 document.getElementById("password").value = null;
				alert("Wrong credentials");
			}
			// document.getElementById("recoveryQuestion").value=response1;
		}
	}
}
