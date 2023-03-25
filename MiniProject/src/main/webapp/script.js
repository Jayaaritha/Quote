/**
 * 
 */

 function getQuotes()
 {
	 console.log("entered")
	 let cat=document.getElementById("quoteinput").value;
	 
	 let xhr= new XMLHttpRequest();
	 xhr.onreadystatechange = function() {
	 	if (this.readyState == 4 && this.status == 200) {
			let obj = JSON.parse(this.responseText);
			    
				let a =JSON.parse(obj.quotes);
				let arr = JSON.stringify(obj.quotes).split(",");
				console.log(a); 
				document.getElementById("quotediv").textContent=a[0].quote;
				document.getElementById("authordiv").textContent=a[0].author;
				document.getElementById("categorydiv").textContent=a[0].category;
				//console.log(arr[1]);
				//console.log("hiiii");
				//console.log(arr[2]);

		}
	}
	 xhr.open("POST","Quotes");
	 xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	 xhr.send("category="+cat);

 }