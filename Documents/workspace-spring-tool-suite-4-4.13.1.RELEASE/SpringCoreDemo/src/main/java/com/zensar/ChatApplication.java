package com.zensar;



import java.util.List;
import java.util.Map;
import java.util.Set;



  public class ChatApplication {
       Map<String,Set<String>> usersMap;
       Map<String, List<String>> massagesMap;

  public ChatApplication() {
       super();
}



   public ChatApplication(Map<String, Set<String>> usersMap, Map<String, List<String>> massagesMap) {
       super();
       this.usersMap = usersMap;
       this.massagesMap = massagesMap;
}



   public Map<String, Set<String>> getUsersMap() {
       return usersMap;
}



   public void setUsersMap(Map<String, Set<String>> usersMap) {
       this.usersMap = usersMap;
}



   public Map<String, List<String>> getMassagesMap() {
       return massagesMap;
}



   public void setMassagesMap(Map<String, List<String>> massagesMap) {
       this.massagesMap = massagesMap;
}



@Override
   public String toString() {
       return "ChatApplication [usersMap=" + usersMap + ", massagesMap=" + massagesMap + "]";
   }
}