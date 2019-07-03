# ListaDeTareas
App que permite el ingreso de tareas y las coloca en una lista 

Se emplean los componentes EditText, el cual será el encargado de recibir un dato del tipo String para designar una tarea,
al llenar este campo y presionar enter la tarea será agregada a un componente ListView, el cual irá mostrando los valores 
almacenandolos en un ArrayList y un adapter que es el enlace que hay entre el ArrayList y el ListView, para ello se agrega 
una acción o evento de tecla presionada, que en este caso será la tecla enter, para por cada dato ingresado en el EditText, 
se agregará una nueva tarea al arreglo. En el arreglo ya definimos en la activity dos actividades llamadas Tarea1 y Tarea2.
