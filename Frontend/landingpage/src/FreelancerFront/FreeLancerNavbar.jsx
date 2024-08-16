import React from 'react'
import {IoIosHome} from 'react-icons/io'
import {CgProfile} from 'react-icons/cg'
import {GrProjects} from 'react-icons/gr'
import {IoMdLogOut} from 'react-icons/io'

function FreeLancerNavbar() {
  return (
    
    <div className='w-64 bg-slate-500 fixed h-full py-8 px-4'>
      <div>
        <h1 className='text-2x text-white font-bold'>Freelancer DashBoard</h1>
      </div>
      <hr/>
      <ul className='mt-3 text-white font-bold'>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3'>
            <IoIosHome className='inline-block w-6 h-6 mr-2 -mt-2'></IoIosHome>
            Home
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3'>
            <CgProfile className='inline-block w-6 h-6 mr-2 -mt-2'></CgProfile>
            Profile
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3'>
            <GrProjects className='inline-block w-6 h-6 mr-2 -mt-2'></GrProjects>
           Projects
          </a>
        </li>
        <li className='mb-2 rounded hover:shadow hover:bg-blue-500 py-2'>
          <a href='' className='px-3'>
            <IoMdLogOut className='inline-block w-6 h-6 mr-2 -mt-2'></IoMdLogOut>
           Logout
          </a>
        </li>
      </ul>
    </div>
  )
}

export default FreeLancerNavbar
