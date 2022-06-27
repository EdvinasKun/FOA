import React, { useEffect, useState } from 'react';
import { Routes, Route, useLocation } from "react-router-dom";
import './App.css';
import AdminBoard from './components/AdminBoard';
import Login from './components/Login';
import MainPage from './components/MainPage';
import Navbar from './components/Navbar';
import Registration from './components/Registration';
// import Test from './components/test'

function App() {

  // a function used to hide navbar
  const usePathname = () => {
    const location = useLocation();
    return location.pathname;
  }
  const path = usePathname();
  const [notRegisterLogin, setNotRegisterLogin] = useState(false);
  useEffect(() => {
    if (path === "/register" || path === "/") {
      setNotRegisterLogin(false);
    } else {
      setNotRegisterLogin(true);
    }
  })

  return (
    <>

      <div style={{ display: notRegisterLogin ? "contents" : "none" }}><Navbar /></div>

      <div>
        <Routes>
          <Route path="/mainPage" element={<MainPage />} />
          <Route path="/register" element={<Registration />} />
          <Route path="/adminBoard" element={<AdminBoard />} />
          <Route path="/" element={<Login />} />
          <Route path="*" element={<p>There's nothing here. ERROR 404 not found!</p>} />
        </Routes>
      </div>

      {/* <div>
        <Routes>

        </Routes>
      </div> */}
    </>
  );
}

export default App;
