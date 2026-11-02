package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.viewpager2.widget.ViewPager2;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rb8 implements lt4, xk, u4, zc6, fa5 {
    public final /* synthetic */ byte X;
    public Object Y;

    public rb8(byte b) {
        this.X = b;
        switch (b) {
            case 6:
                this.Y = new gj4();
                break;
            case 10:
                Object obj = ns2.c;
                this.Y = new SparseIntArray();
                break;
            default:
                ow7 ow7VarB = pw7.b();
                nf1 nf1Var = tp1.a;
                this.Y = gv3.c(g33.K(ow7VarB, ye1.Z));
                break;
        }
    }

    @Override // defpackage.lt4
    public void D(nt4 nt4Var) {
        sb8 sb8Var = (sb8) this.Y;
        boolean zO = sb8Var.g.a.o();
        Window.Callback callback = sb8Var.h;
        if (zO) {
            callback.onPanelClosed(108, nt4Var);
        } else if (callback.onPreparePanel(0, null, nt4Var)) {
            callback.onMenuOpened(108, nt4Var);
        }
    }

    public long a(long j) {
        gj4 gj4Var = (gj4) this.Y;
        if (tu8.b(j) <= 0.0f || tu8.c(j) <= 0.0f) {
            wc3.b("maximumVelocity should be a positive value. You specified=".concat(tu8.g(j)));
        }
        return a38.a(((vu8) gj4Var.Y).c(tu8.b(j)), ((vu8) gj4Var.Z).c(tu8.c(j)));
    }

    @Override // defpackage.zc6
    public void accept(Object obj, Object obj2) {
        z18 z18Var = (z18) obj2;
        c99 c99Var = (c99) ((i99) obj).h();
        i28 i28Var = (i28) this.Y;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c99Var.h);
        int i = n89.a;
        if (i28Var == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            i28Var.writeToParcel(parcelObtain, 0);
        }
        try {
            c99Var.g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            z18Var.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, s51 s51Var) {
        ro8 ro8Var;
        Object rj6Var;
        cp8 cp8Var;
        if (s51Var instanceof ro8) {
            ro8Var = (ro8) s51Var;
            int i = ro8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                ro8Var = new ro8(this, s51Var);
            }
        } else {
            ro8Var = new ro8(this, s51Var);
        }
        Object objP = ro8Var.f0;
        int i2 = ro8Var.h0;
        try {
            if (i2 == 0) {
                w39.n0(objP);
                ss8 ss8Var = ss8.a;
                ro8Var.h0 = 1;
                objP = ss8Var.p(str, 7000L, ro8Var);
                c71 c71Var = c71.X;
                if (objP == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objP);
            }
            String str2 = (String) objP;
            if (str2 != null) {
                cp3 cp3Var = mr.a;
                g55 g55Var = cp3Var.b;
                cp8Var = (cp8) cp3Var.a(cp8.Companion.serializer(), str2);
                if (cp8Var == null || !dh3.f(cp8Var.a, "happ_android")) {
                    rj6Var = cp8Var;
                    rj6Var = null;
                }
            } else {
                rj6Var = cp8Var;
                rj6Var = null;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        rj6Var = cp8Var;
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable c(s51 s51Var) {
        so8 so8Var;
        if (s51Var instanceof so8) {
            so8Var = (so8) s51Var;
            int i = so8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                so8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                so8Var = new so8(this, s51Var);
            }
        } else {
            so8Var = new so8(this, s51Var);
        }
        Object objG = so8Var.f0;
        int i2 = so8Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objG);
            List<String> list = wo8.a;
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            for (String str : list) {
                m51 m51Var = (m51) this.Y;
                nf1 nf1Var = tp1.a;
                arrayList.add(w51.j(m51Var, ye1.Z, new t17(this, str, q51Var, (byte) 18), 2));
            }
            so8Var.h0 = 1;
            objG = jb5.g(arrayList, so8Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objG);
        }
        Iterable iterable = (Iterable) objG;
        iterable.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public int d(Context context, is2 is2Var) {
        int i;
        int iB;
        w45.s(context);
        w45.s(is2Var);
        int iF = is2Var.f();
        SparseIntArray sparseIntArray = (SparseIntArray) this.Y;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iF, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.Y;
        synchronized (sparseIntArray2) {
            iB = 0;
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    if (iKeyAt > iF && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iB == -1) {
                iB = ns2.d.b(context, iF);
            }
            sparseIntArray2.put(iF, iB);
        }
        return iB;
    }

    @Override // defpackage.u4
    public boolean f(View view) {
        yr6 yr6Var = (yr6) this.Y;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) yr6Var.g0;
        if (viewPager2.w0) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    @Override // defpackage.xk
    public ne2 get(int i) {
        switch (this.X) {
            case 4:
                return ((te2[]) this.Y)[i];
            default:
                return (ne2) this.Y;
        }
    }

    @Override // defpackage.fa5
    public /* synthetic */ void i(fb9 fb9Var) {
        ((CountDownLatch) this.Y).countDown();
    }

    @Override // defpackage.lt4
    public boolean l(nt4 nt4Var, MenuItem menuItem) {
        return false;
    }

    public /* synthetic */ rb8(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public /* synthetic */ rb8(byte b, boolean z) {
        this.X = b;
    }

    public rb8(d94 d94Var) {
        this.X = (byte) 8;
        d94Var.getClass();
        this.Y = new WeakReference(d94Var);
    }

    public rb8(float f, float f2, wk wkVar) {
        this.X = (byte) 4;
        int iB = wkVar.b();
        te2[] te2VarArr = new te2[iB];
        for (int i = 0; i < iB; i++) {
            te2VarArr[i] = new te2(f, f2, wkVar.a(i));
        }
        this.Y = te2VarArr;
    }
}
