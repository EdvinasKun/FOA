import React from "react";
import "./Navbar.css"
import mainLogo from "../images/Cibus_logo.png"
import { NavLink } from "react-router-dom";

export default function Navbar() {



    return (
        <>
            <div className="topnav">
                <NavLink to={"/mainPage"}><img src={mainLogo} alt="cibus logo" className="logo_navbar" /></NavLink>
                <input type="text" placeholder="Search.." className="col-4" />
            </div>
        </>
    )
}