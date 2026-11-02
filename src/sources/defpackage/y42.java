package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 {
    public static final wi3 q = new wi3((byte) 0);
    public static final wi3 r = new wi3((byte) 1);
    public int a;
    public final byte b;
    public final RecyclerView c;
    public final kz7 d;
    public int e;
    public float f;
    public final LinkedList g;
    public List h;
    public int i;
    public int j;
    public boolean k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final ui3 n;
    public final /* synthetic */ byte o;
    public final Object p;

    /* JADX WARN: Multi-variable type inference failed */
    public y42(RecyclerView recyclerView, kz7 kz7Var, int i) {
        float f;
        recyclerView.getClass();
        kz7Var.getClass();
        this.a = -1;
        this.b = i;
        this.c = recyclerView;
        this.d = kz7Var;
        this.e = -1;
        int iOrdinal = kz7Var.ordinal();
        byte b = 1;
        if (iOrdinal == 0) {
            f = 0.5f;
        } else {
            if (iOrdinal != 1) {
                b61.c();
                throw null;
            }
            f = 0.01f;
        }
        this.f = f;
        this.g = new LinkedList();
        this.h = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.j = -1;
        ss8 ss8Var = ss8.a;
        this.l = ss8.w() ? linkedHashMap2 : linkedHashMap;
        this.m = ss8.w() ? linkedHashMap : linkedHashMap2;
        this.n = new ui3(this, b);
        yi3 yi3Var = new yi3(this);
        RecyclerView recyclerView2 = yi3Var.r;
        if (recyclerView2 != recyclerView) {
            ui3 ui3Var = yi3Var.z;
            if (recyclerView2 != null) {
                recyclerView2.f0(yi3Var);
                RecyclerView recyclerView3 = yi3Var.r;
                recyclerView3.w0.remove(ui3Var);
                if (recyclerView3.x0 == ui3Var) {
                    recyclerView3.x0 = null;
                }
                ArrayList arrayList = yi3Var.r.I0;
                if (arrayList != null) {
                    arrayList.remove(yi3Var);
                }
                ArrayList arrayList2 = yi3Var.p;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    vi3 vi3Var = (vi3) arrayList2.get(0);
                    vi3Var.g.cancel();
                    a(vi3Var.e);
                }
                arrayList2.clear();
                yi3Var.w = null;
                VelocityTracker velocityTracker = yi3Var.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    yi3Var.t = null;
                }
                xi3 xi3Var = yi3Var.y;
                if (xi3Var != null) {
                    xi3Var.a = false;
                    yi3Var.y = null;
                }
                if (yi3Var.x != null) {
                    yi3Var.x = null;
                }
            }
            yi3Var.r = recyclerView;
            Resources resources = recyclerView.getResources();
            yi3Var.f = resources.getDimension(i36.item_touch_helper_swipe_escape_velocity);
            yi3Var.g = resources.getDimension(i36.item_touch_helper_swipe_escape_max_velocity);
            yi3Var.q = ViewConfiguration.get(yi3Var.r.getContext()).getScaledTouchSlop();
            yi3Var.r.i(yi3Var);
            yi3Var.r.w0.add(ui3Var);
            RecyclerView recyclerView4 = yi3Var.r;
            ArrayList arrayList3 = recyclerView4.I0;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                recyclerView4.I0 = arrayList3;
            }
            arrayList3.add(yi3Var);
            yi3Var.y = new xi3(yi3Var);
            yi3Var.x = new GestureDetector(yi3Var.r.getContext(), yi3Var.y);
        }
        recyclerView.w0.add(this.n);
    }

    public static void a(l lVar) {
        View view = lVar.a;
        Object tag = view.getTag(y36.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = cw8.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(y36.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static void d(Canvas canvas, View view, List list, int i, float f) {
        float f2;
        ba6 ba6Var = new ba6();
        ba6Var.X = view.getRight();
        ba6 ba6Var2 = new ba6();
        ba6Var2.X = view.getLeft();
        float size = f / list.size();
        int i2 = 0;
        if (f < 0.0f) {
            boolean z = view.getLayoutDirection() == 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i21.X();
                    throw null;
                }
                yl8 yl8Var = (yl8) obj;
                if (list.size() == 1) {
                    e(yl8Var, ba6Var, size, view, list, f, canvas, i, true, true);
                } else if ((z && i2 == 0) || (!z && i2 == list.size() - 1)) {
                    e(yl8Var, ba6Var, size, view, list, f, canvas, i, false, true);
                } else if (!(z && i2 == list.size() - 1) && (z || i2 != 0)) {
                    e(yl8Var, ba6Var, size, view, list, f, canvas, i, false, false);
                } else {
                    e(yl8Var, ba6Var, size, view, list, f, canvas, i, true, false);
                }
                i2 = i3;
            }
            return;
        }
        boolean z2 = view.getLayoutDirection() == 0;
        for (Object obj2 : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                i21.X();
                throw null;
            }
            yl8 yl8Var2 = (yl8) obj2;
            if (list.size() == 1) {
                f2 = size;
                f(yl8Var2, ba6Var2, f2, view, list, f, canvas, i, true, true);
            } else if ((z2 && i2 == 0) || (!z2 && i2 == list.size() - 1)) {
                f2 = size;
                f(yl8Var2, ba6Var2, f2, view, list, f, canvas, i, true, false);
            } else if (!(z2 && i2 == list.size() - 1) && (z2 || i2 != 0)) {
                f2 = size;
                f(yl8Var2, ba6Var2, f2, view, list, f, canvas, i, false, false);
            } else {
                f2 = size;
                f(yl8Var2, ba6Var2, f2, view, list, f, canvas, i, false, true);
            }
            size = f2;
            i2 = i4;
        }
    }

    public static final void e(yl8 yl8Var, ba6 ba6Var, float f, View view, List list, float f2, Canvas canvas, int i, boolean z, boolean z2) {
        float f3 = (ba6Var.X + f) - (z2 ? 50 : 0);
        Context context = view.getContext();
        context.getClass();
        Rect rect = new Rect((int) f3, view.getTop(), (int) ba6Var.X, view.getBottom());
        int iIndexOf = list.indexOf(yl8Var);
        int size = list.size();
        float[] fArr = null;
        if (z && (view instanceof RoundableLayout)) {
            RoundableLayout roundableLayout = (RoundableLayout) view;
            fArr = new float[]{roundableLayout.getCornerLeftTop(), roundableLayout.getCornerLeftTop(), roundableLayout.getCornerRightTop(), roundableLayout.getCornerRightTop(), roundableLayout.getCornerLeftBottom(), roundableLayout.getCornerLeftBottom(), 0.0f, 0.0f};
        }
        yl8Var.a(context, f2, canvas, rect, i, iIndexOf, size, z2, fArr);
        ba6Var.X = f3;
    }

    public static final void f(yl8 yl8Var, ba6 ba6Var, float f, View view, List list, float f2, Canvas canvas, int i, boolean z, boolean z2) {
        float f3 = ba6Var.X + f + (z2 ? 50 : 0);
        Context context = view.getContext();
        context.getClass();
        Rect rect = new Rect((int) ba6Var.X, view.getTop(), (int) f3, view.getBottom());
        int iIndexOf = list.indexOf(yl8Var);
        int size = list.size();
        float[] fArr = null;
        if (z && (view instanceof RoundableLayout)) {
            RoundableLayout roundableLayout = (RoundableLayout) view;
            fArr = new float[]{roundableLayout.getCornerLeftTop(), roundableLayout.getCornerLeftTop(), roundableLayout.getCornerRightTop(), roundableLayout.getCornerRightTop(), 0.0f, 0.0f, roundableLayout.getCornerRightBottom(), roundableLayout.getCornerRightBottom()};
        }
        yl8Var.a(context, f2, canvas, rect, i, iIndexOf, size, z2, fArr);
        ba6Var.X = f3;
    }

    public final void g(l lVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        byte b = this.o;
        byte b2 = 2;
        Object obj = this.p;
        byte b3 = 0;
        switch (b) {
            case 0:
                lVar.getClass();
                linkedHashMap.put(0, i21.N(new yl8(q36.ic_delete_24dp, v26.colorRvActionsDelete, null, new q02((ExcludedRoutesActivity) obj, b2), 28)));
                break;
            default:
                lVar.getClass();
                if (lVar instanceof yv7) {
                    linkedHashMap.put(0, i21.N(new yl8(q36.ic_delete_24dp, v26.colorRvActionsDelete, null, new hm4(this, b3), 28)));
                    linkedHashMap2.put(0, i21.N(new yl8(q36.ic_ping_24dp, v26.colorPing, null, new im4(this, b3), 28)));
                    pv7 pv7VarL = ((dw7) obj).l(((yv7) lVar).b());
                    if (pv7VarL != null) {
                        EConfigType configType = pv7VarL.a.getConfig().getConfigType();
                        kw4 kw4Var = kw4.a;
                        SubscriptionItem subscriptionItemF = kw4.f(pv7VarL.b);
                        byte b4 = 1;
                        if ((subscriptionItemF == null || !subscriptionItemF.G()) && configType != EConfigType.CUSTOM) {
                            List list = (List) linkedHashMap2.get(0);
                            if (list != null) {
                                list.add(new yl8(q36.icon_share, v26.colorShareBg, null, new k42(), 12));
                            }
                            linkedHashMap2.put(1, i21.N(new yl8(q36.icon_link, v26.colorShareBg, Integer.valueOf(y46.share_clipboard), new hm4(this, b4), 16), new yl8(q36.icon_qr_code, v26.colorShareBg, Integer.valueOf(y46.share_qr), new im4(this, b4), 16), new yl8(q36.icon_json, v26.colorShareBg, Integer.valueOf(y46.share_json), new hm4(this, b2), 16)));
                        }
                        break;
                    }
                }
                break;
        }
    }

    public final int h(RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.a;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(i36.item_touch_helper_max_drag_scroll_per_frame);
            this.a = dimensionPixelSize;
        }
        int interpolation = (int) (q.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (r.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5 A[SYNTHETIC] */
    public final void i(Canvas canvas, RecyclerView recyclerView, l lVar, float f, float f2, int i, boolean z) {
        float f3;
        float f4;
        float size;
        int childCount;
        int i2;
        float f5;
        View childAt;
        float elevation;
        canvas.getClass();
        lVar.getClass();
        View view = lVar.a;
        view.getClass();
        int iB = lVar.b();
        if (iB < 0) {
            this.e = iB;
            return;
        }
        kz7 kz7Var = this.d;
        LinkedHashMap linkedHashMap = this.l;
        LinkedHashMap linkedHashMap2 = this.m;
        if (i == 1) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            ss8 ss8Var = ss8.a;
            LinkedHashMap linkedHashMap5 = ss8.w() ? linkedHashMap3 : linkedHashMap4;
            LinkedHashMap linkedHashMap6 = ss8.w() ? linkedHashMap4 : linkedHashMap3;
            f4 = 1.0f;
            kz7 kz7Var2 = kz7.Y;
            f3 = 0.0f;
            if (f < 0.0f) {
                linkedHashMap2.remove(Integer.valueOf(iB));
                if (linkedHashMap.containsKey(Integer.valueOf(iB))) {
                    List list = (List) linkedHashMap.get(Integer.valueOf(iB));
                    if (list == null) {
                        return;
                    } else {
                        linkedHashMap5.put(Integer.valueOf(this.i), list);
                    }
                } else {
                    g(lVar, linkedHashMap3, linkedHashMap4);
                    List list2 = (List) linkedHashMap5.get(Integer.valueOf(this.i));
                    if (list2 == null) {
                        return;
                    } else {
                        linkedHashMap.put(Integer.valueOf(iB), list2);
                    }
                }
                List list3 = (List) linkedHashMap.get(Integer.valueOf(iB));
                if (list3 != null) {
                    this.h = list3;
                }
                List list4 = (List) linkedHashMap5.get(Integer.valueOf(this.i));
                if (list4 == null) {
                    return;
                }
                size = ((list4.size() * f) * Math.min(!this.h.isEmpty() ? (view.getWidth() - 100) / this.h.size() : 0, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE)) / view.getWidth();
                if (kz7Var == kz7Var2) {
                    view.setAlpha(1.0f - (Math.abs(f) / view.getWidth()));
                    size = f;
                }
                d(canvas, view, list4, iB, size);
            } else if (f > 0.0f) {
                linkedHashMap.remove(Integer.valueOf(iB));
                if (linkedHashMap2.containsKey(Integer.valueOf(iB))) {
                    List list5 = (List) linkedHashMap2.get(Integer.valueOf(iB));
                    if (list5 != null) {
                        linkedHashMap6.put(Integer.valueOf(this.i), list5);
                    }
                } else {
                    g(lVar, linkedHashMap3, linkedHashMap4);
                    List list6 = (List) linkedHashMap6.get(Integer.valueOf(this.i));
                    if (list6 == null) {
                        return;
                    } else {
                        linkedHashMap2.put(Integer.valueOf(iB), list6);
                    }
                }
                List list7 = (List) linkedHashMap2.get(Integer.valueOf(iB));
                if (list7 != null) {
                    this.h = list7;
                }
                List list8 = (List) linkedHashMap6.get(Integer.valueOf(this.i));
                if (list8 == null) {
                    return;
                }
                size = ((list8.size() * f) * Math.min(!this.h.isEmpty() ? (view.getWidth() - 100) / this.h.size() : 0, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE)) / view.getWidth();
                if (kz7Var == kz7Var2) {
                    view.setAlpha(1.0f - (Math.abs(f) / view.getWidth()));
                    size = f;
                }
                d(canvas, view, list8, iB, size);
            }
            if (z && view.getTag(y36.item_touch_helper_previous_elevation) == null) {
                WeakHashMap weakHashMap = cw8.a;
                Float fValueOf = Float.valueOf(view.getElevation());
                childCount = recyclerView.getChildCount();
                f5 = f3;
                for (i2 = 0; i2 < childCount; i2++) {
                    childAt = recyclerView.getChildAt(i2);
                    if (childAt == view) {
                        WeakHashMap weakHashMap2 = cw8.a;
                        elevation = childAt.getElevation();
                        if (elevation > f5) {
                            f5 = elevation;
                        }
                    }
                }
                view.setElevation(f5 + f4);
                view.setTag(y36.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(size);
            view.setTranslationY(f2);
            if (this.k) {
                j(lVar, this.j);
            }
            if (kz7Var == kz7.X || this.e <= -1 || view.getTranslationX() != f3) {
                return;
            }
            this.h.clear();
            linkedHashMap.remove(Integer.valueOf(iB));
            linkedHashMap2.remove(Integer.valueOf(iB));
            this.i = 0;
            this.j = -1;
            return;
        }
        f3 = 0.0f;
        f4 = 1.0f;
        size = f;
        if (z) {
            WeakHashMap weakHashMap3 = cw8.a;
            Float fValueOf2 = Float.valueOf(view.getElevation());
            childCount = recyclerView.getChildCount();
            f5 = f3;
            while (i2 < childCount) {
                childAt = recyclerView.getChildAt(i2);
                if (childAt == view) {
                    WeakHashMap weakHashMap4 = cw8.a;
                    elevation = childAt.getElevation();
                    if (elevation > f5) {
                        f5 = elevation;
                    }
                }
            }
            view.setElevation(f5 + f4);
            view.setTag(y36.item_touch_helper_previous_elevation, fValueOf2);
        }
        view.setTranslationX(size);
        view.setTranslationY(f2);
        if (this.k) {
            j(lVar, this.j);
        }
        if (kz7Var == kz7.X) {
        }
    }

    public final void j(l lVar, int i) {
        RecyclerView recyclerView;
        f adapter;
        int iK;
        lVar.getClass();
        if (this.h.isEmpty()) {
            return;
        }
        int i2 = -1;
        if (lVar.s != null && (recyclerView = lVar.r) != null && (adapter = recyclerView.getAdapter()) != null && (iK = lVar.r.K(lVar)) != -1 && lVar.s == adapter) {
            i2 = iK;
        }
        int iOrdinal = this.d.ordinal();
        RecyclerView recyclerView2 = this.c;
        LinkedHashMap linkedHashMap = this.m;
        LinkedHashMap linkedHashMap2 = this.l;
        if (iOrdinal == 0) {
            this.j = i;
            int i3 = this.e;
            if (i3 != i2) {
                Integer numValueOf = Integer.valueOf(i3);
                LinkedList linkedList = this.g;
                if (!linkedList.contains(numValueOf)) {
                    linkedList.add(Integer.valueOf(this.e));
                }
            }
            this.e = i2;
            if (linkedHashMap2.containsKey(Integer.valueOf(i2))) {
                List list = (List) linkedHashMap2.get(Integer.valueOf(this.e));
                if (list != null) {
                    this.h = list;
                }
            } else if (linkedHashMap.containsKey(Integer.valueOf(i2))) {
                List list2 = (List) linkedHashMap.get(Integer.valueOf(this.e));
                if (list2 != null) {
                    this.h = list2;
                }
            } else {
                this.h.clear();
            }
            int iMin = Math.min(!this.h.isEmpty() ? (lVar.a.getWidth() - 100) / this.h.size() : 0, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
            linkedHashMap2.clear();
            linkedHashMap.clear();
            this.f = this.h.size() * 0.5f * iMin;
            k();
            recyclerView2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            if (linkedHashMap2.containsKey(Integer.valueOf(i2))) {
                ((yl8) wv0.r0((List) wv0.q0(linkedHashMap2.values()))).f.y(i2);
            } else if (linkedHashMap.containsKey(Integer.valueOf(i2))) {
                ((yl8) wv0.r0((List) wv0.q0(linkedHashMap.values()))).f.y(i2);
            }
            recyclerView2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        this.k = false;
    }

    public final synchronized void k() {
        int iIntValue;
        while (!this.g.isEmpty()) {
            Integer num = (Integer) this.g.poll();
            if (num != null && (iIntValue = num.intValue()) > -1) {
                f adapter = this.c.getAdapter();
                if (adapter != null) {
                    adapter.a.d(iIntValue, 1, null);
                }
                this.l.remove(Integer.valueOf(iIntValue));
                this.m.remove(Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y42(ExcludedRoutesActivity excludedRoutesActivity, RecyclerView recyclerView) {
        this(recyclerView, kz7.Y, 4);
        this.o = (byte) 0;
        this.p = excludedRoutesActivity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y42(RecyclerView recyclerView, dw7 dw7Var) {
        this(recyclerView, kz7.X, 12);
        this.o = (byte) 1;
        dw7Var.getClass();
        this.p = dw7Var;
    }
}
