

public class Main {
    public static void main(String[] args) throws Exception {

       
        System.out.printf("Area do triangulo Equilatero %.2f \n",AreaTrianguloEquilatero(12));
        System.out.printf("Area do quadrado: %.2f \n", AreaQuadrado(5));
        System.out.printf("Area do Circulo: %.2f \n",AreaCirculo(5));
        System.out.printf("Area do lozango: %.2f \n",AreaLozango(2, 6));
        System.out.printf("Area do Paralelogramo: %.2f \n",AreaParalelogramo(8, 9));
        System.out.printf("Area do trapezio: %.2f \n",AreaTrapezio(4, 5, 8));


      
}

public static float AreaQuadrado(float lado){
    float area = (float) Math.pow(lado, 2);
    return area ;
}

public static float AreaCirculo( float raio){
    float pi = (float) 3.14;
    float area = (float) (Math.pow(raio, 2) * pi);
    return area ;
}

public static float AreaTrapezio( float base , float base2, float altura){
    float area =( base2 * base ) * altura / 2;
    return area ;
}

public static float AreaRetangulo( float base , float altura){
    float area = base * altura ;
    return area ;
}
public static float AreaLozango( float base , float base2){
    float area = (base*base2) / 2;
    return area ;
}

public static float AreaParalelogramo( float base , float altura){
    float area = base * altura ;
    return area ;
}

public static float AreaTrianguloEquilatero( float lado){

    float area = (float) ((lado * lado ) * Math.sqrt(3) / 4) ;
    return area ;
}

public static float AreaTriangulo( float base , float altura){
    float area = base * altura / 2;
    return area ;
}


}
