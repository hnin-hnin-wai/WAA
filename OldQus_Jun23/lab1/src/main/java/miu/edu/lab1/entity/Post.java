package miu.edu.lab1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String content;
    String author;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="post_id")
    List<Comment> comments;
    public Post(long id,String title,String content,String author,List<Comment>  comments){
        this.id=id;
        this.title=title;
        this.content=content;
        this.author=author;
        this.comments=comments;
    }

}
