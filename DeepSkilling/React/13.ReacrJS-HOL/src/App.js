import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

  const showBook = true;
  const showBlog = true;
  const showCourse = false;

  // if...else
  let courseComponent;

  if (showCourse) {
    courseComponent = <CourseDetails />;
  } else {
    courseComponent = <h3>Course Details Hidden</h3>;
  }

  return (

    <div style={{ margin: "20px" }}>

      <h1>Blogger App</h1>

      {/* Logical AND */}

      {showBook && <BookDetails />}

      <hr />

      {/* Ternary Operator */}

      {
        showBlog
          ?
          <BlogDetails />
          :
          <h3>Blog Details Hidden</h3>
      }

      <hr />

      {/* if...else */}

      {courseComponent}

    </div>

  );

}

export default App;