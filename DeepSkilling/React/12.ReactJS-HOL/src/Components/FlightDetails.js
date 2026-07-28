function FlightDetails() {

    const flights = [
        {
            id: 101,
            airline: "IndiGo",
            from: "Chennai",
            to: "Delhi",
            fare: "₹5500"
        },
        {
            id: 102,
            airline: "Air India",
            from: "Bangalore",
            to: "Mumbai",
            fare: "₹4800"
        },
        {
            id: 103,
            airline: "SpiceJet",
            from: "Hyderabad",
            to: "Kolkata",
            fare: "₹6200"
        }
    ];

    return (
        <div>
            <h2>Flight Details</h2>

            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Airline</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Fare</th>
                    </tr>
                </thead>

                <tbody>
                    {flights.map((flight) => (
                        <tr key={flight.id}>
                            <td>{flight.id}</td>
                            <td>{flight.airline}</td>
                            <td>{flight.from}</td>
                            <td>{flight.to}</td>
                            <td>{flight.fare}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default FlightDetails;