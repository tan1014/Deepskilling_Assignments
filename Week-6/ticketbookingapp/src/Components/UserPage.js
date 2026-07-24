import React from "react";

function UserPage() {
    return (
        <div>

            <h2>Welcome User</h2>

            <h3>Flight Details</h3>

            <ul>
                <li>Flight : AI202</li>
                <li>From : Delhi</li>
                <li>To : Mumbai</li>
                <li>Price : ₹6500</li>
            </ul>

            <button>Book Ticket</button>

        </div>
    );
}

export default UserPage;