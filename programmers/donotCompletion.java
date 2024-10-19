import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
        Collections.sort(participantList);
        Collections.sort(completionList);

        for (int i=0; i<participantList.size()-1; i++) {
            if (!participantList.get(i).equals(completionList.get(i))) {
                answer = participantList.get(i);
                break;
            }
        }

        if (answer.equals("")) {
            answer = participantList.get(participantList.size()-1);
        }

        return answer;
    }
}
