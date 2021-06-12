const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");

sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");

});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});
const enviar = document.getElementById("registrar")

//funcion de registrar persona
enviar.addEventListener("click",(e)=>{
e.preventDefault()  
console.log('hola')
const nombre = document.getElementById("nombre")
const correo = document.getElementById("correo")
const password = document.getElementById("password")
const direccion = document.getElementById("direccion")
const telefono = document.getElementById("telefono")
const rol = document.getElementById("rol")
const genero = document.getElementById("genero")
const documento = document.getElementById("documento")


let formulario= JSON.stringify({
  "name": nombre.value,
  "telefono": telefono.value,
  "direccion":direccion.value,
  "correo": correo.value,
  "estado":  "activo",
  "password": password.value,
  "rol": {
      "id": rol.value
  },
  "genero": {
      "id": genero.value
  },
  "tipo_documento": {
      "id": documento.value
  }})

    fetch('http://localhost:8084/usuario/', {
      method: 'POST', 
      body: formulario, 
      headers:{
        'Content-Type': 'application/json'
      } 
    
    }).then(function(response) {
      return response.json();
    }).then(function(data) {
        nombre.value="";
        correo.value="";
        password.value="";
        direccion.value="";
        telefono.value="";
        rol.value=0;
        genero.value=0;
        documento.value=0;
        

        
        /*alerta de usuario creado*/
        console.log("usuario registado correctamente"+ data)
   
        
    })

})

const llenarGenero = () =>{

  fetch('http://localhost:8084/genero')
  .then(response => response.ok ? Promise.resolve(response) : Promise.reject(new Error('Fallo la consulta News')))
        .then(response => response.json())
        .then(data => {
      
          llenarFkHtml(document.getElementById("genero"),data);
        }).catch( console.log);
}


const llenarDocumento = () =>{

  fetch('http://localhost:8084/tipo_documento')
  .then(response => response.ok ? Promise.resolve(response) : Promise.reject(new Error('Fallo la consulta News')))
        .then(response => response.json())
        .then(data => {
      
          llenarFkHtml(document.getElementById("documento"),data);
        }).catch( console.log);
}

const llenarRoles = () =>{
   
  fetch('http://localhost:8084/rol')
  .then(response => response.ok ? Promise.resolve(response) : Promise.reject(new Error('Fallo la consulta News')))
        .then(response => response.json())
        .then(data => {
          console.log(data)
          llenarFkHtml(document.getElementById("rol"),data);
        }).catch( console.log);
}

function llenarFkHtml(id,datos) {
  
   for (const dato of datos) {
      const option = document.createElement(`OPTION`);
      option.setAttribute('value',`${dato.id}`)
      option.textContent=`${dato.descripcion}`;
      id.append(option);
    }
}


if (location.pathname== `/login/login.html`) {

  llenarGenero();
  llenarRoles();
  llenarDocumento();
  
}



///inicar sesion

const enviarlogin = document.getElementById("login");



enviarlogin.addEventListener("click",(e)=>{
  e.preventDefault()  
  
  
  
 // const nombre = document.getElementById("nombre")
  const correo = document.getElementById("correo")
  const password = document.getElementById("password")
  //const direccion = document.getElementById("direccion")
 // const telefono = document.getElementById("telefono")
 // const rol = document.getElementById("rol")
 // const genero = document.getElementById("genero")
 // const documento = document.getElementById("documento")

  
  let formulario= JSON.stringify({
    "correo": correo.value,
    "password": password.value
  });
    
  
      fetch('http://localhost:8084/login/', {
        method: 'POST', 
        body: formulario, 
        headers:{
          'Accept':'*/*',
          'Content-Type': 'application/json'
        } 
      
      })
      .then(function(response) {
        return response.json();
      }).then(function(data) {
        
    
    
  
         // nombre.value="";
          correo.value="";
          password.value="";
          direccion.value="";
          //telefono.value="";
         // rol.value=0;
         // genero.value=0;
         // documento.value=0;
          
  
          /*mas acciones a realizar*/
          /*alerta de usuario creado*/
          console.log("inicio de sesion crrecto"+ data)
     
          
      }).catch(console.log)
  
  })

