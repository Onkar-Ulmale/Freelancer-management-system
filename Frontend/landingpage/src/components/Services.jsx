import React from 'react'
import { Link } from 'react-router-dom'

function Services() {
  return (
    <div className=' justify-between items-center h-24 max-w-[1240px] mx-auto px-4'>
      <a className='text-white'>Hi I am Services</a>


      <Link to="/ClientLogin"><button className='bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black'>Use Service</button></Link>
    </div>
  )
}

export default Services






