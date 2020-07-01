// BUBBLE SORT //////////////////////////////////
        int array[] = {4,2,1,5,3,9,7,6,8};
        boolean sorted = true;

        for (int i=0;i<=(array.length)-1;i++){
            for (int j=0;j<(array.length)-1-i;j++){
                if (array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    sorted = false;
                }
            }if (sorted) break;
        }
        for (int items: array) {
            System.out.print(items + " ");
        }
