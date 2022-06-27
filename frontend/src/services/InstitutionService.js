import axios from "axios";
import authHeader from "./auth-header";

const API_URL = "http://localhost:8080/api/institutions";

const saveInstitution = ({ codeName, businessName, address }) => {
    return axios
        .post(API_URL, {
            codeName,
            businessName,
            address,
        }, { headers: authHeader() });
}

const editInstitution = ({ institutionId, codeName, businessName, address }) => {
    // console.log(institutionId)
    // console.log(codeName)
    return axios
        .put(API_URL + `/${institutionId}`, {
            institutionId,
            codeName,
            businessName,
            address,
        }, { headers: authHeader() });
}

const deleteInstitution = (id) => {
    return axios
        .delete(API_URL + `/${id}`, {
            headers: authHeader()
        });
}

const getAllInstitutions = () => {
    return axios
        .get(API_URL, { headers: authHeader() })
}

export default {
    saveInstitution,
    deleteInstitution,
    editInstitution,
    getAllInstitutions
}