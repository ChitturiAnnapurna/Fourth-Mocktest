import React, { Component } from 'react';
import axios from 'axios';


export class UsersComponent extends React.Component {

    constructor(props) {
        super(props)

        this.state = {
            usersComponent: []
        }
    }

    componentDidMount() {
        axios.get('http://localhost:8080/users')
            .then((data) => {
                console.log(data);
                this.setState({ usersComponentState:data
                }, () => {
                    console.log(this.state.usersComponent)
                })
            })
            .catch((error) => {
                console.log(error);
            })
    }


    render() {
        return (
            <div className="wrapper-users">
                <div className="container">
                    <table className="table table-striped table-dark">
                        <thead className="thead-dark">
                            <tr>
                                <td>Id</td>
                                <td>num</td>
                                <td>first_Name</td>
                                <td>last_Name</td>
                                <td>Email</td>
                                <td>Gender</td>
                                <td>ip_Address</td>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.usersComponent.map(
                                    user =>
                                    <tr key={user.id}>
                                        <td> {user.id}</td>
                                        <td> {user.num}</td>
                                        <td> {user.first_Name}</td>
                                        <td> {user.last_Name}</td>
                                        <td> {user.Email}</td>
                                        <td> {user.Gender}</td>
                                        <td> {user.ip_Address}</td>
                                    </tr>    
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}



