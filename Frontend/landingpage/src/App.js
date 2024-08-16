
import FreelancerLogin from "./components/FreelancerLogin"
import { BrowserRouter ,Routes ,Route} from 'react-router-dom';
import Home from "./components/Home"
import Role from "./components/Role";
import Services from "./components/Services";
import ClientLogin from "./components/ClientLogin";

function App() {


  return (
 
    <div>
      <BrowserRouter>
       
          <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/FreelancerLogin" element={<FreelancerLogin/>}/>
            <Route path="/ClientLogin" element={<ClientLogin/>}/>
            <Route path="/Role" element={<Role/>}/>  
            <Route path="/Services" element={<Services/>}/> 
          </Routes>
      </BrowserRouter>
     
     

     
     
    </div>
  );
}

export default App;
