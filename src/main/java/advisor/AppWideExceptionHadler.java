package advisor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import util.ResponceUtil;

@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHadler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public ResponceUtil exceptionHandler(Exception e) {
        return new ResponceUtil(500, e.getMessage(), null);
    }
}
