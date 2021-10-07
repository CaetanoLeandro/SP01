package trycatch;

public class ParcelaNaoAprovadaException extends RuntimeException{

    public ParcelaNaoAprovadaException(String error){
        super(error);

    }
}
