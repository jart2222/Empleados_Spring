function traer_clientes(){
    let url ="http://127.0.0.1:8080/api/empleados";
    let promise=fetch(url,{ 
                            method: 'GET',
                            headers: { 'Content-Type': 'application/json'}
                        })
    promise
    .then(function(response){
        return response.json()
    })
    .then(function(data){
        desplejar_get(data)
    } );
}

function desplejar_get(data){
    for (const i in data) {
        let idE= data[i].num_emp
        let nombreE= data[i].nombre
        let num_depto=data[i].num_depto
        crear_lista(idE,nombreE,num_depto);
      }    
}

function crear_lista(idE,nombreE,num_depto){
    let tarjetas=document.getElementById("tarjetas")
    tarjetas.innerHTML+=
    `                   <div class=" col-sm-12 col-md-12 col-lg-12">
                            <ul class="list-group">
                                <li class="list-group-item list-group-item-success" aria-disabled="true">Empleado con el num. ${idE}</li>
                                <li class="list-group-item list-group-item-danger">Nombre del Empleado: ${nombreE}</li>
                                <li class="list-group-item list-group-item-danger">Numero de departamento: ${num_depto}</li>
                                <li class="espacio">  </li>
                               
                            </ul> 
                        <div>  

                        
                        
                        `
    }