


let arrayDatos = [];


const funcionLlenarDatos = ()=>{
    fetch('http://localhost:8084/usuario')
    .then(resp => resp.ok  ? Promise.resolve(resp)  : Promise.reject(new Error('Fallos la consulta')))
    .then(response => response.json())
    .then( data => {
        arrayDatos = data
        console.log(data)
        
    })
    .catch( error => console.log(error));


}

const thBody =document.getElementById('usuario');

const llenarDatos= ()=>{

    thBody.innerHTML=''
    let elemento = document.createDocumentFragment();

    for (const users of arrayDatos) {
        let divPrueba =document.createElement('tr');
        
        divPrueba.innerHTML =`
        
        <tr>
        <td>${users.id}</td>
        <td>${users.name}</td>
        <td>${users.telefono}</td>
        <td>${users.direccion}</td>
        <td>${users.correo}</td>
        <td>${users.estado}</td>
        <td>${users.password}</td>
        </tr>
        `;
        elemento.append(divPrueba)

    }

    thBody.append(elemento);

}




const btn = document.getElementById('btn-obtener');

btn.addEventListener('click',()=>
    {
        llenarDatos();
    }
);



funcionLlenarDatos();




