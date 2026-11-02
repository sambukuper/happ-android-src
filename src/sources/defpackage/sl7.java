package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sl7 extends oh1 implements rv1 {
    public final td s0;
    public final dy1 t0;
    public RenderNode u0;

    public sl7(cz7 cz7Var, td tdVar, dy1 dy1Var) {
        this.s0 = tdVar;
        this.t0 = dy1Var;
        Y0(cz7Var);
    }

    public static boolean b1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode c1() {
        RenderNode renderNode = this.u0;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeD = h60.d();
        this.u0 = renderNodeD;
        return renderNodeD;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01e7 A[PHI: r20
  0x01e7: PHI (r20v2 boolean) = (r20v1 boolean), (r20v11 boolean) binds: [B:92:0x019c, B:100:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        boolean zB1;
        boolean z;
        char c;
        float f;
        um0 um0Var = p34Var.X;
        long jE = um0Var.e();
        td tdVar = this.s0;
        tdVar.j(jE);
        Canvas canvasB = fb.b(um0Var.Y.k());
        tdVar.d.getValue();
        if (ua7.e(um0Var.e())) {
            p34Var.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        dy1 dy1Var = this.t0;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = dy1Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = dy1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = dy1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = dy1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = dy1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = dy1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = dy1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = dy1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            p34Var.a();
            return;
        }
        float fH0 = p34Var.h0(30.0f);
        boolean z2 = dy1.f(dy1Var.d) || dy1.g(dy1Var.h) || dy1.f(dy1Var.e) || dy1.g(dy1Var.i);
        boolean z3 = dy1.f(dy1Var.f) || dy1.g(dy1Var.j) || dy1.f(dy1Var.g) || dy1.g(dy1Var.k);
        if (z2 && z3) {
            c1().setPosition(0, 0, canvasB.getWidth(), canvasB.getHeight());
        } else if (z2) {
            c1().setPosition(0, 0, (nr4.O(fH0) * 2) + canvasB.getWidth(), canvasB.getHeight());
        } else {
            if (!z3) {
                p34Var.a();
                return;
            }
            c1().setPosition(0, 0, canvasB.getWidth(), (nr4.O(fH0) * 2) + canvasB.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = c1().beginRecording();
        boolean zG = dy1.g(dy1Var.j);
        sd5 sd5Var = sd5.Y;
        if (zG) {
            EdgeEffect edgeEffectA = dy1Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = dy1Var.a(sd5Var);
                dy1Var.j = edgeEffectA;
            }
            b1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (dy1.f(dy1Var.f)) {
            EdgeEffect edgeEffectC = dy1Var.c();
            zB1 = b1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (dy1.g(dy1Var.f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tdVar.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = dy1Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = dy1Var.a(sd5Var);
                    dy1Var.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fK = i >= 31 ? tc.k(edgeEffectC) : 0.0f;
                float f2 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    tc.v(edgeEffectA2, fK, f2);
                } else {
                    edgeEffectA2.onPull(fK, f2);
                }
            }
        } else {
            zB1 = false;
        }
        boolean zG2 = dy1.g(dy1Var.h);
        sd5 sd5Var2 = sd5.X;
        if (zG2) {
            EdgeEffect edgeEffectA3 = dy1Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = dy1Var.a(sd5Var2);
                dy1Var.h = edgeEffectA3;
            }
            b1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (dy1.f(dy1Var.d)) {
            EdgeEffect edgeEffectE = dy1Var.e();
            zB1 = b1(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zB1;
            if (dy1.g(dy1Var.d)) {
                z = z3;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tdVar.c() >> 32));
                EdgeEffect edgeEffectA4 = dy1Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = dy1Var.a(sd5Var2);
                    dy1Var.h = edgeEffectA4;
                }
                c = ' ';
                int i2 = Build.VERSION.SDK_INT;
                float fK2 = i2 >= 31 ? tc.k(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    tc.v(edgeEffectA4, fK2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fK2, fIntBitsToFloat2);
                }
            } else {
                z = z3;
                c = ' ';
            }
        } else {
            z = z3;
            c = ' ';
        }
        if (dy1.g(dy1Var.k)) {
            EdgeEffect edgeEffectA5 = dy1Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = dy1Var.a(sd5Var);
                dy1Var.k = edgeEffectA5;
            }
            b1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (dy1.f(dy1Var.g)) {
            EdgeEffect edgeEffectD = dy1Var.d();
            zB1 = b1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zB1;
            if (dy1.g(dy1Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tdVar.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = dy1Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = dy1Var.a(sd5Var);
                    dy1Var.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fK3 = i3 >= 31 ? tc.k(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    tc.v(edgeEffectA6, fK3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fK3, fIntBitsToFloat3);
                }
            }
        }
        if (dy1.g(dy1Var.i)) {
            EdgeEffect edgeEffectA7 = dy1Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = dy1Var.a(sd5Var2);
                dy1Var.i = edgeEffectA7;
            }
            f = 0.0f;
            b1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f = 0.0f;
        }
        if (dy1.f(dy1Var.e)) {
            EdgeEffect edgeEffectB = dy1Var.b();
            boolean z4 = b1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zB1;
            if (dy1.g(dy1Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (tdVar.c() >> c));
                EdgeEffect edgeEffectA8 = dy1Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = dy1Var.a(sd5Var2);
                    dy1Var.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fK4 = i4 >= 31 ? tc.k(edgeEffectB) : f;
                float f3 = 1.0f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    tc.v(edgeEffectA8, fK4, f3);
                } else {
                    edgeEffectA8.onPull(fK4, f3);
                }
            }
            zB1 = z4;
        }
        if (zB1) {
            tdVar.d();
        }
        float f4 = z ? f : fH0;
        if (z2) {
            fH0 = f;
        }
        z24 layoutDirection = p34Var.getLayoutDirection();
        eb ebVar = new eb();
        ebVar.a = recordingCanvasBeginRecording;
        long jE2 = um0Var.e();
        fi1 fi1VarM = um0Var.Y.m();
        z24 z24VarO = um0Var.Y.o();
        sm0 sm0VarK = um0Var.Y.k();
        long jP = um0Var.Y.p();
        lr lrVar = um0Var.Y;
        xt2 xt2Var = (xt2) lrVar.Z;
        lrVar.B(p34Var);
        lrVar.C(layoutDirection);
        lrVar.A(ebVar);
        lrVar.D(jE2);
        lrVar.Z = null;
        ebVar.g();
        try {
            ((wl6) um0Var.Y.Y).V(f4, fH0);
            try {
                p34Var.a();
                float f5 = -f4;
                float f6 = -fH0;
                ((wl6) um0Var.Y.Y).V(f5, f6);
                ebVar.p();
                lr lrVar2 = um0Var.Y;
                lrVar2.B(fi1VarM);
                lrVar2.C(z24VarO);
                lrVar2.A(sm0VarK);
                lrVar2.D(jP);
                lrVar2.Z = xt2Var;
                c1().endRecording();
                int iSave = canvasB.save();
                canvasB.translate(f5, f6);
                canvasB.drawRenderNode(c1());
                canvasB.restoreToCount(iSave);
            } catch (Throwable th) {
                ((wl6) um0Var.Y.Y).V(-f4, -fH0);
                throw th;
            }
        } catch (Throwable th2) {
            ebVar.p();
            lr lrVar3 = um0Var.Y;
            lrVar3.B(fi1VarM);
            lrVar3.C(z24VarO);
            lrVar3.A(sm0VarK);
            lrVar3.D(jP);
            lrVar3.Z = xt2Var;
            throw th2;
        }
    }
}
