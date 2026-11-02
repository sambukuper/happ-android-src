package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media.MediaBrowserServiceCompat;
import java.io.IOException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class y5 implements ov8, i04, v06, vg5, ny0, g44 {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;

    public y5(ql qlVar, o88 o88Var, List list, fi1 fi1Var, fi2 fi2Var, boolean z) {
        int i;
        ql qlVar2 = qlVar;
        o88 o88Var2 = o88Var;
        this.X = (byte) 17;
        this.Y = qlVar2;
        this.Z = list;
        final byte b = 0;
        dn2 dn2Var = new dn2(this) { // from class: cz4
            public final /* synthetic */ y5 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                Object obj = null;
                int i2 = 1;
                y5 y5Var = this.Y;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) y5Var.h0;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fH = ((ug5) obj2).a.h();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fH2 = ((ug5) obj3).a.h();
                                    if (Float.compare(fH, fH2) < 0) {
                                        obj2 = obj3;
                                        fH = fH2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        ug5 ug5Var = (ug5) obj;
                        return Float.valueOf(ug5Var != null ? ug5Var.a.h() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) y5Var.h0;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((ug5) obj4).a.k0.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC2 = ((ug5) obj5).a.k0.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        ug5 ug5Var2 = (ug5) obj;
                        return Float.valueOf(ug5Var2 != null ? ug5Var2.a.k0.c() : 0.0f);
                }
            }
        };
        w74 w74Var = w74.Y;
        this.g0 = x97.P(w74Var, dn2Var);
        final byte b2 = 1;
        this.f0 = x97.P(w74Var, new dn2(this) { // from class: cz4
            public final /* synthetic */ y5 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                Object obj = null;
                int i2 = 1;
                y5 y5Var = this.Y;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) y5Var.h0;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fH = ((ug5) obj2).a.h();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fH2 = ((ug5) obj3).a.h();
                                    if (Float.compare(fH, fH2) < 0) {
                                        obj2 = obj3;
                                        fH = fH2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        ug5 ug5Var = (ug5) obj;
                        return Float.valueOf(ug5Var != null ? ug5Var.a.h() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) y5Var.h0;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((ug5) obj4).a.k0.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC2 = ((ug5) obj5).a.k0.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        ug5 ug5Var2 = (ug5) obj;
                        return Float.valueOf(ug5Var2 != null ? ug5Var2.a.k0.c() : 0.0f);
                }
            }
        });
        xg5 xg5Var = o88Var2.b;
        int i2 = rl.a;
        ArrayList arrayList = qlVar2.f0;
        String str = qlVar2.Y;
        d02 d02Var = d02.X;
        List listS0 = arrayList != null ? wv0.S0(arrayList, new l71((byte) 9)) : d02Var;
        ArrayList arrayList2 = new ArrayList();
        kt ktVar = new kt();
        int size = listS0.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            pl plVar = (pl) listS0.get(i3);
            pl plVarA = pl.a(plVar, xg5Var.a((xg5) plVar.a), b, b, 14);
            Object obj = plVarA.a;
            int i5 = plVarA.c;
            int i6 = plVarA.b;
            while (i4 < i6 && !ktVar.isEmpty()) {
                pl plVar2 = (pl) ktVar.last();
                listS0 = listS0;
                int i7 = plVar2.c;
                d02Var = d02Var;
                Object obj2 = plVar2.a;
                if (i6 < i7) {
                    arrayList2.add(new pl(i4, i6, obj2));
                    i4 = i6;
                } else {
                    int i8 = size;
                    arrayList2.add(new pl(i4, i7, obj2));
                    i4 = plVar2.c;
                    while (!ktVar.isEmpty() && i4 == ((pl) ktVar.last()).c) {
                        ktVar.removeLast();
                    }
                    size = i8;
                }
            }
            List list2 = listS0;
            d02 d02Var2 = d02Var;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new pl(i4, i6, xg5Var));
                i4 = i6;
            }
            pl plVar3 = (pl) ktVar.h();
            if (plVar3 != null) {
                int i10 = plVar3.c;
                Object obj3 = plVar3.a;
                int i11 = plVar3.b;
                if (i11 == i6 && i10 == i5) {
                    ktVar.removeLast();
                    ktVar.addLast(new pl(i6, i5, ((xg5) obj3).a((xg5) obj)));
                } else if (i11 == i10) {
                    arrayList2.add(new pl(i11, i10, obj3));
                    ktVar.removeLast();
                    ktVar.addLast(new pl(i6, i5, obj));
                } else {
                    if (i10 < i5) {
                        kp5.e();
                        throw null;
                    }
                    ktVar.addLast(new pl(i6, i5, ((xg5) obj3).a((xg5) obj)));
                }
            } else {
                ktVar.addLast(new pl(i6, i5, obj));
            }
            i3++;
            listS0 = list2;
            d02Var = d02Var2;
            size = i9;
            b = 0;
        }
        d02 d02Var3 = d02Var;
        while (i4 <= str.length() && !ktVar.isEmpty()) {
            pl plVar4 = (pl) ktVar.last();
            Object obj4 = plVar4.a;
            int i12 = plVar4.c;
            arrayList2.add(new pl(i4, i12, obj4));
            while (!ktVar.isEmpty() && i12 == ((pl) ktVar.last()).c) {
                ktVar.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str.length()) {
            arrayList2.add(new pl(i4, str.length(), xg5Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new pl(0, 0, xg5Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i13 = i;
        for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
            pl plVar5 = (pl) arrayList2.get(i13);
            int i14 = plVar5.b;
            int i15 = plVar5.c;
            String strSubstring = i14 != i15 ? str.substring(i14, i15) : _UrlKt.FRAGMENT_ENCODE_SET;
            List listA = rl.a(qlVar2, i14, i15, new y2((byte) 17));
            ql qlVar3 = new ql(strSubstring, listA == null ? d02Var3 : listA);
            xg5 xg5Var2 = (xg5) plVar5.a;
            if (xg5Var2.b == 0) {
                xg5Var2 = new xg5(xg5Var2.a, xg5Var.b, xg5Var2.c, xg5Var2.d, xg5Var2.e, xg5Var2.f, xg5Var2.g, xg5Var2.h, xg5Var2.i);
            }
            o88 o88Var3 = new o88(o88Var2.a, xg5Var.a(xg5Var2));
            List list3 = qlVar3.X;
            List list4 = list3 == null ? d02Var3 : list3;
            List list5 = (List) this.Z;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                pl plVar6 = (pl) list5.get(i16);
                xg5 xg5Var3 = xg5Var;
                int i17 = plVar6.b;
                o88 o88Var4 = o88Var3;
                int i18 = plVar6.c;
                if (rl.b(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        xc3.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new pl(i17 - i14, i18 - i14, plVar6.a));
                }
                i16++;
                list5 = list5;
                o88Var3 = o88Var4;
                xg5Var = xg5Var3;
            }
            arrayList3.add(new ug5(new kf(strSubstring, o88Var3, list4, arrayList4, fi2Var, fi1Var, z), i14, i15));
            i13++;
            qlVar2 = qlVar;
            o88Var2 = o88Var;
        }
        this.h0 = arrayList3;
    }

    public static Exception O(fb9 fb9Var) {
        return fb9Var.f() != null ? fb9Var.f() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public static int[] c0(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            wd2 wd2Var = (wd2) it.next();
            int i3 = wd2Var.X;
            iArr[i2] = i3;
            sparseIntArray.append(i3, wd2Var.Y);
            i2++;
        }
        return iArr;
    }

    public static ArrayList z(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        vd2 vd2Var = new vd2();
        vd2Var.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(vd2Var);
            }
            arrayList.add((vd2) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(vd2Var);
            }
        }
        return arrayList;
    }

    public sf0 A(gh0 gh0Var, Map map, Map map2) {
        gh0Var.getClass();
        map.getClass();
        map2.getClass();
        s98 s98Var = (s98) this.Y;
        hi0 hi0Var = (hi0) this.Z;
        cl7 cl7Var = (cl7) this.g0;
        tl7 tl7Var = (tl7) this.h0;
        jg0 jg0Var = (jg0) this.f0;
        jg0Var.getClass();
        jg0Var.b.getClass();
        ij0 ij0Var = jj0.h;
        jj0 jj0VarA = ((hg0) jg0Var.a).a(hi0Var.a);
        ij0Var.getClass();
        return new sf0(gh0Var, s98Var, map, map2, cl7Var, tl7Var, ij0.c(jj0VarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void B(cj0 cj0Var, cj0 cj0Var2, xx7 xx7Var, xx7 xx7Var2, Map.Entry entry) {
        xx7 xx7Var3 = (xx7) entry.getValue();
        Objects.toString(xx7Var3);
        hi5.z0("DualSurfaceProcessorNode");
        jz jzVar = new jz(xx7Var.g.a, ((dy) entry.getKey()).a.d, xx7Var.c ? cj0Var : null, ((dy) entry.getKey()).a.f, ((dy) entry.getKey()).a.g);
        jz jzVar2 = new jz(xx7Var2.g.a, ((dy) entry.getKey()).b.d, xx7Var2.c ? cj0Var2 : null, ((dy) entry.getKey()).b.f, ((dy) entry.getKey()).b.g);
        int i = ((dy) entry.getKey()).a.c;
        xx7Var3.getClass();
        s08.b();
        xx7Var3.a();
        mb6.s("Consumer can only be linked once.", !xx7Var3.j);
        xx7Var3.j = true;
        wx7 wx7Var = xx7Var3.l;
        zo0 zo0VarG0 = vr3.g0(wx7Var.c(), new ux7(xx7Var3, wx7Var, i, jzVar, jzVar2), km4.J());
        zo0VarG0.a(new zo2(zo0VarG0, new mj0((byte) 18, this, xx7Var3, false), 0 == true ? 1 : 0), km4.J());
    }

    public ArrayList C(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ud2 ud2Var = (ud2) ((td2) this.Y).e(i2).getLayoutParams();
            wd2 wd2Var = new wd2();
            wd2Var.Y = ud2Var.getOrder();
            wd2Var.X = i2;
            arrayList.add(wd2Var);
        }
        return arrayList;
    }

    public void D(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        td2 td2Var = (td2) this.Y;
        int flexDirection = td2Var.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            bt.q(pc6.j(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<vd2> flexLinesInternal = td2Var.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = td2Var.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((vd2) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = td2Var.getAlignContent();
                if (alignContent == 1) {
                    vd2 vd2Var = new vd2();
                    vd2Var.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, vd2Var);
                    return;
                }
                if (alignContent == 2) {
                    td2Var.setFlexLines(z(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((vd2) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            vd2 vd2Var2 = new vd2();
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f + size3);
                                vd2Var2.g = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(size3);
                                vd2Var2.g = iRound;
                            }
                            float f2 = (size3 - iRound) + f;
                            if (f2 > 1.0f) {
                                vd2Var2.g = iRound + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                vd2Var2.g = iRound - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(vd2Var2);
                        }
                        i4++;
                    }
                    td2Var.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        td2Var.setFlexLines(z(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    vd2 vd2Var3 = new vd2();
                    vd2Var3.g = size5;
                    for (vd2 vd2Var4 : flexLinesInternal) {
                        arrayList2.add(vd2Var3);
                        arrayList2.add(vd2Var4);
                        arrayList2.add(vd2Var3);
                    }
                    td2Var.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        vd2 vd2Var5 = (vd2) flexLinesInternal.get(i4);
                        float f4 = vd2Var5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        float f5 = (f4 - iRound3) + f3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        vd2Var5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public void E(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        y5 y5Var;
        int i4;
        int i5;
        td2 td2Var = (td2) this.Y;
        int flexItemCount = td2Var.getFlexItemCount();
        boolean[] zArr = (boolean[]) this.Z;
        if (zArr == null) {
            this.Z = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.Z = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= td2Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = td2Var.getFlexDirection();
        int flexDirection2 = td2Var.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = td2Var.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = td2Var.getPaddingLeft();
            paddingRight = td2Var.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                bt.q(pc6.j(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = td2Var.getLargestMainSize();
            }
            paddingLeft = td2Var.getPaddingTop();
            paddingRight = td2Var.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = (int[]) this.g0;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = td2Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            vd2 vd2Var = (vd2) flexLinesInternal.get(i8);
            int i9 = vd2Var.e;
            if (i9 >= i7 || !vd2Var.q) {
                y5Var = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && vd2Var.r) {
                    y5Var.b0(i4, i5, vd2Var, i7, i6, false);
                }
            } else {
                y5Var = this;
                i4 = i;
                i5 = i2;
                y5Var.I(i4, i5, vd2Var, i7, i6, false);
            }
            i8++;
            this = y5Var;
            i = i4;
            i2 = i5;
        }
    }

    public void F(int i) {
        int[] iArr = (int[]) this.g0;
        if (iArr == null) {
            this.g0 = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.g0 = Arrays.copyOf((int[]) this.g0, Math.max(iArr.length * 2, i));
        }
    }

    public void G(int i) {
        long[] jArr = (long[]) this.f0;
        if (jArr == null) {
            this.f0 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f0 = Arrays.copyOf((long[]) this.f0, Math.max(jArr.length * 2, i));
        }
    }

    public void H(int i) {
        long[] jArr = (long[]) this.h0;
        if (jArr == null) {
            this.h0 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.h0 = Arrays.copyOf((long[]) this.h0, Math.max(jArr.length * 2, i));
        }
    }

    public void I(int i, int i2, vd2 vd2Var, int i3, int i4, boolean z) {
        int i5;
        float f;
        int iMax;
        double d;
        double d2;
        td2 td2Var = (td2) this.Y;
        float f2 = vd2Var.j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = vd2Var.e)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        vd2Var.e = i4 + vd2Var.f;
        if (!z) {
            vd2Var.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < vd2Var.h) {
            int i8 = vd2Var.o + i6;
            View viewB = td2Var.b(i8);
            if (viewB == null || viewB.getVisibility() == 8) {
                f = f3;
                f4 = f4;
                z2 = z2;
            } else {
                ud2 ud2Var = (ud2) viewB.getLayoutParams();
                int flexDirection = td2Var.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    boolean z3 = z2;
                    int measuredWidth = viewB.getMeasuredWidth();
                    long[] jArr = (long[]) this.h0;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewB.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.h0;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.Z)[i8] || ud2Var.s() <= f) {
                        z2 = z3;
                    } else {
                        float fS = (ud2Var.s() * f4) + measuredWidth;
                        if (i6 == vd2Var.h - 1) {
                            fS += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fS);
                        if (iRound > ud2Var.A()) {
                            iRound = ud2Var.A();
                            ((boolean[]) this.Z)[i8] = true;
                            vd2Var.j -= ud2Var.s();
                            z2 = true;
                        } else {
                            float f6 = (fS - iRound) + f5;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f5 = f6;
                                z2 = z3;
                            }
                            f6 = (float) d;
                            f5 = f6;
                            z2 = z3;
                        }
                        int iK = K(i2, ud2Var, vd2Var.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewB.measure(iMakeMeasureSpec, iK);
                        int measuredWidth2 = viewB.getMeasuredWidth();
                        int measuredHeight2 = viewB.getMeasuredHeight();
                        h0(i8, iMakeMeasureSpec, iK, viewB);
                        td2Var.i(viewB, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, td2Var.k(viewB) + ud2Var.n() + ud2Var.q() + measuredHeight);
                    vd2Var.e = ud2Var.v() + ud2Var.o() + measuredWidth + vd2Var.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewB.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.h0;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewB.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.h0;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.Z)[i8] || ud2Var.s() <= f) {
                        f4 = f4;
                        z2 = z2;
                    } else {
                        float fS2 = (ud2Var.s() * f4) + measuredHeight3;
                        if (i6 == vd2Var.h - 1) {
                            fS2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fS2);
                        if (iRound2 > ud2Var.z()) {
                            iRound2 = ud2Var.z();
                            ((boolean[]) this.Z)[i8] = true;
                            vd2Var.j -= ud2Var.s();
                            z2 = true;
                        } else {
                            float f7 = (fS2 - iRound2) + f5;
                            boolean z4 = z2;
                            double d4 = f7;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                f5 = f7;
                                z2 = z4;
                            }
                            f7 = (float) d2;
                            f5 = f7;
                            z2 = z4;
                        }
                        int iL = L(i, ud2Var, vd2Var.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewB.measure(iL, iMakeMeasureSpec2);
                        int measuredWidth4 = viewB.getMeasuredWidth();
                        int measuredHeight4 = viewB.getMeasuredHeight();
                        h0(i8, iL, iMakeMeasureSpec2, viewB);
                        td2Var.i(viewB, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, td2Var.k(viewB) + ud2Var.v() + ud2Var.o() + measuredWidth3);
                    vd2Var.e = ud2Var.n() + ud2Var.q() + measuredHeight3 + vd2Var.e;
                }
                vd2Var.g = Math.max(vd2Var.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == vd2Var.e) {
            return;
        }
        I(i, i2, vd2Var, i3, i4, true);
    }

    public void J(gn2 gn2Var) {
        int i;
        synchronized (this.Y) {
            try {
                j05 j05Var = (j05) this.f0;
                this.f0 = (j05) this.h0;
                this.h0 = j05Var;
                rv rvVar = (rv) this.g0;
                do {
                    i = rvVar.get();
                } while (!rvVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = j05Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    gn2Var.B(j05Var.g(i3));
                }
                j05Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int K(int i, ud2 ud2Var, int i2) {
        td2 td2Var = (td2) this.Y;
        int iG = td2Var.g(i, ud2Var.n() + ud2Var.q() + td2Var.getPaddingBottom() + td2Var.getPaddingTop() + i2, ud2Var.a());
        int size = View.MeasureSpec.getSize(iG);
        if (size > ud2Var.z()) {
            return View.MeasureSpec.makeMeasureSpec(ud2Var.z(), View.MeasureSpec.getMode(iG));
        }
        return size < ud2Var.w() ? View.MeasureSpec.makeMeasureSpec(ud2Var.w(), View.MeasureSpec.getMode(iG)) : iG;
    }

    public int L(int i, ud2 ud2Var, int i2) {
        td2 td2Var = (td2) this.Y;
        int iC = td2Var.c(i, ud2Var.v() + ud2Var.o() + td2Var.getPaddingRight() + td2Var.getPaddingLeft() + i2, ud2Var.b());
        int size = View.MeasureSpec.getSize(iC);
        if (size > ud2Var.A()) {
            return View.MeasureSpec.makeMeasureSpec(ud2Var.A(), View.MeasureSpec.getMode(iC));
        }
        return size < ud2Var.i() ? View.MeasureSpec.makeMeasureSpec(ud2Var.i(), View.MeasureSpec.getMode(iC)) : iC;
    }

    public float M(int i, boolean z) {
        Layout layout = (Layout) this.Y;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float N(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.Y;
        if (!z2) {
            return M(i, z);
        }
        int iZ = gv3.z(layout, i, z2);
        int lineStart = layout.getLineStart(iZ);
        int lineEnd = layout.getLineEnd(iZ);
        if (i != lineStart && i != lineEnd) {
            return M(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return M(i, z);
        }
        int iP = P(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(Q(iP))) == -1;
        int iU = U(lineEnd, lineStart);
        int iQ = Q(iP);
        int i4 = lineStart - iQ;
        int i5 = iU - iQ;
        Bidi bidiS = s(iP);
        Bidi bidiCreateLineBidi = bidiS != null ? bidiS.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iZ) : layout.getLineRight(iZ);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        b34[] b34VarArr = new b34[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            b34VarArr[i6] = new b34(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, b34VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (b34VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == b34VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iZ);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(b34VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(b34VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iZ);
        }
        int iU2 = i > iU ? U(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (b34VarArr[i9].b == iU2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == b34VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iZ);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(b34VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(b34VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iZ);
    }

    public int P(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.Z;
        int i2 = i21.i(arrayList, Integer.valueOf(i));
        int i3 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i3 > 0) {
            int i4 = i3 - 1;
            if (i == ((Number) arrayList.get(i4)).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public int Q(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.Z).get(i - 1)).intValue();
    }

    public boolean R() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        xa2 xa2Var = (xa2) this.Z;
        xa2Var.a();
        Context context = xa2Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void S(View view, vd2 vd2Var, int i, int i2, int i3, int i4) {
        ud2 ud2Var = (ud2) view.getLayoutParams();
        td2 td2Var = (td2) this.Y;
        int alignItems = td2Var.getAlignItems();
        if (ud2Var.f() != -1) {
            alignItems = ud2Var.f();
        }
        int i5 = vd2Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (td2Var.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - ud2Var.n(), i3, i6 - ud2Var.n());
                    return;
                }
                int measuredHeight = view.getMeasuredHeight();
                int iQ = ud2Var.q() + measuredHeight + (i2 - i5);
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, iQ, i3, ud2Var.q() + measuredHeight2 + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int iQ2 = ((ud2Var.q() + (i5 - view.getMeasuredHeight())) - ud2Var.n()) / 2;
                if (td2Var.getFlexWrap() != 2) {
                    int i7 = i2 + iQ2;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iQ2;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = td2Var.getFlexWrap();
                int i9 = vd2Var.l;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), ud2Var.q());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), ud2Var.n());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (td2Var.getFlexWrap() != 2) {
            view.layout(i, ud2Var.q() + i2, i3, ud2Var.q() + i4);
        } else {
            view.layout(i, i2 - ud2Var.n(), i3, i4 - ud2Var.n());
        }
    }

    public void T(View view, vd2 vd2Var, boolean z, int i, int i2, int i3, int i4) {
        ud2 ud2Var = (ud2) view.getLayoutParams();
        int alignItems = ((td2) this.Y).getAlignItems();
        if (ud2Var.f() != -1) {
            alignItems = ud2Var.f();
        }
        int i5 = vd2Var.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - ud2Var.v(), i2, ((i3 + i5) - view.getMeasuredWidth()) - ud2Var.v(), i4);
                    return;
                }
                int measuredWidth = view.getMeasuredWidth();
                view.layout(ud2Var.o() + measuredWidth + (i - i5), i2, ud2Var.o() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - ud2Var.v(), i2, i3 - ud2Var.v(), i4);
        } else {
            view.layout(ud2Var.o() + i, i2, ud2Var.o() + i3, i4);
        }
    }

    public int U(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.Y).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((dh3.k(cCharAt, 8192) < 0 || dh3.k(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public z47 V() {
        z47 z47Var = new z47(false);
        z47Var.g0 = new LinkedHashMap();
        z47Var.Z = (u23) this.Y;
        z47Var.Y = (String) this.Z;
        Map map = (Map) this.f0;
        z47Var.g0 = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        z47Var.f0 = ((nz2) this.g0).c();
        return z47Var;
    }

    public void W() {
        js4 js4Var = new js4((MediaBrowserServiceCompat) this.h0, this);
        this.Z = js4Var;
        js4Var.onCreate();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[Catch: all -> 0x0034, LOOP:0: B:29:0x0059->B:31:0x005d, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0076 -> B:35:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void X(defpackage.s51 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f0
            x90 r0 = (defpackage.x90) r0
            java.lang.Object r1 = r7.h0
            kt r1 = (defpackage.kt) r1
            boolean r2 = r8 instanceof defpackage.ev5
            if (r2 == 0) goto L1b
            r2 = r8
            ev5 r2 = (defpackage.ev5) r2
            int r3 = r2.i0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.i0 = r3
            goto L20
        L1b:
            ev5 r2 = new ev5
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.g0
            int r3 = r2.i0
            r4 = 2
            r5 = 1
            c71 r6 = defpackage.c71.X
            if (r3 == 0) goto L40
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L36
            int r3 = r2.f0
            defpackage.w39.n0(r8)     // Catch: java.lang.Throwable -> L34
            goto L79
        L34:
            r8 = move-exception
            goto L7e
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            return
        L3c:
            defpackage.w39.n0(r8)     // Catch: java.lang.Throwable -> L34
            goto L4c
        L40:
            defpackage.w39.n0(r8)
        L43:
            r2.i0 = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.r(r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r6) goto L4c
            goto L78
        L4c:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L4f:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L43
            java.lang.Object r8 = r0.q()     // Catch: java.lang.Throwable -> L34
        L59:
            boolean r3 = r8 instanceof defpackage.tp0     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L68
            defpackage.up0.b(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.q()     // Catch: java.lang.Throwable -> L34
            goto L59
        L68:
            int r3 = r1.Z     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.Z     // Catch: java.lang.Throwable -> L34
            yn1 r8 = (defpackage.yn1) r8     // Catch: java.lang.Throwable -> L34
            r2.f0 = r3     // Catch: java.lang.Throwable -> L34
            r2.i0 = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.K(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r6) goto L79
        L78:
            return
        L79:
            int r8 = r1.Z     // Catch: java.lang.Throwable -> L34
            if (r3 != r8) goto L4f
            goto L43
        L7e:
            r7.Z(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5.X(s51):void");
    }

    public fb9 Y() {
        fb9 fb9VarK;
        int i;
        boolean zR = R();
        final byte b = 1;
        if (zR && ((r41) this.h0).h() >= 261200000) {
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new e25("Firebase-Messaging-Network-Io"));
            final byte b2 = 0;
            return ((mb2) ((nb2) this.g0)).d().e(executorServiceNewSingleThreadExecutor, new r51(this) { // from class: js2
                public final /* synthetic */ y5 Y;

                {
                    this.Y = this;
                }

                @Override // defpackage.r51
                public final Object g(fb9 fb9Var) {
                    byte b3 = b;
                    ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                    y5 y5Var = this.Y;
                    switch (b3) {
                        case 0:
                            if (!fb9Var.i()) {
                                return g28.k(y5.O(fb9Var));
                            }
                            String str = (String) ((Pair) fb9Var.g()).first;
                            String str2 = (String) ((Pair) fb9Var.g()).second;
                            xa2 xa2Var = (xa2) y5Var.Z;
                            xa2Var.a();
                            uc2 uc2Var = xa2Var.c;
                            String str3 = uc2Var.a;
                            xa2Var.a();
                            oc6 oc6Var = new oc6(r41.g(xa2Var), uc2Var.b, str3, str, str2);
                            h99 h99Var = (h99) y5Var.Y;
                            y18 y18Var = new y18();
                            y18Var.b = true;
                            y18Var.a = new k82[]{vr3.i};
                            y18Var.d = new c89(oc6Var, h99Var);
                            y18Var.c = (char) 39001;
                            return h99Var.b(0, y18Var.a()).d(executorService, new ks2(str, (byte) 0));
                        default:
                            if (!fb9Var.i()) {
                                return g28.k(y5.O(fb9Var));
                            }
                            return ((mb2) ((nb2) y5Var.g0)).c().e(executorService, new ks2(y5Var, ((qy) fb9Var.g()).a));
                    }
                }
            }).e(executorServiceNewSingleThreadExecutor, new r51(this) { // from class: js2
                public final /* synthetic */ y5 Y;

                {
                    this.Y = this;
                }

                @Override // defpackage.r51
                public final Object g(fb9 fb9Var) {
                    byte b3 = b2;
                    ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                    y5 y5Var = this.Y;
                    switch (b3) {
                        case 0:
                            if (!fb9Var.i()) {
                                return g28.k(y5.O(fb9Var));
                            }
                            String str = (String) ((Pair) fb9Var.g()).first;
                            String str2 = (String) ((Pair) fb9Var.g()).second;
                            xa2 xa2Var = (xa2) y5Var.Z;
                            xa2Var.a();
                            uc2 uc2Var = xa2Var.c;
                            String str3 = uc2Var.a;
                            xa2Var.a();
                            oc6 oc6Var = new oc6(r41.g(xa2Var), uc2Var.b, str3, str, str2);
                            h99 h99Var = (h99) y5Var.Y;
                            y18 y18Var = new y18();
                            y18Var.b = true;
                            y18Var.a = new k82[]{vr3.i};
                            y18Var.d = new c89(oc6Var, h99Var);
                            y18Var.c = (char) 39001;
                            return h99Var.b(0, y18Var.a()).d(executorService, new ks2(str, (byte) 0));
                        default:
                            if (!fb9Var.i()) {
                                return g28.k(y5.O(fb9Var));
                            }
                            return ((mb2) ((nb2) y5Var.g0)).c().e(executorService, new ks2(y5Var, ((qy) fb9Var.g()).a));
                    }
                }
            });
        }
        fu6 fu6Var = (fu6) this.f0;
        String strG = r41.g((xa2) fu6Var.Y);
        Bundle bundle = new Bundle();
        try {
            fu6Var.u0(strG, bundle, zR);
            yq6 yq6Var = (yq6) fu6Var.f0;
            dp1 dp1Var = dp1.f0;
            cb0 cb0Var = yq6Var.c;
            if (cb0Var.w() < 12000000) {
                fb9VarK = cb0Var.u() != 0 ? yq6Var.b(bundle).e(dp1Var, new c89(bundle, yq6Var)) : g28.k(new IOException("MISSING_INSTANCEID_SERVICE"));
            } else {
                eb9 eb9VarN = eb9.n(yq6Var.b);
                synchronized (eb9VarN) {
                    i = eb9VarN.Y;
                    eb9VarN.Y = i + 1;
                }
                fb9VarK = eb9VarN.o(new bb9(i, 1, bundle, (byte) 1)).d(dp1Var, f08.f0);
            }
        } catch (InterruptedException | ExecutionException e) {
            fb9VarK = g28.k(e);
        }
        return fb9VarK.d(new nd((byte) 2), new u52(fu6Var));
    }

    public void Z(Throwable th) {
        kt ktVar = (kt) this.h0;
        x90 x90Var = (x90) this.f0;
        if (x90Var.e(th, false)) {
            for (Object objQ = x90Var.q(); !(objQ instanceof tp0); objQ = x90Var.q()) {
                up0.b(objQ);
                ktVar.addLast(objQ);
            }
            if (ktVar.isEmpty()) {
                return;
            }
            ((gn2) this.Y).B(new ArrayList(ktVar));
            ktVar.clear();
        }
    }

    @Override // defpackage.ny0
    public Object a(Class cls) {
        if (!((Set) this.Y).contains(e26.a(cls))) {
            throw new qi1(pc6.n("Attempting to request an undeclared dependency ", cls, "."));
        }
        Object objA = ((ny0) this.h0).a(cls);
        if (!cls.equals(y16.class)) {
            return objA;
        }
        return new mj6();
    }

    public void a0(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.Y).put(str, obj);
        oh7 oh7Var = (oh7) ((LinkedHashMap) this.g0).get(str);
        if (oh7Var != null) {
            oh7Var.m(obj);
        }
        oh7 oh7Var2 = (oh7) ((LinkedHashMap) this.f0).get(str);
        if (oh7Var2 != null) {
            oh7Var2.m(obj);
        }
    }

    @Override // defpackage.vg5
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.h0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ug5) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    public void b0(int i, int i2, vd2 vd2Var, int i3, int i4, boolean z) {
        float f;
        boolean z2;
        int iMax;
        boolean z3;
        int iW;
        float f2;
        td2 td2Var = (td2) this.Y;
        int i5 = vd2Var.e;
        float f3 = vd2Var.k;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        vd2Var.e = i4 + vd2Var.f;
        if (!z) {
            vd2Var.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < vd2Var.h) {
            int i8 = vd2Var.o + i6;
            View viewB = td2Var.b(i8);
            if (viewB == null || viewB.getVisibility() == 8) {
                f = f4;
                f5 = f5;
                z2 = z4;
                i6 = i6;
            } else {
                ud2 ud2Var = (ud2) viewB.getLayoutParams();
                int flexDirection = td2Var.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f5 = f5;
                    z2 = z4;
                    int measuredWidth = viewB.getMeasuredWidth();
                    long[] jArr = (long[]) this.h0;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewB.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.h0;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.Z)[i8] || ud2Var.h() <= f) {
                        i6 = i6;
                    } else {
                        float fH = measuredWidth - (ud2Var.h() * f5);
                        if (i6 == vd2Var.h - 1) {
                            fH += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fH);
                        if (iRound < ud2Var.i()) {
                            iRound = ud2Var.i();
                            ((boolean[]) this.Z)[i8] = true;
                            vd2Var.k -= ud2Var.h();
                            z2 = true;
                        } else {
                            float f7 = (fH - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iRound++;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f7 += 1.0f;
                            }
                            f6 = f7;
                        }
                        int iK = K(i2, ud2Var, vd2Var.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewB.measure(iMakeMeasureSpec, iK);
                        int measuredWidth2 = viewB.getMeasuredWidth();
                        int measuredHeight2 = viewB.getMeasuredHeight();
                        h0(i8, iMakeMeasureSpec, iK, viewB);
                        td2Var.i(viewB, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, td2Var.k(viewB) + ud2Var.n() + ud2Var.q() + measuredHeight);
                    vd2Var.e = ud2Var.v() + ud2Var.o() + measuredWidth + vd2Var.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewB.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.h0;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewB.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.h0;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.Z)[i8] || ud2Var.h() <= f) {
                        z3 = z4;
                    } else {
                        float fH2 = measuredHeight3 - (ud2Var.h() * f5);
                        if (i6 == vd2Var.h - 1) {
                            fH2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fH2);
                        if (iRound2 < ud2Var.w()) {
                            iW = ud2Var.w();
                            ((boolean[]) this.Z)[i8] = true;
                            vd2Var.k -= ud2Var.h();
                            z3 = true;
                        } else {
                            float f8 = (fH2 - iRound2) + f6;
                            boolean z5 = z4;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iW = iRound2 + 1;
                                f2 = f8 - 1.0f;
                            } else if (d2 < -1.0d) {
                                iW = iRound2 - 1;
                                f2 = f8 + 1.0f;
                            } else {
                                iW = iRound2;
                                z3 = z5;
                                f6 = f8;
                            }
                            f6 = f2;
                            z3 = z5;
                        }
                        int iL = L(i, ud2Var, vd2Var.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iW, 1073741824);
                        viewB.measure(iL, iMakeMeasureSpec2);
                        int measuredWidth4 = viewB.getMeasuredWidth();
                        int measuredHeight4 = viewB.getMeasuredHeight();
                        h0(i8, iL, iMakeMeasureSpec2, viewB);
                        td2Var.i(viewB, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, td2Var.k(viewB) + ud2Var.v() + ud2Var.o() + measuredWidth3);
                    vd2Var.e = ud2Var.n() + ud2Var.q() + measuredHeight3 + vd2Var.e;
                    z2 = z3;
                    i6 = i6;
                }
                vd2Var.g = Math.max(vd2Var.g, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            z4 = z2;
            f5 = f5;
        }
        if (!z4 || i5 == vd2Var.e) {
            return;
        }
        b0(i, i2, vd2Var, i3, i4, true);
    }

    @Override // defpackage.i04
    public void c() {
        ((fc8) this.Z).c();
        fc8 fc8Var = (fc8) this.g0;
        ((HashMap) fc8Var.Z).put((v15) this.f0, new qm((gm) wv0.O0((ArrayList) this.h0)));
    }

    @Override // defpackage.g44
    public boolean d() {
        return ((xw8) this.h0) != null;
    }

    public void d0(View view, int i, int i2) {
        ud2 ud2Var = (ud2) view.getLayoutParams();
        int iO = (i - ud2Var.o()) - ud2Var.v();
        td2 td2Var = (td2) this.Y;
        int iMin = Math.min(Math.max(iO - td2Var.k(view), ud2Var.i()), ud2Var.A());
        long[] jArr = (long[]) this.h0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        h0(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        td2Var.i(view, i2);
    }

    @Override // defpackage.ny0
    public Set e(e26 e26Var) {
        if (((Set) this.g0).contains(e26Var)) {
            return ((ny0) this.h0).e(e26Var);
        }
        kp5.l("Attempting to request an undeclared dependency Set<", e26Var, ">.");
        return null;
    }

    public void e0(View view, int i, int i2) {
        ud2 ud2Var = (ud2) view.getLayoutParams();
        int iQ = (i - ud2Var.q()) - ud2Var.n();
        td2 td2Var = (td2) this.Y;
        int iMin = Math.min(Math.max(iQ - td2Var.k(view), ud2Var.w()), ud2Var.z());
        long[] jArr = (long[]) this.h0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        h0(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        td2Var.i(view, i2);
    }

    @Override // defpackage.ny0
    public w06 f(Class cls) {
        return j(e26.a(cls));
    }

    public void f0(int i) {
        View viewB;
        td2 td2Var = (td2) this.Y;
        if (i >= td2Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = td2Var.getFlexDirection();
        if (td2Var.getAlignItems() != 4) {
            for (vd2 vd2Var : td2Var.getFlexLinesInternal()) {
                for (Integer num : vd2Var.n) {
                    View viewB2 = td2Var.b(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        e0(viewB2, vd2Var.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            bt.q(pc6.j(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        d0(viewB2, vd2Var.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.g0;
        List flexLinesInternal = td2Var.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            vd2 vd2Var2 = (vd2) flexLinesInternal.get(i2);
            int i3 = vd2Var2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = vd2Var2.o + i4;
                if (i4 < td2Var.getFlexItemCount() && (viewB = td2Var.b(i5)) != null && viewB.getVisibility() != 8) {
                    ud2 ud2Var = (ud2) viewB.getLayoutParams();
                    if (ud2Var.f() == -1 || ud2Var.f() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            e0(viewB, vd2Var2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                bt.q(pc6.j(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            d0(viewB, vd2Var2.g, i5);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.i04
    public void g(v15 v15Var, Object obj) {
        ((fc8) this.Y).g(v15Var, obj);
    }

    public boolean g0(Object obj) {
        return !(((x90) this.f0).b(obj) instanceof tp0);
    }

    @Override // defpackage.v06
    public Object get() {
        return new of1((Executor) ((v06) this.Y).get(), (zu4) ((v06) this.Z).get(), (f63) ((f63) this.g0).get(), (wr6) ((v06) this.f0).get(), (wr6) ((v06) this.h0).get());
    }

    @Override // defpackage.ov8
    public View getRoot() {
        switch (this.X) {
            case 0:
                return (LinearLayout) this.Y;
            case 1:
                return (LinearLayout) this.Y;
            case 2:
                return (LinearLayout) this.Y;
            case 11:
                return (ConstraintLayout) this.Z;
            default:
                return (LinearLayout) this.Y;
        }
    }

    @Override // defpackage.g44
    public Object getValue() {
        xw8 xw8Var = (xw8) this.h0;
        if (xw8Var != null) {
            return xw8Var;
        }
        ex8 ex8Var = (ex8) ((dn2) this.Z).invoke();
        bx8 bx8Var = (bx8) ((dn2) this.g0).invoke();
        o71 o71Var = (o71) ((dn2) this.f0).invoke();
        ex8Var.getClass();
        bx8Var.getClass();
        o71Var.getClass();
        yr6 yr6Var = new yr6(ex8Var, bx8Var, o71Var);
        zu3 zu3Var = (zu3) this.Y;
        zu3Var.getClass();
        String strP = zu3Var.p();
        if (strP == null) {
            bt.q("Local and anonymous classes can not be ViewModels");
            return null;
        }
        xw8 xw8VarG = yr6Var.g(zu3Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        this.h0 = xw8VarG;
        return xw8VarG;
    }

    @Override // defpackage.vg5
    public float h() {
        return ((Number) ((g44) this.g0).getValue()).floatValue();
    }

    public void h0(int i, int i2, int i3, View view) {
        long[] jArr = (long[]) this.f0;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.h0;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    @Override // defpackage.ny0
    public w06 i(e26 e26Var) {
        if (((Set) this.f0).contains(e26Var)) {
            return ((ny0) this.h0).i(e26Var);
        }
        kp5.l("Attempting to request an undeclared dependency Provider<Set<", e26Var, ">>.");
        return null;
    }

    @Override // defpackage.ny0
    public w06 j(e26 e26Var) {
        if (((Set) this.Z).contains(e26Var)) {
            return ((ny0) this.h0).j(e26Var);
        }
        kp5.l("Attempting to request an undeclared dependency Provider<", e26Var, ">.");
        return null;
    }

    @Override // defpackage.ny0
    public Object k(e26 e26Var) {
        if (((Set) this.Y).contains(e26Var)) {
            return ((ny0) this.h0).k(e26Var);
        }
        kp5.l("Attempting to request an undeclared dependency ", e26Var, ".");
        return null;
    }

    @Override // defpackage.vg5
    public float l() {
        return ((Number) ((g44) this.f0).getValue()).floatValue();
    }

    public void m(ci ciVar, zu3 zu3Var) {
        ((ArrayList) this.Z).add(new qg5(ciVar, zu3Var));
    }

    @Override // defpackage.i04
    public void n(v15 v15Var, vs0 vs0Var) {
        ((fc8) this.Y).n(v15Var, vs0Var);
    }

    public void o(v82 v82Var, zu3 zu3Var) {
        ((ArrayList) this.f0).add(new p5(v82Var, zu3Var, (byte) 17));
    }

    public pm0 p(h00 h00Var, dn2 dn2Var) {
        int i;
        int i2;
        int i3;
        ca6 ca6Var = new ca6();
        ca6Var.X = -1;
        synchronized (this.Y) {
            Throwable th = (Throwable) this.Z;
            if (th != null) {
                h00Var.b(th);
                return pz2.x0;
            }
            rv rvVar = (rv) this.g0;
            do {
                i = rvVar.get();
                i2 = i + 1;
            } while (!rvVar.compareAndSet(i, i2));
            byte b = 0;
            boolean z = (134217727 & i2) == 1;
            ca6Var.X = (i2 >>> 27) & 15;
            ((j05) this.f0).a(h00Var);
            if (z) {
                try {
                    dn2Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.Y) {
                        try {
                            if (((Throwable) this.Z) == null) {
                                this.Z = th2;
                                j05 j05Var = (j05) this.f0;
                                Object[] objArr = j05Var.a;
                                int i4 = j05Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((h00) objArr[i5]).b(th2);
                                }
                                ((j05) this.f0).d();
                                rv rvVar2 = (rv) this.g0;
                                do {
                                    i3 = rvVar2.get();
                                } while (!rvVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new zz2(new g00(h00Var, this, ca6Var, b));
        }
    }

    public void q(List list, vd2 vd2Var, int i, int i2) {
        vd2Var.m = i2;
        ((td2) this.Y).h(vd2Var);
        vd2Var.p = i;
        list.add(vd2Var);
    }

    @Override // defpackage.i04
    public j04 r(v15 v15Var) {
        return ((fc8) this.Y).r(v15Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi s(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.Y;
        ArrayList arrayList = (ArrayList) this.Z;
        ArrayList arrayList2 = (ArrayList) this.g0;
        boolean[] zArr = (boolean[]) this.f0;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.h0;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(Q(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.h0;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.h0 = cArr2;
        return bidi;
    }

    @Override // defpackage.i04
    public void t(v15 v15Var, qs0 qs0Var, v15 v15Var2) {
        ((fc8) this.Y).t(v15Var, qs0Var, v15Var2);
    }

    public String toString() {
        String str;
        switch (this.X) {
            case 14:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                uz3 uz3Var = (uz3) this.Y;
                if (uz3Var == null) {
                    dh3.T("kind");
                    throw null;
                }
                sb.append(uz3Var);
                sb.append(", level=");
                tz3 tz3Var = (tz3) this.Z;
                if (tz3Var == null) {
                    dh3.T("level");
                    throw null;
                }
                sb.append(tz3Var);
                sb.append(", version=");
                sz3 sz3Var = (sz3) this.h0;
                if (sz3Var == null) {
                    dh3.T("version");
                    throw null;
                }
                sb.append(sz3Var);
                sb.append(", errorCode=");
                sb.append((Integer) this.g0);
                sb.append(", message=");
                return oi0.o(sb, (String) this.f0, ')');
            case 19:
                Map map = (Map) this.f0;
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.Z);
                sb2.append(", url=");
                sb2.append((u23) this.Y);
                nz2 nz2Var = (nz2) this.g0;
                if (nz2Var.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = nz2Var.iterator();
                    int i = 0;
                    while (true) {
                        w1 w1Var = (w1) it;
                        if (w1Var.hasNext()) {
                            Object next = w1Var.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                i21.X();
                                throw null;
                            }
                            qg5 qg5Var = (qg5) next;
                            String str2 = (String) qg5Var.X;
                            String str3 = (String) qg5Var.Y;
                            if (i > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(str2);
                            sb2.append(':');
                            sb2.append(str3);
                            i = i2;
                        } else {
                            sb2.append(']');
                        }
                    }
                }
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                return sb2.toString();
            case 24:
                String str4 = (String) this.h0;
                StringBuilder sb3 = new StringBuilder("since ");
                sb3.append((cv8) this.Y);
                sb3.append(' ');
                sb3.append((vi1) this.g0);
                Integer num = (Integer) this.f0;
                String strConcat = _UrlKt.FRAGMENT_ENCODE_SET;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                sb3.append(str);
                if (str4 != null) {
                    strConcat = ": ".concat(str4);
                }
                sb3.append(strConcat);
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public fz u() {
        String strConcat = ((wg1) this.Y) == null ? " surface" : _UrlKt.FRAGMENT_ENCODE_SET;
        if (((List) this.Z) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.g0) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.f0) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((px1) this.h0) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new fz((wg1) this.Y, (List) this.Z, ((Integer) this.g0).intValue(), ((Integer) this.f0).intValue(), (px1) this.h0);
        }
        bt.i("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    public void v(b8 b8Var, int i, int i2, int i3, int i4, int i5, List list) {
        int iG;
        ud2 ud2Var;
        int i6;
        boolean z;
        int i7 = i;
        td2 td2Var = (td2) this.Y;
        boolean zJ = td2Var.j();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List arrayList = list == null ? new ArrayList() : list;
        b8Var.c = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zJ ? td2Var.getPaddingStart() : td2Var.getPaddingTop();
        int paddingEnd = zJ ? td2Var.getPaddingEnd() : td2Var.getPaddingBottom();
        int paddingTop = zJ ? td2Var.getPaddingTop() : td2Var.getPaddingStart();
        int paddingBottom = zJ ? td2Var.getPaddingBottom() : td2Var.getPaddingEnd();
        vd2 vd2Var = new vd2();
        int i8 = i4;
        int i9 = 1;
        vd2Var.o = i8;
        int i10 = paddingStart + paddingEnd;
        vd2Var.e = i10;
        int flexItemCount = td2Var.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewB = td2Var.b(i8);
            if (viewB != null) {
                if (viewB.getVisibility() == 8) {
                    vd2Var.i++;
                    vd2Var.h++;
                    if (i8 == i14 - 1 && vd2Var.a() != 0) {
                        q(arrayList, vd2Var, i8, i12);
                    }
                } else {
                    if (viewB instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewB;
                        ud2 ud2Var2 = (ud2) compoundButton.getLayoutParams();
                        int i15 = ud2Var2.i();
                        int iW = ud2Var2.w();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (i15 == -1) {
                            i15 = minimumWidth;
                        }
                        ud2Var2.j(i15);
                        if (iW == -1) {
                            iW = minimumHeight;
                        }
                        ud2Var2.r(iW);
                    }
                    ud2 ud2Var3 = (ud2) viewB.getLayoutParams();
                    if (ud2Var3.f() == 4) {
                        vd2Var.n.add(Integer.valueOf(i8));
                    }
                    int iB = zJ ? ud2Var3.b() : ud2Var3.a();
                    if (ud2Var3.t() != -1.0f && mode == 1073741824) {
                        iB = Math.round(ud2Var3.t() * size);
                    }
                    if (zJ) {
                        iG = td2Var.c(i7, ud2Var3.v() + ud2Var3.o() + i10, iB);
                        int iG2 = td2Var.g(i2, ud2Var3.n() + ud2Var3.q() + paddingTop + paddingBottom + i12, ud2Var3.a());
                        viewB.measure(iG, iG2);
                        h0(i8, iG, iG2, viewB);
                    } else {
                        int iC = td2Var.c(i2, ud2Var3.v() + ud2Var3.o() + paddingTop + paddingBottom + i12, ud2Var3.b());
                        iG = td2Var.g(i7, ud2Var3.n() + ud2Var3.q() + i10, iB);
                        viewB.measure(iC, iG);
                        h0(i8, iC, iG, viewB);
                    }
                    td2Var.i(viewB, i8);
                    x(viewB, i8);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewB.getMeasuredState());
                    int i16 = vd2Var.e;
                    int measuredWidth = (zJ ? viewB.getMeasuredWidth() : viewB.getMeasuredHeight()) + (zJ ? ud2Var3.o() : ud2Var3.q()) + (zJ ? ud2Var3.v() : ud2Var3.n());
                    int size2 = arrayList.size();
                    if (td2Var.getFlexWrap() != 0) {
                        if (ud2Var3.x()) {
                            ud2Var = ud2Var3;
                        } else {
                            if (mode == 0) {
                                ud2Var = ud2Var3;
                            } else {
                                ud2Var = ud2Var3;
                                int maxLine = td2Var.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iF = td2Var.f(viewB, i8, i13);
                                    if (iF > 0) {
                                        measuredWidth += iF;
                                    }
                                    if (size < i16 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            vd2Var.h += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (vd2Var.a() > 0) {
                            arrayList = arrayList;
                            q(arrayList, vd2Var, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += vd2Var.g;
                        }
                        if (zJ) {
                            arrayList = arrayList;
                            if (ud2Var.a() == -1) {
                                viewB.measure(iG, td2Var.g(i2, ud2Var.n() + ud2Var.q() + td2Var.getPaddingBottom() + td2Var.getPaddingTop() + i12, ud2Var.a()));
                                x(viewB, i8);
                            }
                        } else {
                            arrayList = arrayList;
                            if (ud2Var.b() == -1) {
                                viewB.measure(td2Var.c(i2, ud2Var.v() + ud2Var.o() + td2Var.getPaddingRight() + td2Var.getPaddingLeft() + i12, ud2Var.b()), iG);
                                x(viewB, i8);
                            }
                        }
                        vd2Var = new vd2();
                        vd2Var.h = i9;
                        i10 = i10;
                        vd2Var.e = i10;
                        vd2Var.o = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        ud2Var = ud2Var3;
                        i10 = i10;
                        arrayList = arrayList;
                        vd2Var.h += i9;
                        i13++;
                        i6 = i11;
                    }
                    vd2Var.q |= ud2Var.s() != 0.0f;
                    vd2Var.r |= ud2Var.h() != 0.0f;
                    int[] iArr = (int[]) this.g0;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    vd2Var.e = (zJ ? viewB.getMeasuredWidth() : viewB.getMeasuredHeight()) + (zJ ? ud2Var.o() : ud2Var.q()) + (zJ ? ud2Var.v() : ud2Var.n()) + vd2Var.e;
                    vd2Var.j = ud2Var.s() + vd2Var.j;
                    vd2Var.k = ud2Var.h() + vd2Var.k;
                    td2Var.d(viewB, i8, i13, vd2Var);
                    int iMax = Math.max(i6, td2Var.k(viewB) + (zJ ? viewB.getMeasuredHeight() : viewB.getMeasuredWidth()) + (zJ ? ud2Var.q() : ud2Var.o()) + (zJ ? ud2Var.n() : ud2Var.v()));
                    vd2Var.g = Math.max(vd2Var.g, iMax);
                    if (zJ) {
                        int flexWrap = td2Var.getFlexWrap();
                        int i17 = vd2Var.l;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            vd2Var.l = Math.max(i17, ud2Var.q() + viewB.getBaseline());
                        } else {
                            vd2Var.l = Math.max(i17, ud2Var.n() + (viewB.getMeasuredHeight() - viewB.getBaseline()));
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && vd2Var.a() != 0) {
                        q(arrayList, vd2Var, i8, i12);
                        i12 += vd2Var.g;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        i9 = 1;
                        if (((vd2) arrayList.get(arrayList.size() - 1)).p >= i5 && i8 >= i5 && !z3) {
                            i12 = -vd2Var.g;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    } else {
                        i9 = 1;
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
            } else if (i8 == i14 - 1 && vd2Var.a() != 0) {
                q(arrayList, vd2Var, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
        }
        b8Var.b = iCombineMeasuredStates;
    }

    @Override // defpackage.i04
    public i04 w(qs0 qs0Var, v15 v15Var) {
        return ((fc8) this.Y).w(qs0Var, v15Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public void x(View view, int i) {
        boolean z;
        ud2 ud2Var = (ud2) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= ud2Var.i()) {
            if (measuredWidth > ud2Var.A()) {
                measuredWidth = ud2Var.A();
            } else {
                z = false;
            }
            if (measuredHeight < ud2Var.w()) {
                measuredHeight = ud2Var.w();
            } else if (measuredHeight > ud2Var.z()) {
                measuredHeight = ud2Var.z();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                h0(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                ((td2) this.Y).i(view, i);
            }
        }
        measuredWidth = ud2Var.i();
        z = true;
        if (measuredHeight < ud2Var.w()) {
            measuredHeight = ud2Var.w();
        } else if (measuredHeight > ud2Var.z()) {
            measuredHeight = ud2Var.z();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            h0(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            ((td2) this.Y).i(view, i);
        }
    }

    public void y(int i, List list) {
        int i2 = ((int[]) this.g0)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.g0;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.f0;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public /* synthetic */ y5(LinearLayout linearLayout, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Toolbar toolbar, byte b) {
        this.X = b;
        this.Y = linearLayout;
        this.Z = viewGroup;
        this.g0 = viewGroup2;
        this.h0 = viewGroup3;
        this.f0 = toolbar;
    }

    public /* synthetic */ y5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.g0 = obj3;
        this.f0 = obj4;
        this.h0 = obj5;
    }

    public y5(Context context, xa2 xa2Var, nb2 nb2Var, fu6 fu6Var, r41 r41Var) {
        this.X = (byte) 13;
        this.Y = new h99(context, h99.l, bn.a, ls2.b);
        this.Z = xa2Var;
        this.g0 = nb2Var;
        this.f0 = fu6Var;
        this.h0 = r41Var;
    }

    public y5(cv8 cv8Var, yz5 yz5Var, vi1 vi1Var, Integer num, String str) {
        this.X = (byte) 24;
        yz5Var.getClass();
        this.Y = cv8Var;
        this.Z = yz5Var;
        this.g0 = vi1Var;
        this.f0 = num;
        this.h0 = str;
    }

    public y5(Map map) {
        this.X = (byte) 21;
        map.getClass();
        this.Y = new LinkedHashMap(map);
        this.Z = new LinkedHashMap();
        this.g0 = new LinkedHashMap();
        this.f0 = new LinkedHashMap();
        this.h0 = new hy0(this, (byte) 4);
    }

    public y5(u23 u23Var, String str, nz2 nz2Var, w45 w45Var, Map map) {
        this.X = (byte) 19;
        u23Var.getClass();
        str.getClass();
        this.Y = u23Var;
        this.Z = str;
        this.g0 = nz2Var;
        this.f0 = map;
    }

    public y5(byte b) {
        this.X = b;
        switch (b) {
            case 9:
                this.Y = new int[10];
                this.Z = new int[10];
                this.g0 = new int[10];
                this.f0 = new int[10];
                this.h0 = new int[10];
                break;
            default:
                this.Y = new Object();
                this.g0 = new rv(0);
                this.f0 = new j05();
                this.h0 = new j05();
                break;
        }
    }

    public y5(Context context, y5 y5Var) {
        z35 z35Var;
        this.X = (byte) 23;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        y40 y40Var = new y40(applicationContext, y5Var, (byte) 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        y40 y40Var2 = new y40(applicationContext2, y5Var, (byte) 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            int i = y35.a;
            z35Var = new z35(applicationContext3, y5Var);
        } else {
            z35Var = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        y40 y40Var3 = new y40(applicationContext4, y5Var, (byte) 2);
        this.Y = context;
        this.Z = y40Var;
        this.g0 = y40Var2;
        this.f0 = z35Var;
        this.h0 = y40Var3;
    }

    public y5(Layout layout) {
        this.X = (byte) 15;
        this.Y = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iL0 = fm7.l0(((Layout) this.Y).getText(), '\n', length, 4);
            length = iL0 < 0 ? ((Layout) this.Y).getText().length() : iL0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.Y).getText().length());
        this.Z = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.g0 = arrayList2;
        this.f0 = new boolean[((ArrayList) this.Z).size()];
        ((ArrayList) this.Z).size();
    }

    public y5(zu3 zu3Var, dn2 dn2Var, dn2 dn2Var2, dn2 dn2Var3) {
        this.X = (byte) 25;
        zu3Var.getClass();
        this.Y = zu3Var;
        this.Z = dn2Var;
        this.g0 = dn2Var2;
        this.f0 = dn2Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y5(cy0 cy0Var, ny0 ny0Var) {
        this.X = (byte) 20;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<li1> set = cy0Var.c;
        Set set2 = cy0Var.g;
        for (li1 li1Var : set) {
            boolean z = li1Var.c;
            byte b = li1Var.b;
            e26 e26Var = li1Var.a;
            if (z == 0) {
                if (b == 2) {
                    hashSet4.add(e26Var);
                } else {
                    hashSet.add(e26Var);
                }
            } else if (z == 2) {
                hashSet3.add(e26Var);
            } else if (b == 2) {
                hashSet5.add(e26Var);
            } else {
                hashSet2.add(e26Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(e26.a(y16.class));
        }
        this.Y = Collections.unmodifiableSet(hashSet);
        this.Z = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.g0 = Collections.unmodifiableSet(hashSet4);
        this.f0 = Collections.unmodifiableSet(hashSet5);
        this.h0 = ny0Var;
    }

    public y5(Executor executor) {
        this.X = (byte) 26;
        this.f0 = new Handler(Looper.getMainLooper());
        this.h0 = new ki3(this);
        h37 h37Var = new h37(executor);
        this.Y = h37Var;
        u61 u61VarX = nr4.x(h37Var);
        this.Z = u61VarX;
        nr4.x(new h37(executor));
        this.g0 = gv3.c(u61VarX);
    }

    public /* synthetic */ y5(byte b, boolean z) {
        this.X = b;
    }

    public y5(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, HappTextButton happTextButton, HappTextButton happTextButton2, HappTextView happTextView) {
        this.X = (byte) 11;
        this.Z = constraintLayout;
        this.Y = appCompatImageView;
        this.g0 = happTextButton;
        this.f0 = happTextButton2;
        this.h0 = happTextView;
    }

    public y5(s98 s98Var, hi0 hi0Var, cl7 cl7Var, jg0 jg0Var, tl7 tl7Var) {
        this.X = (byte) 22;
        s98Var.getClass();
        jg0Var.getClass();
        tl7Var.getClass();
        this.Y = s98Var;
        this.Z = hi0Var;
        this.g0 = cl7Var;
        this.f0 = jg0Var;
        this.h0 = tl7Var;
    }

    public y5(d0 d0Var, yn1 yn1Var) {
        this.X = (byte) 18;
        this.Y = d0Var;
        this.Z = yn1Var;
        this.g0 = nr4.e(false);
        this.f0 = gv3.b(Integer.MAX_VALUE, null, new vj2((Object) this, (byte) 25), 2);
        this.h0 = new kt();
    }

    public y5(cj0 cj0Var, cj0 cj0Var2, cy7 cy7Var) {
        this.X = (byte) 8;
        this.Z = cj0Var;
        this.g0 = cj0Var2;
        this.Y = cy7Var;
    }

    public y5(td2 td2Var) {
        this.X = (byte) 10;
        this.Y = td2Var;
    }

    public y5(uy0 uy0Var) {
        this.X = (byte) 6;
        this.Y = wv0.Z0(uy0Var.a);
        this.Z = wv0.Z0(uy0Var.b);
        this.g0 = wv0.Z0(uy0Var.c);
        List list = (List) uy0Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new o7(it.next(), (byte) 21));
        }
        this.f0 = arrayList;
        List list2 = (List) uy0Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ty0((qd1) it2.next(), (byte) 0));
        }
        this.h0 = arrayList2;
    }

    public y5(fc8 fc8Var, fc8 fc8Var2, v15 v15Var, ArrayList arrayList) {
        this.X = (byte) 5;
        this.Z = fc8Var;
        this.g0 = fc8Var2;
        this.f0 = v15Var;
        this.h0 = arrayList;
        this.Y = fc8Var;
    }

    public y5(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.X = (byte) 16;
        this.h0 = mediaBrowserServiceCompat;
        this.f0 = mediaBrowserServiceCompat;
        this.Y = new ArrayList();
    }
}
