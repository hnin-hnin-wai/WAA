import React,{useRef} from 'react'
import axios from 'axios';
const NewPost = (props) => {

    const newPostForm = useRef();

    const addPost=()=>{
        const form = newPostForm.current;
        const data = {
            title: form['title'].value,
            author: form['author'].value,
            content: form['content'].value
        }

        axios.post('http://localhost:8080/posts', data)
            .then(response => {
                props.flagHandler();
            })
            .catch(err => {
                console.error(err);
            })
    }
    
  return (
    <div className="ContentDetail">
        <form ref={newPostForm}>
        <h1>New Post</h1>

        <label>title</label>
        <input type="text" label={'title'} name={'title'}></input>

        <label>author</label>
        <input type="text" label={'author'} name={'author'}></input>

        <label>content</label>
        <input type="text" label={'content'} name={'content'}></input>
        </form>
        <button onClick={addPost}> Add Post</button>
        
        
    </div>
  )
}

export default NewPost