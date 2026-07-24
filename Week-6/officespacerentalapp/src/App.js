import React from "react";

function App() {

  const officeSpaces = [
    {
      Name: "Sky Tower",
      Rent: 55000,
      Address: "Bangalore"
    },
    {
      Name: "Tech Park",
      Rent: 75000,
      Address: "Hyderabad"
    },
    {
      Name: "Business Hub",
      Rent: 45000,
      Address: "Pune"
    }
  ];

  const image =
      "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800";

  return (
      <div style={{ padding: "20px" }}>

        <h1>Office Space Rental App</h1>

        <img
            src={image}
            alt="Office Space"
            width="500"
        />

        <hr />

        {officeSpaces.map((office, index) => (

            <div key={index}>

              <h2>{office.Name}</h2>

              <p>
                <strong>Address:</strong> {office.Address}
              </p>

              <p
                  style={{
                    color: office.Rent < 60000 ? "red" : "green",
                    fontWeight: "bold"
                  }}
              >
                Rent: ₹{office.Rent}
              </p>

              <hr />

            </div>

        ))}

      </div>
  );
}

export default App;