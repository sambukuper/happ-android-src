package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 implements rn2, sn2, tn2, un2, vn2, wn2, xn2, yn2, en2, fn2, hn2, in2, jn2, kn2, ln2, mn2, nn2, pn2, qn2 {
    public final int X;
    public final boolean Y;
    public Object Z;
    public j86 f0;
    public ArrayList g0;

    public zy0(int i, boolean z, Object obj) {
        this.X = i;
        this.Y = z;
        this.Z = obj;
    }

    @Override // defpackage.tn2
    public final /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (lp2) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.xn2
    public final /* bridge */ /* synthetic */ Object G(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, lp2 lp2Var, Integer num) {
        return g(obj, bool, obj2, obj3, obj4, lp2Var, num.intValue());
    }

    @Override // defpackage.rn2
    public final /* bridge */ /* synthetic */ Object K(Object obj, Object obj2) {
        return c(((Number) obj2).intValue(), (lp2) obj);
    }

    @Override // defpackage.un2
    public final /* bridge */ /* synthetic */ Object N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e((h30) obj, obj2, obj3, (lp2) obj4, ((Number) obj5).intValue());
    }

    public final Object c(int i, lp2 lp2Var) {
        lp2Var.X(this.X);
        l(lp2Var);
        int iP = i | (lp2Var.f(this) ? jm4.p(2, 0) : jm4.p(1, 0));
        Object obj = this.Z;
        obj.getClass();
        ci8.i(2, obj);
        Object objK = ((rn2) obj).K(lp2Var, Integer.valueOf(iP));
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new yy0(2, this, zy0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 0);
        }
        return objK;
    }

    public final Object e(h30 h30Var, Object obj, Object obj2, lp2 lp2Var, int i) {
        lp2Var.X(this.X);
        l(lp2Var);
        int iP = lp2Var.f(this) ? jm4.p(2, 3) : jm4.p(1, 3);
        Object obj3 = this.Z;
        obj3.getClass();
        ci8.i(5, obj3);
        Object objN = ((un2) obj3).N(h30Var, obj, obj2, lp2Var, Integer.valueOf(iP | i));
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i40(this, h30Var, obj, obj2, i);
        }
        return objN;
    }

    public final Object f(Object obj, lp2 lp2Var, int i) {
        lp2Var.X(this.X);
        l(lp2Var);
        byte b = 1;
        int iP = lp2Var.f(this) ? jm4.p(2, 1) : jm4.p(1, 1);
        Object obj2 = this.Z;
        obj2.getClass();
        ci8.i(3, obj2);
        Object objX = ((sn2) obj2).x(obj, lp2Var, Integer.valueOf(iP | i));
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl(b, i, this, obj);
        }
        return objX;
    }

    public final Object g(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, lp2 lp2Var, int i) {
        lp2Var.X(this.X);
        l(lp2Var);
        int iP = lp2Var.f(this) ? jm4.p(2, 6) : jm4.p(1, 6);
        Object obj5 = this.Z;
        obj5.getClass();
        ci8.i(8, obj5);
        Object objG = ((xn2) obj5).G(obj, bool, obj2, obj3, obj4, lp2Var, Integer.valueOf(i | iP));
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wu(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objG;
    }

    public final Object j(Object obj, Object obj2, lp2 lp2Var, int i) {
        lp2Var.X(this.X);
        l(lp2Var);
        int iP = lp2Var.f(this) ? jm4.p(2, 2) : jm4.p(1, 2);
        Object obj3 = this.Z;
        obj3.getClass();
        ci8.i(4, obj3);
        Object objF = ((tn2) obj3).F(obj, obj2, lp2Var, Integer.valueOf(iP | i));
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(this, obj, obj2, i);
        }
        return objF;
    }

    public final void l(lp2 lp2Var) {
        j86 j86VarW;
        if (!this.Y || (j86VarW = lp2Var.w()) == null) {
            return;
        }
        j86VarW.b |= 1;
        j86 j86Var = this.f0;
        if (j86Var == null || !j86Var.a() || j86Var == j86VarW || dh3.f(j86Var.c, j86VarW.c)) {
            this.f0 = j86VarW;
            return;
        }
        ArrayList arrayList = this.g0;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.g0 = arrayList2;
            arrayList2.add(j86VarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j86 j86Var2 = (j86) arrayList.get(i);
            if (j86Var2 == null || !j86Var2.a() || j86Var2 == j86VarW || dh3.f(j86Var2.c, j86VarW.c)) {
                arrayList.set(i, j86VarW);
                return;
            }
        }
        arrayList.add(j86VarW);
    }

    @Override // defpackage.sn2
    public final /* bridge */ /* synthetic */ Object x(Object obj, Object obj2, Object obj3) {
        return f(obj, (lp2) obj2, ((Number) obj3).intValue());
    }
}
