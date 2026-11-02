package defpackage;

import io.sentry.c2;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class st implements Iterator, Map.Entry {
    public int X;
    public int Y = -1;
    public boolean Z;
    public final /* synthetic */ vt f0;

    public st(vt vtVar) {
        this.f0 = vtVar;
        this.X = vtVar.Z - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.Z) {
            bt.i("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.Y;
            vt vtVar = this.f0;
            if (dh3.f(key, vtVar.g(i)) && dh3.f(entry.getValue(), vtVar.j(this.Y))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.Z) {
            return this.f0.g(this.Y);
        }
        bt.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.Z) {
            return this.f0.j(this.Y);
        }
        bt.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y < this.X;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.Z) {
            bt.i("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.Y;
        vt vtVar = this.f0;
        Object objG = vtVar.g(i);
        Object objJ = vtVar.j(this.Y);
        return (objG == null ? 0 : objG.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        this.Y++;
        this.Z = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.Z) {
            c2.g();
            return;
        }
        this.f0.h(this.Y);
        this.Y--;
        this.X--;
        this.Z = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.Z) {
            return this.f0.i(this.Y, obj);
        }
        bt.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
