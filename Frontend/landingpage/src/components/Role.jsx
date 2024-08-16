import React from 'react'
import {Link} from 'react-router-dom'


function Role() {
  return (
    <div className=' justify-between items-center h-24 max-w-[1240px] mx-auto px-4 '>
      
        <Link to="/FreelancerLogin"><button className=' bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black'>Freelancer</button></Link>
        <Link to="/ClientLogin"><button className=' bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black'>Client</button></Link>
      
    </div>
  )
}

export default Role
