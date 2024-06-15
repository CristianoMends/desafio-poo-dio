package br.com.dio.desafio.exception;

public class AppException extends Exception{
    String message;

    public AppException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
