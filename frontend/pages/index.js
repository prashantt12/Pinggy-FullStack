import { useState, useEffect } from 'react';
import axios from 'axios';
import styles from '@/styles/Home.module.css';  // Import the CSS file

export default function Home() {

    const [title, setTitle] = useState("");
    const [body, setBody] = useState("");
    const [posts, setPosts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [authCode, setAuthCode] = useState("");

    const fetchPosts = async () => {
      setLoading(true);
      try {
          const res = await axios.get("http://localhost:8080/list", {
              withCredentials: true,
              headers: { PinggyAuthHeader: authCode }
            }
            );
          setPosts(res.data);
      } catch (error) {
          if (error.response) {
              console.error("Server responded with status:", error.response.status);
          } else if (error.request) {
              console.error("No response received:", error.request);
          } else {
              console.error("Axios configuration error:", error.message);
          }
      } finally {
          setLoading(false);
      }
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await axios.post(
                "http://localhost:8080/post",
                { title, body },
                { headers: { PinggyAuthHeader: authCode } }
            );

            // reset fields after pressing submit button
            setTitle("");
            setBody("");
            setAuthCode("");

            
            fetchPosts();
        } catch (error) {
            alert("Failed to submit Post.");
        }
    };

    useEffect(() => {
        fetchPosts();
    }, []);

    return (
      <div className={styles.container}>
          <h1 className={styles.heading}>Post Manager</h1>

          <form onSubmit={handleSubmit} className={styles.form}>
              <input 
                  placeholder="Title" 
                  value={title} 
                  onChange={(e) => setTitle(e.target.value)} 
                  className={styles.input}
              />
              <input 
                  placeholder="Body" 
                  value={body} 
                  onChange={(e) => setBody(e.target.value)} 
                  className={styles.input}
              />
              <input 
                  placeholder="Auth Code" 
                  value={authCode} 
                  onChange={(e) => setAuthCode(e.target.value)} 
                  className={styles.input}
              />
              <button type="submit" className={styles.button}>Submit</button>
          </form>

          <h2 className={styles.subheading}>Posts</h2>
          
          {loading ? (
              <p>Loading...</p>
          ) : (
              <div className={styles.postsContainer}>
                  {posts.length === 0 ? (
                      <p className={styles.noPosts}>No posts available</p>
                  ) : (
                      posts.map((post, index) => (
                          <div key={index} className={styles.postCard}>
                              <h3 className={styles.postTitle}>{post.title}</h3>
                              <p className={styles.postBody}>{post.body}</p>
                              <span className={styles.authCode}>
                                  Auth: {post.authHeader || "N/A"}
                              </span>
                          </div>
                      ))
                  )}
              </div>
          )}
      </div>
  );
}