public class Pikacu{
    private String sexo;
    private int edad;
    private boolean fuerte;

    public Pikacu (String elSexo, int laEdad){
        sexo = elSexo;
        edad = laEdad;
        fuerte = true;
    }

    public String getSexo(){
        return sexo;
    }

    public int getEdad(){
        return edad;
    }

    public boolean getFuerte(){
        return fuerte;
    }

    public void setNombre(String sexoDelPikachu){
        sexo = sexoDelPikachu;
    }

    public void aumentarPrecio(int laEdad){
        edad = laEdad + edad;
    }

    public void cambiarViejo(){
        if(fuerte = true){
            fuerte = false;
        }
        else{
            fuerte = true;
        }           
    }

    public void imprimirEstado(){
        String esFuerte;
        if(fuerte == true){
             esFuerte = "No";  
            
        }
        else{
         esFuerte = "Si";
         
        }
        System.out.println("El sexo del Pikachu es :" +sexo+ "la edad del pikachu es " +edad+ "El pikachu es fuerte?"+fuerte);
    }

    public String devolverEstado(){
        String esFuerte;
         if(fuerte == true){
             esFuerte = "No";  
        }
        else{
         esFuerte = "Si";
        }
        return "El Pikachu es : " + sexo +  " la edad del Pikachu es : " + edad + "euros" +  "El pIkachu es fuerte?" + esFuerte;
    }
          
    
 
    
    
    
}