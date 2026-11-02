package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 extends uy7 implements gn2 {
    public Object g0;
    public Serializable h0;
    public Object i0;
    public Object j0;
    public Iterator k0;
    public int l0;
    public byte m0;
    public final /* synthetic */ ib1 n0;
    public final /* synthetic */ z47 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa1(ib1 ib1Var, z47 z47Var, q51 q51Var) {
        super(1, q51Var);
        this.n0 = ib1Var;
        this.o0 = z47Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((sa1) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new sa1(this.n0, this.o0, q51Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009e->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        o15 o15VarA;
        aa6 aa6Var;
        ea6 ea6Var;
        ea6 ea6Var2;
        o15 o15Var;
        Iterator it;
        o15 o15Var2;
        aa6 aa6Var2;
        ea6 ea6Var3;
        ra1 ra1Var;
        ea6 ea6Var4;
        aa6 aa6Var3;
        rn2 rn2Var;
        Object obj2;
        int iHashCode;
        Integer numA;
        Object obj3;
        byte b = this.m0;
        z47 z47Var = this.o0;
        ib1 ib1Var = this.n0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            o15VarA = r15.a();
            aa6Var = new aa6();
            ea6Var = new ea6();
            this.g0 = o15VarA;
            this.h0 = aa6Var;
            this.i0 = ea6Var;
            this.j0 = ea6Var;
            this.m0 = (byte) 1;
            obj = ib1Var.g(true, this);
            if (obj != c71Var) {
                ea6Var2 = ea6Var;
            }
            return c71Var;
        }
        if (b == 1) {
            ea6Var = (ea6) this.j0;
            ea6Var2 = (ea6) this.i0;
            aa6Var = (aa6) this.h0;
            o15VarA = (o15) this.g0;
            w39.n0(obj);
        } else {
            if (b == 2) {
                it = this.k0;
                ra1Var = (ra1) this.j0;
                ea6Var3 = (ea6) this.i0;
                aa6Var2 = (aa6) this.h0;
                o15Var2 = (o15) this.g0;
                w39.n0(obj);
                while (it.hasNext()) {
                    rn2Var = (rn2) it.next();
                    this.g0 = o15Var2;
                    this.h0 = aa6Var2;
                    this.i0 = ea6Var3;
                    this.j0 = ra1Var;
                    this.k0 = it;
                    this.m0 = (byte) 2;
                    if (rn2Var.K(ra1Var, this) == c71Var) {
                        return c71Var;
                    }
                }
                ea6Var2 = ea6Var3;
                aa6Var = aa6Var2;
                o15Var = o15Var2;
                z47Var.f0 = null;
                this.g0 = aa6Var;
                this.h0 = ea6Var2;
                this.i0 = o15Var;
                this.j0 = null;
                this.k0 = null;
                this.m0 = (byte) 3;
                if (o15Var.g(this) != c71Var) {
                    ea6Var4 = ea6Var2;
                    aa6Var3 = aa6Var;
                    aa6Var3.X = true;
                    o15Var.m(null);
                    obj2 = ea6Var4.X;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    ja7 ja7VarB = ib1Var.b();
                    this.g0 = obj2;
                    this.h0 = null;
                    this.i0 = null;
                    this.l0 = iHashCode;
                    this.m0 = (byte) 4;
                    numA = ja7VarB.a();
                    if (numA != c71Var) {
                        obj = numA;
                        obj3 = obj2;
                    }
                }
                return c71Var;
            }
            if (b == 3) {
                o15Var = (o15) this.i0;
                ea6Var4 = (ea6) this.h0;
                aa6Var3 = (aa6) this.g0;
                w39.n0(obj);
                try {
                    aa6Var3.X = true;
                    o15Var.m(null);
                    obj2 = ea6Var4.X;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    ja7 ja7VarB2 = ib1Var.b();
                    this.g0 = obj2;
                    this.h0 = null;
                    this.i0 = null;
                    this.l0 = iHashCode;
                    this.m0 = (byte) 4;
                    numA = ja7VarB2.a();
                    if (numA != c71Var) {
                        obj = numA;
                        obj3 = obj2;
                    }
                    return c71Var;
                } catch (Throwable th) {
                    o15Var.m(null);
                    throw th;
                }
            }
            if (b != 4) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.l0;
            obj3 = this.g0;
            w39.n0(obj);
        }
        return new v91(iHashCode, ((Number) obj).intValue(), obj3);
        ea6Var.X = ((v91) obj).b;
        ra1 ra1Var2 = new ra1(o15VarA, aa6Var, ea6Var2, ib1Var);
        List list = (List) z47Var.f0;
        if (list != null) {
            it = list.iterator();
            o15Var2 = o15VarA;
            aa6Var2 = aa6Var;
            ea6Var3 = ea6Var2;
            ra1Var = ra1Var2;
            while (it.hasNext()) {
                rn2Var = (rn2) it.next();
                this.g0 = o15Var2;
                this.h0 = aa6Var2;
                this.i0 = ea6Var3;
                this.j0 = ra1Var;
                this.k0 = it;
                this.m0 = (byte) 2;
                if (rn2Var.K(ra1Var, this) == c71Var) {
                    return c71Var;
                }
            }
            ea6Var2 = ea6Var3;
            aa6Var = aa6Var2;
            o15Var = o15Var2;
        } else {
            o15Var = o15VarA;
        }
        z47Var.f0 = null;
        this.g0 = aa6Var;
        this.h0 = ea6Var2;
        this.i0 = o15Var;
        this.j0 = null;
        this.k0 = null;
        this.m0 = (byte) 3;
        if (o15Var.g(this) != c71Var) {
            ea6Var4 = ea6Var2;
            aa6Var3 = aa6Var;
            aa6Var3.X = true;
            o15Var.m(null);
            obj2 = ea6Var4.X;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            ja7 ja7VarB3 = ib1Var.b();
            this.g0 = obj2;
            this.h0 = null;
            this.i0 = null;
            this.l0 = iHashCode;
            this.m0 = (byte) 4;
            numA = ja7VarB3.a();
            if (numA != c71Var) {
                obj = numA;
                obj3 = obj2;
                return new v91(iHashCode, ((Number) obj).intValue(), obj3);
            }
        }
        return c71Var;
    }
}
