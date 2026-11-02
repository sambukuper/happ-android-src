package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v28 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ v28(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0258  */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        pl plVar;
        boolean z;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        byte b2 = 1;
        switch (b) {
            case 0:
                aa6 aa6Var = (aa6) obj4;
                pl plVar2 = (pl) obj3;
                qe7 qe7Var = (qe7) obj2;
                pl plVar3 = (pl) obj;
                if (aa6Var.X) {
                    Object obj5 = plVar3.a;
                    int i = plVar3.c;
                    int i2 = plVar3.b;
                    if ((obj5 instanceof qe7) && i2 == plVar2.b && i == plVar2.c) {
                        if (qe7Var == null) {
                            qe7Var = new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65535);
                        }
                        plVar = new pl(i2, i, qe7Var);
                    } else {
                        plVar = plVar3;
                    }
                } else {
                    plVar = plVar3;
                }
                aa6Var.X = plVar2.equals(plVar3);
                return plVar;
            case 1:
                da6 da6Var = (da6) obj4;
                r68 r68Var = (r68) obj3;
                da6Var.X = n07.a(r68Var.k().c());
                ((da6) obj2).X = 0L;
                r68Var.w(true);
                y24 y24VarQ = r68Var.q();
                r68Var.n.setValue(new z85(y24VarQ != null ? y24VarQ.b(0L) : 9205357640488583168L));
                r68Var.B(ev2.X, da6Var.X);
                return dn8Var;
            case 2:
                r68 r68Var2 = (r68) obj3;
                s48 s48Var = (s48) obj2;
                z85 z85Var = (z85) obj;
                ((a23) obj4).invoke();
                boolean z2 = r68Var2.i;
                y78 y78Var = r68Var2.b;
                if (z2 && r68Var2.h) {
                    s48Var.invoke();
                    if (r68Var2.a.d().Z.length() > 0) {
                        r68Var2.x(true);
                    }
                    r68Var2.y(s88.X);
                    r68Var2.v(ys7.c(y78Var, y78Var.a(z85Var.a)));
                }
                return dn8Var;
            default:
                r68 r68Var3 = (r68) obj4;
                b71 b71Var = (b71) obj3;
                Context context = (Context) obj2;
                e38 e38Var = (e38) obj;
                j05 j05Var = e38Var.a;
                j05 j05Var2 = e38Var.a;
                s38 s38Var = s38.b;
                j05Var.a(s38Var);
                o38 o38Var = o38.Autofill;
                byte b3 = 0;
                boolean z3 = !f88.b(r68Var3.a.d().f0) && r68Var3.m();
                q51 q51Var = null;
                byte b4 = 28;
                a23 a23Var = new a23(b71Var, new t68(r68Var3, q51Var, b3), b4);
                Resources resources = context.getResources();
                s88 s88Var = s88.X;
                ii iiVar = new ii(a23Var, q51Var, r68Var3, s88Var, (byte) 8);
                if (z3) {
                    j05Var2.a(new n38(w79.c, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, iiVar));
                }
                o38 o38Var2 = o38.Autofill;
                boolean zB = f88.b(r68Var3.a.d().f0);
                a23 a23Var2 = new a23(b71Var, new t68(r68Var3, q51Var, b2), b4);
                Resources resources2 = context.getResources();
                ii iiVar2 = new ii(a23Var2, q51Var, r68Var3, s88Var, (byte) 8);
                if (!zB) {
                    j05Var2.a(new n38(w79.d, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, iiVar2));
                }
                o38 o38Var3 = o38.Autofill;
                if (!r68Var3.m()) {
                    z = false;
                } else if (r68Var3.y.Y) {
                    z = true;
                } else {
                    dn2 dn2Var = r68Var3.m;
                    if (dn2Var != null && dn2Var.invoke() != null) {
                        c2.m();
                    }
                    z = false;
                }
                a23 a23Var3 = new a23(b71Var, new t68(r68Var3, q51Var, (byte) 2), b4);
                Resources resources3 = context.getResources();
                ii iiVar3 = new ii(a23Var3, q51Var, r68Var3, s88Var, (byte) 8);
                if (z) {
                    j05Var2.a(new n38(w79.e, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, iiVar3));
                }
                o38 o38Var4 = o38.Autofill;
                kd8 kd8Var = r68Var3.a;
                long j = kd8Var.d().f0;
                boolean z4 = f88.c(j) - f88.d(j) != kd8Var.d().Z.length();
                n30 n30Var = new n30(r68Var3, (byte) 7);
                n30 n30Var2 = new n30(r68Var3, (byte) 8);
                Resources resources4 = context.getResources();
                ii iiVar4 = new ii(n30Var2, n30Var, r68Var3, s88.Z, (byte) 8);
                if (z4) {
                    j05Var2.a(new n38(w79.f, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, iiVar4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    o38 o38Var5 = o38.Autofill;
                    b2 = (r68Var3.m() && f88.b(r68Var3.a.d().f0)) ? (byte) 1 : (byte) 0;
                    n30 n30Var3 = new n30(r68Var3, (byte) 9);
                    Resources resources5 = context.getResources();
                    ii iiVar5 = new ii(n30Var3, q51Var, r68Var3, s88Var, (byte) 8);
                    if (b2 != 0) {
                        j05Var2.a(new n38(o38Var5.X, resources5.getString(o38Var5.Y), o38Var5.Z, iiVar5));
                    }
                }
                j05Var2.a(s38Var);
                return dn8Var;
        }
    }
}
