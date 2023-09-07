package ru.quazar.file_cabinet.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-02-15 20:36:48 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Data
public class CommentDTO {

    private Long id;
    @NotEmpty
    private String message;
    private String username;

}
