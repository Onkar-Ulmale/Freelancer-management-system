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
    <div className='text-white px-96'>
      <h1>PROJECTS</h1>
      
     
      <table>
        <thead>
            <tr>
                <th>BUDGET</th>
                <th>DETAILS</th>
                <th>PROJECT NAME</th>
            </tr>
            <tbody>
            {project.length > 0 ? (
            project.map(project => (
              <tr className='text-white' key={project.id}>
                <td>{project.budget}</td>
                <td>{project.details}</td>
                <td>{project.name}</td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="3">No projects found</td>
            </tr>
          )}
           
            
                  
                 
                

            </tbody>
        </thead>
      </table>
     
    </div>
  )
}

export default ClientdashboardInfo
