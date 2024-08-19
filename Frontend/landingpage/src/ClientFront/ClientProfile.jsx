import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { FaRegArrowAltCircleLeft } from 'react-icons/fa'
import { useNavigate } from 'react-router-dom'





function ClientProfile() {

const navigate=useNavigate()
const name=localStorage.getItem('name')
    const handleClick=()=>{
        navigate("/ClientDashboard")
    }
  return (
    <div>
          <div className='text-9xl text-orange-500 flex justify-center mx-10 mt-4 h-5 w-10 cursor-pointer'  onClick={handleClick}  >
      <FaRegArrowAltCircleLeft  />
      </div>
         <div className="min-h-screen bg-gray-100 flex items-center justify-center">
      <div className="bg-white p-6 rounded-lg shadow-lg w-full max-w-sm">
        <div className="flex justify-center">
          <img
            className="w-24 h-24 rounded-full border-4 border-gray-300"
            src="https://via.placeholder.com/150"
            alt="Profile"
          />
        </div>
        <h2 className="mt-4 text-center text-2xl font-semibold text-gray-700">
         {name}
        </h2>
        <p className="text-center text-gray-500">Software Engineer</p>
        <div className="mt-6">
          <h3 className="text-lg font-medium text-gray-700">About Me</h3>
          <p className="mt-2 text-gray-600 text-sm">
            Passionate software engineer with 5+ years of experience in building
            scalable web applications and working with cross-functional teams.
          </p>
        </div>
        <div className="mt-6">
          <h3 className="text-lg font-medium text-gray-700">Skills</h3>
          <ul className="mt-2 text-gray-600 text-sm list-disc list-inside">
            <li>JavaScript</li>
            <li>React.js</li>
            <li>Node.js</li>
            <li>Tailwind CSS</li>
          </ul>
        </div>
        <div className="mt-6 flex justify-center">
          <button className="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600 transition">
            Contact
          </button>
        </div>
      </div>
    </div>
      
    </div>
  )
}

export default ClientProfile
