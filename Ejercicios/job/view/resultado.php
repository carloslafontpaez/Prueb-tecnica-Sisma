<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>resultado</title>

    <?php 

        $cadena = '';
        $words = explode(" ",$_POST['sentence']);
    for ($i=0; $i<count($words); $i++) {   
        $size = strlen($words[$i]);
        $characters = str_split($words[$i]); 
        $count = 0;
        for($j=0; $j<$size; $j++) { 
            if($characters[$j] == $characters[$j+1]){
                $count++;
            }
            $cadena = $characters[0].($size-2)-$count.$characters[$size-1];
        } 
        echo $cadena;  
    }
    ?>
</head>
<body>
    
</body>
</html>