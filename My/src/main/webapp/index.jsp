<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./me.css"></link>
<style> 
@media (max-width:12000px)and (min-width:600px){
.container{
margin-top:100px;
width:600px;

}
}

#he{
  display:none;
}
.#download ,.container{
margin-top:50px;
background-color:
border-style:solid;
border-width:3px;
border-radius:10px;

}
#dec{
display:none;
}
 .container:hover{
 border-width:5px;
border-color:red;
border-shadow:rgba(0, 0, 0, 0.3);

}#formFileLg{
width:300px;
}
.bg-danger{
--bs-bg-opacity: .9;
ckground-color: rgba(var(--bs-success-rgb), var(--bs-bg-opacity));
}
</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
  <head></head>
<center>
<head><button onclick="swit('up')">Compress</button><button onclick="swit('dec')">Decompress</button></head>
<div  class="container bg-danger"  id="up">
<form action="hoff"  method="post" enctype="multipart/form-data">
 <div class="w-100 mx-0">
                        <h1>Compress File</h1>
                        <h2 class="text-left">Use this online file compressor to reduce the file size of your file documents. Make file smaller to send them via e-mail or upload them to the internet.</h2>
                    </div>
       <div class="row"><div><input class="form-control form-control-lg col" id="formFileLg" name="name"></input></div><div class="col"></div>
  </div>              
    <div class="row"><div><input class="form-control form-control-lg col" id="formFileLg" name="file" type="file">   </input></div><div class="col"><i class="bi bi-cloud-arrow-up-fill"></i></div>
  </div>
   <button name="sub" value="upload" type="submit" class="btn btn-primary mb-3">Submit File</button>
 
    <div class="col-auto">
     </div>
     </i>
</form>
</div>

<div class="container bg-danger" id="dec">
   <form action="dec" method="post">
   <div class="w-100 mx-0">
                        <h1>Decompress File</h1>
                        <h2 class="text-left">Use this online file compressor to reduce the file size of your file documents. Make file smaller to send them via e-mail or upload them to the internet.</h2>
                    </div>
                    
    <div class="row"><div><input class="form-control form-control-lg col" id="formFileLg" name="file" type="file">   </input></div><div class="col"><i class="bi bi-cloud-arrow-up-fill"></i></div>
  </div>
  
   <button name="sub" value="upload" type="submit" class="btn btn-primary mb-3">Submit File</button>
 
    <div class="col-auto">
     </div>
     </i> 
   </form>
</div>
 
<!--  
<div  class="container" id="download">
  <form action="hoff" method="post">
    <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Enter File Name</label>
    <input type="text" class="form-control" id="exampleInputPassword1">
  </div>
  <button name="download" type="submit" class="btn btn-primary"></i>download</button>
 </form>
  
</div>

<button onclick="he()">click </button>-->


<script>
 function swit(a)
    { 
	 if(a=='dec')
		 {
		 document.getElementById("dec").style.display="block";
		 document.getElementById("up").style.display="none";
		 
		 }
	 else{
		 document.getElementById("dec").style.display="none";
		 document.getElementById("up").style.display="block";
		 
		 
	 }
	 
     }
</script>
</body>

</html>