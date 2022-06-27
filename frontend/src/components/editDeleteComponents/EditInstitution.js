import React from "react";
import InstitutionService from "../../services/InstitutionService";
import { useForm } from "react-hook-form";

export default function EditInstitution(props) {

    const { register, handleSubmit, formState: { errors } } = useForm({ mode: 'onSubmit', reValidateMode: 'onSubmit' });

    // function onSubmit() {
    //     InstitutionService.editInstitution(props.institutionId, props.codeName, props.businessName, props.address)
    //     // console.log(props);
    //     // console.log(props.institutionId)
    // }


    const onSubmit = data => {
        InstitutionService.editInstitution(data);
        console.log(data);
        console.log(props.institutionId)
    }

    return (
        <>
            {/* <button className="btn btn-warning" onClick={editInstitution}>Edit</button> */}
            <button
                type="button"
                className="btn btn-warning"
                data-bs-toggle="modal"
                data-bs-target={"#id" + props.institutionId}
                // style={{ paddingTop: 0, paddingBottom: 10 }}
            >
                Edit
            </button>

            <div
                className="modal"
                id={"id" + props.institutionId}
                data-bs-backdrop="static"
                data-bs-keyboard="false"
                tabIndex="-1"
                aria-labelledby="staticBackdropLabel"
                aria-hidden="true"
            >
                <div className="modal-dialog modal-dialog-centered">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5
                                className="modal-title"
                                id="staticBackdropLabel"
                            >
                                Įrašo redagavimas
                            </h5>
                            <button
                                type="button"
                                className="btn-close"
                                data-bs-dismiss="modal"
                                aria-label="Close">
                            </button>
                        </div>

                        <form onSubmit={handleSubmit(onSubmit)} className="modal-body">
                            <input
                                {...register("institutionId")}
                                style={{ display: "none" }}
                                defaultValue={props.institutionId}
                            />
                            <input
                                {...register("codeName",
                                    {
                                        required: true,
                                        minLength: 3
                                    })
                                }
                                type="number"
                                className="form-control add__description"
                                placeholder="Įstaigos kodas"
                                defaultValue={props.codeName}
                            />
                            {errors?.codeName?.type === "required" && <p>Laukas negali būti tuščias</p>}
                            {errors?.codeName?.type === "minLength" && <p>Aprašymas turi būti sudarytas iš bent 3 simbolių</p>}

                            <input
                                {...register("businessName",
                                    {
                                        required: true,
                                        minLength: 3
                                    })
                                }
                                type="text"
                                className="form-control add__description"
                                placeholder="Įstaigos pavadinimas"
                                defaultValue={props.businessName}
                            />
                            {errors?.businessName?.type === "required" && <p>Laukas negali būti tuščias</p>}
                            {errors?.businessName?.type === "minLength" && <p>Aprašymas turi būti sudarytas iš bent 3 simbolių</p>}

                            <input
                                {...register("address",
                                    {
                                        required: true,
                                        min: 1
                                    })
                                }
                                type="text"
                                className="form-control add__value mt-2"
                                placeholder="Adresas"
                                defaultValue={props.address}
                            />
                            {errors?.address?.type === "required" && <p>Laukas negali būti tuščias</p>}
                            {errors?.address?.type === "min" && <p>Mažiausias įvestinų pajamų kiekis yra 1 &euro;</p>}

                            <div className="modal-footer">
                                <button
                                    type="button"
                                    className="btn btn-secondary"
                                    data-bs-dismiss="modal"
                                >
                                    Uždaryti
                                </button>
                                <button
                                    type="submit"
                                    className="btn btn-primary"
                                >
                                    Išsaugoti
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </>
    )
}