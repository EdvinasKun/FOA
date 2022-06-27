import React, { useEffect, useState } from "react";
import AuthService from "../services/AuthService";
import InstitutionService from "../services/InstitutionService";
import { Link } from "react-router-dom";

export default function MainPage() {

    const user = AuthService.getCurrentUser();
    const [noUser, setNoUser] = useState(true);
    const [institutions, setInstitutions] = useState([]);


    useEffect(() => {
        if (user === null) {
            setNoUser(true);
        } else {
            setNoUser(false);
        }
        InstitutionService.getAllInstitutions().then((response) => {
            setInstitutions(response.data)
        })
    }, [])

    return (
        <>

            <div className="container mt-5">
                <div style={{ display: noUser ? "contents" : "none" }} className="forgot"><Link to={"/"}>Prisijungti čia</Link></div>
                <div className="row row-cols-1 row-cols-md-3 g-4">
                    {institutions.map((institution) => {
                        return (
                            <div className="col">
                                <div className="card h-200">
                                    <img src="https://picsum.photos/200/100" className="card-img-top" alt="institutionImage" />
                                    <div className="card-body">
                                        <h5 className="card-title">{institution.businessName}</h5>
                                        <p className="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    </div>
                                </div>
                            </div>
                        )
                    })}
                </div>

                {/* <div className="row row-cols-1 row-cols-md-3 g-4">
                    <div className="col">
                        <div className="card h-200">
                            <img src="..." className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Card title</h5>
                                <p className="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                            </div>
                        </div>
                    </div>
                    <div className="col">
                        <div className="card h-100">
                            <img src="..." className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Card title</h5>
                                <p className="card-text">This is a short card.</p>
                            </div>
                        </div>
                    </div>
                    <div className="col">
                        <div className="card h-100">
                            <img src="..." className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Card title</h5>
                                <p className="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                            </div>
                        </div>
                    </div>
                    <div className="col">
                        <div className="card h-100">
                            <img src="..." className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Card title</h5>
                                <p className="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                            </div>
                        </div>
                    </div>
                </div> */}

            </div>
        </>
    )
}