import React from 'react';
import { Button,Card } from 'react-bootstrap';


function CustomCard(){

    return (
<Card>
<Card.Img src="https://picsum.photos/200/100"/>
    <Card.Body>
        <Card.Title>
            Card Title
        </Card.Title>
        <Card.Text>This is card text!</Card.Text>
    </Card.Body>
    <Button variant="primary">Read More</Button>
    </Card>

    )


}


export default CustomCard;