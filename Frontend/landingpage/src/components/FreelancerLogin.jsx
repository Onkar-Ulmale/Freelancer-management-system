import React from 'react'
import {useState} from 'react'
import {CiUser,CiMail,CiLock} from "react-icons/ci"



 function FreelancerLogin() {
    const[open,setOpen]=useState(false)

    const[isRegister,setIsRegister]=useState(false)
    const handleClick=()=>{
        setOpen(!open)

       
            if(isRegister){
                return <redirect to="/Login"/>
            }
        

        
    }

  return (
    
       
    <div className=' h-[100vh] flex flex-col items-center justify-center text-white'>
        <div className='h-[320px] w-80 bg-lime-950 rounded-2xl px-6 my-4 overflow-hidden'  >


            <div className={`${open ?"translate-y-[0px] transition-all":"translate-y-[400px] transition-all"}`}>


                <h2 className=' text-black text-3xl font-bold pb-3 text-center'>Register</h2>

                <form className="flex flex-col items-center " action=''>
                   
                    <div className='w-full  relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full " required type='text' placeholder='name'/>
                        <CiUser className='absolute top-[35%] right-3'/>
                    </div>

                    <div className='w-full relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full " required type='email' placeholder='email'/>
                        <CiMail className='absolute top-[35%] right-3'/>
                    </div>

                    <div className='w-full relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full " required type='password' placeholder='password'/>
                        <CiLock className='absolute top-[35%] right-3'/>
                    </div>

                    <button className='my-2 py-2 w-full rounded-full bg-[#00df9a] cursor-auto'>Register</button>
                    <span>Already have an account ? <span className='cursor-pointer hover:underline' onClick={handleClick}>Login</span></span>
                
                
                </form>
            </div>

            <div className={`${!open ?"translate-y-[-270px] transition-all":"translate-y-[400px] transition-all"}`}>


                <h2 className=' text-black text-3xl font-bold pb-3 text-center'>Login</h2>

                <form className="flex flex-col items-center " action=''>

                        <div className='w-full relative'>
                            <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full "type='email' placeholder='email'/>
                            <CiMail className='absolute top-[35%] right-3'/>
                        </div>

                        <div className='w-full relative'>
                            <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full "type='password' placeholder='password'/>
                            <CiLock className='absolute top-[35%] right-3'/>
                        </div>
                        <div className=' flex gap-7 w-full'>
                            <div className='text-[14px]' >
                                <input type='checkbox' name='' id=''/>
                                <label htmlFor=''>    Remember Me</label>
                            </div>
                            <span className='text-[14px]'>Forget Password ?</span>
                        </div>


                        <button className='my-2 py-2 w-full rounded-full bg-[#00df9a]'>Login</button>
                        <span>Don't have an account ? <span className='cursor-pointer hover:underline' onClick={handleClick}>Register</span></span>


                    </form>
                </div>
        </div>
      
    </div>
    
  )
}

export default FreelancerLogin
