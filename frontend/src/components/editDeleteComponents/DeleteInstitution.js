import React from "react";
import { useState } from "react";
import InstitutionService from "../../services/InstitutionService";

export default function DeleteInstitution(props) {
    const [forceRender, setForceRender] = useState(false);

    function deleteInstitution() {
        InstitutionService.deleteInstitution(props.id);
        console.log(props.id);
        // setForceRender(!forceRender);
    }

    return (
        <>
            <button className="btn btn-danger mr-2" onClick={() => {setForceRender(!forceRender); console.log("something"); deleteInstitution()}}>Delete</button>
        </>
    )
}