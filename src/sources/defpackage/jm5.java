package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class jm5 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public Object Y;
    public final Map Z;
    public int f0;

    public /* synthetic */ jm5(Object obj, Map map, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = map;
    }

    public za4 a() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        Object obj = this.Z.get(this.Y);
        if (obj != null) {
            za4 za4Var = (za4) obj;
            this.f0++;
            this.Y = za4Var.c;
            return za4Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.Y + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Map map = this.Z;
        switch (b) {
            case 0:
                return this.f0 < map.size();
            case 1:
                return this.f0 < map.size();
            default:
                return this.f0 < map.size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        byte b = this.X;
        Object obj = null;
        Map map = this.Z;
        switch (b) {
            case 0:
                return a();
            case 1:
                if (hasNext()) {
                    obj = this.Y;
                    this.f0++;
                    Object obj2 = map.get(obj);
                    if (obj2 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.Y = ((ab4) obj2).b;
                } else {
                    bt.n();
                }
                return obj;
            default:
                if (hasNext()) {
                    obj = this.Y;
                    this.f0++;
                    Object obj3 = map.get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.Y = ((bb4) obj3).b;
                } else {
                    bt.n();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
