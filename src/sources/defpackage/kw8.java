package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kw8 implements ov8 {
    public static final boolean j0 = true;
    public static final ReferenceQueue k0 = new ReferenceQueue();
    public static final iw8 l0 = new iw8(0);
    public final xb X;
    public boolean Y;
    public final View Z;
    public boolean f0;
    public final Choreographer g0;
    public final jw8 h0;
    public final Handler i0;

    public kw8(View view, Object obj) {
        if (obj != null) {
            bt.q("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            throw null;
        }
        this.X = new xb(this, (byte) 25);
        this.Y = false;
        this.Z = view;
        if (Looper.myLooper() == null) {
            bt.i("DataBinding must be created in view's UI Thread");
            throw null;
        }
        this.g0 = Choreographer.getInstance();
        this.h0 = new jw8(this);
    }

    public static kw8 c(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        return x91.a.b(layoutInflater.inflate(i, viewGroup, false), i);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091 A[ADDED_TO_REGION] */
    public static void d(View view, Object[] objArr, SparseIntArray sparseIntArray, boolean z) {
        int id;
        int i;
        int i2;
        int length;
        if ((view != null ? (kw8) view.getTag(m46.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (z && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf <= 0 || (length = str.length()) == (i2 = iLastIndexOf + 1)) {
                id = view.getId();
                if (id > 0) {
                    objArr[i] = view;
                }
            } else {
                int i3 = i2;
                while (true) {
                    if (i3 >= length) {
                        int length2 = str.length();
                        int iCharAt = 0;
                        while (i2 < length2) {
                            iCharAt = (iCharAt * 10) + (str.charAt(i2) - '0');
                            i2++;
                        }
                        if (objArr[iCharAt] == null) {
                            objArr[iCharAt] = view;
                        }
                    } else if (Character.isDigit(str.charAt(i3))) {
                        i3++;
                    } else {
                        id = view.getId();
                        if (id > 0) {
                            objArr[i] = view;
                        }
                    }
                }
            }
        } else if (str == null || !str.startsWith("binding_")) {
            id = view.getId();
            if (id > 0 && sparseIntArray != null && (i = sparseIntArray.get(id, -1)) >= 0 && objArr[i] == null) {
                objArr[i] = view;
            }
        } else {
            int length3 = str.length();
            int iCharAt2 = 0;
            for (int i4 = 8; i4 < length3; i4++) {
                iCharAt2 = (iCharAt2 * 10) + (str.charAt(i4) - '0');
            }
            if (objArr[iCharAt2] == null) {
                objArr[iCharAt2] = view;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                d(viewGroup.getChildAt(i5), objArr, sparseIntArray, false);
            }
        }
    }

    public static Object[] e(View view, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        d(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public abstract void a();

    public abstract boolean b();

    public final void f() {
        synchronized (this) {
            try {
                if (this.Y) {
                    return;
                }
                this.Y = true;
                if (j0) {
                    this.g0.postFrameCallback(this.h0);
                } else {
                    this.i0.post(this.X);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(View view) {
        view.setTag(m46.dataBinding, this);
    }

    @Override // defpackage.ov8
    public final View getRoot() {
        return this.Z;
    }
}
