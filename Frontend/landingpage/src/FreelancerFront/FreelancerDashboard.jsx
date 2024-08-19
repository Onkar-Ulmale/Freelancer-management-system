import React from 'react'
import FreeLancerNavbar from './FreeLancerNavbar'
import Navbar from './Navbar'
import FreeLancerHome from './FreeLancerHome'

function FreelancerDashboard() {
  return (
       <div className='w-full'>
       <FreeLancerNavbar/>
       
        <Navbar/>
        <FreeLancerHome/>
    </div>
  )
}

export default FreelancerDashboard
