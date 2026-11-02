package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v27 implements Iterator, q51, qv3 {
    public byte X;
    public Object Y;
    public Iterator Z;
    public q51 f0;

    public final RuntimeException a() {
        byte b = this.X;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.X));
    }

    public final void b(q51 q51Var, Object obj) {
        this.Y = obj;
        this.X = (byte) 3;
        this.f0 = q51Var;
        q51Var.getClass();
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        w39.n0(obj);
        this.X = (byte) 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            byte b = this.X;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.Z;
                it.getClass();
                if (it.hasNext()) {
                    this.X = (byte) 2;
                    return true;
                }
                this.Z = null;
            }
            this.X = (byte) 5;
            q51 q51Var = this.f0;
            q51Var.getClass();
            this.f0 = null;
            q51Var.f(dn8.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            bt.n();
            return null;
        }
        if (b == 2) {
            this.X = (byte) 1;
            Iterator it = this.Z;
            it.getClass();
            return it.next();
        }
        if (b != 3) {
            throw a();
        }
        this.X = (byte) 0;
        Object obj = this.Y;
        this.Y = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.q51
    public final s61 w() {
        return b02.X;
    }
}
