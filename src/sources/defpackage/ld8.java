package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ld8 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public Iterator Y;
    public final Object Z;

    public ld8(md8 md8Var) {
        this.X = (byte) 0;
        this.Z = md8Var;
        this.Y = md8Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return ((md8) obj).b.B(this.Y.next());
            default:
                Object next = this.Y.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                w1 w1Var = viewGroup != null ? new w1(viewGroup, (byte) 7) : null;
                if (w1Var == null || !w1Var.hasNext()) {
                    while (!this.Y.hasNext() && !arrayList.isEmpty()) {
                        this.Y = (Iterator) wv0.A0(arrayList);
                        bw0.j0(arrayList);
                    }
                } else {
                    arrayList.add(this.Y);
                    this.Y = w1Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ld8(w1 w1Var) {
        this.X = (byte) 1;
        this.Z = new ArrayList();
        this.Y = w1Var;
    }
}
