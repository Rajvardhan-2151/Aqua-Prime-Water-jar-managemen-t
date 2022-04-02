import React from "react";
import "./main.css"



import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import ViewComplaint from "./ViewComplaint";
import ViewDailyOrderCount from "./ViewDailyOrderCount";
import ViewProduct from "./ViewProduct";
import ViewSupplier from "./ViewSupplier";

export default function App() {
  return (
    <div>
   
    <Router>
      <div>
      
      <nav class="main-menu">

       	<ul>
				
							<li>
                  <div class="header-icons">
                       <li> <Link to="/View Products">View Product</Link> </li>
                	</div>
              </li>

              <li>
                  <div class="header-icons">
                       <li> <Link to="/View Supplier">Supplier List</Link> </li>
                	</div>
              </li>
              <li>
                  <div class="header-icons">
                       <li>  <Link to="/View Count">View Order Count</Link> </li>
                	</div>
              </li>
              <li>
                  <div class="header-icons">
                       <li> <Link to="/view Complaint">Complaints</Link> </li>
                	</div>
              </li>
              
            	</ul>


              
					</nav>

          
        <Switch>
          <Route path="/about">
           
          </Route>
          <Route path="/View Products">
           <ViewProduct></ViewProduct>
          </Route>
          <Route path="/View Supplier">
            <ViewSupplier></ViewSupplier>
          </Route>
          <Route path="/View Count">
            <ViewDailyOrderCount></ViewDailyOrderCount>
          </Route>
          <Route path="/view Complaint">
            <ViewComplaint></ViewComplaint>
          </Route>
        </Switch>
      </div>
    </Router>
    </div>
  );
}



function About() {
  return <h2>About</h2>;
}

function Users() {
  return <h2>Users</h2>;
}