package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p00 implements dq1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p00(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.dq1
    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                m00 m00Var = (m00) obj2;
                fz0 fz0Var = (fz0) obj;
                if (m00Var.a != null) {
                    fz0Var.b.e();
                } else if (m00Var.b == null) {
                    bt.i("Unreachable");
                } else {
                    fz0Var.a.e();
                }
                break;
            case 1:
                ((nc3) obj2).a.j((lc3) obj);
                break;
            case 2:
                ((o74) obj2).Z.k(obj);
                break;
            case 3:
                ((d94) obj2).getX().f((fy0) obj);
                break;
            case 4:
                ((b88) obj2).c.remove((gn2) obj);
                break;
            case 5:
                ((ce8) obj2).k.remove((ce8) obj);
                break;
            case 6:
                ce8 ce8Var = (ce8) obj2;
                rd8 rd8Var = (rd8) ((sd8) obj).b.getValue();
                if (rd8Var != null) {
                    ce8Var.j.remove(rd8Var.X);
                }
                break;
            case 7:
                ((ce8) obj2).j.remove((yd8) obj);
                break;
            default:
                c29 c29Var = (c29) obj2;
                View view = (View) obj;
                int i = c29Var.u - 1;
                c29Var.u = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = cw8.a;
                    uv8.c(view, null);
                    c19.a(view, null);
                    view.removeOnAttachStateChangeListener(c29Var.v);
                }
                break;
        }
    }
}
