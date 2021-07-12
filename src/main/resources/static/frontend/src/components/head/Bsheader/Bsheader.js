import React from 'react';
import {Navbar} from "react-bootstrap";
import  {Nav} from 'react-bootstrap';


function Bsheader() {
return(
    <div>
<Nav className="justify-content-center" activeKey="/home">
    <Nav.Item>
      <Nav.Link href="/home">Active</Nav.Link>
    </Nav.Item>
    <Nav.Item>
      <Nav.Link eventKey="link-1">Link</Nav.Link>
    </Nav.Item>
    <Nav.Item>
      <Nav.Link eventKey="link-2">Link</Nav.Link>
    </Nav.Item>
    <Nav.Item>
      <Nav.Link eventKey="disabled" disabled>
        Disabled
      </Nav.Link>
    </Nav.Item>
  </Nav>
    </div>
)

}
export default Bsheader;