import React from 'react'

const Post = (props) => {
  return (
    <div className="Content" onClick={props.setSelected}>
      <h3>{props.id}</h3>
      <h3>{props.title}</h3>
      <h3>{props.author}</h3>
    </div>
  )
}

export default Post