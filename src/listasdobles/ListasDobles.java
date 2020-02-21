
package listasdobles;

public class ListasDobles {

    public static void main(String[] args) throws Exception {
        
        //Creo la lista doble
        OperacionesListaDoble<Integer> listaDoble = new OperacionesListaDoble<>();
        
        //Add los datos a la lista
        listaDoble.add(1);
        listaDoble.add(3);
        listaDoble.add(4);
        listaDoble.add(8);
        listaDoble.add(5);
        listaDoble.add(2);
        
        //Muestro los datos de la lista
        System.out.println("Lista doble: "+listaDoble.showData());
        
        // 1. Determinar si un dato ingresado por el usuario existe en la lista.
        System.out.println("Existe el dato en la lista: "+listaDoble.searchData(0));
        
        // 2. Insertar nuevos nodos ordenados de mayor a menor e impedir datos duplicados (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
        OperacionesListaDoble<Integer> newListaDoble = new OperacionesListaDoble<>();
        newListaDoble.addOrdered(1);
        newListaDoble.addOrdered(3);
        newListaDoble.addOrdered(4);
        newListaDoble.addOrdered(8);
        newListaDoble.addOrdered(5);
        newListaDoble.addOrdered(2);
        System.out.println("Nueva lista doble ordenada: "+newListaDoble.showData());
        
        // 3. Eliminar un nodo con un dato específico ingresado por el usuario.
        newListaDoble.delete(8);
        System.out.println("Nueva lista doble ordenada con dato eliminado: "+newListaDoble.showData());
        
        // 4. Insertar nuevos nodos después de un dato especificado por el usuario (si no se encuentra el dato, lanzar excepción).
        newListaDoble.insetarNuevoNodo(5, 0);
        System.out.println("Nueva lista doble ordenada con nuevo dato: "+newListaDoble.showData());
        
        //Ingresar Estudiantes a la lista doble
        OperacionesListaDobleEstudiante studentList = new OperacionesListaDobleEstudiante();
        studentList.addEstudiantesOrdenado("43888555","Esperanza","Laureles",4.9);
        studentList.addEstudiantesOrdenado("71666888","Gabriel","Belen",3.2);
        studentList.addEstudiantesOrdenado("43545646","Sandra","Bello",3.0);
        studentList.addEstudiantesOrdenado("35435132","Matias","Itagui",4.0);
        studentList.addEstudiantesOrdenado("31351351","Marta","Poblado",5.0);
        studentList.addEstudiantesOrdenado("31354151","Rosa","Laureles",1.0);
        studentList.addEstudiantesOrdenado("3531352","Paula","Belen",3.5);
        studentList.addEstudiantesOrdenado("31321212","Camilo","Bello",2.5);
        
        
        //Mostrar la lista de los estudiantes
        System.out.println("Lista de estudiantes: \n"+studentList.showData());
        
        //Permitir buscar un estudiante por su código y mostrar todos sus datos, si no se encuentra el estudiante, lanzar excepción.
        System.out.println("Estudiante buscado: "+studentList.buscarEstudiante("35435132")+"\n");
        
        //Mostrar el nombre de todos los estudiantes que pertenecen a un mismo barrio ingresado por el usuario, sino existe el barrio, lanzar excepción.
        System.out.println("Estudiantes filtrados por barrio: \n" + studentList.filtrarPorBarrio("Belen"));
        
        //Crear una nueva lista doble con los estudiantes que han aprobado la materia.
        OperacionesListaDobleEstudiante listaAprobados = new OperacionesListaDobleEstudiante();
        listaAprobados.AddListaAprobados("43888555","Esperanza","Laureles",4.9);
        listaAprobados.AddListaAprobados("71666888","Gabriel","Belen",3.2);
        listaAprobados.AddListaAprobados("43545646","Sandra","Bello",3.0);
        listaAprobados.AddListaAprobados("35435132","Matias","Itagui",4.0);
        listaAprobados.AddListaAprobados("31351351","Marta","Poblado",5.0);
        listaAprobados.AddListaAprobados("31354151","Rosa","Laureles",1.0);
        listaAprobados.AddListaAprobados("3531352","Paula","Belen",3.5);
        listaAprobados.AddListaAprobados("31321212","Camilo","Bello",2.5);
        
        System.out.println("Lista de estudiantes aprobados: \n"+listaAprobados.showData());
        
        //Crear una nueva lista doble con los estudiantes que han reprobado la materia.
        OperacionesListaDobleEstudiante listaReprobados = new OperacionesListaDobleEstudiante();
        listaReprobados.AddListaReprobados("43888555","Esperanza","Laureles",4.9);
        listaReprobados.AddListaReprobados("71666888","Gabriel","Belen",3.2);
        listaReprobados.AddListaReprobados("43545646","Sandra","Bello",3.0);
        listaReprobados.AddListaReprobados("35435132","Matias","Itagui",4.0);
        listaReprobados.AddListaReprobados("31351351","Marta","Poblado",5.0);
        listaReprobados.AddListaReprobados("31354151","Rosa","Laureles",1.0);
        listaReprobados.AddListaReprobados("3531352","Paula","Belen",3.5);
        listaReprobados.AddListaReprobados("31321212","Camilo","Bello",2.5);
        
        System.out.println("Lista de estudiantes reprobados: \n"+listaReprobados.showData());
    }
    
}
