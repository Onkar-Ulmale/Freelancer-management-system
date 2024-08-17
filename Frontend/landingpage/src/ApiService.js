import axios from 'axios'

const API_BASE_URL='http://localhost:8080';

const ApiService={
    login:(username,password)=>{
        return axios.post(`${API_BASE_URL}/Login`,{username,password});

       
    }
}

export default ApiService;