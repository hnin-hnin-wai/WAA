package miu.edu.lab1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Post {
    long id;
    String title;
    String content;
    String author;

    public Post(long id,String title,String content,String author){
        this.id=id;
        this.title=title;
        this.content=content;
        this.author=author;
    }

}
