package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v86 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ RecyclerView Y;

    public /* synthetic */ v86(RecyclerView recyclerView, byte b) {
        this.X = b;
        this.Y = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.X;
        RecyclerView recyclerView = this.Y;
        switch (b) {
            case 0:
                if (recyclerView.A0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.y0) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.D0) {
                        recyclerView.C0 = true;
                    } else {
                        recyclerView.p();
                    }
                    break;
                }
                break;
            default:
                d96 d96Var = recyclerView.S0;
                if (d96Var != null) {
                    ff1 ff1Var = (ff1) d96Var;
                    long j = ff1Var.d;
                    ArrayList<l> arrayList = ff1Var.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = ff1Var.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = ff1Var.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = ff1Var.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (l lVar : arrayList) {
                            View view = lVar.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            ff1Var.q.add(lVar);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new af1(ff1Var, lVar, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            ff1Var.m.add(arrayList5);
                            arrayList2.clear();
                            ze1 ze1Var = new ze1(ff1Var, arrayList5, (byte) 0);
                            if (z2) {
                                ze1Var.run();
                            } else {
                                View view2 = ((ef1) arrayList5.get(0)).a.a;
                                WeakHashMap weakHashMap = cw8.a;
                                view2.postOnAnimationDelayed(ze1Var, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            ff1Var.n.add(arrayList6);
                            arrayList3.clear();
                            ze1 ze1Var2 = new ze1(ff1Var, arrayList6, (byte) 1);
                            if (z2) {
                                ze1Var2.run();
                            } else {
                                View view3 = ((df1) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap2 = cw8.a;
                                view3.postOnAnimationDelayed(ze1Var2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            ff1Var.l.add(arrayList7);
                            arrayList4.clear();
                            ze1 ze1Var3 = new ze1(ff1Var, arrayList7, (byte) 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                ze1Var3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? ff1Var.e : 0L, zIsEmpty3 ? 0L : ff1Var.f) + j;
                                z = false;
                                View view4 = ((l) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap3 = cw8.a;
                                view4.postOnAnimationDelayed(ze1Var3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.q1 = z;
                break;
        }
    }
}
