var url ='http://localhost:8084/usuario';
var data ={username:'usuario'};

fetch('http://localhost:8084/usuario', {
  method: 'POST', // or 'PUT'
  body: JSON.stringify(data), // data can be `string` or {object}!
  headers:{
    'Content-Type': 'application/json'
  } 
 
})

.then(res => res.json())
.catch(function(response){
  if(response.ok){
    return response.JSON()
  }else{
    throw "error al enviar los datos"
  }

})
.then(function(json){
  console.log(json);
})
.catch(function(err){
  console.log(err);
})


