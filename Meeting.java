public class Meeting {
    public static void main(String[] args) {
        int[] start_time = {2, 3, 5, 6, 7, 8};
        int[] end_time   = {3, 7, 7, 7, 8, 10};
 
        int n = start_time.length;
        int rooms = 0;
        int min_roomcount = 0;
 
        int j = 0; 
 
        for (int i = 0; i < n; i++) {
            
            if (start_time[i] < end_time[j]) {
                rooms++;
                min_roomcount = Math.max(min_roomcount, rooms);
            }
            else {
                while (j < n && start_time[i] >= end_time[j]) {
                    rooms--;
                    j++;
                }
                rooms++;
                min_roomcount = Math.max(min_roomcount, rooms);
            }
        }
 
        System.out.println("Minimum number of meeting rooms required = " + min_roomcount);
    }
}