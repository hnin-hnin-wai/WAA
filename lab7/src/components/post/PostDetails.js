import React from 'react'
import { Fragment, useEffect, useState } from 'react';
import Comments from '../comment/Comments'
import axios from 'axios';

const PostDetails = (props) => {

  const [postDetail, setPostDetail] = useState({});

  useEffect(() => {
    axios
      .get("http://localhost:8080/posts/" + props.id)
      .then((response) => {
        setPostDetail(response.data);
        console.log("RESPONSE:", response.data);
      })
      .catch((err) => console.log(err.message));
  }, [props.id]);

  console.log("PostDTL:", postDetail);
  const space = <Fragment>&nbsp;&nbsp;</Fragment>;
  return (
    <div className="ContentDetail">
      <div>
        <h1>
          Post Details
        </h1>
        <h3>{props.id}</h3>
        <h3>{props.title}</h3>
        <h3>{props.author}</h3>

      </div>
      <div style={{ textAlign: "left" }}>
        {space} Comments <br />
        {postDetail.comments != null
          ? postDetail.comments.map((comment) => {
            console.log("<<comment>>");
            return <Comments comment={comment.name} key={comment.id} />;
          })
          : null}
      </div>
      <div>
        <input type="button" value="delete" onClick={() => props.deletePost(props.id)} />
      </div>

    </div>
  )
}

export default PostDetails