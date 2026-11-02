package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dq4 extends z1 {
    public final /* synthetic */ byte X = 0;
    public final Object Y;

    public dq4(List list) {
        list.getClass();
        this.Y = list;
    }

    @Override // defpackage.z0
    public final int a() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((fq4) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.z0, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.X) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                String strGroup = ((fq4) obj).a.group(i);
                return strGroup == null ? _UrlKt.FRAGMENT_ENCODE_SET : strGroup;
            default:
                return ((List) obj).get(wv0.K0(i, this));
        }
    }

    @Override // defpackage.z1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.X) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.z1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.X) {
            case 1:
                return new qk6(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.z1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.X) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.z1, java.util.List
    public ListIterator listIterator() {
        switch (this.X) {
            case 1:
                return new qk6(this, 0);
            default:
                return super.listIterator();
        }
    }

    public dq4(fq4 fq4Var) {
        this.Y = fq4Var;
    }

    @Override // defpackage.z1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.X) {
            case 1:
                return new qk6(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
