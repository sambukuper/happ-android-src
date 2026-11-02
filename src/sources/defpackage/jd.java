package defpackage;

import android.view.ActionMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jd implements dq1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.dq1
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                oo1 oo1Var = (oo1) obj;
                oo1Var.dismiss();
                oo1Var.j0.e();
                break;
            case 1:
                ir5 ir5Var = (ir5) obj;
                ir5Var.e();
                ir5Var.setTag(v36.view_tree_lifecycle_owner, null);
                ir5Var.v0.removeViewImmediate(ir5Var);
                break;
            case 2:
                ch chVar = (ch) obj;
                xd7 xd7Var = chVar.e;
                o61 o61Var = xd7Var.h;
                if (o61Var != null) {
                    o61Var.h();
                }
                xd7Var.a();
                ActionMode actionMode = chVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                chVar.h = null;
                break;
            case 3:
                h30 h30Var = (h30) ((i30) obj).c.getValue();
                if (h30Var != null) {
                    h30Var.close();
                }
                break;
            case 4:
                r68 r68Var = (r68) obj;
                r68Var.r();
                r68Var.j = null;
                break;
            case 5:
                mm0 mm0Var = ((jc8) obj).d;
                if (mm0Var != null) {
                    mm0Var.z(null);
                }
                break;
            case 6:
                ((e64) obj).d = null;
                break;
            case 7:
                p64 p64Var = (p64) obj;
                sa2 sa2Var = p64Var.c;
                if (sa2Var != null) {
                    sa2Var.b = false;
                }
                p64Var.c = null;
                break;
            case 8:
                k64 k64Var = (k64) obj;
                k64Var.f = true;
                k64Var.d = 0;
                k64Var.c();
                break;
            default:
                ow4 ow4Var = (ow4) obj;
                ow4Var.dismiss();
                ow4Var.k0.e();
                break;
        }
    }
}
