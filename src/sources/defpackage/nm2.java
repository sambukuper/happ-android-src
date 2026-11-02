package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nm2 extends v3 implements me5 {
    public final /* synthetic */ qm2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm2(qm2 qm2Var) {
        super((byte) 3);
        this.c = qm2Var;
    }

    @Override // defpackage.me5
    public final void b(Object obj) {
        Object obj2;
        pm2 pm2Var;
        pm2 pm2Var2 = pm2.f0;
        ((ux0) this.b).V(new te5(obj));
        qm2 qm2Var = this.c;
        tv tvVar = qm2Var.f;
        do {
            obj2 = tvVar.a;
            pm2 pm2Var3 = (pm2) obj2;
            int iOrdinal = pm2Var3.ordinal();
            if (iOrdinal == 0) {
                pm2Var = pm2.Y;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + qm2Var + "! State is " + pm2Var3 + ' ');
                }
                pm2Var = pm2Var2;
            }
        } while (!tvVar.a(obj2, pm2Var));
        Iterator it = qm2Var.h.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        if (pm2Var == pm2Var2) {
            Iterator it2 = qm2Var.h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw p61.k(it2);
            }
        }
    }
}
