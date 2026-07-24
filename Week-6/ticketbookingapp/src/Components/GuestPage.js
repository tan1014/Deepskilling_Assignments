import React from "react";

function GuestPage() {
    return (
        <div>
            <h2>Welcome Guest</h2>

            <h3>Flight Details</h3>

            <ul>
                <li>Flight : AI202</li>
                <li>From : Delhi</li>
                <li>To : Mumbai</li>
                <li>Price : ₹6500</li>
            </ul>

            <p>Please Login to Book Tickets.</p>
        </div>
    );
}

export default GuestPage;