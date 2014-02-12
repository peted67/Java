public void writeBillToFile(double amount , double billingAmount,double taxAmount,
                                   double discount ,double transactionID , double billingNumber , 
                                   int customerID , String tableNumber ,ArrayList listObject  )
    {
        FileWriter fw=null ;
        BufferedWriter bw =null;
        Date d=new Date();        
        long currentTimestamp=d.getTime();
        try{

            fw = new FileWriter("D:/study/ADVANCE_JAVA/PrOgRaMs/WEB_APPS/00_COS-THE MEGA PROJECT/COS_March_03/GeneratedBill/bill"+currentTimestamp+".txt" , true);        
            bw= new BufferedWriter(fw);

            System.out.println("Date and Time :: "+d.toString() +"\t Bill No :: "+billingNumber+"\t Transaction ID :: "+transactionID+"\n");
            bw.write("Date and Time :: "+d.toString() +" Bill No::"+billingNumber+" Transaction ID::"+transactionID);
            bw.newLine();
            Iterator  iteratorObject= listObject.iterator();
            while(iteratorObject.hasNext())        
            {          
                ItemInSessionModel itemObject = (ItemInSessionModel)iteratorObject.next();
                bw.write(itemObject.getItemName()+"    "+itemObject.getItemQty()+"     "+itemObject.getItemRate()+"     "+(itemObject.getItemRate()*itemObject.getItemQty()));
                bw.newLine();
            }

            bw.write("Total Amount ::"+amount);
            bw.newLine();
            bw.write("Discount     ::"+discount);
            bw.newLine();
            bw.write("TAX          ::"+taxAmount);
            bw.newLine();
            bw.write("Bill Amount  ::"+billingAmount);
            bw.newLine();
            bw.write("Thank You...!");
            System.out.println("Successfully Writen in File...!");
        }catch(Exception e)
        {
            System.out.println("Exception in FILE IO :: "+e);
        }
        finally
        {
            try{
            fw.close();
            bw.close();
            }catch(Exception e){}
        }
    }