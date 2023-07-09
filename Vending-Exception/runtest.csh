#!/usr/bin/tcsh

@ cont = 1

while ( $cont <= 25 )

java -cp ".;..\..\..\..\..\..\Tools\jabuti;..\..\..\..\..\..\Tools\jabuti\lib\BCEL.jar;..\..\..\..\..\..\Tools\jabuti\lib\jviewsall.jar" probe.ProberLoader -P $1 vending.TestDriver ../testset/input$cont

@ cont = $cont + 1

end
