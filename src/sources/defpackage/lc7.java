package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lc7 implements Iterator {
    public final /* synthetic */ byte X;
    public int Y;
    public boolean Z;
    public Object f0;
    public final /* synthetic */ Object g0;

    public lc7(df8 df8Var) {
        this.X = (byte) 2;
        this.g0 = df8Var;
        this.f0 = new bf8();
        this.Z = true;
        this.Y = 0;
    }

    public Iterator a() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                Iterator it = (Iterator) this.f0;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((gc7) obj).Z.entrySet().iterator();
                this.f0 = it2;
                return it2;
            default:
                Iterator it3 = (Iterator) this.f0;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((hc7) obj).Y.entrySet().iterator();
                this.f0 = it4;
                return it4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    public int b(char c) {
        df8 df8Var = (df8) this.g0;
        if (c >= 56319) {
            return 56319;
        }
        int iB = df8Var.b(c);
        do {
            c++;
            if (c > 56319) {
                break;
            }
        } while (df8Var.b((char) c) == iB);
        return c - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return this.Y + 1 < ((gc7) obj).Y.size() || a().hasNext();
            case 1:
                hc7 hc7Var = (hc7) obj;
                return this.Y + 1 < hc7Var.X.size() || (!hc7Var.Y.isEmpty() && a().hasNext());
            default:
                return this.Z || this.Y < 56320;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iB;
        int iB2;
        int i;
        int iA;
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                this.Z = true;
                int i2 = this.Y + 1;
                this.Y = i2;
                gc7 gc7Var = (gc7) obj;
                return i2 < gc7Var.Y.size() ? (Map.Entry) gc7Var.Y.get(this.Y) : (Map.Entry) a().next();
            case 1:
                this.Z = true;
                int i3 = this.Y + 1;
                this.Y = i3;
                hc7 hc7Var = (hc7) obj;
                return i3 < hc7Var.X.size() ? (Map.Entry) hc7Var.X.get(this.Y) : (Map.Entry) a().next();
            default:
                df8 df8Var = (df8) obj;
                if (!hasNext()) {
                    bt.n();
                    return null;
                }
                int i4 = this.Y;
                if (i4 >= 1114112) {
                    this.Z = false;
                    i4 = 55296;
                    this.Y = 55296;
                }
                if (this.Z) {
                    iB = df8Var.a(i4);
                    iB2 = df8Var.e(this.Y, iB);
                    while (iB2 < 1114111 && (iA = df8Var.a((i = iB2 + 1))) == iB) {
                        iB2 = df8Var.e(i, iA);
                    }
                } else {
                    iB = df8Var.b((char) i4);
                    iB2 = b((char) this.Y);
                    while (iB2 < 56319) {
                        char c = (char) (iB2 + 1);
                        if (df8Var.b(c) == iB) {
                            iB2 = b(c);
                        }
                    }
                }
                bf8 bf8Var = (bf8) this.f0;
                bf8Var.a = this.Y;
                bf8Var.b = iB2;
                bf8Var.c = iB;
                bf8Var.d = !this.Z;
                this.Y = iB2 + 1;
                return bf8Var;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                gc7 gc7Var = (gc7) obj;
                if (!this.Z) {
                    bt.i("remove() was called before next()");
                    return;
                }
                this.Z = false;
                int i = gc7.h0;
                gc7Var.b();
                if (this.Y >= gc7Var.Y.size()) {
                    a().remove();
                    return;
                }
                int i2 = this.Y;
                this.Y = i2 - 1;
                gc7Var.g(i2);
                return;
            case 1:
                hc7 hc7Var = (hc7) obj;
                if (!this.Z) {
                    bt.i("remove() was called before next()");
                    return;
                }
                this.Z = false;
                int i3 = hc7.h0;
                hc7Var.b();
                if (this.Y >= hc7Var.X.size()) {
                    a().remove();
                    return;
                }
                int i4 = this.Y;
                this.Y = i4 - 1;
                hc7Var.i(i4);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ lc7(AbstractMap abstractMap, byte b) {
        this.X = b;
        this.g0 = abstractMap;
        this.Y = -1;
    }
}
