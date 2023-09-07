package ru.quazar.file_cabinet.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-02-15 20:36:48 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Post post;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private Long userId;
    @Column(columnDefinition = "text", nullable = false)
    private String message;
    @Column(updatable = false)
    private LocalDateTime createdDate;

    public Comment() {
    }

    @PrePersist
    protected void onCreate()
    {
        this.createdDate = LocalDateTime.now();
    }
}
