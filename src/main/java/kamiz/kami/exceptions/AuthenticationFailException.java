package kamiz.kami.exceptions;

public class AuthenticationFailException extends IllegalArgumentException{
    public AuthenticationFailException(String msg)  {
        super(msg);
    }
}