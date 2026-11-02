package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sq5 {
    public final int a;
    public final dn2 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final e21[] f;
    public final k17 g;
    public final xr0 h;

    public sq5(int i, dn2 dn2Var) {
        this.a = i;
        this.b = dn2Var;
        this.f = new e21[i];
        int i2 = l17.a;
        this.g = new k17(i, 0);
        this.h = new xr0(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        rq5 rq5Var;
        if (s51Var instanceof rq5) {
            rq5Var = (rq5) s51Var;
            int i = rq5Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rq5Var.i0 = i - Integer.MIN_VALUE;
            } else {
                rq5Var = new rq5(this, s51Var);
            }
        } else {
            rq5Var = new rq5(this, s51Var);
        }
        Object obj = rq5Var.g0;
        int i2 = rq5Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            rq5Var.f0 = this;
            rq5Var.i0 = 1;
            Object objA = this.g.a(rq5Var);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = rq5Var.f0;
            w39.n0(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            xr0 xr0Var = this.h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    nr4.T(21, "Connection pool is closed");
                    throw null;
                }
                if (xr0Var.b == xr0Var.c && this.d < this.a) {
                    e21 e21Var = new e21((qr6) this.b.invoke());
                    e21[] e21VarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    e21VarArr[i3] = e21Var;
                    xr0Var.a(e21Var);
                }
                int i4 = xr0Var.b;
                if (i4 == xr0Var.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) xr0Var.e;
                Object obj2 = objArr[i4];
                objArr[i4] = null;
                xr0Var.b = (i4 + 1) & xr0Var.d;
                e21 e21Var2 = (e21) obj2;
                reentrantLock.unlock();
                return e21Var2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.g.c();
            throw th2;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (e21 e21Var : this.f) {
                if (e21Var != null) {
                    e21Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        xr0 xr0Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            gb4 gb4VarR = i21.r();
            int iL = xr0Var.l();
            for (int i = 0; i < iL; i++) {
                gb4VarR.add(xr0Var.g(i));
            }
            gb4 gb4VarJ = i21.j(gb4VarR);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(iu.a.getIntVolatile(this.g, j17.h0), 0) + ", ");
            sb.append("queue=(size=" + gb4VarJ.a() + ")[" + wv0.y0(gb4VarJ, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            e21[] e21VarArr = this.f;
            int length = e21VarArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                e21 e21Var = e21VarArr[i3];
                i2++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i2);
                sb2.append("] - ");
                sb2.append(e21Var != null ? e21Var.X.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (e21Var != null) {
                    e21Var.p(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(e21 e21Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(e21Var);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
