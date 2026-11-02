package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qm3 extends no2 implements sn2 {
    public static final qm3 X = new qm3(3, rm3.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        Object objM;
        dn8 dn8Var;
        rm3 rm3Var = (rm3) obj;
        tz6 tz6Var = (tz6) obj2;
        int i = rm3.Z;
        do {
            objM = rm3Var.M();
            boolean z = objM instanceof bb3;
            dn8Var = dn8.a;
            if (!z) {
                tz6Var.g0 = dn8Var;
                return dn8Var;
            }
        } while (rm3Var.h0(objM) < 0);
        tz6Var.Z = u70.W(rm3Var, true, new mm3(rm3Var, tz6Var));
        return dn8Var;
    }
}
