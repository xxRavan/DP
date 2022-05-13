abstract class ATMhandler{
int level;
 ATMhandler nexthandler;
void setnexthandler(ATMhandler nexthandler){
this.nexthandler=nexthandler;
}

public void handleRequest(Request request)
{
if((request.amount%100)==0)
{
if(level<=request.amount){
calculate(request.amount, level);
}
else if(nexthandler!=null){
nexthandler.handleRequest(request);
}
}
else{
System.out.println("Amount " +request.amount+" is not multiple of 100");
}
}

void calculate(int amount,int level)
{
int no=amount/level;
int amnt=amount%level;
System.out.println(level+ "  Rupees note:  "+no);
if(amnt!=0)
this.handleRequest(new Request(amnt));
}
}
