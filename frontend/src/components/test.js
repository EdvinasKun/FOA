import React from "react";
import "./test.css"

export default function Test() {
    return (
        <>
            <div className="login-dark">
                <form method="post">
                    <h2 className="sr-only">Login Form</h2>
                    {/* <div className="illustration"><i class="icon ion-ios-locked-outline"></i></div> */}
                    <div className="form-group">
                        <input className="form-control" type="email" name="email" placeholder="Email"></input>
                    </div>
                    <div className="form-group">
                        <input className="form-control" type="password" name="password" placeholder="Password"></input>
                    </div>
                    <div className="form-group">
                        <button className="btn btn-primary btn-block col-12 mb-3" type="submit">Log In</button>
                    </div>
                    <a href="#" className="forgot">Forgot your email or password?</a>
                </form>
            </div>
        </>
    )
}