package listasdobles;

public class OperacionesListaDobleEstudiante {

    private StudentNode head;
    private StudentNode tail;

    public OperacionesListaDobleEstudiante() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Estudiante d) throws Exception {

        if (isEmpty()) {
            head = tail = new StudentNode(d);
        } else {
            if(searchData(d.getCedula())){
                throw new Exception("EL ESTUDIANTE QUE DESEA INGRESAR YA EXISTE!");
            }else{
                head = new StudentNode(d, null, head);
                head.getNextNode().setPreviousNode(head);
            }         
        }
    }

    public void addLast(String cc, String nom, String barrio, double nota) throws Exception {
        Estudiante d = new Estudiante(cc, nom, barrio, nota);
        if (isEmpty()) {
            head = tail = new StudentNode(d);
        } else {
            if(searchData(d.getCedula())){
                throw new Exception("EL ESTUDIANTE QUE DESEA INGRESAR YA EXISTE!");
            }else{
            tail = new StudentNode(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
            }
        }
    }

    public boolean searchData(String cc) {
        StudentNode current = this.head;
        while (current != null) {
            if (current.getStudent().getCedula() == cc) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    public void addEstudiantesOrdenado(String cc, String nom, String barrio, double nota) throws Exception {
        Estudiante d = new Estudiante(cc, nom, barrio, nota);
        if (isEmpty() || d.getNota() >= 3) {
            add(d);
            return;
        }
        if (searchData(d.getCedula())) {
            throw new Exception("EL ESTUDIANTE QUE DESEA INGRESAR YA EXISTE!");
        }
        if (d.getNota() < 3) {
            addLast(cc, nom, barrio, nota);
            return;
        }
    }

    public String showData() {
        String data = "";
        StudentNode current = this.head;
        while (current != null) {
            data += current.getStudent().getCedula() + " - " + current.getStudent().getNombre() + " - " + current.getStudent().getBarrio() + " - " + current.getStudent().getNota() + "\n";
            current = current.getNextNode();
        }
        return data;
    }

    public String buscarEstudiante(String cc) throws Exception {
        if(isEmpty()){
            throw new Exception("LA LISTA ESTÁ VACIA!");
        }else{
            StudentNode current = this.head;
        while (current != null) {
            if (current.getStudent().getCedula() == cc) {
                return current.getStudent().getCedula() + " - " + current.getStudent().getNombre() + " - " + current.getStudent().getBarrio() + " - " + current.getStudent().getNota();
            }
            current = current.getNextNode();
        }
        return "EL ESTUDIANTE QUE ESTA BUSCANDO NO EXISTE!";
        } 
    }
    
    public String filtrarPorBarrio(String barrio) throws Exception{
        if(isEmpty()){
            throw new Exception("LA LISTA ESTÁ VACIA!");
        }else{
            String chicosDelBarrio = "";
            boolean encontro = false;
            StudentNode current = this.head;
            while (current != null) {
                if (current.getStudent().getBarrio()== barrio) {
                    chicosDelBarrio += current.getStudent().getCedula() + " - " + current.getStudent().getNombre() + " - " + current.getStudent().getBarrio() + " - " + current.getStudent().getNota()+"\n";
                    encontro = true;
                }
                current = current.getNextNode();
            }
            if(!encontro){
                return("EL BARRIO INGRESADO NO EXISTE");
            }else{
                return chicosDelBarrio;
            }           
        } 
    }
    
     public void AddListaAprobados(String cc, String nom, String barrio, double nota) throws Exception {
        Estudiante d = new Estudiante(cc, nom, barrio, nota);
        if (d.getNota() >= 3) {
            add(d);
        }
    }
     
     public void AddListaReprobados(String cc, String nom, String barrio, double nota) throws Exception {
        Estudiante d = new Estudiante(cc, nom, barrio, nota);
        if (d.getNota() < 3) {
            add(d);
        }
    }
}
