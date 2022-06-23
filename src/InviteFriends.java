// Find number of ways in which you can invite n people to your party . single or in pair.

public class InviteFriends {
    public static int wayToInvite(int n){
        if (n<=1){
            return 1;
        }
        // single
        int single = wayToInvite(n-1);
        // in Pair
        int InPair = (n-1)*wayToInvite(n-2);
        return single + InPair;
    }

    public static void main(String[] args) {
        int PossibleWays = wayToInvite(4);
        System.out.println(PossibleWays);
    }
}
