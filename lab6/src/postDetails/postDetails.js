import React, { useEffect } from 'react'
import Dashboard from '../container/Dashboard';
const postDetails = (props) => {


  return (
    <div className="ContentDetail">
        <h1>Post Details</h1>
        <div>
            <h3>{props.id}</h3>
            <h3>{props.title}</h3>
            <h3>{props.author}</h3>
        </div>
        <div className="Edit">
                <input
                    type="button"
                    value="Edit"
                    onClick={props.editPost} />
            
     </div>
     <div className="Delete">
                <input
                    type="button"
                    value="Delete"
                    onClick={props.deletePost} />
            
     </div>

    </div>
  )
}

export default postDetails