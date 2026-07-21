import {
  ListofPlayers,
  Scorebelow70
} from "./Components/ListofPlayers";

import {
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
  ListofIndianPlayers
} from "./Components/IndianPlayers";

function App() {

  const players = [
    { name: "Sachin", score: 90 },
    { name: "Dhoni", score: 85 },
    { name: "Virat", score: 100 },
    { name: "Rohit", score: 65 },
    { name: "Gill", score: 75 },
    { name: "Pant", score: 55 },
    { name: "Rahul", score: 80 },
    { name: "Jadeja", score: 68 },
    { name: "Ashwin", score: 45 },
    { name: "Shami", score: 72 },
    { name: "Bumrah", score: 60 }
  ];

  const IndianTeam = [
    "Sachin",
    "Dhoni",
    "Virat",
    "Rohit",
    "Gill",
    "Pant"
  ];

  var flag = false;

  if (flag === true) {

    return (
        <div>
          <h1>List of Players</h1>

          <ListofPlayers players={players} />

          <hr />

          <h1>List of Players having Scores Less than 70</h1>

          <Scorebelow70 players={players} />
        </div>
    );

  } else {

    return (

        <div>

          <h1>Indian Team</h1>

          <h2>Odd Players</h2>

          {OddPlayers(IndianTeam)}

          <hr />

          <h2>Even Players</h2>

          {EvenPlayers(IndianTeam)}

          <hr />

          <h2>Merged Indian Players</h2>

          <ListofIndianPlayers IndianPlayers={IndianPlayers} />

        </div>

    );
  }
}

export default App;