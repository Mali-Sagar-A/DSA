
public class Remove_Duplicated_02 {
	public static void main(String[] args) {
		int arr[] = new int[] { 3, 12, 23, 5, 3, 13, 12, 23, 7, -999 };
		int tar[] = new int[10];
		int i, j, tar_index;

		tar[0] = arr[0];
		tar_index = 0;

		for (i = 1; arr[i] != -999; i++) {
			for (j = 0; j <= tar_index; j++) {
				if (arr[i] == tar[j]) {
					break;
				}
			}
			if (j > tar_index) {
				tar_index++;
				tar[tar_index] = arr[i];
			}
		}

		for (i = 0; i <tar_index; i++) {
			System.out.print(tar[i] + " ");
		}
	}

}
