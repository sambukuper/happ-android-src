package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om3 extends no2 implements sn2 {
    public static final om3 X = new om3(3, rm3.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        Object objM;
        rm3 rm3Var = (rm3) obj;
        tz6 tz6Var = (tz6) obj2;
        int i = rm3.Z;
        do {
            objM = rm3Var.M();
            if (!(objM instanceof bb3)) {
                if (!(objM instanceof xx0)) {
                    objM = sm3.a(objM);
                }
                tz6Var.g0 = objM;
            }
            return dn8.a;
        } while (rm3Var.h0(objM) < 0);
        tz6Var.Z = u70.W(rm3Var, true, new lm3(rm3Var, tz6Var));
        return dn8.a;
    }
}
