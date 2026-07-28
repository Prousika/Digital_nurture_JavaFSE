import FlightDetails from "./FlightDetails";

function UserPage() {

    return (
        <div>
            <h1>Welcome User</h1>

            <p>You can book flight tickets.</p>

            <FlightDetails />

            <br />

            <button>Book Ticket</button>

        </div>
    );

}

export default UserPage;