public class tree_node {

    int num;
    tree_node left;
    tree_node right;

    public tree_node(int num){

        this.num = num;
        this.left = null;
        this.right = null;

    }


    public void add(int x){

        if(x > num){
            if(right != null) {
                right.add(x);
            }
            else{
                right = new tree_node(x);
                right.num = x;
            }
        }
        if(x < num) {
            if(left != null) {
                left.add(x);
            }
            else {
                left = new tree_node(x);
                left.num = x;
            }
        }
    }

    public String order(){

        String ret = "";
        if(left != null) {
            ret = ret + left.order();
        }
        ret = ret + num;
        if(right != null) {
            ret = ret + right.order();
        }
        return ret;
    }

    public boolean find(int x){
        System.out.println(num);

        if(num == x) {
            return true;
        }
        else if(x > num && right != null) {
            return right.find(x);
        }
        else if(x < num && left != null) {
            return left.find(x);
        }
        return false;
    }


}


