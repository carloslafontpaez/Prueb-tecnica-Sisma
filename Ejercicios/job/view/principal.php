<?php 

    require_once("controller/ControllerMessage.php");
    $show = new ControllerMessage();
    
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
</head>
<body>
    <h1 style="text-align: center;"> <?php echo ($show->showMessage());?> </h1>
<div class="container pt-4"> 
    <div class="row">
        <div class="col-lg-12">
            <form action="/job/view/resultado.php"  method="POST">
                <div class="form-group mb-2">
                    <label for="sentence">Frase</label>
                    <input type="text" class="form-control" name="sentence" id="sentence" placeholder="Enter sentence">
                </div>           
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div> 
</body>
</html>