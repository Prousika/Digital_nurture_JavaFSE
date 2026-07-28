import { useState } from "react";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (

    <div style={{ margin: "20px" }}>

      <h1>Ticket Booking App</h1>

      {
        loggedIn
          ?
          <UserPage />
          :
          <GuestPage />
      }

      <br />

      {
        loggedIn
          ?
          <button onClick={() => setLoggedIn(false)}>
            Logout
          </button>
          :
          <button onClick={() => setLoggedIn(true)}>
            Login
          </button>
      }

    </div>

  );

}

export default App;