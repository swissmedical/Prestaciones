package ar.com.smg.carencias;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Autorizacion implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String estado;
   private java.lang.String mensaje;

   public Autorizacion()
   {
   }

   public java.lang.String getEstado()
   {
      return this.estado;
   }

   public void setEstado(java.lang.String estado)
   {
      this.estado = estado;
   }

   public java.lang.String getMensaje()
   {
      return this.mensaje;
   }

   public void setMensaje(java.lang.String mensaje)
   {
      this.mensaje = mensaje;
   }

   public Autorizacion(java.lang.String estado, java.lang.String mensaje)
   {
      this.estado = estado;
      this.mensaje = mensaje;
   }

}