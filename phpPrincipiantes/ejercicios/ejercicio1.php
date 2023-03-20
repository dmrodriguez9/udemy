<?php
echo "Los números pares encontrados son: ";
for($i=0; $i<=50; $i++){;
    if($i%2==0){
        echo " " . $i ;
    }
}
echo "<br>";
echo "Los números impares encontrados son: ";
for($i=0; $i<=50; $i++){
    if($i%2!=0){
        echo " " . $i;
    }
}

?>