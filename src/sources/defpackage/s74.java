package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s74 extends AbstractList implements RandomAccess, t74 {
    public static final on8 Y = new on8(new s74());
    public final ArrayList X;

    public s74(t74 t74Var) {
        this.X = new ArrayList(t74Var.size());
        addAll(t74Var);
    }

    @Override // defpackage.t74
    public final on8 C() {
        return new on8(this);
    }

    @Override // defpackage.t74
    public final void D(mc4 mc4Var) {
        this.X.add(mc4Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.X.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof t74) {
            collection = ((t74) collection).g();
        }
        boolean zAddAll = this.X.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.X.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.t74
    public final List g() {
        return Collections.unmodifiableList(this.X);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.X;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof jb0) {
            jb0 jb0Var = (jb0) obj;
            String strR = jb0Var.r();
            if (jb0Var.h()) {
                arrayList.set(i, strR);
            }
            return strR;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = dg3.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (bt7.h(0, bArr.length, bArr) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            xw3.o("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.X.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof jb0) {
            return ((jb0) objRemove).r();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = dg3.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            xw3.o("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.X.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof jb0) {
            return ((jb0) obj2).r();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = dg3.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            xw3.o("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }

    @Override // defpackage.t74
    public final jb0 u(int i) {
        jb0 mc4Var;
        ArrayList arrayList = this.X;
        Object obj = arrayList.get(i);
        if (obj instanceof jb0) {
            mc4Var = (jb0) obj;
        } else if (obj instanceof String) {
            try {
                mc4Var = new mc4(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                xw3.o("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            mc4Var = new mc4(bArr2);
        }
        if (mc4Var != obj) {
            arrayList.set(i, mc4Var);
        }
        return mc4Var;
    }

    public s74() {
        this.X = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.X.size(), collection);
    }
}
