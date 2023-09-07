package ru.quazar.file_cabinet.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-02-15 20:36:48 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ImageNotFoundException extends RuntimeException {
    public ImageNotFoundException(String msg) {
        super(msg);
    }
}
