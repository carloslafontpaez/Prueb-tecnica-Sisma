<?php
   require_once("model/Message.php");

class ControllerMessage {

    function __construct() {
        $this->msg = new Message();
    }
    
    function showMessage() { 
        return $this->msg->msg();
    } 
}

?>
