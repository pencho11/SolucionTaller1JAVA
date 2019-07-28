package main ;

import static entidades.Mensajes.* ;

import entidades.operaciones.Promedio ;

import javax.swing.* ;
import java.text.DecimalFormat ;
import java.text.DecimalFormatSymbols ;


public class Main
{
    public static void main(String[] args)
    {
        Promedio promedio = new Promedio() ;

        DecimalFormatSymbols simbolo = new DecimalFormatSymbols() ;
        simbolo.setDecimalSeparator(',') ;
        simbolo.setGroupingSeparator('.') ;

        DecimalFormat formateador = new DecimalFormat( "###,###.##", simbolo ) ;

        do
         {
            String opc = JOptionPane.showInputDialog( null,MENSAJE_INFORMANTE.getMensajes() +
                    MENSAJE_MENU.getMensajes() + MENSAJE_OPCION_UNO.getMensajes() +
                    MENSAJE_OPCION_DOS.getMensajes() ) ;
            promedio.setOpcion( Byte.parseByte(opc) ) ;

            switch ( promedio.getOpcion() )
            {
                case 1:
                String notaN1 = JOptionPane.showInputDialog( MENSAJE_NOTA1.getMensajes() ) ;
                promedio.setNota1( Double.parseDouble( notaN1 ) ) ;

                String notaN2 = JOptionPane.showInputDialog( MENSAJE_NOTA2.getMensajes() ) ;
                promedio.setNota2( Double.parseDouble(notaN2) ) ;

                String notaN3 = JOptionPane.showInputDialog( MENSAJE_NOTA3.getMensajes() ) ;
                promedio.setNota3( Double.parseDouble( notaN3 ) ) ;

                if ( (promedio.totalPromedio() == 5.0) || (promedio.totalPromedio() >= 4.0)  )
                {

                    JOptionPane.showMessageDialog( null, MENSAJE_PROMEDIO_ALTO.getMensajes() +
                            formateador.format( promedio.totalPromedio() ) ) ;
                }
                else if ( (promedio.totalPromedio() >= 3.0) || (promedio.totalPromedio() == 3.9)  )
                {
                    JOptionPane.showMessageDialog( null, MENSAJE_PROMEDIO_BUENO.getMensajes() +
                            formateador.format( promedio.totalPromedio() ) ) ;
                }
                else if ( (promedio.totalPromedio() >= 2.0) || (promedio.totalPromedio() == 2.9)  )
                {
                    JOptionPane.showMessageDialog( null, MENSAJE_PROMEDIO_REGULAR.getMensajes() +
                            formateador.format( promedio.totalPromedio() ) ) ;
                }
                else if ( (promedio.totalPromedio() >= 1.0) || (promedio.totalPromedio() == 1.9)  )
                {
                    JOptionPane.showMessageDialog( null, MENSAJE_PROMEDIO_MALO.getMensajes() +
                            formateador.format( promedio.totalPromedio() ) ) ;
                }
                else
                {
                    JOptionPane.showMessageDialog( null, MENSAJE_PROMEDIO_PESIMO.getMensajes() +
                            formateador.format( promedio.totalPromedio() ) ) ;
                }
                break;

                case 2:
                    JOptionPane.showMessageDialog( null, MENSAJE_DESPEDIDA.getMensajes() ) ;
                    break;

                default:
                    JOptionPane.showMessageDialog( null, MENSAJE_DE_ERROR.getMensajes() ) ;
                    break;
            }
         }
        while ( promedio.getOpcion() != 2 ) ;
    }
}
