public Account(String requestedName){
  username = requestedName;
  int num = 1; 
  if(username.isAvailable()){
    username = requestedName + num;
    num++;
  }
}
