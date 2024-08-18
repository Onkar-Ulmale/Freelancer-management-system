import React from 'react'
import ClientNavbar from './ClientNavbar'
import Navbar from './Navbar'
import ClientdashboardInfo from './ClientdashboardInfo'

function ClientDashboard() {
  return (
    <div className='w-full'>
       <ClientNavbar/>
       
        <Navbar/>
        <ClientdashboardInfo/>
       
       
    </div>
  )
}

export default ClientDashboard
