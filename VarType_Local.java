public class VarType_Local {
    VarType_Local() {
        int a = 1000;
        System.out.println("Constructor localVariable a: " + a);
    }

    void localVarAddition() {
        int a=5,b=10,c;
        c=a+b;
        System.out.println("Method localVariable a: "+a);
        System.out.println("Method localVariable b: "+b);
        System.out.println("Method Addition of localVariable c: "+c);
        for(int j=1;j<=5;j++) {
            System.out.println("Block localVariable : "+j);
        }
    }
}
