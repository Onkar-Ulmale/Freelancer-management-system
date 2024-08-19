
import FreelancerLogin from "./components/FreelancerLogin"
import { BrowserRouter ,Routes ,Route} from 'react-router-dom';
import Home from "./components/Home"
import Role from "./components/Role";
import Services from "./components/Services";
import ClientLogin from "./components/ClientLogin";
import ClientNavbar from "./ClientFront/ClientNavbar";
import ClientDashboard from "./ClientFront/ClientDashboard";
import FreelancerDashboard from "./FreelancerFront/FreelancerDashboard";
import ClientProjects from "./ClientFront/Projects";
import ClientProfile from "./ClientFront/ClientProfile";
import FreelancerProfile from "./FreelancerFront/FreelancerProfile";
import Projects from "./FreelancerFront/Projects";
import ClientHome from "./ClientFront/ClientHome";



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
            <Route path="/ClientDashboard" element={<ClientDashboard/>}/> 
            <Route path="/FreeLancerDashboard" element={<FreelancerDashboard/>}/> 
            <Route path="/ClientProjects" element={<ClientProjects/>}/> 
            <Route path="/ClientProfile" element={<ClientProfile/>}/> 
            <Route path="/FreelancerProfile" element={<FreelancerProfile/>}/> 
            <Route path="/FreelancerProjects" element={<Projects/>}/> 
            <Route path="/ClientHome" element={<ClientHome/>}/>
          </Routes>
      </BrowserRouter>
     
     

     
     
    </div>
  );
}

export default App;
