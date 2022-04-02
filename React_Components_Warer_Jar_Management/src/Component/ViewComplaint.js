import React from "react";

export default class ViewComplaint extends React.Component
{

     state={ data : [] }

    componentDidMount()
     {
        var promise = fetch("http://localhost:8080/getAllComplaint", {
            "method": "Post",  })

        var anotherpromise=promise.then(reponse=>{
              return reponse.json()
        })

        anotherpromise.then(jasondataarr=>{
            this.setState({data:jasondataarr})
            console.log(jasondataarr);
        })
                      
        promise.catch(err => { console.log(err); 
        });
     }

    

    render()
    {
      return(
              <div>
                  <table border="1">
                    <tr><th>Complaint Description</th><th>Customer Name</th><th>Complaint Status</th></tr>
                   {
                   this.state.data.map((ele , index)=>{
                       return(<tr><td>{ele.complaintInfo}</td><td>{ele.customer_name}</td><td>{ele.status}</td></tr>)  
                   })
                  }
               </table>
             </div>
            )
           }
     }