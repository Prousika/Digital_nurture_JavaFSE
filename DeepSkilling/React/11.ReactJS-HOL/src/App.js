import { useState } from "react";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Have a Nice Day.");
  }

  function handleIncrement() {
    increment();
    sayHello();
  }

  function sayWelcome(message) {
    alert(message);
  }

  function onPress() {
    alert("I was clicked");
  }

  return (

    <div style={{ margin: "20px" }}>

      <h1>Event Examples App</h1>

      <h2>Counter : {count}</h2>

      <button onClick={handleIncrement}>
        Increment
      </button>

      <button
        onClick={decrement}
        style={{ marginLeft: "10px" }}
      >
        Decrement
      </button>

      <br /><br />

      <button
        onClick={() => sayWelcome("Welcome")}
      >
        Say Welcome
      </button>

      <br /><br />

      <button
        onClick={onPress}
      >
        OnPress
      </button>

      <hr />

      <CurrencyConvertor />

    </div>

  );

}

export default App;