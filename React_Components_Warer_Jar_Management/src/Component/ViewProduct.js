import React from "react";

export default class ViewProduct extends React.Component
{

     state={ data : [] , flag:true , name : "" , category : [] }

    componentDidMount()
     {
        var promise = fetch("http://localhost:8080/viewProducts", {
            "method": "Post",  })

        var anotherpromise=promise.then(reponse=>{
         
              return reponse.json()
        })

        anotherpromise.then(jasondataarr=>{
         
            this.setState({data:jasondataarr})
            console.log(...jasondataarr);
        })
                      
        promise.catch(err => { console.log("Error  :  "+err); 
        });
     }

     

    render()
    {
      
      return(
              <div>
                  <table border="1">
                    <tr><th>Water Type</th><th>Jar Capacity</th><th>Price</th></tr>
                   {
                   this.state.data.map((ele , index)=>{
                       return(<tr><td>{ele.waterType}</td><td>{ele.jarCapacity}</td><td>{ele.price}</td></tr>)  
                   })
                   } 
               </table>
             </div>
            )
           }
     }
   



