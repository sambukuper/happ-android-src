package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class er5 {
    public Object[] a;
    public int b;

    public er5(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            bt.q("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        Object[] objArr = this.a;
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        } else if (i == objArr.length) {
            Object[] objArr2 = new Object[(i >> 2) + i];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            this.a = objArr2;
            objArr = objArr2;
        }
        objArr[i] = obj;
        this.b = i + 1;
    }

    public void c(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public boolean d(Object obj) {
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                bt.i("Already in the pool!");
                return false;
            }
        }
        int i3 = this.b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }

    public er5() {
        this.a = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    }
}
