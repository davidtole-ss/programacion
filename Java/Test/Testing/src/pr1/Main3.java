package pr1;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        /*Scanner datos = new Scanner(System.in);
        ArrayList <Integer >lista=new ArrayList<Integer>();
        boolean seguir=true;
        while(seguir){
            int numero=datos.nextInt();
            if(numero!=-1){
                lista.add(numero);
            }else{
                seguir=false;
            }
        }
        System.out.println(lista);
        for(Integer n:lista){
            if(n%2==0){
                System.out.println(n);

            }
        }
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)%2!=0){
                lista.remove(i);
            }
        }
    */
        ArrayList <Empleado> empleados= new ArrayList<>();
        empleados.add(new Empleado(1,"Pepe",1500));
        empleados.add(new Empleado(2,"Manolo",1800));
        empleados.add(new Empleado(3,"Miguel",2500));
        double mayorSalario=0;
        double sumaSalario=0;
        for(int x=0;x<empleados.size();x++){
            if(empleados.get(x).getSalario()>mayorSalario){
                mayorSalario=empleados.get(x).getSalario();
            }
            sumaSalario+=empleados.get(x).getSalario();

        }
        System.out.println("Mayor salario: "+mayorSalario);
        double mediaSalario=sumaSalario/empleados.size();
        System.out.println("Media salario: "+mediaSalario);
        for(Empleado e:empleados){
            if(e.getSalario()>1500){
                e.mostrarInformacion();
            }


        }




    }
}
