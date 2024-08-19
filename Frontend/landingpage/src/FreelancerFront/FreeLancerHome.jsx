import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { FaRegArrowAltCircleLeft } from 'react-icons/fa';
import { useNavigate } from 'react-router-dom';

function FreeLancerHome() {
    const navigate=useNavigate()

const [project,setProject]=useState([]);
const email=localStorage.getItem('email')


const accepts=()=>{
  alert("you request the project")
}
        useEffect(()=>{
          
          
          
          // alert(getUserId)

          
            axios.get('http://localhost:8080/project/getAllProjects')
            .then(response=>{
              
              
              setProject(response.data)
              
            })
            .catch(err=>{
              console.log(err)
            })
          }

        

        ,[])

        const returnTo=()=>{
            navigate('/FreeLancerDashboard')
        }



  return (
    <div>
    <div className='text-9xl text-orange-500 flex justify-center mx-10 mt-4 h-5 w-10 cursor-pointer'  onClick={returnTo} >
    <FaRegArrowAltCircleLeft  />
    </div>
  <div  className=' text-white px-[400px]'>
    <h1 className='mt-20 px-20 text-3xl font-bold'>PROJECTS</h1>
    
   
 
          {/* {project.length > 0 ? (
          project.map(project => (
            <tr className='text-white' key={project.id}>
              <td>{project.budget}</td>
              <td>{project.details}</td>
              <td>{project.name}</td>
            </tr> */}
     
         
          
                
  
  <div class="max-w-4xl mx-auto bg-white shadow-lg rounded-lg overflow-hidden mt-20 mx-10 ">
      <table class="min-w-full divide-y divide-gray-200">
          <thead class="bg-gray-50">
              <tr >
                  <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Project Name</th>
                  <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Budget</th>
                  <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Details</th>
                 
              </tr>
          </thead>
          <tbody class="bg-white divide-y divide-gray-200">
          {project.length>0?(
              project.map(project=>(
              <tr class="hover:bg-gray-100 transition duration-300 ease-in-out" key={email}>
                  <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">{project.name}</td>
                  <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">{project.budget}</td>
                  <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">{project.details}</td>
                 
              </tr>
                 ))
                ):(
                  <tr>
                  <td colSpan="3">No projects found</td>
                </tr>
                )}
             
              
          </tbody>
      </table>
  </div>
   
  </div>

  </div>

)
}

export default FreeLancerHome
