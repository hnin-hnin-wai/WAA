import React from 'react'
import Post from './Post'


const Posts = (props) => {


    const posts = props.posts.map(p => {
        return <Post
            title={p.title}
            author={p.author}
            id={p.id}
            key={p.id}
            setSelected={()=>props.setSelected(p.id)}
        />
    })
    return posts;


}

export default Posts