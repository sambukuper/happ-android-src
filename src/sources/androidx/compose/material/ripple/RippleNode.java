package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material3.a;
import androidx.compose.material3.b;
import defpackage.dw0;
import defpackage.el6;
import defpackage.em7;
import defpackage.et5;
import defpackage.fb;
import defpackage.fi1;
import defpackage.ft5;
import defpackage.fw0;
import defpackage.gl6;
import defpackage.gt5;
import defpackage.hg;
import defpackage.hi5;
import defpackage.ht5;
import defpackage.i21;
import defpackage.ig;
import defpackage.j05;
import defpackage.jx4;
import defpackage.jy2;
import defpackage.lr;
import defpackage.nr4;
import defpackage.oi;
import defpackage.p34;
import defpackage.p61;
import defpackage.pc;
import defpackage.q51;
import defpackage.rv1;
import defpackage.s01;
import defpackage.sm0;
import defpackage.sv1;
import defpackage.u15;
import defpackage.ua7;
import defpackage.um0;
import defpackage.w24;
import defpackage.w51;
import defpackage.wg;
import defpackage.wl6;
import defpackage.xd6;
import defpackage.xz4;
import defpackage.yn0;
import defpackage.z68;
import defpackage.z85;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Ljx4;", "Ls01;", "Lrv1;", "Lw24;", "Lfw0;", "color", "Lfw0;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RippleNode extends jx4 implements s01, rv1, w24 {
    private final fw0 color;
    public final xz4 q0;
    public final boolean r0;
    public final float s0;
    public final a t0;
    public wg u0;
    public float v0;
    public boolean x0;
    public long w0 = 0;
    public final j05 y0 = new j05();

    public RippleNode(xz4 xz4Var, boolean z, float f, b bVar, a aVar) {
        this.q0 = xz4Var;
        this.r0 = z;
        this.s0 = f;
        this.color = bVar;
        this.t0 = aVar;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        w51.G(M0(), null, null, new jy2((Object) this, (q51) null, (byte) 24), 3);
    }

    public final void Y0(ht5 ht5Var) {
        gl6 gl6Var;
        if (!(ht5Var instanceof ft5)) {
            if (ht5Var instanceof gt5) {
                gl6 gl6Var2 = ((ig) this).A0;
                if (gl6Var2 != null) {
                    gl6Var2.d();
                    return;
                }
                return;
            }
            if (!(ht5Var instanceof et5) || (gl6Var = ((ig) this).A0) == null) {
                return;
            }
            gl6Var.d();
            return;
        }
        ft5 ft5Var = (ft5) ht5Var;
        long j = this.w0;
        float f = this.v0;
        ig igVar = (ig) this;
        el6 el6Var = igVar.z0;
        byte b = 0;
        if (el6Var == null) {
            Object obj = (View) hi5.W(igVar, pc.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    em7.h("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    el6 el6Var2 = new el6(viewGroup.getContext());
                    viewGroup.addView(el6Var2);
                    el6Var = el6Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof el6) {
                        el6Var = (el6) childAt;
                        break;
                    }
                    i++;
                }
            }
            igVar.z0 = el6Var;
        }
        ArrayList arrayList = el6Var.g0;
        xd6 xd6Var = el6Var.i0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) xd6Var.Y;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) xd6Var.Y;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) xd6Var.Z;
        gl6 gl6Var3 = (gl6) linkedHashMap.get(igVar);
        if (gl6Var3 == null) {
            ArrayList arrayList2 = el6Var.h0;
            arrayList2.getClass();
            gl6Var3 = (gl6) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (gl6Var3 == null) {
                if (el6Var.j0 > i21.G(arrayList)) {
                    gl6Var3 = new gl6(el6Var.getContext());
                    el6Var.addView(gl6Var3);
                    arrayList.add(gl6Var3);
                } else {
                    gl6Var3 = (gl6) arrayList.get(el6Var.j0);
                    ig igVar2 = (ig) linkedHashMap3.get(gl6Var3);
                    if (igVar2 != null) {
                        igVar2.A0 = null;
                        z68.W(igVar2);
                        gl6 gl6Var4 = (gl6) linkedHashMap2.get(igVar2);
                        if (gl6Var4 != null) {
                        }
                        linkedHashMap2.remove(igVar2);
                        gl6Var3.c();
                    }
                }
                int i2 = el6Var.j0;
                if (i2 < el6Var.f0 - 1) {
                    el6Var.j0 = i2 + 1;
                } else {
                    el6Var.j0 = 0;
                }
            }
            linkedHashMap2.put(igVar, gl6Var3);
            linkedHashMap3.put(gl6Var3, igVar);
        }
        int iO = nr4.O(f);
        long jA = igVar.color.a();
        igVar.t0.invoke();
        gl6 gl6Var5 = gl6Var3;
        gl6Var5.b(ft5Var, igVar.r0, j, iO, jA, new hg(igVar, b));
        igVar.A0 = gl6Var5;
        z68.W(igVar);
    }

    @Override // defpackage.w24, defpackage.as4
    public final void a(long j) {
        float fH0;
        this.x0 = true;
        fi1 fi1Var = yn0.Z(this).A0;
        this.w0 = u15.R(j);
        float f = this.s0;
        if (Float.isNaN(f)) {
            long j2 = this.w0;
            float fD = ua7.d(j2);
            fH0 = z85.c((((long) Float.floatToRawIntBits(ua7.b(j2))) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32)) / 2.0f;
            if (this.r0) {
                fH0 += fi1Var.h0(10.0f);
            }
        } else {
            fH0 = fi1Var.h0(f);
        }
        this.v0 = fH0;
        j05 j05Var = this.y0;
        Object[] objArr = j05Var.a;
        int i = j05Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Y0((ht5) objArr[i2]);
        }
        j05Var.d();
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) throws InterruptedException {
        um0 um0Var = p34Var.X;
        p34Var.a();
        wg wgVar = this.u0;
        if (wgVar != null) {
            float f = this.v0;
            long jA = this.color.a();
            float fFloatValue = ((Number) ((oi) wgVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = dw0.b(fFloatValue, jA);
                if (wgVar.a) {
                    float fD = ua7.d(um0Var.e());
                    float fB = ua7.b(um0Var.e());
                    lr lrVar = um0Var.Y;
                    long jP = lrVar.p();
                    lrVar.k().g();
                    try {
                        ((lr) ((wl6) lrVar.Y).Y).k().m(0.0f, 0.0f, fD, fB, 1);
                        sv1.o0(p34Var, jB, f, 0L, null, 124);
                        p61.w(lrVar, jP);
                    } catch (Throwable th) {
                        p61.w(lrVar, jP);
                        throw th;
                    }
                } else {
                    sv1.o0(p34Var, jB, f, 0L, null, 124);
                }
            }
        }
        ig igVar = (ig) this;
        sm0 sm0VarK = um0Var.Y.k();
        gl6 gl6Var = igVar.A0;
        if (gl6Var != null) {
            long j = igVar.w0;
            int iO = nr4.O(igVar.v0);
            long jA2 = igVar.color.a();
            igVar.t0.invoke();
            gl6Var.e(iO, j, jA2);
            gl6Var.draw(fb.b(sm0VarK));
        }
    }
}
