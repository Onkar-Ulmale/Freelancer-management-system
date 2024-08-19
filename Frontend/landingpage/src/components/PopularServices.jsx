import React from 'react'
import Image1 from '../assets/images/1.jpeg'
import Image2 from '../assets/images/2.jpeg'
import Image3 from '../assets/images/3.jpeg'
import {Link} from 'react-router-dom'
import { MdKeyboardArrowRight } from "react-icons/md";
import { FiArrowRightCircle } from "react-icons/fi";
import { motion } from "framer-motion";



function PopularServices() {
  return (
    <div>
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
                <img src={Image1} alt='' className='w-[180px] rounded-3xl right-6 absolute bottom-3 h-72'/>
            </div>
            <div className='py-10 pl-5 bg-gradient-to-br from-slate-700 to-black/70 text-white rounded-3xl relative h-[320px] flex hover:opacity-60 -bottom-3 hover:bottom-5 transition-all duration-500 hover:cursor-pointer  '>
                <div>
                    <div className='mb-4'>
                        <p className='mb-[2px] text-gray-600 font-semibold text-[40px] z-10 relative'>Front End</p>
                        <p className='text-[50px] font-semibold relative z-10 '>Designing</p>
                        
                        <button className='bg-lime-300 text-black rounded-lg'>Use Service</button>
                    </div>
                </div>
                <img src={Image2} alt='' className='w-[180px] rounded-3xl right-6 absolute bottom-3 h-72 '/>
            </div>
            <div className='py-10 pl-5 bg-gradient-to-br from-slate-700 to-black/70 text-white rounded-3xl relative h-[320px] flex hover:opacity-60 -bottom-3 hover:bottom-5 transition-all duration-500 hover:cursor-pointer overflow-hidden '>
                <div>
                    <div className='mb-4'>
                        <p className='mb-[2px] text-gray-600 font-semibold text-[40px] z-10 relative'>Full Stack</p>
                        <p className='text-[50px] font-semibold relative z-10 '>Development</p>
                        
                        <button className='bg-lime-300 text-black rounded-full '>Use Service</button>
                    </div>
                </div>
                <img src={Image3} alt='' className='w-[180px] rounded-3xl right-6 absolute bottom-5 h-60 '/>
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
    <footer className="bg-gray-900 text-white py-10">
      <div className="container mx-auto px-4">
        <div className="flex flex-wrap justify-between items-center">
          {/* Left Section: Logo and Introduction */}
          <motion.div
            className="w-full md:w-1/3 mb-6 md:mb-0"
            initial={{ opacity: 0, y: 50 }}
            animate={{ opacity: 1, y: 0 }}
            transition={{ duration: 1.5 }}
          >
            <h1 className="text-3xl font-bold text-white">My Freelance Services</h1>
            <p className="mt-4 text-gray-400">
              Providing top-notch IT services to help you grow your business and
              achieve your goals.
            </p>
          </motion.div>

          {/* Center Section: Quick Links */}
          <motion.div
            className="w-full md:w-1/3 mb-6 md:mb-0"
            initial={{ opacity: 0, y: 50 }}
            animate={{ opacity: 1, y: 0 }}
            transition={{ duration: 1.8 }}
          >
            <h2 className="text-xl font-semibold text-white">Quick Links</h2>
            <ul className="mt-4">
              <li>
                <a href="#home" className="text-gray-400 hover:text-white">
                  Home
                </a>
              </li>
              <li>
                <a href="#services" className="text-gray-400 hover:text-white">
                  Services
                </a>
              </li>
              <li>
                <a href="#portfolio" className="text-gray-400 hover:text-white">
                  Portfolio
                </a>
              </li>
              <li>
                <a href="#contact" className="text-gray-400 hover:text-white">
                  Contact
                </a>
              </li>
            </ul>
          </motion.div>

          {/* Right Section: Social Media Links */}
          <motion.div
            className="w-full md:w-1/3"
            initial={{ opacity: 0, y: 50 }}
            animate={{ opacity: 1, y: 0 }}
            transition={{ duration: 2.1 }}
          >
            <h2 className="text-xl font-semibold text-white">Follow Me</h2>
            <div className="mt-4 flex space-x-4">
              <a href="#" className="text-gray-400 hover:text-white">
                <i className="fab fa-facebook-f"></i>
              </a>
              <a href="#" className="text-gray-400 hover:text-white">
                <i className="fab fa-twitter"></i>
              </a>
              <a href="#" className="text-gray-400 hover:text-white">
                <i className="fab fa-linkedin-in"></i>
              </a>
              <a href="#" className="text-gray-400 hover:text-white">
                <i className="fab fa-github"></i>
              </a>
            </div>
          </motion.div>
        </div>

        {/* Bottom Section: Copyright */}
        <motion.div
          className="text-center text-gray-500 mt-8"
          initial={{ opacity: 0 }}
          animate={{ opacity: 1 }}
          transition={{ duration: 2.5 }}
        >
          &copy; {new Date().getFullYear()} My Freelance Services. All rights
          reserved.
        </motion.div>
      </div>
    </footer>
  );
  </div>
  )
}

export default PopularServices
