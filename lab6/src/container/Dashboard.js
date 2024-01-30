import React, { useState } from 'react'
import Posts from './post/Posts'
import PostDetails from '../postDetails/postDetails'

const Dashboard = () => {

  const[postsState,setPostsState]=useState(
    [
        {id:111,title:"Happiness",author:"John"},
        {id:112,title:"MIU",author:"Dean"},
        {id:113,title:"Enjoy Life",author:"Jasmine"}
    ]
)

    const [postState,setPostState]=useState(
      {
        title:""
      }
    )

    const addButtonClicked = () => {
      
      console.log("TXT:",postState);
      const updatedPosts =  postsState.map(post => {
        if (post.id === 111) {
           return { ...post, title: postState };
           
        }
        return post;
    });

    setPostsState(updatedPosts);   
  }

  const handleInputChange=(event)=>{
    setPostState(event.target.value);
   
  }
  //console.log(postState);

  const [selectedState, setSelectedState] = useState(0);
  
  const [selectTitle,setSelectTitle]=useState("");
  const [selectAuthor,setSelectAuthor]=useState("");

    const setSelected = (id) => {
     
      setSelectedState(id);
       postsState.map(p=>{
        if(p.id==id){
          setSelectTitle(p.title) ;
          setSelectAuthor(p.author);
        } 
      })   
  }

  //console.log("sOBJ:",selectPostObj);

  return (
    <div>
    <h1>Dashboard</h1>
    <div className="Post">
     <Posts posts={postsState} setSelected={setSelected}/>
    </div>
  
    <div>
      <input type="text"
          label={'title'}
          name={'title'}
          value={postState.title}
          onChange={handleInputChange}
      />
      <button  onClick={addButtonClicked}>Change Name</button>
    </div>
       
    
    <div className="PostDetail">
        <PostDetails
            id={selectedState}
            title={selectTitle}
            author={selectAuthor}
        />
    </div>
    </div>

 
  )
}

export default Dashboard