public class Main {
    public static void main(String[] args) {
        int a[]=new int[10];
        int index=1;
        for (int i=0;i<5;i++){
            a[i]=i+1;
        }
        System.out.println("truoc khi xoa");
        for (int element:a){
            System.out.println(element+"");

        }
        System.out.println();
        for (int i=index;i< a.length;i++){
            a[i]=a[i+1];
        }
        System.out.println("sau khi xoa");
        for (int element:a){
            System.out.println(element+"");
        }
    }
}