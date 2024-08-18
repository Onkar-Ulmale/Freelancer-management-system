import React, { useState, useEffect } from 'react';
import axios from 'axios';

//budget details name client_id

function ClientdashboardInfo() {

const [project,setProject]=useState([]);


useEffect(()=>{
   try{
    
    axios.post("http://localhost:8080/project/getProjectsById/1")
    .then((res)=>{
        alert(res.data.budget)
        setProject(res.data.name);
    })
   }catch{
    alert("problemm!!!!!!!!!")
       
    
   }
},[])

  return (
    <div className='text-white'>
      <h1>PROJECTS</h1>
      <table>
        <thead>
            <tr>
                <th>BUDGET</th>
                <th>DETAILS</th>
                <th>PROJECT NAME</th>
            </tr>
            <tbody>
                {project.map(emp=>{
                    <tr key={project.project_id}>
                        <td>{project.budget}</td>
                        <td>{project.details}</td>
                        <td>{project.name}</td>

                    </tr>
                })}

            </tbody>
        </thead>
      </table>
    </div>
  )
}

export default ClientdashboardInfo
