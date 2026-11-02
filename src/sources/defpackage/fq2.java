package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fq2 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public int Y;
    public Object Z;
    public final Object f0;

    public fq2(v05 v05Var) {
        this.X = (byte) 2;
        this.f0 = v05Var;
        this.Y = -1;
        this.Z = jm4.P(new u05(v05Var, this, null));
    }

    public void a() {
        Object objB;
        int i = this.Y;
        z92 z92Var = (z92) this.f0;
        if (i == -2) {
            objB = ((dn2) z92Var.b).invoke();
        } else {
            gn2 gn2Var = (gn2) z92Var.c;
            Object obj = this.Z;
            obj.getClass();
            objB = gn2Var.B(obj);
        }
        this.Z = objB;
        this.Y = objB == null ? 0 : 1;
    }

    public void b() {
        Iterator it = (Iterator) this.f0;
        if (it.hasNext()) {
            Object next = it.next();
            ed1 ed1Var = (ed1) next;
            ed1Var.getClass();
            if (ed1Var instanceof jd0) {
                this.Y = 1;
                this.Z = next;
                return;
            }
        }
        this.Y = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                if (this.Y < 0) {
                    a();
                }
                return this.Y == 1;
            case 1:
                return ((v27) this.Z).hasNext();
            case 2:
                return ((v27) this.Z).hasNext();
            case 3:
                if (this.Y == -1) {
                    b();
                }
                return this.Y == 1;
            default:
                return ((Iterator) this.Z).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                if (this.Y < 0) {
                    a();
                }
                if (this.Y == 0) {
                    bt.n();
                    return null;
                }
                Object obj = this.Z;
                obj.getClass();
                this.Y = -1;
                return obj;
            case 1:
                return ((v27) this.Z).next();
            case 2:
                return ((v27) this.Z).next();
            case 3:
                if (this.Y == -1) {
                    b();
                }
                if (this.Y == 0) {
                    bt.n();
                    return null;
                }
                Object obj2 = this.Z;
                this.Z = null;
                this.Y = -1;
                return obj2;
            default:
                x51 x51Var = (x51) ((z92) this.f0).c;
                int i = this.Y;
                this.Y = i + 1;
                if (i >= 0) {
                    return x51Var.K(Integer.valueOf(i), ((Iterator) this.Z).next());
                }
                i21.X();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.X;
        Object obj = this.f0;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.Y;
                if (i != -1) {
                    ((n05) obj).Y.h(i);
                    this.Y = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.Y;
                if (i2 != -1) {
                    ((v05) obj).Y.m(i2);
                    this.Y = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public fq2(hu huVar) {
        this.X = (byte) 3;
        this.f0 = ((u27) huVar.b).iterator();
        this.Y = -1;
    }

    public fq2(z92 z92Var, byte b) {
        this.X = (byte) 0;
        this.f0 = z92Var;
        this.Y = -2;
    }

    public fq2(z92 z92Var) {
        this.X = (byte) 4;
        this.f0 = z92Var;
        this.Z = new rd2((sd2) z92Var.b);
    }

    public fq2(n05 n05Var) {
        this.X = (byte) 1;
        this.f0 = n05Var;
        this.Y = -1;
        this.Z = jm4.P(new m05(n05Var, this, null));
    }
}
