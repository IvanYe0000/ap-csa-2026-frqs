public Account(String requestedName){
  String username = requestedName;
  if(username.isAvailable()){
    username = requestedName; 
  } else {
    return false;
}
