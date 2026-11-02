package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qt implements Iterator, qv3 {
    public int X;
    public int Y;
    public boolean Z;
    public final /* synthetic */ byte f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qt(vt vtVar, byte b) {
        this(vtVar.Z);
        this.f0 = b;
        switch (b) {
            case 1:
                this.g0 = vtVar;
                this(vtVar.Z);
                break;
            default:
                this.g0 = vtVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y < this.X;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            bt.n();
            return null;
        }
        int i = this.Y;
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                objG = ((vt) obj).g(i);
                break;
            case 1:
                objG = ((vt) obj).j(i);
                break;
            default:
                objG = ((bu) obj).Y[i];
                break;
        }
        this.Y++;
        this.Z = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.Z) {
            bt.i("Call next() before removing an element.");
            return;
        }
        int i = this.Y - 1;
        this.Y = i;
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                ((vt) obj).h(i);
                break;
            case 1:
                ((vt) obj).h(i);
                break;
            default:
                ((bu) obj).a(i);
                break;
        }
        this.X--;
        this.Z = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qt(bu buVar) {
        this(buVar.Z);
        this.f0 = (byte) 2;
        this.g0 = buVar;
    }

    public qt(int i) {
        this.X = i;
    }
}
