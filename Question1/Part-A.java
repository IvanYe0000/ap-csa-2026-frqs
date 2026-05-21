public Account(String requestedName){
  username = requestedName;
  if(username.isAvailable()){
    username = requestedName; 
  } else {
    return false;
}
