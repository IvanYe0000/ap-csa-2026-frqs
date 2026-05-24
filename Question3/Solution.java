public int moreHistoryThanMathAbsence(){
  int count = 0;
  for( Courserecord c : historyList){
    for (courserfecord m :mathList){
      if (c.getStudentID().equals(m.getStudentID()) && c.getAbsence() > m.getAbsence()){
        count++;
      }
    }
  }
  return count;
}
  
