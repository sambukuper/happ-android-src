package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a66;
import defpackage.av2;
import defpackage.bv2;
import defpackage.e30;
import defpackage.f10;
import defpackage.f87;
import defpackage.k09;
import defpackage.ka4;
import defpackage.km4;
import defpackage.kv8;
import defpackage.lr;
import defpackage.m31;
import defpackage.mj0;
import defpackage.n31;
import defpackage.r31;
import defpackage.ri1;
import defpackage.x21;
import defpackage.xo0;
import defpackage.xz2;
import defpackage.y03;
import defpackage.y21;
import defpackage.ye2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.metrics.ConscryptStatsLog;
import org.xmlpull.v1.XmlPullParserException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static f87 u0;
    public final SparseArray f0;
    public final ArrayList g0;
    public final n31 h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public int n0;
    public d o0;
    public mj0 p0;
    public int q0;
    public HashMap r0;
    public final SparseArray s0;
    public final b t0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = new SparseArray();
        this.g0 = new ArrayList(4);
        this.h0 = new n31();
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = Integer.MAX_VALUE;
        this.l0 = Integer.MAX_VALUE;
        this.m0 = true;
        this.n0 = 257;
        this.o0 = null;
        this.p0 = null;
        this.q0 = -1;
        this.r0 = new HashMap();
        this.s0 = new SparseArray();
        this.t0 = new b(this, this);
        i(attributeSet, 0);
    }

    public static LayoutParams g() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.a = -1;
        layoutParams.b = -1;
        layoutParams.c = -1.0f;
        layoutParams.d = true;
        layoutParams.e = -1;
        layoutParams.f = -1;
        layoutParams.g = -1;
        layoutParams.h = -1;
        layoutParams.i = -1;
        layoutParams.j = -1;
        layoutParams.k = -1;
        layoutParams.l = -1;
        layoutParams.m = -1;
        layoutParams.n = -1;
        layoutParams.o = -1;
        layoutParams.p = -1;
        layoutParams.q = 0;
        layoutParams.r = 0.0f;
        layoutParams.s = -1;
        layoutParams.t = -1;
        layoutParams.u = -1;
        layoutParams.v = -1;
        layoutParams.w = Integer.MIN_VALUE;
        layoutParams.x = Integer.MIN_VALUE;
        layoutParams.y = Integer.MIN_VALUE;
        layoutParams.z = Integer.MIN_VALUE;
        layoutParams.A = Integer.MIN_VALUE;
        layoutParams.B = Integer.MIN_VALUE;
        layoutParams.C = Integer.MIN_VALUE;
        layoutParams.D = 0;
        layoutParams.E = 0.5f;
        layoutParams.F = 0.5f;
        layoutParams.G = null;
        layoutParams.H = -1.0f;
        layoutParams.I = -1.0f;
        layoutParams.J = 0;
        layoutParams.K = 0;
        layoutParams.L = 0;
        layoutParams.M = 0;
        layoutParams.N = 0;
        layoutParams.O = 0;
        layoutParams.P = 0;
        layoutParams.Q = 0;
        layoutParams.R = 1.0f;
        layoutParams.S = 1.0f;
        layoutParams.T = -1;
        layoutParams.U = -1;
        layoutParams.V = -1;
        layoutParams.W = false;
        layoutParams.X = false;
        layoutParams.Y = null;
        layoutParams.Z = 0;
        layoutParams.a0 = true;
        layoutParams.b0 = true;
        layoutParams.c0 = false;
        layoutParams.d0 = false;
        layoutParams.e0 = false;
        layoutParams.f0 = -1;
        layoutParams.g0 = -1;
        layoutParams.h0 = -1;
        layoutParams.i0 = -1;
        layoutParams.j0 = Integer.MIN_VALUE;
        layoutParams.k0 = Integer.MIN_VALUE;
        layoutParams.l0 = 0.5f;
        layoutParams.p0 = new m31();
        return layoutParams;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static f87 getSharedValues() {
        f87 f87Var = u0;
        if (f87Var != null) {
            return f87Var;
        }
        f87 f87Var2 = new f87();
        new SparseIntArray();
        new HashMap();
        u0 = f87Var2;
        return f87Var2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ConstraintHelper) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.m0 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.l0;
    }

    public int getMaxWidth() {
        return this.k0;
    }

    public int getMinHeight() {
        return this.j0;
    }

    public int getMinWidth() {
        return this.i0;
    }

    public int getOptimizationLevel() {
        return this.h0.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        n31 n31Var = this.h0;
        String resourceEntryName = n31Var.j;
        if (resourceEntryName == null) {
            int id2 = getId();
            if (id2 != -1) {
                resourceEntryName = getContext().getResources().getResourceEntryName(id2);
                n31Var.j = resourceEntryName;
            } else {
                resourceEntryName = "parent";
                n31Var.j = "parent";
            }
        }
        if (n31Var.h0 == null) {
            n31Var.h0 = resourceEntryName;
        }
        for (m31 m31Var : n31Var.q0) {
            View view = m31Var.f0;
            if (view != null) {
                if (m31Var.j == null && (id = view.getId()) != -1) {
                    m31Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (m31Var.h0 == null) {
                    m31Var.h0 = m31Var.j;
                }
            }
        }
        n31Var.n(sb);
        return sb.toString();
    }

    public final m31 h(View view) {
        if (view == this) {
            return this.h0;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(new LayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        n31 n31Var = this.h0;
        n31Var.f0 = this;
        b bVar = this.t0;
        n31Var.u0 = bVar;
        n31Var.s0.g = bVar;
        this.f0.put(getId(), this);
        this.o0 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a66.ConstraintLayout_Layout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == a66.ConstraintLayout_Layout_android_minWidth) {
                    this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i0);
                } else if (index == a66.ConstraintLayout_Layout_android_minHeight) {
                    this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.j0);
                } else if (index == a66.ConstraintLayout_Layout_android_maxWidth) {
                    this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.k0);
                } else if (index == a66.ConstraintLayout_Layout_android_maxHeight) {
                    this.l0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.l0);
                } else if (index == a66.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.n0 = typedArrayObtainStyledAttributes.getInt(index, this.n0);
                } else if (index == a66.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.p0 = null;
                        }
                    }
                } else if (index == a66.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.o0 = dVar;
                        dVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o0 = null;
                    }
                    this.q0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        n31Var.D0 = this.n0;
        ka4.q = n31Var.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        mj0 mj0Var = new mj0((byte) 8, false);
        mj0Var.Y = new SparseArray();
        mj0Var.Z = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            x21 x21Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                mj0Var.U(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                x21 x21Var2 = new x21(context, xml);
                                ((SparseArray) mj0Var.Y).put(x21Var2.b, x21Var2);
                                x21Var = x21Var2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                y21 y21Var = new y21(context, xml);
                                if (x21Var != null) {
                                    x21Var.a.add(y21Var);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.p0 = mj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x030e  */
    /* JADX WARN: Code duplicated, block: B:164:0x032a  */
    /* JADX WARN: Code duplicated, block: B:166:0x032d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:180:0x036e  */
    /* JADX WARN: Code duplicated, block: B:405:0x039d A[SYNTHETIC] */
    public final void k(n31 n31Var, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        e30 e30Var;
        int i7;
        boolean zT;
        int i8;
        int i9;
        boolean zX;
        e30 e30Var2;
        boolean z3;
        boolean z4;
        e30 e30Var3;
        boolean z5;
        int i10;
        y03 y03Var;
        kv8 kv8Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z6;
        Iterator it;
        k09 k09Var;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i17 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        b bVar = this.t0;
        bVar.b = iMax3;
        bVar.c = iMax4;
        bVar.d = paddingWidth;
        bVar.e = i17;
        bVar.f = i2;
        bVar.g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i18 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i19 = size - paddingWidth;
        int i20 = size2 - i17;
        int i21 = bVar.e;
        int i22 = bVar.d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.i0);
                iMin = iMax;
            } else {
                iMin = i19;
            }
            i18 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.i0);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i18 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.k0 - i22, i19);
            i18 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.j0);
                iMin2 = iMax2;
            } else {
                iMin2 = i20;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.l0 - i21, i20);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.j0);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iQ = n31Var.q();
        ri1 ri1Var = n31Var.s0;
        int[] iArr = n31Var.C;
        int i23 = iMin;
        if (i23 == iQ && iMin2 == n31Var.k()) {
            c = 1;
        } else {
            ri1Var.b = true;
            c = 1;
        }
        n31Var.Y = 0;
        n31Var.Z = 0;
        iArr[0] = this.k0 - i22;
        iArr[c] = this.l0 - i21;
        n31Var.b0 = 0;
        n31Var.c0 = 0;
        n31Var.M(i18);
        n31Var.O(i23);
        n31Var.N(i4);
        n31Var.L(iMin2);
        int i24 = this.i0 - i22;
        if (i24 < 0) {
            n31Var.b0 = 0;
        } else {
            n31Var.b0 = i24;
        }
        int i25 = this.j0 - i21;
        if (i25 < 0) {
            n31Var.c0 = 0;
        } else {
            n31Var.c0 = i25;
        }
        n31Var.x0 = iMax5;
        n31Var.y0 = iMax3;
        lr lrVar = n31Var.r0;
        n31 n31Var2 = (n31) lrVar.f0;
        ArrayList arrayList = (ArrayList) lrVar.Y;
        e30 e30Var4 = n31Var.u0;
        int size3 = n31Var.q0.size();
        int iQ2 = n31Var.q();
        int iK = n31Var.k();
        boolean zY = km4.y(i, 128);
        boolean z7 = zY || km4.y(i, 64);
        if (z7) {
            int i26 = 0;
            while (true) {
                if (i26 < size3) {
                    boolean z8 = z7;
                    m31 m31Var = (m31) n31Var.q0.get(i26);
                    i5 = size3;
                    int[] iArr2 = m31Var.p0;
                    int i27 = i26;
                    boolean z9 = (iArr2[0] == 3) && (iArr2[1] == 3) && m31Var.W > 0.0f;
                    if ((m31Var.x() && z9) || ((m31Var.y() && z9) || (m31Var instanceof ye2) || m31Var.x() || m31Var.y())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i26 = i27 + 1;
                        z7 = z8;
                        size3 = i5;
                    }
                } else {
                    z = z7;
                    i5 = size3;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z7;
            i5 = size3;
            i6 = 1073741824;
        }
        boolean z10 = z & ((mode == i6 && mode2 == i6) || zY);
        if (z10) {
            int iMin3 = Math.min(iArr[0], i19);
            int iMin4 = Math.min(iArr[1], i20);
            int i28 = 1073741824;
            if (mode == 1073741824) {
                if (n31Var.q() != iMin3) {
                    n31Var.O(iMin3);
                    ri1Var.a = true;
                }
                i28 = 1073741824;
            }
            if (mode2 == i28 && n31Var.k() != iMin4) {
                n31Var.L(iMin4);
                ri1Var.a = true;
            }
            if (mode == i28 && mode2 == i28) {
                ArrayList<k09> arrayList2 = (ArrayList) ri1Var.e;
                n31 n31Var3 = (n31) ri1Var.c;
                if (ri1Var.a || ri1Var.b) {
                    for (m31 m31Var2 : n31Var3.q0) {
                        m31Var2.h();
                        m31Var2.a = false;
                        m31Var2.d.n();
                        m31Var2.e.m();
                        z10 = z10;
                    }
                    z2 = z10;
                    n31Var3.h();
                    i13 = 0;
                    n31Var3.a = false;
                    n31Var3.d.n();
                    n31Var3.e.m();
                    ri1Var.b = false;
                } else {
                    z2 = z10;
                    i13 = 0;
                }
                ri1Var.b((n31) ri1Var.d);
                n31Var3.Y = i13;
                int[] iArr3 = n31Var3.p0;
                n31Var3.Z = i13;
                int iJ = n31Var3.j(i13);
                int iJ2 = n31Var3.j(1);
                if (ri1Var.a) {
                    ri1Var.c();
                }
                int iR = n31Var3.r();
                int iS = n31Var3.s();
                e30Var = e30Var4;
                n31Var3.d.h.d(iR);
                n31Var3.e.h.d(iS);
                ri1Var.u();
                if (iJ == 2 || iJ2 == 2) {
                    if (zY) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((k09) it2.next()).k()) {
                                zY = false;
                                break;
                            }
                        }
                    }
                    if (zY && iJ == 2) {
                        n31Var3.M(1);
                        n31Var3.O(ri1Var.e(n31Var3, 0));
                        n31Var3.d.e.d(n31Var3.q());
                    }
                    if (zY && iJ2 == 2) {
                        i14 = 1;
                        n31Var3.N(1);
                        n31Var3.L(ri1Var.e(n31Var3, 1));
                        n31Var3.e.e.d(n31Var3.k());
                    }
                    i15 = iArr3[0];
                    if (i15 != i14 || i15 == 4) {
                        int iQ3 = n31Var3.q() + iR;
                        n31Var3.d.i.d(iQ3);
                        n31Var3.d.e.d(iQ3 - iR);
                        ri1Var.u();
                        i16 = iArr3[1];
                        if (i16 != 1 || i16 == 4) {
                            int iK2 = n31Var3.k() + iS;
                            n31Var3.e.i.d(iK2);
                            n31Var3.e.e.d(iK2 - iS);
                        }
                        ri1Var.u();
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    for (k09 k09Var2 : arrayList2) {
                        if (k09Var2.b == n31Var3 || k09Var2.g) {
                            k09Var2.e();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zT = true;
                            break;
                        }
                        k09Var = (k09) it.next();
                        if (!z6 || k09Var.b != n31Var3) {
                            if (k09Var.h.j || ((!k09Var.i.j && !(k09Var instanceof bv2)) || (!k09Var.e.j && !(k09Var instanceof xo0) && !(k09Var instanceof bv2)))) {
                                zT = false;
                                break;
                            }
                        }
                    }
                    n31Var3.M(iJ);
                    n31Var3.N(iJ2);
                    i7 = 2;
                    i12 = 1073741824;
                } else {
                    iS = iS;
                }
                i14 = 1;
                i15 = iArr3[0];
                if (i15 != i14) {
                    int iQ4 = n31Var3.q() + iR;
                    n31Var3.d.i.d(iQ4);
                    n31Var3.d.e.d(iQ4 - iR);
                    ri1Var.u();
                    i16 = iArr3[1];
                    if (i16 != 1) {
                        int iK3 = n31Var3.k() + iS;
                        n31Var3.e.i.d(iK3);
                        n31Var3.e.e.d(iK3 - iS);
                    } else {
                        int iK4 = n31Var3.k() + iS;
                        n31Var3.e.i.d(iK4);
                        n31Var3.e.e.d(iK4 - iS);
                    }
                    ri1Var.u();
                    z6 = true;
                } else {
                    int iQ5 = n31Var3.q() + iR;
                    n31Var3.d.i.d(iQ5);
                    n31Var3.d.e.d(iQ5 - iR);
                    ri1Var.u();
                    i16 = iArr3[1];
                    if (i16 != 1) {
                        int iK5 = n31Var3.k() + iS;
                        n31Var3.e.i.d(iK5);
                        n31Var3.e.e.d(iK5 - iS);
                    } else {
                        int iK6 = n31Var3.k() + iS;
                        n31Var3.e.i.d(iK6);
                        n31Var3.e.e.d(iK6 - iS);
                    }
                    ri1Var.u();
                    z6 = true;
                }
                while (r8.hasNext()) {
                    if (k09Var2.b == n31Var3) {
                    }
                    k09Var2.e();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zT = true;
                        break;
                    }
                    k09Var = (k09) it.next();
                    if (!z6) {
                    }
                    if (k09Var.h.j) {
                    }
                    zT = false;
                    break;
                }
                n31Var3.M(iJ);
                n31Var3.N(iJ2);
                i7 = 2;
                i12 = 1073741824;
            } else {
                z2 = z10;
                e30Var = e30Var4;
                n31 n31Var4 = (n31) ri1Var.c;
                if (ri1Var.a) {
                    for (m31 m31Var3 : n31Var4.q0) {
                        m31Var3.h();
                        m31Var3.a = false;
                        y03 y03Var2 = m31Var3.d;
                        y03Var2.e.j = false;
                        y03Var2.g = false;
                        y03Var2.n();
                        kv8 kv8Var2 = m31Var3.e;
                        kv8Var2.e.j = false;
                        kv8Var2.g = false;
                        kv8Var2.m();
                    }
                    i11 = 0;
                    n31Var4.h();
                    n31Var4.a = false;
                    y03 y03Var3 = n31Var4.d;
                    y03Var3.e.j = false;
                    y03Var3.g = false;
                    y03Var3.n();
                    kv8 kv8Var3 = n31Var4.e;
                    kv8Var3.e.j = false;
                    kv8Var3.g = false;
                    kv8Var3.m();
                    ri1Var.c();
                } else {
                    i11 = 0;
                }
                ri1Var.b((n31) ri1Var.d);
                n31Var4.Y = i11;
                n31Var4.Z = i11;
                n31Var4.d.h.d(i11);
                n31Var4.e.h.d(i11);
                i12 = 1073741824;
                if (mode == 1073741824) {
                    zT = n31Var.T(i11, zY);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= n31Var.T(1, zY);
                    i7++;
                }
            }
            if (zT) {
                n31Var.P(mode == i12, mode2 == i12);
            }
        } else {
            z2 = z10;
            e30Var = e30Var4;
            i7 = 0;
            zT = false;
        }
        if (zT && i7 == 2) {
            return;
        }
        int i29 = n31Var.D0;
        if (i5 > 0) {
            int size4 = n31Var.q0.size();
            boolean zW = n31Var.W(64);
            e30 e30Var5 = n31Var.u0;
            int i30 = 0;
            while (i30 < size4) {
                m31 m31Var4 = (m31) n31Var.q0.get(i30);
                if ((m31Var4 instanceof av2) || (m31Var4 instanceof f10) || m31Var4.F || (zW && (y03Var = m31Var4.d) != null && (kv8Var = m31Var4.e) != null && y03Var.e.j && kv8Var.e.j)) {
                    i10 = size4;
                } else {
                    int iJ3 = m31Var4.j(0);
                    int iJ4 = m31Var4.j(1);
                    i10 = size4;
                    boolean z11 = iJ3 == 3 && m31Var4.r != 1 && iJ4 == 3 && m31Var4.s != 1;
                    if (!z11 && n31Var.W(1) && !(m31Var4 instanceof ye2)) {
                        if (iJ3 == 3 && m31Var4.r == 0 && iJ4 != 3 && !m31Var4.x()) {
                            z11 = true;
                        }
                        if (iJ4 == 3 && m31Var4.s == 0 && iJ3 != 3 && !m31Var4.x()) {
                            z11 = true;
                        }
                        if ((iJ3 == 3 || iJ4 == 3) && m31Var4.W > 0.0f) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        lrVar.x(0, e30Var5, m31Var4);
                    }
                }
                i30++;
                size4 = i10;
            }
            ConstraintLayout constraintLayout = ((b) e30Var5).a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.g0;
            for (int i31 = 0; i31 < childCount2; i31++) {
                constraintLayout.getChildAt(i31);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i32 = 0; i32 < size5; i32++) {
                    ((ConstraintHelper) arrayList3.get(i32)).getClass();
                }
            }
        }
        lrVar.F(n31Var);
        int size6 = arrayList.size();
        if (i5 > 0) {
            lrVar.E(n31Var, 0, iQ2, iK);
        }
        if (size6 > 0) {
            int[] iArr4 = n31Var.p0;
            boolean z12 = iArr4[0] == 2;
            boolean z13 = iArr4[1] == 2;
            int iMax7 = Math.max(n31Var.q(), n31Var2.b0);
            int iMax8 = Math.max(n31Var.k(), n31Var2.c0);
            int i33 = 0;
            boolean z14 = false;
            while (i33 < size6) {
                m31 m31Var5 = (m31) arrayList.get(i33);
                if (m31Var5 instanceof ye2) {
                    int iQ6 = m31Var5.q();
                    int iK7 = m31Var5.k();
                    z3 = z13;
                    z4 = z12;
                    e30Var3 = e30Var;
                    boolean zX2 = z14 | lrVar.x(1, e30Var3, m31Var5);
                    int iQ7 = m31Var5.q();
                    int iK8 = m31Var5.k();
                    if (iQ7 != iQ6) {
                        m31Var5.O(iQ7);
                        if (z4 && m31Var5.r() + m31Var5.U > iMax7) {
                            iMax7 = Math.max(iMax7, m31Var5.i(4).e() + m31Var5.r() + m31Var5.U);
                        }
                        z5 = true;
                    } else {
                        z5 = zX2;
                    }
                    if (iK8 != iK7) {
                        m31Var5.L(iK8);
                        if (z3 && m31Var5.s() + m31Var5.V > iMax8) {
                            iMax8 = Math.max(iMax8, m31Var5.i(5).e() + m31Var5.s() + m31Var5.V);
                        }
                        z5 = true;
                    }
                    z14 = ((ye2) m31Var5).y0 | z5;
                } else {
                    z3 = z13;
                    z4 = z12;
                    e30Var3 = e30Var;
                }
                i33++;
                e30Var = e30Var3;
                z12 = z4;
                z13 = z3;
            }
            boolean z15 = z13;
            boolean z16 = z12;
            int i34 = 0;
            while (true) {
                e30 e30Var6 = e30Var;
                if (i34 >= 2) {
                    break;
                }
                int i35 = 0;
                while (i35 < size6) {
                    m31 m31Var6 = (m31) arrayList.get(i35);
                    if (((m31Var6 instanceof xz2) && !(m31Var6 instanceof ye2)) || (m31Var6 instanceof av2) || m31Var6.g0 == 8 || ((z2 && m31Var6.d.e.j && m31Var6.e.e.j) || (m31Var6 instanceof ye2))) {
                        i8 = size6;
                        e30Var2 = e30Var6;
                        i9 = i35;
                        zX = z14;
                    } else {
                        int iQ8 = m31Var6.q();
                        int iK9 = m31Var6.k();
                        i8 = size6;
                        int i36 = m31Var6.a0;
                        i9 = i35;
                        zX = lrVar.x(i34 == 1 ? 2 : 1, e30Var6, m31Var6) | z14;
                        int iQ9 = m31Var6.q();
                        e30Var2 = e30Var6;
                        int iK10 = m31Var6.k();
                        if (iQ9 != iQ8) {
                            m31Var6.O(iQ9);
                            if (z16 && m31Var6.r() + m31Var6.U > iMax7) {
                                iMax7 = Math.max(iMax7, m31Var6.i(4).e() + m31Var6.r() + m31Var6.U);
                            }
                            zX = true;
                        }
                        if (iK10 != iK9) {
                            m31Var6.L(iK10);
                            if (z15 && m31Var6.s() + m31Var6.V > iMax8) {
                                iMax8 = Math.max(iMax8, m31Var6.i(5).e() + m31Var6.s() + m31Var6.V);
                            }
                            zX = true;
                        }
                        if (m31Var6.E && i36 != m31Var6.a0) {
                            zX = true;
                        }
                    }
                    z14 = zX;
                    e30Var6 = e30Var2;
                    i35 = i9 + 1;
                    size6 = i8;
                }
                int i37 = size6;
                e30Var = e30Var6;
                if (!z14) {
                    break;
                }
                i34++;
                lrVar.E(n31Var, i34, iQ2, iK);
                size6 = i37;
                z14 = false;
            }
        }
        n31Var.D0 = i29;
        ka4.q = n31Var.W(512);
    }

    public final void l(m31 m31Var, LayoutParams layoutParams, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f0.get(i);
        m31 m31Var2 = (m31) sparseArray.get(i);
        if (m31Var2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.c0 = true;
        if (i2 == 6) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.c0 = true;
            layoutParams2.p0.E = true;
        }
        m31Var.i(6).b(m31Var2.i(i2), layoutParams.D, layoutParams.C, true);
        m31Var.E = true;
        m31Var.i(3).j();
        m31Var.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            m31 m31Var = layoutParams.p0;
            if (childAt.getVisibility() != 8 || layoutParams.d0 || layoutParams.e0 || zIsInEditMode) {
                int iR = m31Var.r();
                int iS = m31Var.s();
                childAt.layout(iR, iS, m31Var.q() + iR, m31Var.k() + iS);
            }
        }
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x0227  */
    /* JADX WARN: Code duplicated, block: B:164:0x0330  */
    /* JADX WARN: Code duplicated, block: B:166:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0348  */
    /* JADX WARN: Code duplicated, block: B:176:0x0366  */
    /* JADX WARN: Code duplicated, block: B:178:0x0370  */
    /* JADX WARN: Code duplicated, block: B:179:0x0380  */
    /* JADX WARN: Code duplicated, block: B:181:0x0388  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:192:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:203:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0401  */
    /* JADX WARN: Code duplicated, block: B:206:0x040a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0414  */
    /* JADX WARN: Code duplicated, block: B:211:0x041b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0423  */
    /* JADX WARN: Code duplicated, block: B:287:0x0548  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        m31 m31Var;
        int i4;
        m31 m31Var2;
        int i5;
        int i6;
        int i7;
        m31 m31Var3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        m31 m31Var4;
        int i14;
        int i15;
        int i16;
        m31 m31Var5;
        LayoutParams layoutParams;
        int i17;
        int i18;
        int i19;
        m31 m31Var6;
        int i20;
        float f;
        m31 m31Var7;
        m31 m31Var8;
        int i21;
        m31 m31Var9;
        int i22;
        int i23;
        int i24;
        int i25;
        float fAbs;
        int i26;
        byte b;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iF;
        int i27;
        m31 m31Var10;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.m0;
        constraintLayout.m0 = z3;
        int i28 = 1;
        int i29 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            for (int i30 = 0; i30 < childCount; i30++) {
                if (constraintLayout.getChildAt(i30).isLayoutRequested()) {
                    constraintLayout.m0 = true;
                    break;
                }
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        n31 n31Var = constraintLayout.h0;
        n31Var.v0 = z4;
        if (constraintLayout.m0) {
            constraintLayout.m0 = false;
            int childCount2 = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i31++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i32 = 0; i32 < childCount3; i32++) {
                    m31 m31VarH = constraintLayout.h(constraintLayout.getChildAt(i32));
                    if (m31VarH != null) {
                        m31VarH.C();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.f0;
                if (zIsInEditMode) {
                    int i33 = 0;
                    while (i33 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i33);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i27 = i28;
                                try {
                                    if (constraintLayout.r0 == null) {
                                        constraintLayout.r0 = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.r0.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i27 = i28;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                m31Var10 = viewFindViewById == constraintLayout ? n31Var : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).p0;
                            }
                            m31Var10.h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i27 = i28;
                        }
                        i33++;
                        i28 = i27;
                    }
                }
                int i34 = i28;
                if (constraintLayout.q0 != -1) {
                    for (int i35 = 0; i35 < childCount3; i35++) {
                        constraintLayout.getChildAt(i35).getId();
                    }
                }
                d dVar = constraintLayout.o0;
                if (dVar != null) {
                    dVar.a(constraintLayout);
                }
                n31Var.q0.clear();
                ArrayList arrayList2 = constraintLayout.g0;
                int size = arrayList2.size();
                if (size > 0) {
                    int i36 = 0;
                    while (i36 < size) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList2.get(i36);
                        HashMap map = constraintHelper.l0;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.j0);
                        }
                        xz2 xz2Var = constraintHelper.i0;
                        if (xz2Var == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            xz2Var.r0 = i29;
                            Arrays.fill(xz2Var.q0, (Object) null);
                            int i37 = i29;
                            while (i37 < constraintHelper.g0) {
                                int i38 = constraintHelper.f0[i37];
                                View view = (View) sparseArray2.get(i38);
                                if (view == null && (iF = constraintHelper.f(constraintLayout, (str = (String) map.get(Integer.valueOf(i38))))) != 0) {
                                    constraintHelper.f0[i37] = iF;
                                    map.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray2.get(iF);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    xz2 xz2Var2 = constraintHelper.i0;
                                    m31 m31VarH2 = constraintLayout.h(view2);
                                    xz2Var2.getClass();
                                    if (m31VarH2 != xz2Var2 && m31VarH2 != null) {
                                        int i39 = xz2Var2.r0 + 1;
                                        m31[] m31VarArr = xz2Var2.q0;
                                        if (i39 > m31VarArr.length) {
                                            m31VarArr = (m31[]) Arrays.copyOf(m31VarArr, m31VarArr.length * 2);
                                            xz2Var2.q0 = m31VarArr;
                                        }
                                        int i40 = xz2Var2.r0;
                                        m31VarArr[i40] = m31VarH2;
                                        xz2Var2.r0 = i40 + 1;
                                    }
                                }
                                i37++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            constraintHelper.i0.S();
                        }
                        i36++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i29 = 0;
                    }
                }
                int i41 = 2;
                for (int i42 = 0; i42 < childCount3; i42++) {
                    constraintLayout.getChildAt(i42);
                }
                SparseArray sparseArray3 = constraintLayout.s0;
                sparseArray3.clear();
                sparseArray3.put(0, n31Var);
                sparseArray3.put(constraintLayout.getId(), n31Var);
                for (int i43 = 0; i43 < childCount3; i43++) {
                    View childAt2 = constraintLayout.getChildAt(i43);
                    sparseArray3.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i44 = 0;
                while (i44 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i44);
                    m31 m31VarH3 = constraintLayout.h(childAt3);
                    if (m31VarH3 == null) {
                        i3 = i44;
                        z2 = z;
                        i23 = i41;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                        n31Var.q0.add(m31VarH3);
                        n31 n31Var2 = m31VarH3.T;
                        if (n31Var2 != null) {
                            n31Var2.q0.remove(m31VarH3);
                            m31VarH3.C();
                        }
                        m31VarH3.T = n31Var;
                        layoutParams2.a();
                        m31VarH3.g0 = childAt3.getVisibility();
                        m31VarH3.f0 = childAt3;
                        if (childAt3 instanceof ConstraintHelper) {
                            ((ConstraintHelper) childAt3).h(m31VarH3, n31Var.v0);
                        }
                        if (layoutParams2.d0) {
                            av2 av2Var = (av2) m31VarH3;
                            int i45 = layoutParams2.m0;
                            int i46 = layoutParams2.n0;
                            float f2 = layoutParams2.o0;
                            if (f2 == -1.0f) {
                                b = -1;
                                if (i45 != -1) {
                                    if (i45 > -1) {
                                        av2Var.q0 = -1.0f;
                                        av2Var.r0 = i45;
                                        av2Var.s0 = -1;
                                    }
                                } else if (i46 != -1 && i46 > -1) {
                                    av2Var.q0 = -1.0f;
                                    av2Var.r0 = -1;
                                    av2Var.s0 = i46;
                                    i3 = i44;
                                    z2 = z;
                                    i23 = i41;
                                }
                                i3 = i44;
                                z2 = z;
                                i23 = i41;
                            } else if (f2 > -1.0f) {
                                av2Var.q0 = f2;
                                b = -1;
                                av2Var.r0 = -1;
                                av2Var.s0 = -1;
                                i3 = i44;
                                z2 = z;
                                i23 = i41;
                            } else {
                                i3 = i44;
                                z2 = z;
                                i23 = i41;
                            }
                        } else {
                            int i47 = layoutParams2.f0;
                            int i48 = layoutParams2.g0;
                            int i49 = layoutParams2.h0;
                            int i50 = layoutParams2.i0;
                            int i51 = layoutParams2.j0;
                            int i52 = layoutParams2.k0;
                            i3 = i44;
                            float f3 = layoutParams2.l0;
                            int i53 = layoutParams2.p;
                            z2 = z;
                            if (i53 != -1) {
                                m31 m31Var11 = (m31) sparseArray3.get(i53);
                                if (m31Var11 != null) {
                                    float f4 = layoutParams2.r;
                                    m31VarH3.v(7, 7, layoutParams2.q, 0, m31Var11);
                                    m31VarH3.D = f4;
                                }
                                constraintLayout = this;
                                m31Var6 = m31VarH3;
                                layoutParams = layoutParams2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i47 != -1) {
                                    m31 m31Var12 = (m31) sparseArray3.get(i47);
                                    if (m31Var12 != null) {
                                        m31Var = m31VarH3;
                                        i4 = 2;
                                        m31Var.v(2, 2, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, i51, m31Var12);
                                    } else {
                                        m31Var = m31VarH3;
                                        i4 = 2;
                                    }
                                } else {
                                    m31Var = m31VarH3;
                                    i4 = 2;
                                    if (i48 != -1 && (m31Var2 = (m31) sparseArray3.get(i48)) != null) {
                                        m31Var.v(2, 4, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, i51, m31Var2);
                                        i5 = 2;
                                        i6 = 4;
                                    }
                                    if (i49 != -1) {
                                        m31Var9 = (m31) sparseArray3.get(i49);
                                        if (m31Var9 != null) {
                                            m31Var.v(i6, i5, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i52, m31Var9);
                                        }
                                        i7 = i5;
                                    } else {
                                        i7 = i5;
                                        if (i50 != -1 && (m31Var3 = (m31) sparseArray3.get(i50)) != null) {
                                            m31Var.v(i6, i6, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i52, m31Var3);
                                        }
                                    }
                                    i8 = i6;
                                    i9 = layoutParams2.i;
                                    if (i9 != -1) {
                                        m31Var8 = (m31) sparseArray3.get(i9);
                                        if (m31Var8 != null) {
                                            i21 = 3;
                                            m31Var.v(3, 3, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x, m31Var8);
                                        } else {
                                            i21 = 3;
                                        }
                                        i12 = i21;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = layoutParams2.j;
                                        i11 = -1;
                                        if (i10 != -1 || (m31Var4 = (m31) sparseArray3.get(i10)) == null) {
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            m31Var.v(3, 5, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x, m31Var4);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = layoutParams2.k;
                                    if (i14 != i11) {
                                        m31Var7 = (m31) sparseArray3.get(i14);
                                        if (m31Var7 != null) {
                                            int i54 = i12;
                                            m31Var.v(i13, i54, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z, m31Var7);
                                            i15 = i54;
                                        } else {
                                            i15 = i12;
                                        }
                                    } else {
                                        i15 = i12;
                                        i16 = layoutParams2.l;
                                        if (i16 != i11 && (m31Var5 = (m31) sparseArray3.get(i16)) != null) {
                                            m31Var.v(i13, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z, m31Var5);
                                        }
                                    }
                                    layoutParams = layoutParams2;
                                    i17 = layoutParams.m;
                                    if (i17 != -1) {
                                        constraintLayout = this;
                                        m31Var6 = m31Var;
                                        constraintLayout.l(m31Var6, layoutParams, sparseArray3, i17, 6);
                                    } else {
                                        i18 = layoutParams.n;
                                        if (i18 != -1) {
                                            constraintLayout = this;
                                            m31Var6 = m31Var;
                                            constraintLayout.l(m31Var6, layoutParams, sparseArray3, i18, i15);
                                        } else {
                                            i19 = layoutParams.o;
                                            constraintLayout = this;
                                            m31Var6 = m31Var;
                                            i20 = i13;
                                            if (i19 != -1) {
                                                constraintLayout.l(m31Var6, layoutParams, sparseArray3, i19, i20);
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                            m31Var6.d0 = f3;
                                        }
                                        f = layoutParams.F;
                                        if (f >= 0.0f) {
                                            m31Var6.e0 = f;
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                        m31Var6.d0 = f3;
                                    }
                                    f = layoutParams.F;
                                    if (f >= 0.0f) {
                                        m31Var6.e0 = f;
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i49 != -1) {
                                    m31Var9 = (m31) sparseArray3.get(i49);
                                    if (m31Var9 != null) {
                                        m31Var.v(i6, i5, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i52, m31Var9);
                                    }
                                    i7 = i5;
                                } else {
                                    i7 = i5;
                                    if (i50 != -1) {
                                        m31Var.v(i6, i6, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i52, m31Var3);
                                    }
                                }
                                i8 = i6;
                                i9 = layoutParams2.i;
                                if (i9 != -1) {
                                    m31Var8 = (m31) sparseArray3.get(i9);
                                    if (m31Var8 != null) {
                                        i21 = 3;
                                        m31Var.v(3, 3, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.x, m31Var8);
                                    } else {
                                        i21 = 3;
                                    }
                                    i12 = i21;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = layoutParams2.j;
                                    i11 = -1;
                                    if (i10 != -1) {
                                        i12 = 3;
                                        i13 = 5;
                                    } else {
                                        i12 = 3;
                                        i13 = 5;
                                    }
                                }
                                i14 = layoutParams2.k;
                                if (i14 != i11) {
                                    m31Var7 = (m31) sparseArray3.get(i14);
                                    if (m31Var7 != null) {
                                        int i55 = i12;
                                        m31Var.v(i13, i55, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z, m31Var7);
                                        i15 = i55;
                                    } else {
                                        i15 = i12;
                                    }
                                } else {
                                    i15 = i12;
                                    i16 = layoutParams2.l;
                                    if (i16 != i11) {
                                        m31Var.v(i13, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutParams2.z, m31Var5);
                                    }
                                }
                                layoutParams = layoutParams2;
                                i17 = layoutParams.m;
                                if (i17 != -1) {
                                    constraintLayout = this;
                                    m31Var6 = m31Var;
                                    constraintLayout.l(m31Var6, layoutParams, sparseArray3, i17, 6);
                                } else {
                                    i18 = layoutParams.n;
                                    if (i18 != -1) {
                                        constraintLayout = this;
                                        m31Var6 = m31Var;
                                        constraintLayout.l(m31Var6, layoutParams, sparseArray3, i18, i15);
                                    } else {
                                        i19 = layoutParams.o;
                                        constraintLayout = this;
                                        m31Var6 = m31Var;
                                        i20 = i13;
                                        if (i19 != -1) {
                                            constraintLayout.l(m31Var6, layoutParams, sparseArray3, i19, i20);
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                        m31Var6.d0 = f3;
                                    }
                                    f = layoutParams.F;
                                    if (f >= 0.0f) {
                                        m31Var6.e0 = f;
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    m31Var6.d0 = f3;
                                }
                                f = layoutParams.F;
                                if (f >= 0.0f) {
                                    m31Var6.e0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i26 = layoutParams.T) != -1 || layoutParams.U != -1)) {
                                int i56 = layoutParams.U;
                                m31Var6.Y = i26;
                                m31Var6.Z = i56;
                            }
                            if (layoutParams.a0) {
                                m31Var6.M(i34);
                                m31Var6.O(((ViewGroup.MarginLayoutParams) layoutParams).width);
                                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                                    m31Var6.M(i41);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                                if (layoutParams.W) {
                                    m31Var6.M(3);
                                } else {
                                    m31Var6.M(4);
                                }
                                m31Var6.i(i7).g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                                m31Var6.i(i8).g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            } else {
                                m31Var6.M(3);
                                m31Var6.O(0);
                            }
                            if (layoutParams.b0) {
                                i22 = -1;
                                m31Var6.N(1);
                                m31Var6.L(((ViewGroup.MarginLayoutParams) layoutParams).height);
                                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                                    m31Var6.N(2);
                                }
                            } else {
                                i22 = -1;
                                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                                    if (layoutParams.X) {
                                        m31Var6.N(3);
                                    } else {
                                        m31Var6.N(4);
                                    }
                                    m31Var6.i(3).g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                                    m31Var6.i(5).g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                } else {
                                    m31Var6.N(3);
                                    m31Var6.L(0);
                                }
                            }
                            String str2 = layoutParams.G;
                            if (str2 == null || str2.length() == 0) {
                                m31Var6.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i24 = i22;
                                    i25 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i24 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i22;
                                    i25 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i25);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i25, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= 0.0f || f6 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i24 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    m31Var6.W = fAbs;
                                    m31Var6.X = i24;
                                }
                            }
                            float f7 = layoutParams.H;
                            float[] fArr = m31Var6.k0;
                            fArr[0] = f7;
                            i34 = 1;
                            fArr[1] = layoutParams.I;
                            m31Var6.i0 = layoutParams.J;
                            m31Var6.j0 = layoutParams.K;
                            int i57 = layoutParams.Z;
                            if (i57 >= 0 && i57 <= 3) {
                                m31Var6.q = i57;
                            }
                            int i58 = layoutParams.L;
                            int i59 = layoutParams.N;
                            int i60 = layoutParams.P;
                            float f8 = layoutParams.R;
                            m31Var6.r = i58;
                            m31Var6.u = i59;
                            if (i60 == Integer.MAX_VALUE) {
                                i60 = 0;
                            }
                            m31Var6.v = i60;
                            m31Var6.w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i58 == 0) {
                                m31Var6.r = 2;
                            }
                            int i61 = layoutParams.M;
                            int i62 = layoutParams.O;
                            int i63 = layoutParams.Q;
                            float f9 = layoutParams.S;
                            m31Var6.s = i61;
                            m31Var6.x = i62;
                            if (i63 == Integer.MAX_VALUE) {
                                i63 = 0;
                            }
                            m31Var6.y = i63;
                            m31Var6.z = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i61 != 0) {
                                i23 = 2;
                            } else {
                                i23 = 2;
                                m31Var6.s = 2;
                            }
                        }
                    }
                    i44 = i3 + 1;
                    i41 = i23;
                    z = z2;
                }
            }
            if (z) {
                n31Var.r0.F(n31Var);
            }
        }
        n31Var.w0.getClass();
        constraintLayout.k(n31Var, constraintLayout.n0, i, i2);
        int iQ = n31Var.q();
        int iK = n31Var.k();
        boolean z5 = n31Var.E0;
        boolean z6 = n31Var.F0;
        b bVar = constraintLayout.t0;
        int i64 = bVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + bVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i64, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.k0, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.l0, iResolveSizeAndState2);
        if (z5) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z6) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        m31 m31VarH = h(view);
        if ((view instanceof Guideline) && !(m31VarH instanceof av2)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            av2 av2Var = new av2();
            layoutParams.p0 = av2Var;
            layoutParams.d0 = true;
            av2Var.S(layoutParams.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.i();
            ((LayoutParams) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g0;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f0.put(view.getId(), view);
        this.m0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f0.remove(view.getId());
        m31 m31VarH = h(view);
        this.h0.q0.remove(m31VarH);
        m31VarH.C();
        this.g0.remove(view);
        this.m0 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.o0 = dVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f0;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.l0) {
            return;
        }
        this.l0 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.k0) {
            return;
        }
        this.k0 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.j0) {
            return;
        }
        this.j0 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.i0) {
            return;
        }
        this.i0 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(r31 r31Var) {
        mj0 mj0Var = this.p0;
        if (mj0Var != null) {
            mj0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n0 = i;
        n31 n31Var = this.h0;
        n31Var.D0 = i;
        ka4.q = n31Var.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f0 = new SparseArray();
        this.g0 = new ArrayList(4);
        this.h0 = new n31();
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = Integer.MAX_VALUE;
        this.l0 = Integer.MAX_VALUE;
        this.m0 = true;
        this.n0 = 257;
        this.o0 = null;
        this.p0 = null;
        this.q0 = -1;
        this.r0 = new HashMap();
        this.s0 = new SparseArray();
        this.t0 = new b(this, this);
        i(attributeSet, i);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public float l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public float o0;
        public int p;
        public m31 p0;
        public int q;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = Integer.MIN_VALUE;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = 0.5f;
            this.p0 = new m31();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a66.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        this.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                d.h(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        d.g(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        d.g(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            m31 av2Var = this.p0;
            if (!(av2Var instanceof av2)) {
                av2Var = new av2();
                this.p0 = av2Var;
            }
            ((av2) av2Var).S(this.V);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX WARN: Code duplicated, block: B:25:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:37:0x007a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0084  */
        /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.h0 = -1;
            this.i0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.j0 = this.w;
            this.k0 = this.y;
            float f = this.E;
            this.l0 = f;
            int i8 = this.a;
            this.m0 = i8;
            int i9 = this.b;
            this.n0 = i9;
            float f2 = this.c;
            this.o0 = f2;
            int i10 = this.s;
            if (z2) {
                if (i10 != -1) {
                    this.h0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.i0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.g0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.f0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.k0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.j0 = i5;
                        }
                        if (z) {
                            this.l0 = 1.0f - f;
                        }
                        if (this.d0 && this.V == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.o0 = 1.0f - f2;
                                this.m0 = -1;
                                this.n0 = -1;
                            } else if (i8 != -1) {
                                this.n0 = i8;
                                this.m0 = -1;
                                this.o0 = -1.0f;
                            } else if (i9 != -1) {
                                this.m0 = i9;
                                this.n0 = -1;
                                this.o0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.g0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.f0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.k0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z) {
                    this.l0 = 1.0f - f;
                }
                if (this.d0) {
                    if (f2 != -1.0f) {
                        this.o0 = 1.0f - f2;
                        this.m0 = -1;
                        this.n0 = -1;
                    } else if (i8 != -1) {
                        this.n0 = i8;
                        this.m0 = -1;
                        this.o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.m0 = i9;
                        this.n0 = -1;
                        this.o0 = -1.0f;
                    }
                }
            } else {
                if (i10 != -1) {
                    this.g0 = i10;
                }
                int i12 = this.t;
                if (i12 != -1) {
                    this.f0 = i12;
                }
                i2 = this.u;
                if (i2 != -1) {
                    this.h0 = i2;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.i0 = i3;
                }
                int i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.j0 = i13;
                }
                int i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.k0 = i14;
                }
            }
            if (i2 == -1 && i3 == -1 && this.t == -1 && i10 == -1) {
                int i15 = this.g;
                if (i15 != -1) {
                    this.h0 = i15;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i16 = this.h;
                    if (i16 != -1) {
                        this.i0 = i16;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i17 = this.e;
                if (i17 != -1) {
                    this.f0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i18 = this.f;
                if (i18 != -1) {
                    this.g0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = Integer.MIN_VALUE;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = 0.5f;
            this.p0 = new m31();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.a = layoutParams2.a;
                this.b = layoutParams2.b;
                this.c = layoutParams2.c;
                this.d = layoutParams2.d;
                this.e = layoutParams2.e;
                this.f = layoutParams2.f;
                this.g = layoutParams2.g;
                this.h = layoutParams2.h;
                this.i = layoutParams2.i;
                this.j = layoutParams2.j;
                this.k = layoutParams2.k;
                this.l = layoutParams2.l;
                this.m = layoutParams2.m;
                this.n = layoutParams2.n;
                this.o = layoutParams2.o;
                this.p = layoutParams2.p;
                this.q = layoutParams2.q;
                this.r = layoutParams2.r;
                this.s = layoutParams2.s;
                this.t = layoutParams2.t;
                this.u = layoutParams2.u;
                this.v = layoutParams2.v;
                this.w = layoutParams2.w;
                this.x = layoutParams2.x;
                this.y = layoutParams2.y;
                this.z = layoutParams2.z;
                this.A = layoutParams2.A;
                this.B = layoutParams2.B;
                this.C = layoutParams2.C;
                this.D = layoutParams2.D;
                this.E = layoutParams2.E;
                this.F = layoutParams2.F;
                this.G = layoutParams2.G;
                this.H = layoutParams2.H;
                this.I = layoutParams2.I;
                this.J = layoutParams2.J;
                this.K = layoutParams2.K;
                this.W = layoutParams2.W;
                this.X = layoutParams2.X;
                this.L = layoutParams2.L;
                this.M = layoutParams2.M;
                this.N = layoutParams2.N;
                this.P = layoutParams2.P;
                this.O = layoutParams2.O;
                this.Q = layoutParams2.Q;
                this.R = layoutParams2.R;
                this.S = layoutParams2.S;
                this.T = layoutParams2.T;
                this.U = layoutParams2.U;
                this.V = layoutParams2.V;
                this.a0 = layoutParams2.a0;
                this.b0 = layoutParams2.b0;
                this.c0 = layoutParams2.c0;
                this.d0 = layoutParams2.d0;
                this.f0 = layoutParams2.f0;
                this.g0 = layoutParams2.g0;
                this.h0 = layoutParams2.h0;
                this.i0 = layoutParams2.i0;
                this.j0 = layoutParams2.j0;
                this.k0 = layoutParams2.k0;
                this.l0 = layoutParams2.l0;
                this.Y = layoutParams2.Y;
                this.Z = layoutParams2.Z;
                this.p0 = layoutParams2.p0;
            }
        }
    }
}
