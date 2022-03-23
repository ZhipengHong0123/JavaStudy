public class FindMountain1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;
        //find peak
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int peak = left;

        // find left
        left = 0;
        right = peak;
        int left_minimal = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) == target) {
                left_minimal = mid;
            }
            if (mountainArr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        // find right
        left = peak;
        right = mountainArr.length() - 1;
        int right_minimal = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) == target) {
                right_minimal = mid;
            }
            if (mountainArr.get(mid) < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        if (left_minimal ==-1 || right_minimal == -1){
            return Math.max(left_minimal,right_minimal);
        }else {
            return Math.min(left_minimal,right_minimal);
        }
    }

    interface MountainArray {
        public default int get(int index) {
            return -1;
        }

        public default int length() {
            return -1;
        }
    }
}
