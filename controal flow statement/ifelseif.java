class ifelseif{
public static void main (String[] args){

boolean withdraw=true;
boolean ministatement=true;
boolean checkbalance=false;

if(withdraw){
System.out.println("enter amount");
}

else if (ministatement){
System.out.println("collect statement");
}

else if(checkbalance){
System.out.println("account balance is o");
}

else{
System.out.println("sorry you did not entered anything");
}
}
}