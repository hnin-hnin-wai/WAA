import axios from 'axios';
import React, { useState, useEffect } from 'react'
import Posts from '../components/post/Posts';
import PostDetails from '../components/post/PostDetails';
import NewPost from '../components/post/NewPost';
import { ThemeColorContext } from "../store/ThemeColor";
const Dashboard = () => {

  const [posts, setPosts] = useState([]);
  const [flag, setFlag] = useState(true);
  const [themeColorState, setThemeColorState] = useState({ color: "red" });


  const fetchPosts = () => {
    axios.get('http://localhost:8080/posts')
      .then(response => {
        console.log("Resp data:", response.data);
        setPosts(response.data)

      })
      .catch(err => console.log(err.message))
  }

  console.log("setPost:", posts);

  useEffect(() => {
    fetchPosts();
  }, [flag])

  const [selectedId, setSelectedId] = useState(0);
  const [selectedTitle, setSelectedTitle] = useState("");
  const [selectedAuthor, setSelectedAuthor] = useState("");

  const setSelectedPost = (id) => {
    console.log("Post obj:", id);
    setSelectedId(id);
    posts.map(p => {
      if (p.id === id) {
        setSelectedTitle(p.title);
        setSelectedAuthor(p.author);
      }
    })

  }

  const deletePost = (id) => {
    axios.delete('http://localhost:8080/posts/' + id).then(response => {
      fetchPosts();
    }).catch(err => console.log(err.message));
    clear();
  }

  const clear = () => {
    setSelectedId("");
    setSelectedTitle("");
    setSelectedAuthor("");
  }

  const flagHandler = () => {
    setFlag(!flag);
  }

  return (
    <ThemeColorContext.Provider value={themeColorState}>
      <div>
        <h1>Dashboard</h1>
        <div className="Post">
          <Posts posts={posts} setSelected={setSelectedPost} />
        </div>

        <div>
          <PostDetails
            id={selectedId}
            title={selectedTitle}
            author={selectedAuthor}
            deletePost={deletePost}
          />
        </div>

        <div>
          <NewPost flagHandler={flagHandler} />
        </div>

      </div>
    </ThemeColorContext.Provider>
  )
}

export default Dashboard