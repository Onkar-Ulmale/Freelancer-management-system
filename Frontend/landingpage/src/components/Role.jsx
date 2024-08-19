import React from 'react'
import {Link, useNavigate} from 'react-router-dom'
import { motion } from "framer-motion";


function Role() {
const navigate=useNavigate()
const freelancer=()=>{
  navigate('/FreelancerLogin')
}

const clientLogin=()=>{
  navigate('/ClientLogin');
}


  return (
    <div>
    <div className="flex justify-center items-center min-h-screen bg-[#000300]">
    <div className="space-x-6" onClick={freelancer}>
      <motion.button
        className="bg-blue-500 text-white text-lg font-semibold py-4 px-8 rounded-full shadow-lg focus:outline-none"
        whileHover={{ scale: 1.2, backgroundColor: "#1D4ED8" }} // Blue color
        whileTap={{ scale: 0.9, rotate: 10 }}
      >
        FreeLancer
      </motion.button>
      <motion.button
        className="bg-green-500 text-white text-lg font-semibold py-4 px-8 rounded-full shadow-lg focus:outline-none" onClick={clientLogin}
        whileHover={{ scale: 1.2, backgroundColor: "#047857" }} // Green color
        whileTap={{ scale: 0.9, rotate: -10 }}
      >
        Client
      </motion.button>
    </div>
  </div>
  </div>
);
};




export default Role
