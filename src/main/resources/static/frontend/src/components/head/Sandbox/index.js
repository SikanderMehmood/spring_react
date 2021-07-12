import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, Alert,Container ,Breadcrumb, Row,Col} from 'react-bootstrap';
import CustomCard from '../CustomCard/CustomCard';

function Sandbox(){

return (

<Container>
<Row>
 <Col md>
   <CustomCard />
  </Col>
 <Col md>
   <CustomCard />
 </Col>
 <Col md>
    <CustomCard />
</Col>    
</Row>
  <Breadcrumb>
   <Breadcrumb.Item>Test-1</Breadcrumb.Item>
   <Breadcrumb.Item>Test-2</Breadcrumb.Item>
   <Breadcrumb.Item>Test-3</Breadcrumb.Item>
   <Breadcrumb.Item active="true">Test-4</Breadcrumb.Item>
  </Breadcrumb>

  <Alert variant="primary">Alert Button</Alert>
  <Button>Simple Button</Button>

</Container>



)


}

export default Sandbox;