import "./App.css";
import ComponentsBottom from "./Components/ComponentsBottom";
import ComponentsTop from "./Components/ComponentsTop";

function App() {
  return (
    <div className="App">
      <ComponentsTop heading_panel="-----Components Top-----" />
      <br />
      <br />
      <ComponentsBottom message="Wellcome to VTI Academy!" />
    </div>
  );
}
export default App;
