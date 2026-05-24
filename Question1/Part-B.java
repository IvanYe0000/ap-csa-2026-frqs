public string getShortenName(){
  string result = "";
  for (int i = 0; i < username.length(); i++){
    if (username.charAt(i) != '-'){
      result += username.charAt(i){
    else{
      result = result.substring(0, result.length() - 1);
    }
  }
  return result
}
