import React, { useEffect, useState } from 'react'
import {IoIosHome} from 'react-icons/io'
import {CgProfile} from 'react-icons/cg'
import {GrProjects} from 'react-icons/gr'
import {IoMdLogOut} from 'react-icons/io'
import { Navigate, useNavigate } from 'react-router-dom'
import ClientDashboard from './ClientDashboard'
import axios from 'axios'

function ClientNavbar() {
  const navigate=useNavigate()
  const email=localStorage.getItem('email')
  const[project,setProject]=useState([])
  




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

  const home=()=>{
    navigate('/ClientDashboard')
  }

const handleLogout=()=>{


  localStorage.removeItem('userId')
  sessionStorage.removeItem('userId')


  navigate('/')
    
}

const navigateToProfile=()=>{
  navigate("/ClientProfile")
}

const navigateToProjects=()=>{
  navigate("/ClientProjects")
}

  return (
    

    <div className='w-64 bg-slate-500 fixed h-full py-8 px-4'>
      <div>
        <h1 className='text-2x text-white font-bold' >Client DashBoard</h1>
      </div>
      <hr/>
      <ul className='mt-3 text-white font-bold'>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3'onClick={home}>
            <IoIosHome className='inline-block w-6 h-6 mr-2 -mt-2'></IoIosHome>
            Home
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3' onClick={navigateToProfile}>
            <CgProfile className='inline-block w-6 h-6 mr-2 -mt-2'></CgProfile>
            Profile
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3'onClick={navigateToProjects}>
            <GrProjects className='inline-block w-6 h-6 mr-2 -mt-2'></GrProjects>
           Projects
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3' onClick={handleLogout}>
            <IoMdLogOut className='inline-block w-6 h-6 mr-2 -mt-2' ></IoMdLogOut>
           Logout
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow flex relative justify-center text-yellow-600 '>
          <a>
           {email}
          </a>
        </li>
      </ul>
    </div>

  )
}

export default ClientNavbar
