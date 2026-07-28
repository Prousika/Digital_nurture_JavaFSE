import { useState } from "react";

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");
    const [euro, setEuro] = useState("");

    const handleSubmit = () => {

        const result = rupees / 90;   // 1 Euro = ₹90
        setEuro(result.toFixed(2));

    };

    return (

        <div>

            <h2>Currency Convertor</h2>

            <input
                type="number"
                placeholder="Enter Amount in Rupees"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

            <h3>Euro : € {euro}</h3>

        </div>

    );

}

export default CurrencyConvertor;