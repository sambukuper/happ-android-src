package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ WorkDatabase Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ x39 f0;

    public /* synthetic */ jm0(WorkDatabase workDatabase, String str, x39 x39Var, byte b) {
        this.X = b;
        this.Y = workDatabase;
        this.Z = str;
        this.f0 = x39Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        x39 x39Var = this.f0;
        String str = this.Z;
        WorkDatabase workDatabase = this.Y;
        switch (b) {
            case 0:
                n49 n49VarX = workDatabase.x();
                n49VarX.getClass();
                str.getClass();
                Iterator it = ((List) u15.G(n49VarX.a, true, false, new nm7(str, (byte) 10))).iterator();
                while (it.hasNext()) {
                    pu.j(x39Var, (String) it.next());
                }
                break;
            default:
                n49 n49VarX2 = workDatabase.x();
                n49VarX2.getClass();
                Iterator it2 = ((List) u15.G(n49VarX2.a, true, false, new nm7(str, (byte) 12))).iterator();
                while (it2.hasNext()) {
                    pu.j(x39Var, (String) it2.next());
                }
                break;
        }
    }
}
