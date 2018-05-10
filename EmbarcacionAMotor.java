public class EmbarcacionAMotor extends Barco {
    private int cv;
    
    public EmbarcacionAMotor(String matricula, Cliente propietario, double eslora, String anoFabricacion, int cv) {
        super(matricula, propietario, eslora, anoFabricacion);
        this.cv = cv;
    }
    
    public int getPotenciaMotor() {
        return cv;
    }
    
    public int getBernua() {
        return 0;
    }
    
    public String toString(){
    String aDevolver = super.toString();
    aDevolver += "\rCV :" + cv; 
    return aDevolver;
    }
}