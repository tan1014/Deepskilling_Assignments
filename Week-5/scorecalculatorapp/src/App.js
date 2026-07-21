import {CalculateScore} from "./Components/CalculateScore";

function App(){
  return(
      <div>
        <CalculateScore
          Name = "Tanu"
          School= "DAV Public School"
          total = {500}
          goal={1} />
      </div>
  );
}
export default App;