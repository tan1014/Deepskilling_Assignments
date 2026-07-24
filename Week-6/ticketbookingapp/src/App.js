import React, { Component } from "react";

import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";
import Login from "./Components/Login";
import Logout from "./Components/Logout";

class App extends Component {

  constructor() {
    super();

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  logout = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {

    return (

        <div style={{ padding: "20px" }}>

          <h1>Ticket Booking App</h1>

          {
            this.state.isLoggedIn
                ? <Logout logout={this.logout} />
                : <Login login={this.login} />
          }

          <hr />

          {
            this.state.isLoggedIn
                ? <UserPage />
                : <GuestPage />
          }

        </div>

    );
  }
}

export default App;