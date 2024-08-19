import axios from 'axios'
import React, { useState } from 'react'

function AddProject() {
    const[name,setName]=useState()
    const[details,setDetails]=useState()
    const[budget,setBudget]=useState()
    const[client_id,setClientId]=useState()
    const id=localStorage.getItem('userId');
       console.log(client_id)

    const addProject=async()=>{
        
        await axios.post("http://localhost:8080/project/addProject",{
            
            name,details,budget,client_id:id
        })
    }


  return (
    <div className=''>
      <div className="max-w-2xl mx-auto p-8 'border-gray-50 ">
            <h1 className=" font-bold mb-4 text-[#00df9a] text-4xl justify-center flex">Add Project</h1>
            <form  className="space-y-4">
                <div>
                    <label className="block text-sm font-medium text-gray-700" value={name} onChange={(e)=>setName(e.target.value)}>
                        Name
                    </label>
                    <input
                        type="text"
                        name="name"
                       
                        className="mt-1 block w-full rounded-md px-3 py-2 border border-gray-300 shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        required  value={name} onChange={(e)=>setName(e.target.value)}
                    />
                </div>
                <div>
                    <label className="block text-sm font-medium text-gray-700">
                        Detail
                    </label>
                    <input
                        type="text"
                        name="detail"
                       
                        className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        required  value={details} onChange={(e)=>setDetails(e.target.value)}
                    />
                </div>
                <div>
                    <label className="block text-sm font-medium text-gray-700">
                        Budget
                    </label>
                    <input
                        type="text"
                        name="budget"
                        
                        className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
                        required  value={budget} onChange={(e)=>setBudget(e.target.value)}
                    />
                </div>
                <div>
                    <button
                        
                        className="inline-flex justify-center py-2 px-4 border border-transparent shadow-sm text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500"
                            onClick={addProject}>
                        Submit
                    </button>
                </div>
            </form>

           
              
           
        </div>
        
   

    </div>
  )
}

export default AddProject
