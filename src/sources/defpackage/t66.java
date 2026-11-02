package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t66 {
    public final ql6 a;

    public t66(ql6 ql6Var) {
        this.a = ql6Var;
    }

    public final void a(qr6 qr6Var, vt vtVar) {
        rt rtVar = (rt) vtVar.keySet();
        vt vtVar2 = rtVar.X;
        if (vtVar2.isEmpty()) {
            return;
        }
        if (vtVar.Z > 999) {
            gv3.R(vtVar, new s66(this, qr6Var, (byte) 0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        w39.i(vtVar2.Z, sb);
        sb.append(")");
        xr6 xr6VarX0 = qr6Var.X0(sb.toString());
        Iterator it = rtVar.iterator();
        int i = 1;
        while (true) {
            qt qtVar = (qt) it;
            if (!qtVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    xr6VarX0.close();
                    throw th;
                }
            }
            xr6VarX0.T(i, (String) qtVar.next());
            i++;
        }
        xr6VarX0.getClass();
        int iU = w45.u(xr6VarX0, "work_spec_id");
        if (iU == -1) {
            xr6VarX0.close();
            return;
        }
        while (xr6VarX0.S0()) {
            List list = (List) vtVar.get(xr6VarX0.p0(iU));
            if (list != null) {
                byte[] blob = xr6VarX0.getBlob(0);
                u91 u91Var = u91.b;
                list.add(wl7.A(blob));
            }
        }
        xr6VarX0.close();
    }

    public final void b(qr6 qr6Var, vt vtVar) {
        rt rtVar = (rt) vtVar.keySet();
        vt vtVar2 = rtVar.X;
        if (vtVar2.isEmpty()) {
            return;
        }
        if (vtVar.Z > 999) {
            gv3.R(vtVar, new s66(this, qr6Var, (byte) 1));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        w39.i(vtVar2.Z, sb);
        sb.append(")");
        xr6 xr6VarX0 = qr6Var.X0(sb.toString());
        Iterator it = rtVar.iterator();
        int i = 1;
        while (true) {
            qt qtVar = (qt) it;
            if (!qtVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    xr6VarX0.close();
                    throw th;
                }
            }
            xr6VarX0.T(i, (String) qtVar.next());
            i++;
        }
        xr6VarX0.getClass();
        int iU = w45.u(xr6VarX0, "work_spec_id");
        if (iU == -1) {
            xr6VarX0.close();
            return;
        }
        while (xr6VarX0.S0()) {
            List list = (List) vtVar.get(xr6VarX0.p0(iU));
            if (list != null) {
                list.add(xr6VarX0.p0(0));
            }
        }
        xr6VarX0.close();
    }
}
