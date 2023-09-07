package ru.quazar.file_cabinet.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-02-15 20:36:48 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Data
@AllArgsConstructor
public class JWTTokenSuccessResponse {
   private boolean success;
   private String token;
}
