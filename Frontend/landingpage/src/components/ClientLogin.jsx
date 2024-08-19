import React from 'react'
import {useState} from 'react'
import {CiUser,CiMail,CiLock} from "react-icons/ci"
import Navbar from './Navbar'
import image from '../assets/Premium Vector _ Software development, programming language, coding.jpeg' 
import { Navigate } from 'react-router-dom'
import ApiService from '../ApiService'
import axios from 'axios'

 function ClientLogin() {

   

    const handleLogin=()=>{
        ApiService.login(name,password)
        .then(response=>{
            console.log("login successfull",response.data)
        })
    }
    const[email,setEmail]=useState('')
    const[name,setName]=useState('')
    const[password,setPassword]=useState('')
    const[phonenumber,setPhonenumber]=useState('')


    const handleRegestration=async()=>{
        await axios.post('http://localhost:8080/client/addClient',{
            email,name,phonenumber,password
        });
    }
     
    const Login=async()=>{
        await axios.post('http://localhost:8080/login/client',{
            email,password
        }).then((res)=>{

            
            localStorage.setItem('userId',res.data.id)
            
            localStorage.setItem('email',res.data.email)

            if(res.data.email===email&&res.data.password===password){
                window.location.href = "/ClientDashboard";
            }else{
                alert("invalid email or password")
            }
        });
    }

    const[clientData,setClientData]=useState(null)

    // // useEffect(()=>{

    // })



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
        <img className='h-[390px] w-80  rounded-2xl my-4 flex justify-normal absolute opacity-93' src={image}/>
        <div className='h-[390px] w-80 bg-[#8ca491] rounded-2xl px-4 my-4 overflow-hidden'  >


            <div className={`${open ?"translate-y-[0px] transition-all":"translate-y-[400px] transition-all"}`}>


                <h2 className=' text-black text-3xl font-bold pb-3 text-center'>Register</h2>

                <form className="flex flex-col items-center " action=''>
                   
                    <div className='w-full  relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full hover:opacity-10"required value={name} onChange={(e)=>setName(e.target.value)} type='text' placeholder='name'/>
                        <CiUser className='absolute top-[35%] right-3'/>
                    </div>

                    <div className='w-full relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full " value={email} onChange={(e)=>setEmail(e.target.value)} required type='email' placeholder='email'/>
                        <CiMail className='absolute top-[35%] right-3'/>
                    </div>

                    <div className='w-full relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full "type='password' value={password} onChange={(e)=>setPassword(e.target.value)} placeholder='password'/>
                        <CiLock className='absolute top-[35%] right-3'/>
                    </div>
                    <div className='w-full relative'>
                        <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full "type='text' value={phonenumber} onChange={(e)=>setPhonenumber(e.target.value)}  placeholder='Phone'/>
                        <CiLock className='absolute top-[35%] right-3'/>
                    </div>

                    <button className='my-2 py-2 w-full rounded-full bg-[#00df9a] cursor-auto' onClick={handleRegestration}>Register</button>
                    <span>Already have an account ? <span className='cursor-pointer hover:underline' onClick={handleClick}  >Login</span></span>
                
                
                </form>
            </div>

            <div className={`${!open ?"translate-y-[-270px] transition-all":"translate-y-[400px] transition-all"}`}>


                <h2 className=' text-black text-3xl font-bold pb-3 text-center'>Login</h2>

                <form className="flex flex-col items-center " action=''>

                        <div className='w-full relative'>
                            <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full "type='email' placeholder='email' value={email} onChange={(e)=>setEmail(e.target.value)}/>
                            <CiMail className='absolute top-[35%] right-3'/>
                        </div>

                        <div className='w-full relative'>
                            <input className="border border-gray-500 rounded-full py-2 px-4 my-2 bg-transparent w-full " value={password} onChange={(e)=>setPassword(e.target.value)} type='password' placeholder='password'/>
                            <CiLock className='absolute top-[35%] right-3'/>
                        </div>
                        <div className=' flex gap-7 w-full'>
                            <div className='text-[14px]' >
                                <input type='checkbox' name='' id=''/>
                                <label htmlFor=''>    Remember Me</label>
                            </div>
                            <span className='text-[14px]'>Forget Password ?</span>
                        </div>


                        <button className='my-2 py-2 w-full rounded-full bg-[#00df9a] 'onClick={Login}>Login</button>
                        <span>Don't have an account ? <span className='cursor-pointer hover:underline' onClick={handleClick} >Register</span></span>


                    </form>
                </div>
        </div>
      
    </div>
    
  )
}

export default ClientLogin
