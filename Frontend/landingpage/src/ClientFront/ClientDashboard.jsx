import React from 'react'
import ClientNavbar from './ClientNavbar'
import Navbar from './Navbar'
import ClientHome from './ClientHome'


function ClientDashboard() {
  return (
    <div >
      

      <div className='w-full'>
       <ClientNavbar/>
       
        <Navbar/>
        
        </div>
        <ClientHome/>
       
    </div>
  )
}

export default ClientDashboard
