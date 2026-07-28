import "./App.css";

function App() {

  const office = {
    name: "Tech Park Office",
    rent: 55000,
    address: "Chennai"
  };

  const offices = [
    {
      name: "Tech Park Office",
      rent: 55000,
      address: "Chennai"
    },
    {
      name: "Smart Hub",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "IT Tower",
      rent: 90000,
      address: "Hyderabad"
    },
    {
      name: "Business Center",
      rent: 45000,
      address: "Coimbatore"
    }
  ];

  return (

    <div>

      <h1>Office Space Rental App</h1>

      <img src="/office.jpg" alt="Office Space" />

      <h2>Single Office Details</h2>

      <div className="office">

        <h3>{office.name}</h3>

        <p>
          Rent :
          <span
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
          >
            {" "}₹{office.rent}
          </span>
        </p>

        <p>Address : {office.address}</p>

      </div>

      <h2>All Office Spaces</h2>

      {
        offices.map((item, index) => (

          <div className="office" key={index}>

            <h3>{item.name}</h3>

            <p>
              Rent :
              <span
                style={{
                  color: item.rent < 60000 ? "red" : "green"
                }}
              >
                {" "}₹{item.rent}
              </span>
            </p>

            <p>Address : {item.address}</p>

          </div>

        ))
      }

    </div>

  );

}

export default App;