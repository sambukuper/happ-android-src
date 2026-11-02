package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 implements d41 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ay1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.d41
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((d41) this.b).getClass();
                ((d41) this.b).accept(obj);
                return;
            case 1:
                ri2 ri2Var = (ri2) obj;
                if (ri2Var == null) {
                    ri2Var = new ri2(-3);
                }
                ((dq) this.b).H(ri2Var);
                return;
            default:
                ri2 ri2Var2 = (ri2) obj;
                synchronized (si2.c) {
                    try {
                        l97 l97Var = si2.d;
                        ArrayList arrayList = (ArrayList) l97Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        l97Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((d41) arrayList.get(i)).accept(ri2Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ ay1() {
        this.a = (byte) 0;
    }
}
