package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yi implements dq1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yi(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.dq1
    public final void a() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((vd7) obj3).remove(obj2);
                ((lj) obj).c.j(obj2);
                break;
            case 1:
                ((d94) obj3).getX().f((y84) obj2);
                o00 o00Var = (o00) ((ea6) obj).X;
                if (o00Var != null) {
                    o00Var.a();
                }
                break;
            default:
                jv6 jv6Var = (jv6) obj3;
                nv6 nv6Var = (nv6) obj;
                if (jv6Var.Y.j(obj2) == nv6Var) {
                    Map map = jv6Var.X;
                    Map mapD = nv6Var.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
