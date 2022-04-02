import React from "react";

export default class ViewDailyOrderCount extends React.Component
{

     state={ data : 0 }

    componentDidMount()
     {
        var promise = fetch("http://localhost:8080/ViewCount", {
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
                  
                 <h3>Today's Order Count : {this.state.data}</h3> 

             </div>
            )
           }
     }