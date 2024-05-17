public class ParametrosInvalidosException extends Exception{
    
    private String message;
    public ParametrosInvalidosException(String message){
        this.message = message;

    }
    
    public String getMessage(){
        return this.message;
    }


}
