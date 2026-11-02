package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e93 implements c93 {
    public final /* synthetic */ byte X;
    public final ArrayList Y;
    public final Object Z;

    public e93() {
        this.X = (byte) 0;
        this.Z = new Object();
        this.Y = new ArrayList();
    }

    public void a(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        this.Y.add(p61.n(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // defpackage.c93
    public void b() {
        synchronized (this.Z) {
            try {
                for (d93 d93Var : this.Y) {
                    d93Var.c.m(d93Var.a, null);
                    d93Var.b.a();
                }
                this.Y.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c93
    public void c0(wg1 wg1Var) {
        synchronized (this.Z) {
            for (d93 d93Var : this.Y) {
                d93Var.getClass();
                if (dh3.f(d93Var.b, wg1Var)) {
                    wg1Var.a();
                }
            }
        }
    }

    @Override // defpackage.c93
    public void t(int i, wg1 wg1Var, qi0 qi0Var) {
        wg1Var.getClass();
        synchronized (this.Z) {
            this.Y.add(new d93(i, wg1Var, qi0Var));
        }
    }

    public String toString() {
        switch (this.X) {
            case 1:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.Z.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = this.Y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e93(Object obj) {
        this.X = (byte) 1;
        this.Z = obj;
        this.Y = new ArrayList();
    }
}
