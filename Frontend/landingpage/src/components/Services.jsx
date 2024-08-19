import React from 'react'
import { Link, useNavigate } from 'react-router-dom'
import { motion } from "framer-motion";

function Services() {
  const navigate=useNavigate()




  const services = [
    {
      title: "Web Development",
      description:
        "Build responsive, fast, and scalable websites using the latest technologies like React.js, Node.js, and more.",
      icon: "🌐",
    },
    {
      title: "Mobile App Development",
      description:
        "Develop cross-platform mobile applications using React Native, ensuring smooth and engaging user experiences.",
      icon: "📱",
    },
    {
      title: "UI/UX Design",
      description:
        "Design intuitive and user-friendly interfaces that provide an exceptional user experience for your web and mobile apps.",
      icon: "🎨",
    },
    {
      title: "SEO Optimization",
      description:
        "Improve your website’s visibility on search engines and drive more organic traffic with tailored SEO strategies.",
      icon: "🚀",
    },
    {
      title: "Cloud Services",
      description:
        "Leverage the power of cloud computing with services like AWS, Azure, and Google Cloud to make your applications scalable and secure.",
      icon: "☁️",
    },
    {
      title: "DevOps Engineering",
      description:
        "Automate software delivery processes with CI/CD pipelines, containerization, and infrastructure as code.",
      icon: "⚙️",
    },
    {
      title: "Cybersecurity",
      description:
        "Protect your applications and data with comprehensive cybersecurity solutions, including penetration testing and threat analysis.",
      icon: "🔒",
    },
    {
      title: "Data Analytics",
      description:
        "Analyze and visualize data to gain insights and make informed business decisions using tools like Python, R, and Tableau.",
      icon: "📊",
    },
    {
      title: "Database Management",
      description:
        "Design, implement, and maintain robust database systems using SQL, NoSQL, and cloud-based databases.",
      icon: "💾",
    },
    {
      title: "API Development",
      description:
        "Create and manage RESTful APIs to integrate with third-party services and enable communication between different systems.",
      icon: "🔗",
    },
    {
      title: "E-commerce Solutions",
      description:
        "Develop secure and scalable e-commerce platforms with features like payment gateways, product management, and order processing.",
      icon: "🛒",
    },
    {
      title: "Content Management Systems",
      description:
        "Implement and customize CMS platforms like WordPress, Joomla, and Drupal to suit your business needs.",
      icon: "📝",
    },
    {
      title: "Blockchain Development",
      description:
        "Develop decentralized applications (dApps) and smart contracts using blockchain technologies like Ethereum and Hyperledger.",
      icon: "⛓️",
    },
    {
      title: "Artificial Intelligence",
      description:
        "Integrate AI-driven solutions into your business processes, including machine learning models, chatbots, and NLP.",
      icon: "🤖",
    },
    {
      title: "AR/VR Development",
      description:
        "Create immersive augmented and virtual reality experiences for gaming, training, and simulations.",
      icon: "🕶️",
    },
    {
      title: "Project Management",
      description:
        "Oversee IT projects from conception to delivery using agile methodologies and project management tools like Jira and Trello.",
      icon: "📋",
    },
    {
      title: "IT Consulting",
      description:
        "Provide expert advice on IT strategy, technology selection, and digital transformation to help your business grow.",
      icon: "💡",
    },
    {
      title: "Network Administration",
      description:
        "Design, configure, and manage computer networks to ensure optimal performance and security.",
      icon: "🖧",
    },
    {
      title: "Tech Support",
      description:
        "Offer technical support and troubleshooting services for hardware, software, and network-related issues.",
      icon: "🛠️",
    },
    {
      title: "Digital Marketing",
      description:
        "Promote your business online through SEO, PPC, social media marketing, and content creation.",
      icon: "💻",
    },
    {
      title: "Web Hosting",
      description:
        "Provide reliable and secure web hosting services with 24/7 support and maintenance.",
      icon: "🌍",
    },
    {
      title: "Custom Software Development",
      description:
        "Build bespoke software solutions tailored to your business needs, from desktop applications to enterprise systems.",
      icon: "💼",
    },
    {
      title: "System Integration",
      description:
        "Ensure seamless integration of different IT systems and software, enabling them to work together efficiently.",
      icon: "🔧",
    },
    {
      title: "IoT Development",
      description:
        "Create Internet of Things (IoT) solutions that connect devices and systems, enabling smart automation and data collection.",
      icon: "📡",
    },
    {
      title: "Game Development",
      description:
        "Develop engaging and immersive video games using game engines like Unity and Unreal Engine.",
      icon: "🎮",
    },
  ];
  
  
  const handleClick = (serviceTitle) => {
    alert(`You clicked on ${serviceTitle}`)
      navigate('/ClientLogin')
    
  };
  
  // Animation variants for service cards
  const cardVariants = {
    offscreen: {
      opacity: 0,
      y: 100,
    },
    onscreen: {
      opacity: 1,
      y: 0,
      transition: {
        type: "spring",
        bounce: 0.4,
        duration: 1,
      },
    },
  };
  
  // Animation variants for buttons
  const buttonVariants = {
    hover: {
      scale: 1.1,
      boxShadow: "0px 0px 8px rgba(0, 0, 0, 0.5)",
    },
    tap: {
      scale: 0.95,
    },
  };
  
  
    return (
      <div className="min-h-screen bg-#000300  py-10">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <h1 className="text-4xl font-extrabold text-center text-[#00df9a] mb-10">
            Services WE Provide
          </h1>
          <motion.div
            className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 gap-8"
            initial="offscreen"
            animate="onscreen"
            whileInView="onscreen"
            viewport={{ once: true, amount: 0.8 }}
          >
            {services.map((service, index) => (
              <motion.div
                key={index}
                className="bg-green-800 p-6 rounded-lg shadow-md hover:shadow-lg transition-shadow duration-300 transform"
                variants={cardVariants}
              >
                <motion.div
                  whileHover={{ rotate: 360 }}
                  transition={{ duration: 0.8 }}
                  className="flex items-center justify-center text-4xl mb-4"
                >
                  {service.icon}
                </motion.div>
                <h2 className="text-2xl font-semibold text-black">
                  {service.title}
                </h2>
                <p className="mt-4 text-black">{service.description}</p>
                <motion.button
                  onClick={() => handleClick(service.title)}
                  className="mt-6 bg-blue-500 text-white py-2 px-4 rounded hover:bg-blue-600 transition-colors duration-300"
                  variants={buttonVariants}
                  whileHover="hover"
                  whileTap="tap"
                >
                  Use Service
                </motion.button>
              </motion.div>
            ))}
          </motion.div>
        </div>
      </div>
    );
  };
  

export default Services






