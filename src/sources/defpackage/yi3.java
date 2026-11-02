package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yi3 extends g implements f96 {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final y42 m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public xi3 y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public l c = null;
    public int l = -1;
    public byte n = 0;
    public final ArrayList p = new ArrayList();
    public final xb s = new xb(this, (byte) 15);
    public View w = null;
    public final ui3 z = new ui3(this, 0);

    public yi3(y42 y42Var) {
        this.m = y42Var;
    }

    public static boolean o(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.f96
    public final void b(View view) {
        if (view == this.w) {
            this.w = null;
        }
        l lVarM = this.r.M(view);
        if (lVarM == null) {
            return;
        }
        l lVar = this.c;
        if (lVar != null && lVarM == lVar) {
            q(null, 0);
            return;
        }
        l(lVarM, false);
        if (this.a.remove(lVarM.a)) {
            y42.a(lVarM);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.g
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        y42 y42Var;
        yi3 yi3Var = this;
        if (yi3Var.c != null) {
            float[] fArr = yi3Var.b;
            yi3Var.n(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        l lVar = yi3Var.c;
        byte b = yi3Var.n;
        ArrayList arrayList = yi3Var.p;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            y42Var = yi3Var.m;
            if (i >= size) {
                break;
            }
            vi3 vi3Var = (vi3) arrayList.get(i);
            l lVar2 = vi3Var.e;
            float f4 = vi3Var.a;
            float f5 = vi3Var.c;
            if (f4 == f5) {
                vi3Var.i = lVar2.a.getTranslationX();
            } else {
                vi3Var.i = p61.e(f5, f4, vi3Var.m, f4);
            }
            float f6 = vi3Var.b;
            float f7 = vi3Var.d;
            if (f6 == f7) {
                vi3Var.j = lVar2.a.getTranslationY();
            } else {
                vi3Var.j = p61.e(f7, f6, vi3Var.m, f6);
            }
            int iSave = canvas.save();
            y42Var.i(canvas, recyclerView, vi3Var.e, vi3Var.i, vi3Var.j, vi3Var.f, false);
            canvas.restoreToCount(iSave);
            i++;
            yi3Var = this;
        }
        if (lVar != null) {
            int iSave2 = canvas.save();
            y42Var.i(canvas, recyclerView, lVar, f2, f, b, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        l lVar = this.c;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vi3 vi3Var = (vi3) arrayList.get(i);
            int iSave = canvas.save();
            View view = vi3Var.e.a;
            canvas.restoreToCount(iSave);
        }
        if (lVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            vi3 vi3Var2 = (vi3) arrayList.get(i2);
            boolean z2 = vi3Var2.l;
            if (z2 && !vi3Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int i(l lVar, int i) {
        float f;
        y42 y42Var = this.m;
        kz7 kz7Var = y42Var.d;
        if ((i & 12) != 0) {
            int i2 = this.h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                float f2 = this.g;
                int iOrdinal = kz7Var.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    b61.c();
                    return 0;
                }
                velocityTracker.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, f2 * 5.0f);
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                int i3 = xVelocity > 0.0f ? 8 : 4;
                float fAbs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3) {
                    float f3 = this.f;
                    int iOrdinal2 = kz7Var.ordinal();
                    if (iOrdinal2 == 0) {
                        f = 0.25f;
                    } else {
                        if (iOrdinal2 != 1) {
                            b61.c();
                            return 0;
                        }
                        f = 0.4f;
                    }
                    if (fAbs >= f3 * f && fAbs > Math.abs(yVelocity)) {
                        return i3;
                    }
                }
            }
            float width = this.r.getWidth();
            lVar.getClass();
            float f4 = width * y42Var.f;
            if ((i & i2) != 0 && Math.abs(this.h) > f4) {
                return i2;
            }
        }
        return 0;
    }

    public final void j(int i, int i2, MotionEvent motionEvent) {
        View viewM;
        if (this.c != null || i != 2 || this.n == 2 || this.r.getScrollState() == 1) {
            return;
        }
        j layoutManager = this.r.getLayoutManager();
        int i3 = this.l;
        l lVarM = null;
        if (i3 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(iFindPointerIndex) - this.d;
            float y = motionEvent.getY(iFindPointerIndex) - this.e;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.q;
            if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.p()) && ((fAbs2 <= fAbs || !layoutManager.q()) && (viewM = m(motionEvent)) != null))) {
                lVarM = this.r.M(viewM);
            }
        }
        if (lVarM == null) {
            return;
        }
        RecyclerView recyclerView = this.r;
        byte b = this.m.b;
        int iB = (y42.b(b | (b << 8), recyclerView.getLayoutDirection()) & 65280) >> 8;
        if (iB == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.d;
        float f3 = y2 - this.e;
        float fAbs3 = Math.abs(f2);
        float fAbs4 = Math.abs(f3);
        float f4 = this.q;
        if (fAbs3 >= f4 || fAbs4 >= f4) {
            if (fAbs3 > fAbs4) {
                if (f2 < 0.0f && (iB & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iB & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iB & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iB & 2) == 0) {
                    return;
                }
            }
            this.i = 0.0f;
            this.h = 0.0f;
            this.l = motionEvent.getPointerId(0);
            q(lVarM, 1);
        }
    }

    public final int k(l lVar, int i) {
        float f;
        y42 y42Var = this.m;
        kz7 kz7Var = y42Var.d;
        if ((i & 3) != 0) {
            int i2 = this.i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                float f2 = this.g;
                int iOrdinal = kz7Var.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    b61.c();
                    return 0;
                }
                velocityTracker.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, f2 * 5.0f);
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                int i3 = yVelocity <= 0.0f ? 1 : 2;
                float fAbs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2) {
                    float f3 = this.f;
                    int iOrdinal2 = kz7Var.ordinal();
                    if (iOrdinal2 == 0) {
                        f = 0.25f;
                    } else {
                        if (iOrdinal2 != 1) {
                            b61.c();
                            return 0;
                        }
                        f = 0.4f;
                    }
                    if (fAbs >= f3 * f && fAbs > Math.abs(xVelocity)) {
                        return i3;
                    }
                }
            }
            float height = this.r.getHeight();
            lVar.getClass();
            float f4 = height * y42Var.f;
            if ((i & i2) != 0 && Math.abs(this.i) > f4) {
                return i2;
            }
        }
        return 0;
    }

    public final void l(l lVar, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vi3 vi3Var = (vi3) arrayList.get(size);
            if (vi3Var.e == lVar) {
                vi3Var.k |= z;
                if (!vi3Var.l) {
                    vi3Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        l lVar = this.c;
        if (lVar != null) {
            View view = lVar.a;
            if (o(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vi3 vi3Var = (vi3) arrayList.get(size);
            View view2 = vi3Var.e.a;
            if (o(view2, x, y, vi3Var.i, vi3Var.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int iE = recyclerView.k0.e() - 1; iE >= 0; iE--) {
            View viewD = recyclerView.k0.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (x >= viewD.getLeft() + translationX && x <= viewD.getRight() + translationX && y >= viewD.getTop() + translationY && y <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final void n(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void p(l lVar) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (this.r.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.n != 2) {
            return;
        }
        int i = (int) (this.j + this.h);
        int i2 = (int) (this.k + this.i);
        View view = lVar.a;
        if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.u;
            if (arrayList == null) {
                this.u = new ArrayList();
                this.v = new ArrayList();
            } else {
                arrayList.clear();
                this.v.clear();
            }
            int iRound = Math.round(this.j + this.h);
            int iRound2 = Math.round(this.k + this.i);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i3 = (iRound + width) / 2;
            int i4 = (iRound2 + height) / 2;
            j layoutManager = this.r.getLayoutManager();
            int I = layoutManager.I();
            int i5 = 0;
            while (i5 < I) {
                char c2 = c;
                View viewH = layoutManager.H(i5);
                if (viewH != view && viewH.getBottom() >= iRound2 && viewH.getTop() <= height && viewH.getRight() >= iRound && viewH.getLeft() <= width) {
                    l lVarM = this.r.M(viewH);
                    int iAbs5 = Math.abs(i3 - ((viewH.getRight() + viewH.getLeft()) / 2));
                    int iAbs6 = Math.abs(i4 - ((viewH.getBottom() + viewH.getTop()) / 2));
                    int i6 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    int size = this.u.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size) {
                        int i9 = size;
                        if (i6 <= ((Integer) this.v.get(i7)).intValue()) {
                            break;
                        }
                        i8++;
                        i7++;
                        size = i9;
                    }
                    this.u.add(i8, lVarM);
                    this.v.add(i8, Integer.valueOf(i6));
                }
                i5++;
                c = c2;
                i = i;
                i2 = i2;
            }
            int i10 = i;
            int i11 = i2;
            ArrayList arrayList2 = this.u;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i10;
            int height2 = view.getHeight() + i11;
            int left2 = i10 - view.getLeft();
            int top2 = i11 - view.getTop();
            int size2 = arrayList2.size();
            l lVar2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size2; i13++) {
                l lVar3 = (l) arrayList2.get(i13);
                if (left2 > 0 && (right = lVar3.a.getRight() - width2) < 0 && lVar3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    lVar2 = lVar3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = lVar3.a.getLeft() - i10) > 0 && lVar3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    lVar2 = lVar3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = lVar3.a.getTop() - i11) > 0 && lVar3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    lVar2 = lVar3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = lVar3.a.getBottom() - height2) < 0 && lVar3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    lVar2 = lVar3;
                    i12 = iAbs;
                }
            }
            if (lVar2 == null) {
                this.u.clear();
                this.v.clear();
            } else {
                lVar2.b();
                lVar.b();
                this.r.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q(l lVar, int i) {
        boolean z;
        l lVar2;
        int iK;
        int i2;
        float fSignum;
        byte b = this.m.b;
        if (lVar == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        byte b2 = this.n;
        l(lVar, true);
        this.n = i;
        if (i == 2) {
            if (lVar == null) {
                bt.q("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = lVar.a;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        l lVar3 = this.c;
        boolean z2 = false;
        if (lVar3 != null) {
            View view = lVar3.a;
            if (view.getParent() != null) {
                if (b2 == 2) {
                    i2 = 0;
                } else {
                    if (this.n == 2) {
                        iK = 0;
                    } else {
                        int i4 = (b << 8) | b;
                        int iB = (y42.b(i4, this.r.getLayoutDirection()) & 65280) >> 8;
                        if (iB == 0) {
                            iK = 0;
                        } else {
                            int i5 = (i4 & 65280) >> 8;
                            if (Math.abs(this.h) > Math.abs(this.i)) {
                                iK = i(lVar3, iB);
                                if (iK <= 0) {
                                    iK = k(lVar3, iB);
                                    if (iK <= 0) {
                                        iK = 0;
                                    }
                                } else if ((i5 & iK) == 0) {
                                    iK = y42.c(iK, this.r.getLayoutDirection());
                                }
                            } else {
                                iK = k(lVar3, iB);
                                if (iK <= 0) {
                                    iK = i(lVar3, iB);
                                    if (iK <= 0) {
                                        iK = 0;
                                    } else if ((i5 & iK) == 0) {
                                        iK = y42.c(iK, this.r.getLayoutDirection());
                                    }
                                }
                            }
                        }
                    }
                    i2 = iK;
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                float fSignum2 = 0.0f;
                if (i2 == 1 || i2 == 2) {
                    fSignum = Math.signum(this.i) * this.r.getHeight();
                } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.r.getWidth();
                } else {
                    fSignum = 0.0f;
                }
                float[] fArr = this.b;
                n(fArr);
                z = false;
                lVar2 = null;
                vi3 vi3Var = new vi3(this, lVar3, b2, fArr[0], fArr[1], fSignum2, fSignum, i2, lVar3);
                this.r.getClass();
                ValueAnimator valueAnimator = vi3Var.g;
                valueAnimator.setDuration(300L);
                this.p.add(vi3Var);
                lVar3.o(false);
                valueAnimator.start();
                z2 = true;
            } else {
                lVar2 = null;
                z = false;
                if (view == this.w) {
                    this.w = null;
                }
                y42.a(lVar3);
                z2 = false;
            }
            this.c = lVar2;
        } else {
            z = false;
        }
        if (lVar != null) {
            View view2 = lVar.a;
            this.o = (y42.b((b << 8) | b, this.r.getLayoutDirection()) & i3) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = lVar;
            if (i == 2) {
                view2.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.r.getLayoutManager().h0 = true;
        }
        this.r.invalidate();
    }

    public final void r(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.d;
        this.h = fMax;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.h = fMax;
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // defpackage.f96
    public final void d(View view) {
    }
}
