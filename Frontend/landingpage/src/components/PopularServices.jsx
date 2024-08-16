import React from 'react'
import Image1 from '../assets/images/Image1 .jpeg'
import Image2 from '../assets/images/2.jpeg'
import Image3 from '../assets/images/3.jpeg'
import {Link} from 'react-router-dom'
import { MdKeyboardArrowRight } from "react-icons/md";
import { FiArrowRightCircle } from "react-icons/fi";



function PopularServices() {
  return (
    <div className='py-8'>
        <div>
            <p className='text-[#00df9a] px-20 text-[60px] font-semibold font-serif'>POPULAR SERVICES</p>
        </div>
      <div className='container pl-10 pr-10 '>
        <div className='py-10  grid  sm:grid-cols-4 lg:grid lg:grid-col-4 gap-3 ' >

            <div className='py-10 pl-5 bg-gradient-to-br from-slate-700 to-black/70 text-white rounded-3xl relative h-[320px] flex hover:opacity-60 -bottom-3 hover:bottom-5 transition-all duration-500 hover:cursor-pointer '  >
                <div>
                    <div className='mb-4'>
                        <p className='mb-[2px] text-gray-600 font-semibold text-[40px]'>Web</p>
                        <p className='text-[50px] font-semibold relative z-10 '>Designing</p>
                        
                        <button className='bg-lime-300 text-black rounded-lg'>Use Service</button>
                    </div>
                </div>
                <img src={Image1} alt='' className='w-[180px] rounded-3xl right-6 absolute bottom-3'/>
            </div>
            <div className='py-10 pl-5 bg-gradient-to-br from-slate-700 to-black/70 text-white rounded-3xl relative h-[320px] flex hover:opacity-60 -bottom-3 hover:bottom-5 transition-all duration-500 hover:cursor-pointer  '>
                <div>
                    <div className='mb-4'>
                        <p className='mb-[2px] text-gray-600 font-semibold text-[40px] z-10 relative'>Front End</p>
                        <p className='text-[50px] font-semibold relative z-10 '>Designing</p>
                        
                        <button className='bg-lime-300 text-black rounded-lg'>Use Service</button>
                    </div>
                </div>
                <img src={Image2} alt='' className='w-[180px] rounded-3xl right-6 absolute bottom-3 '/>
            </div>
            <div className='py-10 pl-5 bg-gradient-to-br from-slate-700 to-black/70 text-white rounded-3xl relative h-[320px] flex hover:opacity-60 -bottom-3 hover:bottom-5 transition-all duration-500 hover:cursor-pointer overflow-hidden '>
                <div>
                    <div className='mb-4'>
                        <p className='mb-[2px] text-gray-600 font-semibold text-[40px] z-10 relative'>Full Stack</p>
                        <p className='text-[50px] font-semibold relative z-10 '>Development</p>
                        
                        <button className='bg-lime-300 text-black rounded-full '>Use Service</button>
                    </div>
                </div>
                <img src={Image3} alt='' className='w-[180px] rounded-3xl right-6 absolute bottom-3 '/>
            </div>
            <div className='py-10 pl-5 bg-gradient-to-br from-slate-700 to-black/70 text-white rounded-3xl relative h-[320px] flex hover:opacity-60 -bottom-3 hover hover:cursor-pointer overflow-hidden '>
            <div>
                <div className='opacity-100'>
                    <p className='text-[20px] font-semibold text-[40px]  relative justify-center flex -bottom-28  rounded-full  transition-all left-[125px]'>MORE</p>
                </div>
                <Link to='/Services'><a className='mb-[2px] text-gray-600  font-semibold text-[40px]  relative justify-center flex -bottom-28  rounded-full hover:text-[45px] transition-all hover:text-amber-400 left-[125px]'><FiArrowRightCircle className=''/>  </a></Link>
                
            </div>          
            </div>
            
        </div>
      </div>
    </div>
  )
}

export default PopularServices
