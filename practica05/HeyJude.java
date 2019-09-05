public class HeyJude
{
    public static void main (String[] args){

    String l1 = ("Hey Jude");
    String l2 = ("don't");
    String l3 = ("make it bad");
    String l4 = ("be afraid");
    String l5 = ("let me down");
    String l6 = ("take a sad song and make it better");
    String l7 = ("you were made to go out and get her");
    String l8 = ("you have found her, now go and get her");
    String l9 = ("remember to");
    String l10 = ("let her into you heart");
    String l11 = ("let her under your skin");
    String l12 = ("then you");
    String l13 = ("can start");
    String l14 = ("begin");
    String l15 = ("to make it better");
    String l16 = (", oh");
    String l17 = ("na ");    
    String l18 = ("better ");

    int p=0;
    int na=0;
    while(p<7)
    {
      p++;
      if(p==1){
        System.out.println();
        System.out.println(l1+" "+l2+" "+l3);
        System.out.println(l6);
        System.out.println(l9+" "+l10);
        System.out.println(l12+" "+l13+" "+l15);
        System.out.println();
        }
      
        if(p==2){
        System.out.println();
        System.out.println(l1+" "+l2+" "+l4);
        System.out.println(l7);
        System.out.println(l9+" "+l11);
        System.out.println(l12+" "+l14+" "+l15);
        
        
         }

           if(p==4){
        System.out.println();
        System.out.println(l1+" "+l2+" "+l5);
        System.out.println(l8);
        System.out.println(l9+" "+l10);
        System.out.println(l12+" "+l13+" "+l15);
        
         }

        if(p==6){
        System.out.println();
        System.out.println(l1+" "+l2+" "+l3);
        System.out.println(l6);
        System.out.println(l9+" "+l11);
        System.out.println(l12+" "+l14+" "+l15);
       
      }
 
    
         
       if(p==3||p==5||p==7){
           int c=0; 
           System.out.println(); 
           System.out.println();  
           while(c<10)
            {
          c++;
          
          System.out.print(l17);
          
           }  
          if (p==7) {
        System.out.print(l1);
        } 
          else {
        System.out.println();
          }
          
         }     

       if(p==6){
           int b=0;    
           while(b<5)
            {
          b++;
          
          System.out.print(l18);
           }  
          
         }
       if(p==6){
        System.out.print(l16);

         }

        
      }

    }
   
        
}

