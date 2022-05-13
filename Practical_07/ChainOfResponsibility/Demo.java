class Demo{
static ATMhandler createchain(){
ATMhandler twothousand = new Twothousand();
ATMhandler fivehundread = new Fivehundread();
ATMhandler twohundread = new Twohundread();
ATMhandler hundread = new Hundread();
twothousand.setnexthandler(fivehundread);
fivehundread.setnexthandler(twohundread);
twohundread.setnexthandler(hundread);
return(twothousand);
}
public static void main(String args[])
{
ATMhandler handler=Demo.createchain();
handler.handleRequest(new Request(2800));
}
}



