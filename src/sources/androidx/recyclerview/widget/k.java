package androidx.recyclerview.widget;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import defpackage.bt;
import defpackage.cr5;
import defpackage.cw8;
import defpackage.d96;
import defpackage.ff1;
import defpackage.ie2;
import defpackage.j96;
import defpackage.k96;
import defpackage.kr0;
import defpackage.l96;
import defpackage.lr0;
import defpackage.oi0;
import defpackage.om0;
import defpackage.q96;
import defpackage.rb0;
import defpackage.s3;
import defpackage.t3;
import defpackage.u52;
import defpackage.u96;
import defpackage.v10;
import defpackage.v96;
import defpackage.wc8;
import defpackage.xr0;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public k96 g;
    public final /* synthetic */ RecyclerView h;

    public k(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(l lVar, boolean z) {
        RecyclerView.l(lVar);
        View view = lVar.a;
        RecyclerView recyclerView = this.h;
        v96 v96Var = recyclerView.r1;
        if (v96Var != null) {
            u96 u96Var = v96Var.g0;
            cw8.n(view, u96Var != null ? (t3) u96Var.g0.remove(view) : null);
        }
        if (z) {
            l96 l96Var = recyclerView.t0;
            ArrayList arrayList = recyclerView.u0;
            if (l96Var != null) {
                ((v10) l96Var).a(lVar);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((v10) ((l96) arrayList.get(i))).a(lVar);
            }
            f fVar = recyclerView.r0;
            if (fVar != null) {
                fVar.k(lVar);
            }
            if (recyclerView.k1 != null) {
                recyclerView.l0.G(lVar);
            }
            if (RecyclerView.G1) {
                Objects.toString(lVar);
            }
        }
        lVar.s = null;
        lVar.r = null;
        k96 k96VarC = c();
        k96VarC.getClass();
        int i2 = lVar.f;
        ArrayList arrayList2 = k96VarC.a(i2).a;
        ((j96) k96VarC.a.get(i2)).getClass();
        if (5 <= arrayList2.size()) {
            cr5.a(view);
        } else if (RecyclerView.F1 && arrayList2.contains(lVar)) {
            bt.q("this scrap item already exists");
        } else {
            lVar.n();
            arrayList2.add(lVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        q96 q96Var = recyclerView.k1;
        if (i >= 0 && i < q96Var.b()) {
            return !q96Var.g ? i : recyclerView.j0.t(i, 0);
        }
        StringBuilder sbL = ie2.l("invalid position ", i, ". State item count is ");
        sbL.append(q96Var.b());
        sbL.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public final k96 c() {
        if (this.g == null) {
            k96 k96Var = new k96();
            k96Var.a = new SparseArray();
            k96Var.b = 0;
            k96Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = k96Var;
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        f fVar;
        k96 k96Var = this.g;
        if (k96Var == null || (fVar = (recyclerView = this.h).r0) == null || !recyclerView.y0) {
            return;
        }
        k96Var.c.add(fVar);
    }

    public final void f(f fVar, boolean z) {
        k96 k96Var = this.g;
        if (k96Var != null) {
            SparseArray sparseArray = k96Var.a;
            Set set = k96Var.c;
            set.remove(fVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((j96) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    cr5.a(((l) arrayList.get(i2)).a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.K1) {
            xr0 xr0Var = this.h.j1;
            int[] iArr = (int[]) xr0Var.e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            xr0Var.d = 0;
        }
    }

    public final void h(int i) {
        boolean z = RecyclerView.F1;
        ArrayList arrayList = this.c;
        l lVar = (l) arrayList.get(i);
        if (RecyclerView.G1) {
            Objects.toString(lVar);
        }
        a(lVar, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        l lVarN = RecyclerView.N(view);
        boolean zK = lVarN.k();
        RecyclerView recyclerView = this.h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (lVarN.j()) {
            lVarN.n.m(lVarN);
        } else if (lVarN.q()) {
            lVarN.j &= -33;
        }
        j(lVarN);
        if (recyclerView.S0 == null || lVarN.h()) {
            return;
        }
        recyclerView.S0.d(lVarN);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[LOOP:2: B:64:0x00c6->B:68:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00d6 A[EDGE_INSN: B:93:0x00d6->B:69:0x00d6 BREAK  A[LOOP:1: B:60:0x00b1->B:67:0x00d0, LOOP_LABEL: LOOP:1: B:60:0x00b1->B:67:0x00d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d6 A[EDGE_INSN: B:95:0x00d6->B:69:0x00d6 BREAK  A[LOOP:1: B:60:0x00b1->B:67:0x00d0], SYNTHETIC] */
    public final void j(l lVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.h;
        xr0 xr0Var = recyclerView.j1;
        boolean zJ = lVar.j();
        View view = lVar.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zJ || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(lVar.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (lVar.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(lVar);
            om0.j(sb2, recyclerView.C());
            return;
        }
        if (lVar.p()) {
            bt.q("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
            return;
        }
        if ((lVar.j & 16) == 0) {
            WeakHashMap weakHashMap = cw8.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f fVar = recyclerView.r0;
        boolean z5 = fVar != null && z && fVar.i(lVar);
        boolean z6 = RecyclerView.F1;
        ArrayList arrayList = this.c;
        if (z6 && arrayList.contains(lVar)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(lVar);
            om0.j(sb3, recyclerView.C());
            return;
        }
        if (z5 || lVar.h()) {
            if (this.f <= 0 || (lVar.j & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    h(0);
                    size--;
                }
                if (RecyclerView.K1 && size > 0) {
                    int i5 = lVar.c;
                    if (((int[]) xr0Var.e) != null) {
                        int i6 = xr0Var.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((l) arrayList.get(i)).c;
                                    if (((int[]) xr0Var.e) != null) {
                                        break;
                                    }
                                    i3 = xr0Var.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) xr0Var.e)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) xr0Var.e)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((l) arrayList.get(i)).c;
                            if (((int[]) xr0Var.e) != null) {
                                break;
                                break;
                            }
                            i3 = xr0Var.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) xr0Var.e)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, lVar);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(lVar, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.G1) {
                recyclerView.C();
            }
            z4 = false;
        }
        recyclerView.l0.G(lVar);
        if (z3 || z4 || !z) {
            return;
        }
        cr5.a(view);
        lVar.s = null;
        lVar.r = null;
    }

    public final void k(View view) {
        d96 d96Var;
        l lVarN = RecyclerView.N(view);
        int i = lVarN.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && lVarN.l() && (d96Var = recyclerView.S0) != null) {
            ff1 ff1Var = (ff1) d96Var;
            if (lVarN.d().isEmpty() && ff1Var.g && !lVarN.g()) {
                ArrayList arrayList = this.b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.b = arrayList;
                }
                lVarN.n = this;
                lVarN.o = true;
                arrayList.add(lVarN);
                return;
            }
        }
        if (lVarN.g() && !lVarN.i() && !recyclerView.r0.b) {
            bt.q("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        lVarN.n = this;
        lVarN.o = false;
        this.a.add(lVarN);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01be  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x021a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0225  */
    /* JADX WARN: Code duplicated, block: B:136:0x022d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0237  */
    /* JADX WARN: Code duplicated, block: B:140:0x0245  */
    /* JADX WARN: Code duplicated, block: B:142:0x0251  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:180:0x030c A[LOOP:4: B:176:0x02f7->B:180:0x030c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x030f A[EDGE_INSN: B:181:0x030f->B:182:0x0310 BREAK  A[LOOP:4: B:176:0x02f7->B:180:0x030c]] */
    /* JADX WARN: Code duplicated, block: B:183:0x0312  */
    /* JADX WARN: Code duplicated, block: B:186:0x031a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0322  */
    /* JADX WARN: Code duplicated, block: B:198:0x0342 A[Catch: all -> 0x0399, TryCatch #0 {all -> 0x0399, blocks: (B:196:0x033c, B:198:0x0342, B:199:0x0353, B:201:0x035f, B:212:0x0391, B:213:0x0398), top: B:347:0x033c }] */
    /* JADX WARN: Code duplicated, block: B:201:0x035f A[Catch: all -> 0x0399, TRY_LEAVE, TryCatch #0 {all -> 0x0399, blocks: (B:196:0x033c, B:198:0x0342, B:199:0x0353, B:201:0x035f, B:212:0x0391, B:213:0x0398), top: B:347:0x033c }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0387  */
    /* JADX WARN: Code duplicated, block: B:212:0x0391 A[Catch: all -> 0x0399, TRY_ENTER, TryCatch #0 {all -> 0x0399, blocks: (B:196:0x033c, B:198:0x0342, B:199:0x0353, B:201:0x035f, B:212:0x0391, B:213:0x0398), top: B:347:0x033c }] */
    /* JADX WARN: Code duplicated, block: B:219:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:228:0x03db  */
    /* JADX WARN: Code duplicated, block: B:234:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:236:0x0404  */
    /* JADX WARN: Code duplicated, block: B:245:0x041c  */
    /* JADX WARN: Code duplicated, block: B:252:0x044c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0458  */
    /* JADX WARN: Code duplicated, block: B:258:0x0463  */
    /* JADX WARN: Code duplicated, block: B:260:0x0469  */
    /* JADX WARN: Code duplicated, block: B:261:0x0477  */
    /* JADX WARN: Code duplicated, block: B:264:0x0481  */
    /* JADX WARN: Code duplicated, block: B:265:0x0484  */
    /* JADX WARN: Code duplicated, block: B:267:0x0487  */
    /* JADX WARN: Code duplicated, block: B:269:0x048d  */
    /* JADX WARN: Code duplicated, block: B:272:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:275:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:277:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:284:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:291:0x0517  */
    /* JADX WARN: Code duplicated, block: B:293:0x051b  */
    /* JADX WARN: Code duplicated, block: B:296:0x052c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0537  */
    /* JADX WARN: Code duplicated, block: B:303:0x054e  */
    /* JADX WARN: Code duplicated, block: B:306:0x055b  */
    /* JADX WARN: Code duplicated, block: B:327:0x0599  */
    /* JADX WARN: Code duplicated, block: B:330:0x059e  */
    /* JADX WARN: Code duplicated, block: B:334:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:335:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:337:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:338:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:341:0x05c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:354:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:360:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116 A[EDGE_INSN: B:74:0x0116->B:95:0x0180 BREAK  A[LOOP:1: B:43:0x008e->B:55:0x00ba]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Code duplicated, block: B:98:0x0188  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0137, please report this as an issue */
    public final l l(int i, long j) {
        l lVarG;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        long j2;
        long j3;
        View view;
        boolean z3;
        int iT;
        int i2;
        long nanoTime;
        boolean z4;
        f fVar;
        boolean z5;
        long nanoTime2;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        t3 t3Var;
        ArrayList arrayList3;
        ViewGroup.LayoutParams layoutParams;
        long j5;
        ViewGroup.LayoutParams layoutParams2;
        RecyclerView.LayoutParams layoutParams3;
        int i3;
        int iT2;
        int iC;
        f fVar2;
        long nanoTime3;
        View view2;
        long nanoTime4;
        long j6;
        RecyclerView recyclerViewH;
        long j7;
        j96 j96Var;
        l lVar;
        ArrayList arrayList4;
        int size;
        long jB;
        int size2;
        int i4;
        int size3;
        l lVar2;
        long j8;
        int size4;
        int i5;
        ArrayList arrayList5;
        int size5;
        int i6;
        View view3;
        int size6;
        int i7;
        l lVar3;
        l lVarN;
        lr0 lr0Var;
        kr0 kr0Var;
        int iIndexOfChild;
        int iJ;
        l lVarN2;
        int i8;
        boolean z8;
        l lVar4;
        int size7;
        int iT3;
        RecyclerView recyclerView = this.h;
        q96 q96Var = recyclerView.k1;
        if (i < 0 || i >= q96Var.b()) {
            StringBuilder sbR = oi0.r(i, "Invalid item position ", i, "(", "). Item count:");
            sbR.append(q96Var.b());
            sbR.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (q96Var.g) {
            ArrayList arrayList6 = this.b;
            if (arrayList6 != null && (size7 = arrayList6.size()) != 0) {
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        if (recyclerView.r0.b && (iT3 = recyclerView.j0.t(i, 0)) > 0 && iT3 < recyclerView.r0.a()) {
                            long jB2 = recyclerView.r0.b(iT3);
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size7) {
                                    lVarG = null;
                                    break;
                                }
                                l lVar5 = (l) this.b.get(i10);
                                if (!lVar5.q() && lVar5.e == jB2) {
                                    lVar5.a(32);
                                    lVarG = lVar5;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            lVarG = null;
                            break;
                        }
                    } else {
                        lVarG = (l) this.b.get(i9);
                        if (!lVarG.q() && lVarG.c() == i) {
                            lVarG.a(32);
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                lVarG = null;
                break;
            }
            if (lVarG != null) {
                z = true;
            }
            arrayList = this.a;
            arrayList2 = this.c;
            if (lVarG == null) {
                size4 = arrayList.size();
                i5 = 0;
                while (true) {
                    if (i5 < size4) {
                        arrayList5 = recyclerView.k0.c;
                        size5 = arrayList5.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size5) {
                                z2 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList5.get(i6);
                            lVarN2 = RecyclerView.N(view3);
                            z2 = true;
                            if (lVarN2.c() != i && !lVarN2.g() && !lVarN2.i()) {
                                break;
                            }
                            i6++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i7 = 0;
                            while (true) {
                                if (i7 < size6) {
                                    lVarG = null;
                                    break;
                                }
                                lVar3 = (l) arrayList2.get(i7);
                                if (lVar3.g() && lVar3.c() == i && !lVar3.e()) {
                                    arrayList2.remove(i7);
                                    if (RecyclerView.G1) {
                                        lVar3.toString();
                                    }
                                    lVarG = lVar3;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            lVarN = RecyclerView.N(view3);
                            lr0Var = recyclerView.k0;
                            kr0Var = lr0Var.b;
                            iIndexOfChild = lr0Var.a.a.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                u52.j(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (kr0Var.d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                            }
                            kr0Var.a(iIndexOfChild);
                            lr0Var.l(view3);
                            iJ = recyclerView.k0.j(view3);
                            if (iJ != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(lVarN);
                                c2.l(sb, recyclerView.C());
                                return null;
                            }
                            recyclerView.k0.c(iJ);
                            k(view3);
                            lVarN.a(8224);
                            lVarG = lVarN;
                            break;
                        }
                    } else {
                        lVar4 = (l) arrayList.get(i5);
                        if (lVar4.q() && lVar4.c() == i && !lVar4.g() && (q96Var.g || !lVar4.i())) {
                            lVar4.a(32);
                            lVarG = lVar4;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (lVarG != null) {
                    if (lVarG.i()) {
                        i8 = lVarG.c;
                        if (i8 >= 0 || i8 >= recyclerView.r0.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lVarG + recyclerView.C());
                        }
                        if (q96Var.g || recyclerView.r0.c(lVarG.c) == lVarG.f) {
                            f fVar3 = recyclerView.r0;
                            if (!fVar3.b || lVarG.e == fVar3.b(lVarG.c)) {
                                z8 = z2;
                            } else {
                                z8 = false;
                            }
                        } else {
                            z8 = false;
                        }
                    } else {
                        if (!RecyclerView.F1 && !q96Var.g) {
                            bt.i("should not receive a removed view unless it is pre layout".concat(recyclerView.C()));
                            return null;
                        }
                        z8 = q96Var.g;
                    }
                    if (z8) {
                        z = z2;
                    } else {
                        lVarG.a(4);
                        if (lVarG.j()) {
                            recyclerView.removeDetachedView(lVarG.a, false);
                            lVarG.n.m(lVarG);
                        } else if (lVarG.q()) {
                            lVarG.j &= -33;
                        }
                        j(lVarG);
                        lVarG = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (lVarG == null) {
                iT2 = recyclerView.j0.t(i, 0);
                if (iT2 >= 0) {
                    j2 = 3;
                    if (iT2 < recyclerView.r0.a()) {
                        iC = recyclerView.r0.c(iT2);
                        fVar2 = recyclerView.r0;
                        j3 = 4;
                        if (fVar2.b) {
                            jB = fVar2.b(iT2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    i4 = iT2;
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            lVar2 = (l) arrayList2.get(size3);
                                            if (lVar2.e == jB || lVar2.e()) {
                                                size3--;
                                            } else {
                                                if (iC == lVar2.f) {
                                                    arrayList2.remove(size3);
                                                    lVarG = lVar2;
                                                    break;
                                                }
                                                h(size3);
                                            }
                                        }
                                        lVarG = null;
                                        break;
                                    }
                                }
                                l lVar6 = (l) arrayList.get(size2);
                                i4 = iT2;
                                j8 = lVar6.e;
                                View view4 = lVar6.a;
                                if (j8 != jB && !lVar6.q()) {
                                    if (iC == lVar6.f) {
                                        lVar6.a(32);
                                        if (lVar6.i() && !q96Var.g) {
                                            lVar6.j = (lVar6.j & (-15)) | 2;
                                        }
                                        lVarG = lVar6;
                                        break;
                                    }
                                    arrayList.remove(size2);
                                    recyclerView.removeDetachedView(view4, false);
                                    l lVarN3 = RecyclerView.N(view4);
                                    lVarN3.n = null;
                                    lVarN3.o = false;
                                    lVarN3.j &= -33;
                                    j(lVarN3);
                                }
                                size2--;
                                iT2 = i4;
                            }
                            if (lVarG != null) {
                                lVarG.c = i4;
                                z = z2;
                            }
                        }
                        if (lVarG == null) {
                            boolean z9 = RecyclerView.F1;
                            j96Var = (j96) c().a.get(iC);
                            if (j96Var != null) {
                                lVar = null;
                                break;
                            }
                            arrayList4 = j96Var.a;
                            if (arrayList4.isEmpty()) {
                                size = arrayList4.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        lVar = null;
                                        break;
                                    }
                                    if (!((l) arrayList4.get(size)).e()) {
                                        lVar = (l) arrayList4.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                lVar = null;
                                break;
                            }
                            if (lVar != null) {
                                lVar.n();
                                boolean z10 = RecyclerView.F1;
                            }
                            lVarG = lVar;
                        }
                        if (lVarG == null) {
                            nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.g.a(iC).b;
                                if (j7 != 0 && j7 + nanoTime3 >= j) {
                                    return null;
                                }
                            }
                            f fVar4 = recyclerView.r0;
                            fVar4.getClass();
                            try {
                                if (wc8.a()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iC)));
                                }
                                lVarG = fVar4.g(recyclerView, iC);
                                view2 = lVarG.a;
                                if (view2.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                lVarG.f = iC;
                                Trace.endSection();
                                if (RecyclerView.K1 && (recyclerViewH = RecyclerView.H(view2)) != null) {
                                    lVarG.b = new WeakReference(recyclerViewH);
                                }
                                nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                                j96 j96VarA = this.g.a(iC);
                                j6 = j96VarA.b;
                                if (j6 != 0) {
                                    nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                }
                                j96VarA.b = nanoTime4;
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbR2 = oi0.r(i, "Inconsistency detected. Invalid item position ", iT2, "(offset:", ").state:");
                sbR2.append(q96Var.b());
                sbR2.append(recyclerView.C());
                throw new IndexOutOfBoundsException(sbR2.toString());
            }
            j2 = 3;
            j3 = 4;
            view = lVarG.a;
            if (z && !q96Var.g) {
                i3 = lVarG.j;
                if ((i3 & 8192) != 0) {
                    lVarG.j = i3 & (-8193);
                    if (q96Var.j) {
                        d96.b(lVarG);
                        d96 d96Var = recyclerView.S0;
                        lVarG.d();
                        d96Var.getClass();
                        rb0 rb0Var = new rb0();
                        rb0Var.a(lVarG);
                        recyclerView.b0(lVarG, rb0Var);
                    }
                }
            }
            if (q96Var.g || !lVarG.f()) {
                if (lVarG.f() || (lVarG.j & 2) != 0 || lVarG.g()) {
                    if (!RecyclerView.F1 && lVarG.i()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(lVarG);
                        c2.l(sb2, recyclerView.C());
                        return null;
                    }
                    z3 = false;
                    iT = recyclerView.j0.t(i, 0);
                    lVarG.s = null;
                    lVarG.r = recyclerView;
                    i2 = lVarG.f;
                    nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(i2).c;
                        if (j5 != 0 || j5 + nanoTime < j) {
                            if (lVarG.k()) {
                                recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                                z4 = z2;
                            } else {
                                z4 = false;
                            }
                            fVar = recyclerView.r0;
                            fVar.getClass();
                            if (lVarG.s == null) {
                                z5 = z2;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                lVarG.c = iT;
                                if (fVar.b) {
                                    lVarG.e = fVar.b(iT);
                                }
                                lVarG.j = (lVarG.j & (-520)) | 1;
                                if (wc8.a()) {
                                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                                }
                            }
                            lVarG.s = fVar;
                            if (RecyclerView.F1) {
                                if (view.getParent() != null && view.isAttachedToWindow() != lVarG.k()) {
                                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + lVarG.k() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + lVarG);
                                }
                                if (view.getParent() == null && view.isAttachedToWindow()) {
                                    u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                    return null;
                                }
                            }
                            fVar.f(lVarG, iT, lVarG.d());
                            if (z5) {
                                arrayList3 = lVarG.k;
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                lVarG.j &= -1025;
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof RecyclerView.LayoutParams) {
                                    ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                                }
                                Trace.endSection();
                            }
                            if (z4) {
                                recyclerView.detachViewFromParent(view);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            j96 j96VarA2 = this.g.a(lVarG.f);
                            j4 = j96VarA2.c;
                            if (j4 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
                            j96VarA2.c = nanoTime2;
                            accessibilityManager = recyclerView.H0;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                z6 = true;
                                if (view.getImportantForAccessibility() == 0) {
                                    view.setImportantForAccessibility(1);
                                }
                                v96 v96Var = recyclerView.r1;
                                if (v96Var != null) {
                                    u96 u96Var = v96Var.g0;
                                    if (u96Var != null) {
                                        View.AccessibilityDelegate accessibilityDelegateE = cw8.e(view);
                                        if (accessibilityDelegateE == null) {
                                            t3Var = null;
                                        } else {
                                            t3Var = accessibilityDelegateE instanceof s3 ? ((s3) accessibilityDelegateE).a : new t3(accessibilityDelegateE);
                                        }
                                        if (t3Var != null && t3Var != u96Var) {
                                            u96Var.g0.put(view, t3Var);
                                        }
                                    }
                                    cw8.n(view, u96Var);
                                }
                            } else {
                                z6 = true;
                            }
                            if (q96Var.g) {
                                lVarG.g = i;
                            }
                            z7 = z6;
                        } else {
                            z7 = false;
                            z6 = z2;
                        }
                    } else {
                        if (lVarG.k()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        fVar = recyclerView.r0;
                        fVar.getClass();
                        if (lVarG.s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            lVarG.c = iT;
                            if (fVar.b) {
                                lVarG.e = fVar.b(iT);
                            }
                            lVarG.j = (lVarG.j & (-520)) | 1;
                            if (wc8.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                            }
                        }
                        lVarG.s = fVar;
                        if (RecyclerView.F1) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        fVar.f(lVarG, iT, lVarG.d());
                        if (z5) {
                            arrayList3 = lVarG.k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            lVarG.j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof RecyclerView.LayoutParams) {
                                ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        j96 j96VarA3 = this.g.a(lVarG.f);
                        j4 = j96VarA3.c;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        j96VarA3.c = nanoTime2;
                        accessibilityManager = recyclerView.H0;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (q96Var.g) {
                            lVarG.g = i;
                        }
                        z7 = z6;
                    }
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams3);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
                } else {
                    layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(layoutParams3);
                }
                layoutParams3.X = lVarG;
                if (z && z7) {
                    z3 = z6;
                }
                layoutParams3.f0 = z3;
                return lVarG;
            }
            lVarG.g = i;
            z6 = z2;
            z7 = false;
            z3 = false;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams3);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(layoutParams3);
            } else {
                layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
            }
            layoutParams3.X = lVarG;
            if (z) {
                z3 = z6;
            }
            layoutParams3.f0 = z3;
            return lVarG;
        }
        lVarG = null;
        z = false;
        arrayList = this.a;
        arrayList2 = this.c;
        if (lVarG == null) {
            size4 = arrayList.size();
            i5 = 0;
            while (true) {
                if (i5 < size4) {
                    arrayList5 = recyclerView.k0.c;
                    size5 = arrayList5.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size5) {
                            z2 = true;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList5.get(i6);
                        lVarN2 = RecyclerView.N(view3);
                        z2 = true;
                        if (lVarN2.c() != i) {
                        }
                        i6++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i7 = 0;
                        while (true) {
                            if (i7 < size6) {
                                lVarG = null;
                                break;
                            }
                            lVar3 = (l) arrayList2.get(i7);
                            if (lVar3.g()) {
                            }
                            i7++;
                        }
                    } else {
                        lVarN = RecyclerView.N(view3);
                        lr0Var = recyclerView.k0;
                        kr0Var = lr0Var.b;
                        iIndexOfChild = lr0Var.a.a.indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            u52.j(view3, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (kr0Var.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                        }
                        kr0Var.a(iIndexOfChild);
                        lr0Var.l(view3);
                        iJ = recyclerView.k0.j(view3);
                        if (iJ != -1) {
                            StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb3.append(lVarN);
                            c2.l(sb3, recyclerView.C());
                            return null;
                        }
                        recyclerView.k0.c(iJ);
                        k(view3);
                        lVarN.a(8224);
                        lVarG = lVarN;
                        break;
                    }
                } else {
                    lVar4 = (l) arrayList.get(i5);
                    if (lVar4.q()) {
                    }
                    i5++;
                }
            }
            if (lVarG != null) {
                if (lVarG.i()) {
                    i8 = lVarG.c;
                    if (i8 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lVarG + recyclerView.C());
                }
                if (!RecyclerView.F1) {
                }
                z8 = q96Var.g;
                if (z8) {
                    lVarG.a(4);
                    if (lVarG.j()) {
                        recyclerView.removeDetachedView(lVarG.a, false);
                        lVarG.n.m(lVarG);
                    } else if (lVarG.q()) {
                        lVarG.j &= -33;
                    }
                    j(lVarG);
                    lVarG = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (lVarG == null) {
            iT2 = recyclerView.j0.t(i, 0);
            if (iT2 >= 0) {
                j2 = 3;
                if (iT2 < recyclerView.r0.a()) {
                    iC = recyclerView.r0.c(iT2);
                    fVar2 = recyclerView.r0;
                    j3 = 4;
                    if (fVar2.b) {
                        jB = fVar2.b(iT2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                i4 = iT2;
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        lVar2 = (l) arrayList2.get(size3);
                                        if (lVar2.e == jB) {
                                        }
                                        size3--;
                                    }
                                    lVarG = null;
                                    break;
                                }
                            }
                            l lVar7 = (l) arrayList.get(size2);
                            i4 = iT2;
                            j8 = lVar7.e;
                            View view5 = lVar7.a;
                            if (j8 != jB) {
                            }
                            size2--;
                            iT2 = i4;
                        }
                        if (lVarG != null) {
                            lVarG.c = i4;
                            z = z2;
                        }
                    }
                    if (lVarG == null) {
                        boolean z11 = RecyclerView.F1;
                        j96Var = (j96) c().a.get(iC);
                        if (j96Var != null) {
                            lVar = null;
                            break;
                        }
                        arrayList4 = j96Var.a;
                        if (arrayList4.isEmpty()) {
                            lVar = null;
                            break;
                        }
                        size = arrayList4.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                lVar = null;
                                break;
                            }
                            if (!((l) arrayList4.get(size)).e()) {
                                lVar = (l) arrayList4.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (lVar != null) {
                            lVar.n();
                            boolean z12 = RecyclerView.F1;
                        }
                        lVarG = lVar;
                    }
                    if (lVarG == null) {
                        nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.g.a(iC).b;
                            if (j7 != 0) {
                                return null;
                            }
                        }
                        f fVar5 = recyclerView.r0;
                        fVar5.getClass();
                        if (wc8.a()) {
                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iC)));
                        }
                        lVarG = fVar5.g(recyclerView, iC);
                        view2 = lVarG.a;
                        if (view2.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        lVarG.f = iC;
                        Trace.endSection();
                        if (RecyclerView.K1) {
                            lVarG.b = new WeakReference(recyclerViewH);
                        }
                        nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        j96 j96VarA4 = this.g.a(iC);
                        j6 = j96VarA4.b;
                        if (j6 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                        }
                        j96VarA4.b = nanoTime4;
                    }
                }
            }
            StringBuilder sbR3 = oi0.r(i, "Inconsistency detected. Invalid item position ", iT2, "(offset:", ").state:");
            sbR3.append(q96Var.b());
            sbR3.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbR3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = lVarG.a;
        if (z) {
            i3 = lVarG.j;
            if ((i3 & 8192) != 0) {
                lVarG.j = i3 & (-8193);
                if (q96Var.j) {
                    d96.b(lVarG);
                    d96 d96Var2 = recyclerView.S0;
                    lVarG.d();
                    d96Var2.getClass();
                    rb0 rb0Var2 = new rb0();
                    rb0Var2.a(lVarG);
                    recyclerView.b0(lVarG, rb0Var2);
                }
            }
        }
        if (q96Var.g) {
            if (lVarG.f()) {
            }
            if (!RecyclerView.F1) {
            }
            z3 = false;
            iT = recyclerView.j0.t(i, 0);
            lVarG.s = null;
            lVarG.r = recyclerView;
            i2 = lVarG.f;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.a(i2).c;
                if (j5 != 0) {
                    if (lVarG.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    fVar = recyclerView.r0;
                    fVar.getClass();
                    if (lVarG.s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        lVarG.c = iT;
                        if (fVar.b) {
                            lVarG.e = fVar.b(iT);
                        }
                        lVarG.j = (lVarG.j & (-520)) | 1;
                        if (wc8.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                        }
                    }
                    lVarG.s = fVar;
                    if (RecyclerView.F1) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    fVar.f(lVarG, iT, lVarG.d());
                    if (z5) {
                        arrayList3 = lVarG.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        lVarG.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof RecyclerView.LayoutParams) {
                            ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    j96 j96VarA5 = this.g.a(lVarG.f);
                    j4 = j96VarA5.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    j96VarA5.c = nanoTime2;
                    accessibilityManager = recyclerView.H0;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (q96Var.g) {
                        lVarG.g = i;
                    }
                    z7 = z6;
                } else {
                    if (lVarG.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    fVar = recyclerView.r0;
                    fVar.getClass();
                    if (lVarG.s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        lVarG.c = iT;
                        if (fVar.b) {
                            lVarG.e = fVar.b(iT);
                        }
                        lVarG.j = (lVarG.j & (-520)) | 1;
                        if (wc8.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                        }
                    }
                    lVarG.s = fVar;
                    if (RecyclerView.F1) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    fVar.f(lVarG, iT, lVarG.d());
                    if (z5) {
                        arrayList3 = lVarG.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        lVarG.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof RecyclerView.LayoutParams) {
                            ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    j96 j96VarA6 = this.g.a(lVarG.f);
                    j4 = j96VarA6.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    j96VarA6.c = nanoTime2;
                    accessibilityManager = recyclerView.H0;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (q96Var.g) {
                        lVarG.g = i;
                    }
                    z7 = z6;
                }
            } else {
                if (lVarG.k()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                fVar = recyclerView.r0;
                fVar.getClass();
                if (lVarG.s == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    lVarG.c = iT;
                    if (fVar.b) {
                        lVarG.e = fVar.b(iT);
                    }
                    lVarG.j = (lVarG.j & (-520)) | 1;
                    if (wc8.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                    }
                }
                lVarG.s = fVar;
                if (RecyclerView.F1) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                fVar.f(lVarG, iT, lVarG.d());
                if (z5) {
                    arrayList3 = lVarG.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    lVarG.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof RecyclerView.LayoutParams) {
                        ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                j96 j96VarA7 = this.g.a(lVarG.f);
                j4 = j96VarA7.c;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                j96VarA7.c = nanoTime2;
                accessibilityManager = recyclerView.H0;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (q96Var.g) {
                    lVarG.g = i;
                }
                z7 = z6;
            }
        } else {
            if (lVarG.f()) {
            }
            if (!RecyclerView.F1) {
            }
            z3 = false;
            iT = recyclerView.j0.t(i, 0);
            lVarG.s = null;
            lVarG.r = recyclerView;
            i2 = lVarG.f;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.a(i2).c;
                if (j5 != 0) {
                    if (lVarG.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    fVar = recyclerView.r0;
                    fVar.getClass();
                    if (lVarG.s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        lVarG.c = iT;
                        if (fVar.b) {
                            lVarG.e = fVar.b(iT);
                        }
                        lVarG.j = (lVarG.j & (-520)) | 1;
                        if (wc8.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                        }
                    }
                    lVarG.s = fVar;
                    if (RecyclerView.F1) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    fVar.f(lVarG, iT, lVarG.d());
                    if (z5) {
                        arrayList3 = lVarG.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        lVarG.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof RecyclerView.LayoutParams) {
                            ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    j96 j96VarA8 = this.g.a(lVarG.f);
                    j4 = j96VarA8.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    j96VarA8.c = nanoTime2;
                    accessibilityManager = recyclerView.H0;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (q96Var.g) {
                        lVarG.g = i;
                    }
                    z7 = z6;
                } else {
                    if (lVarG.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    fVar = recyclerView.r0;
                    fVar.getClass();
                    if (lVarG.s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        lVarG.c = iT;
                        if (fVar.b) {
                            lVarG.e = fVar.b(iT);
                        }
                        lVarG.j = (lVarG.j & (-520)) | 1;
                        if (wc8.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                        }
                    }
                    lVarG.s = fVar;
                    if (RecyclerView.F1) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    fVar.f(lVarG, iT, lVarG.d());
                    if (z5) {
                        arrayList3 = lVarG.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        lVarG.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof RecyclerView.LayoutParams) {
                            ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    j96 j96VarA9 = this.g.a(lVarG.f);
                    j4 = j96VarA9.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    j96VarA9.c = nanoTime2;
                    accessibilityManager = recyclerView.H0;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (q96Var.g) {
                        lVarG.g = i;
                    }
                    z7 = z6;
                }
            } else {
                if (lVarG.k()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                fVar = recyclerView.r0;
                fVar.getClass();
                if (lVarG.s == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    lVarG.c = iT;
                    if (fVar.b) {
                        lVarG.e = fVar.b(iT);
                    }
                    lVarG.j = (lVarG.j & (-520)) | 1;
                    if (wc8.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lVarG.f)));
                    }
                }
                lVarG.s = fVar;
                if (RecyclerView.F1) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        u52.r(lVarG, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                fVar.f(lVarG, iT, lVarG.d());
                if (z5) {
                    arrayList3 = lVarG.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    lVarG.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof RecyclerView.LayoutParams) {
                        ((RecyclerView.LayoutParams) layoutParams).Z = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                j96 j96VarA10 = this.g.a(lVarG.f);
                j4 = j96VarA10.c;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                j96VarA10.c = nanoTime2;
                accessibilityManager = recyclerView.H0;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (q96Var.g) {
                    lVarG.g = i;
                }
                z7 = z6;
            }
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams3);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            layoutParams3 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(layoutParams3);
        } else {
            layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
        }
        layoutParams3.X = lVarG;
        if (z) {
            z3 = z6;
        }
        layoutParams3.f0 = z3;
        return lVarG;
    }

    public final void m(l lVar) {
        if (lVar.o) {
            this.b.remove(lVar);
        } else {
            this.a.remove(lVar);
        }
        lVar.n = null;
        lVar.o = false;
        lVar.j &= -33;
    }

    public final void n() {
        j jVar = this.h.s0;
        this.f = this.e + (jVar != null ? jVar.l0 : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
