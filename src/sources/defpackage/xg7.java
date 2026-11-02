package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xg7 extends nh8 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xg7(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // defpackage.ui8
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // defpackage.ui8
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // defpackage.nh8
    public final ni8 g(lh8 lh8Var) {
        byte b = this.c;
        Object obj = this.d;
        lh8Var.getClass();
        switch (b) {
            case 0:
                if (!((ArrayList) obj).contains(lh8Var)) {
                    return null;
                }
                ot0 ot0VarX = lh8Var.x();
                ot0VarX.getClass();
                return cj8.j((hi8) ot0VarX);
            default:
                return (ni8) ((Map) obj).get(lh8Var);
        }
    }
}
