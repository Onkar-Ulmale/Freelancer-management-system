import React from 'react'
import {ReactTyped} from 'react-typed';
import vid from "../assets/vid.mp4"

import {Link} from 'react-router-dom'
import Role from './Role';



function Hero() {

 

 
  return (
    <div>
    <div className='text-white'>
     <div className='flex mt-1 justify-center mix-blend-color-dodge'>
      <video autoPlay loop muted className="rounded-lg w-[500px] flex mt-1 justify-center border rounded-3xl border-l-stone-400 ">
        <source src={vid} type="video/mp4"/>
      </video>

     </div>
    
      <div className='max-w-[800px] mt-[-96px] w-full h-screen mx-auto text-center flex flex-col justify-center relative '>
        <p className='text-[#00df9a] font-bold p-2 h-[-120px]'>GROW WITH SKILLS</p>
        <h1 className='md:text-7xl sm:text-6xl text-4xl font-bold md:py-6'>FREELANCING.....</h1>
        <div className='flex justify-center items-center'>
            <p className='md:text-5xl sm-text-4xl text-xl font-bold py-4'>The place for</p>
            <ReactTyped
            className='md:text-5xl sm-text-4xl text-xl font-bold md:pl-4 pl-2'
             strings={['SKILLS','IDEAS','IMAGINATION']} typeSpeed={140} backSpeed={140} loop/>
        </div>
        <p className='md:text-2xl text-xl font-bold  text-gray-500'>Connecting top freelancers with clients worldwide. Join us to showcase your skills and find exciting projects</p>
        <p className='md:text-2xl text-xl font-bold text-gray-500'> Your next opportunity is just a click away!</p>

        {/* onClick function will call login function */}
        <Link to="/Role"><button className='bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black'>Get Started</button></Link>
        </div>
    </div>
    
    </div>
  )
}

export default Hero
