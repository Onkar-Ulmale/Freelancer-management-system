import React, { useState, useEffect } from 'react';
import axios from 'axios';

//budget details name client_id

function ClientdashboardInfo() {


const [project,setProject]=useState([]);




useEffect(()=>{
  const UserId=localStorage.getItem('userId')
   
  
  // alert(getUserId)

  
    axios.post(`http://localhost:8080/project/getProjectsById/${UserId}`)
    .then(response=>{
      
      setProject(response.data)
      
    })
    .catch(err=>{
      console.log(err)
    })
  }

 

,[])

  return (
    <div  className=' px-[400px]'>
      <h1>PROJECTS</h1>
      
     
   
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
                <tr class="hover:bg-gray-100 transition duration-300 ease-in-out" key={project.id}>
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

  )
}

export default ClientdashboardInfo
