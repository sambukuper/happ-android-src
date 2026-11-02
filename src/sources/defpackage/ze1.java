package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ ff1 Z;

    public /* synthetic */ ze1(ff1 ff1Var, ArrayList arrayList, byte b) {
        this.X = b;
        this.Z = ff1Var;
        this.Y = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ArrayList arrayList = this.Y;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ff1 ff1Var = this.Z;
                    if (!zHasNext) {
                        arrayList.clear();
                        ff1Var.m.remove(arrayList);
                    } else {
                        ef1 ef1Var = (ef1) it.next();
                        l lVar = ef1Var.a;
                        int i = ef1Var.b;
                        int i2 = ef1Var.c;
                        int i3 = ef1Var.d;
                        int i4 = ef1Var.e;
                        ff1Var.getClass();
                        View view = lVar.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        ff1Var.p.add(lVar);
                        viewPropertyAnimatorAnimate.setDuration(ff1Var.e).setListener(new bf1(ff1Var, lVar, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    ff1 ff1Var2 = this.Z;
                    if (!zHasNext2) {
                        arrayList.clear();
                        ff1Var2.n.remove(arrayList);
                        break;
                    } else {
                        df1 df1Var = (df1) it2.next();
                        ArrayList arrayList2 = ff1Var2.r;
                        long j = ff1Var2.f;
                        l lVar2 = df1Var.a;
                        View view2 = lVar2 == null ? null : lVar2.a;
                        l lVar3 = df1Var.b;
                        View view3 = lVar3 != null ? lVar3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(df1Var.a);
                            duration.translationX(df1Var.e - df1Var.c);
                            duration.translationY(df1Var.f - df1Var.d);
                            duration.alpha(0.0f).setListener(new cf1(ff1Var2, df1Var, duration, view2, (byte) 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(df1Var.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new cf1(ff1Var2, df1Var, viewPropertyAnimatorAnimate2, view3, (byte) 1)).start();
                        }
                    }
                }
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    ff1 ff1Var3 = this.Z;
                    if (!zHasNext3) {
                        arrayList.clear();
                        ff1Var3.l.remove(arrayList);
                    } else {
                        l lVar4 = (l) it3.next();
                        ff1Var3.getClass();
                        View view4 = lVar4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        ff1Var3.o.add(lVar4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(ff1Var3.c).setListener(new af1(ff1Var3, lVar4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
