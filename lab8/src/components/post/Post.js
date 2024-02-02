import React,{useContext} from 'react'

import {SelectedPostIdContext} from "../post/PostContext"

const Post = (props) => {
  const selectPostIdContext = useContext(SelectedPostIdContext);

  return (
   /*  <div className="Content" onClick={props.setSelected}> */
   <div className="Content" onClick={selectPostIdContext}>
      <h3>{props.id}</h3>
      <h3>{props.title}</h3>
      <h3>{props.author}</h3>
    </div>
  )
}

export default Post