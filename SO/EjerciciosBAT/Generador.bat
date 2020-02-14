rem ESTO ES UN COMENTARIO
echo off
cls
echo ****************************
echo PROGRAMADO POR ALBERTO PRADO
echo ****************************
md i:\_DoctorGalleta\carpeta1
md i:\_DoctorGalleta\carpeta1\carpeta2
md i:\_DoctorGalleta\carpeta1\carpeta2\carpeta3\carpeta4\carpeta5
copy generador.bat i:\_DoctorGalleta\carpeta1\carpeta2\carpeta3\carpeta4\carpeta5
copy generador.bat i:\_DoctorGalleta\carpeta1\carpeta2\carpeta3\carpeta4\carpeta5\gen1.bat
copy generador.bat i:\_DoctorGalleta\carpeta1\carpeta2\carpeta3\carpeta4\carpeta5\gen2.alejandr
copy generador.bat i:\_DoctorGalleta\carpeta1\carpeta2\carpeta3\carpeta4\carpeta5\patata.docx
FOR /L %%x IN (1, 1 ,100) DO copy generador.bat i:\_DoctorGalleta\carpeta1\carpeta2\carpeta3\carpeta4\carpeta5\patata%%x.docx

pause