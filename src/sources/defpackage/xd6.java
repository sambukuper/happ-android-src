package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.recyclerview.widget.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd6 implements v06, bw6, xo2, pi8, p95, oz6 {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;

    public xd6(byte b) {
        this.X = b;
        switch (b) {
            case 2:
                this.Y = new LinkedHashMap();
                this.Z = new LinkedHashMap();
                break;
            case 7:
                this.Z = new AtomicReference();
                this.Y = new c24(Math.min(64, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax), 4000);
                break;
            case 9:
                break;
            case 11:
                this.Y = (ImageCaptureFailedForSpecificCombinationQuirk) sm1.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.Z = (PreviewGreenTintQuirk) sm1.a.b(PreviewGreenTintQuirk.class);
                break;
            case 18:
                this.Y = new ConcurrentHashMap();
                this.Z = new AtomicInteger(0);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                this.Y = new g55((byte) 29);
                this.Z = new ej4(16);
                break;
            case 23:
                this.Y = new l97(0);
                this.Z = new qi4((Object) null);
                break;
            case 25:
                this.Y = new c15(0, new Reference[16]);
                this.Z = new ReferenceQueue();
                break;
            default:
                this.Y = null;
                this.Z = null;
                break;
        }
    }

    public static ch8 k(List list) {
        return list.isEmpty() ? ch8.Z : new ch8(list);
    }

    public rb0 A(l lVar, int i) {
        sw8 sw8Var;
        rb0 rb0Var;
        l97 l97Var = (l97) this.Y;
        int iE = l97Var.e(lVar);
        if (iE >= 0 && (sw8Var = (sw8) l97Var.j(iE)) != null) {
            int i2 = sw8Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                sw8Var.a = i3;
                if (i == 4) {
                    rb0Var = sw8Var.b;
                } else if (i == 8) {
                    rb0Var = sw8Var.c;
                } else {
                    bt.q("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    l97Var.h(iE);
                    sw8Var.a = 0;
                    sw8Var.b = null;
                    sw8Var.c = null;
                    sw8.d.d(sw8Var);
                }
                return rb0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public void B(u88 u88Var) {
        u88 u88Var2;
        u88 u88Var3;
        rh5 rh5Var = (rh5) this.Z;
        String str = u88Var.c;
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            u88 u88Var4 = (u88) rh5Var.getValue();
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            if (u88Var4 == null) {
                rh5Var.setValue(u88Var);
                return;
            }
            boolean z = u88Var4.g;
            String str2 = u88Var4.b;
            String str3 = u88Var4.c;
            int i = u88Var4.a;
            f48 f48Var = u88Var4.h;
            if (z) {
                boolean z2 = u88Var.g;
                String str4 = u88Var.b;
                int i2 = u88Var.a;
                if (z2) {
                    long j = u88Var.f;
                    long j2 = u88Var4.f;
                    if (j < j2 || j - j2 >= StateDownloadFileV2.Success.OUTDATED_DURATION_MS || dh3.f(str3, "\n") || dh3.f(str3, "\r\n") || dh3.f(str, "\n") || dh3.f(str, "\r\n") || f48Var != u88Var.h) {
                        u88Var2 = null;
                    } else {
                        if (f48Var == f48.X && str3.length() + i == i2) {
                            u88Var3 = new u88(u88Var4.a, _UrlKt.FRAGMENT_ENCODE_SET, oi0.l(str3, str), u88Var4.d, u88Var.e, u88Var4.f, false, 64);
                        } else if (f48Var != f48.Y || u88Var4.a() != u88Var.a() || (u88Var4.a() != a48.X && u88Var4.a() != a48.Y)) {
                            u88Var2 = null;
                        } else if (i == str4.length() + i2) {
                            u88Var3 = new u88(u88Var.a, oi0.l(str4, str2), _UrlKt.FRAGMENT_ENCODE_SET, u88Var4.d, u88Var.e, u88Var4.f, false, 64);
                        } else {
                            int i3 = u88Var4.a;
                            if (i3 == i2) {
                                u88Var2 = new u88(i3, pc6.o(str2, str4), _UrlKt.FRAGMENT_ENCODE_SET, u88Var4.d, u88Var.e, u88Var4.f, false, 64);
                            } else {
                                u88Var2 = null;
                            }
                        }
                        u88Var2 = u88Var3;
                    }
                } else {
                    u88Var2 = null;
                }
            } else {
                u88Var2 = null;
            }
            if (u88Var2 != null) {
                rh5Var.setValue(u88Var2);
            } else {
                n();
                rh5Var.setValue(u88Var);
            }
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    @Override // defpackage.p95
    public w19 C(View view, w19 w19Var) {
        boolean z;
        h70 h70Var = (h70) this.Y;
        ay8 ay8Var = (ay8) this.Z;
        int i = ay8Var.a;
        int i2 = ay8Var.b;
        int i3 = ay8Var.c;
        t19 t19Var = w19Var.a;
        fe3 fe3VarH = t19Var.h(519);
        fe3 fe3VarH2 = t19Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) h70Var.Z;
        int i4 = fe3VarH.b;
        int i5 = fe3VarH.c;
        int i6 = fe3VarH.a;
        bottomSheetBehavior.x = i4;
        boolean z2 = true;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.p;
        if (z4) {
            int iA = w19Var.a();
            bottomSheetBehavior.w = iA;
            paddingBottom = iA + i3;
        }
        if (bottomSheetBehavior.q) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.r) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i7 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.v) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = fe3VarH.b;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
        boolean z5 = h70Var.Y;
        if (z5) {
            bottomSheetBehavior.n = fe3VarH2.d;
        }
        if (!z4 && !z5) {
            return w19Var;
        }
        bottomSheetBehavior.V();
        return w19Var;
    }

    public void D(String str, wv6 wv6Var) {
        xv6 xv6Var = (xv6) this.Y;
        synchronized (xv6Var.c) {
            if (xv6Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            xv6Var.d.put(str, wv6Var);
        }
    }

    public bh7 E(s39 s39Var) {
        bh7 bh7VarA;
        s39Var.getClass();
        synchronized (this.Z) {
            bh7VarA = ((fj4) this.Y).a(s39Var);
        }
        return bh7VarA;
    }

    public void F(l lVar) {
        sw8 sw8Var = (sw8) ((l97) this.Y).get(lVar);
        if (sw8Var == null) {
            return;
        }
        sw8Var.a &= -2;
    }

    public void G(l lVar) {
        qi4 qi4Var = (qi4) this.Z;
        for (int iH = qi4Var.h() - 1; iH >= 0; iH--) {
            if (lVar == qi4Var.i(iH)) {
                Object[] objArr = qi4Var.Z;
                Object obj = objArr[iH];
                Object obj2 = u70.d;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                qi4Var.X = true;
                break;
            }
        }
        sw8 sw8Var = (sw8) ((l97) this.Y).remove(lVar);
        if (sw8Var != null) {
            sw8Var.a = 0;
            sw8Var.b = null;
            sw8Var.c = null;
            sw8.d.d(sw8Var);
        }
    }

    public void H() {
        if (!((xv6) this.Y).h) {
            bt.i("Can not perform this action after onSaveInstanceState");
            return;
        }
        fp fpVar = (fp) this.Z;
        if (fpVar == null) {
            fpVar = new fp(this);
        }
        this.Z = fpVar;
        try {
            d84.class.getDeclaredConstructor(null);
            fp fpVar2 = (fp) this.Z;
            if (fpVar2 != null) {
                ((LinkedHashSet) fpVar2.b).add(d84.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + d84.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void I(bh7 bh7Var, zv7 zv7Var) {
        bh7Var.getClass();
        y5 y5Var = (y5) this.Z;
        ((h37) y5Var.Y).execute(new j0((Object) this, (Object) bh7Var, (Object) zv7Var, (byte) 17));
    }

    public void J(bh7 bh7Var, int i) {
        bh7Var.getClass();
        y5 y5Var = (y5) this.Z;
        ((h37) y5Var.Y).execute(new uj7((fv5) this.Y, bh7Var, false, i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    public o57 K(wi8 wi8Var, List list, nl3 nl3Var) {
        mo8 mo8VarF;
        ui8 ui8Var = wi8Var.a;
        o57 o57Var = new o57();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            t14 t14Var = (t14) it.next();
            ot0 ot0VarX = t14Var.n0().x();
            if (ot0VarX instanceof sx4) {
                Set set = nl3Var.e;
                mo8 mo8VarQ0 = t14Var.q0();
                if (mo8VarQ0 instanceof ce2) {
                    ce2 ce2Var = (ce2) mo8VarQ0;
                    aa7 aa7VarF = ce2Var.Y;
                    if (!aa7VarF.n0().g().isEmpty() && aa7VarF.n0().x() != null) {
                        List<hi8> listG = aa7VarF.n0().g();
                        listG.getClass();
                        ArrayList arrayList = new ArrayList(xv0.Z(listG, 10));
                        for (hi8 hi8Var : listG) {
                            ni8 wg7Var = (ni8) wv0.u0(hi8Var.getIndex(), t14Var.l0());
                            boolean z = set != null && set.contains(hi8Var);
                            if (wg7Var == null || z) {
                                wg7Var = new wg7(hi8Var);
                            } else {
                                t14 t14VarB = wg7Var.b();
                                t14VarB.getClass();
                                if (ui8Var.d(t14VarB) == null) {
                                    wg7Var = new wg7(hi8Var);
                                }
                            }
                            arrayList.add(wg7Var);
                        }
                        aa7VarF = s08.f(aa7VarF, arrayList, null, 2);
                    }
                    aa7 aa7VarF2 = ce2Var.Z;
                    if (!aa7VarF2.n0().g().isEmpty() && aa7VarF2.n0().x() != null) {
                        List<hi8> listG2 = aa7VarF2.n0().g();
                        listG2.getClass();
                        ArrayList arrayList2 = new ArrayList(xv0.Z(listG2, 10));
                        for (hi8 hi8Var2 : listG2) {
                            ni8 wg7Var2 = (ni8) wv0.u0(hi8Var2.getIndex(), t14Var.l0());
                            boolean z2 = set != null && set.contains(hi8Var2);
                            if (wg7Var2 == null || z2) {
                                wg7Var2 = new wg7(hi8Var2);
                            } else {
                                t14 t14VarB2 = wg7Var2.b();
                                t14VarB2.getClass();
                                if (ui8Var.d(t14VarB2) == null) {
                                    wg7Var2 = new wg7(hi8Var2);
                                }
                            }
                            arrayList2.add(wg7Var2);
                        }
                        aa7VarF2 = s08.f(aa7VarF2, arrayList2, null, 2);
                    }
                    mo8VarF = dh3.s(aa7VarF, aa7VarF2);
                } else {
                    if (!(mo8VarQ0 instanceof aa7)) {
                        b61.c();
                        return null;
                    }
                    aa7 aa7Var = (aa7) mo8VarQ0;
                    if (aa7Var.n0().g().isEmpty() || aa7Var.n0().x() == null) {
                        mo8VarF = aa7Var;
                    } else {
                        List<hi8> listG3 = aa7Var.n0().g();
                        listG3.getClass();
                        ArrayList arrayList3 = new ArrayList(xv0.Z(listG3, 10));
                        for (hi8 hi8Var3 : listG3) {
                            ni8 wg7Var3 = (ni8) wv0.u0(hi8Var3.getIndex(), t14Var.l0());
                            boolean z3 = set != null && set.contains(hi8Var3);
                            if (wg7Var3 == null || z3) {
                                wg7Var3 = new wg7(hi8Var3);
                            } else {
                                t14 t14VarB3 = wg7Var3.b();
                                t14VarB3.getClass();
                                if (ui8Var.d(t14VarB3) == null) {
                                    wg7Var3 = new wg7(hi8Var3);
                                }
                            }
                            arrayList3.add(wg7Var3);
                        }
                        mo8VarF = s08.f(aa7Var, arrayList3, null, 2);
                    }
                }
                o57Var.add(wi8Var.f(c18.g(mo8VarF, mo8VarQ0), rt8.OUT_VARIANCE));
            } else if (ot0VarX instanceof hi8) {
                Set set2 = nl3Var.e;
                if (set2 == null || !set2.contains(ot0VarX)) {
                    List upperBounds = ((hi8) ot0VarX).getUpperBounds();
                    upperBounds.getClass();
                    o57Var.addAll(K(wi8Var, upperBounds, nl3Var));
                } else {
                    o57Var.add(p(nl3Var));
                }
            }
        }
        return w45.m(o57Var);
    }

    public bh7 L(s39 s39Var) {
        bh7 bh7VarC;
        synchronized (this.Z) {
            bh7VarC = ((fj4) this.Y).c(s39Var);
        }
        return bh7VarC;
    }

    public ar3 M(dh8 dh8Var) {
        ar3 ar3Var;
        synchronized (this) {
            c24 c24Var = (c24) this.Y;
            ar3Var = (ar3) ((wu5) c24Var.X).get(new di8(dh8Var));
        }
        return ar3Var;
    }

    public ar3 N(Class cls) {
        ar3 ar3Var;
        synchronized (this) {
            c24 c24Var = (c24) this.Y;
            ar3Var = (ar3) ((wu5) c24Var.X).get(new di8(cls, false));
        }
        return ar3Var;
    }

    @Override // defpackage.bw6
    public Object U(hv6 hv6Var, Object obj) {
        return ((rn2) this.Y).K(hv6Var, obj);
    }

    @Override // defpackage.oz6
    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.Y;
        do {
            i = ((nv0) this.Z).H(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        switch (this.X) {
            case 14:
                by7 by7Var = (by7) obj;
                by7Var.getClass();
                ((jg1) ((zv7) this.Z).X).c(by7Var);
                break;
            default:
                mb6.s("Unexpected result from SurfaceRequest. Surface was provided twice.", ((lz) obj).a != 3);
                hi5.z0("TextureViewImpl");
                ((SurfaceTexture) this.Y).release();
                b98 b98Var = ((a98) this.Z).a;
                if (b98Var.j != null) {
                    b98Var.j = null;
                }
                break;
        }
    }

    @Override // defpackage.oz6
    public int c(int i) {
        do {
            i = ((nv0) this.Z).Q(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.Y).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.pi8
    public dh8 d(Type type) {
        return ((uh8) this.Y).b(null, type, (gh8) this.Z);
    }

    @Override // defpackage.oz6
    public int e(int i) {
        do {
            i = ((nv0) this.Z).Q(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.Y).charAt(i)));
        return i;
    }

    @Override // defpackage.oz6
    public int f(int i) {
        do {
            i = ((nv0) this.Z).H(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.Y).charAt(i - 1)));
        return i;
    }

    public void g(l lVar, rb0 rb0Var) {
        l97 l97Var = (l97) this.Y;
        sw8 sw8VarA = (sw8) l97Var.get(lVar);
        if (sw8VarA == null) {
            sw8VarA = sw8.a();
            l97Var.put(lVar, sw8VarA);
        }
        sw8VarA.c = rb0Var;
        sw8VarA.a |= 8;
    }

    @Override // defpackage.v06
    public Object get() {
        f08 f08Var = new f08((byte) 13);
        f08 f08Var2 = new f08((byte) 9);
        Object obj = ((v06) this.Y).get();
        v06 v06Var = (v06) this.Z;
        return new wr6(f08Var, f08Var2, ky.f, (dx6) obj, v06Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v27, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public il7 h(int i, aj0 aj0Var, ArrayList arrayList, ArrayList arrayList2, ih0 ih0Var, Range range, boolean z) {
        int i2;
        Rect rectH;
        mx7 mx7Var;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        kx7 kx7Var;
        iy7 iy7VarO;
        List list;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LinkedHashMap linkedHashMap2;
        mx7 mx7Var2;
        aj0Var.getClass();
        ih0Var.getClass();
        range.getClass();
        ArrayList arrayList5 = new ArrayList();
        String strE = aj0Var.e();
        strE.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            iz izVar = hq8Var.i;
            if (izVar == null) {
                bt.q("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            hl0 hl0Var = (hl0) this.Z;
            if (hl0Var == null) {
                bt.i("Required value was null.");
                return null;
            }
            int iN = hq8Var.h.n();
            Size sizeC = hq8Var.c();
            if (sizeC == null) {
                bt.q("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            jl7 jl7VarR = hq8Var.h.r();
            Iterator it2 = it;
            mb6.o(hl0Var.d.containsKey(strE), "No such camera id in supported combination list: ".concat(strE));
            synchronized (hl0Var.c) {
                mx7Var2 = (mx7) hl0Var.d.get(strE);
            }
            if (mx7Var2 == null) {
                bt.q("No such camera id in supported combination list: ".concat(strE));
                return null;
            }
            rx7 rx7VarP = mx7Var2.p(i, iN, sizeC, jl7VarR);
            int iN2 = hq8Var.h.n();
            Size sizeC2 = hq8Var.c();
            sizeC2.getClass();
            px1 px1Var = izVar.c;
            ArrayList arrayList6 = new ArrayList();
            if (hq8Var instanceof gl7) {
                Iterator it3 = ((gl7) hq8Var).r.X.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((hq8) it3.next()).h.s());
                }
            } else {
                arrayList6.add(hq8Var.h.s());
            }
            l11 l11Var = izVar.f;
            int iIntValue = ((Integer) hq8Var.h.a(er8.Q, 0)).intValue();
            Range range2 = (Range) hq8Var.h.a(er8.R, iz.h);
            if (range2 == null) {
                bt.q("Required value was null.");
                return null;
            }
            Boolean bool = (Boolean) hq8Var.h.a(er8.S, Boolean.FALSE);
            Objects.requireNonNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            er8 er8Var = hq8Var.h;
            Size sizeC3 = hq8Var.c();
            sizeC3.getClass();
            rx rxVar = new rx(rx7VarP, iN2, sizeC2, px1Var, arrayList6, l11Var, iIntValue, range2, zBooleanValue, er8Var.v(sizeC3));
            arrayList5.add(rxVar);
            linkedHashMap4.put(rxVar, hq8Var);
            linkedHashMap3.put(hq8Var, izVar);
            it = it2;
        }
        Pair pair = new Pair(linkedHashMap3, linkedHashMap4);
        Object obj = pair.second;
        obj.getClass();
        Map map = (Map) obj;
        HashMap mapY = tl0.y(arrayList, (hr8) ih0Var.a(ih0.c, hr8.a), (ul0) this.Y, range);
        String strE2 = aj0Var.e();
        strE2.getClass();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            try {
                rectH = aj0Var.h();
            } catch (NullPointerException unused) {
                rectH = null;
            }
            zv7 zv7Var = new zv7(aj0Var, rectH != null ? hd8.f(rectH) : null);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                hq8 hq8Var2 = (hq8) it4.next();
                Object obj2 = mapY.get(hq8Var2);
                if (obj2 == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                pl0 pl0Var = (pl0) obj2;
                er8 er8VarP = hq8Var2.p(aj0Var, pl0Var.a, pl0Var.b);
                er8VarP.getClass();
                linkedHashMap6.put(er8VarP, hq8Var2);
                linkedHashMap7.put(er8VarP, zv7Var.k(er8VarP));
            }
            lv8 lv8VarE = ts7.e(arrayList, new gq6(mapY, aj0Var, (byte) 7));
            hl0 hl0Var2 = (hl0) this.Z;
            if (hl0Var2 == null) {
                bt.i("Required value was null.");
                return null;
            }
            ArrayList arrayList7 = new ArrayList(map.keySet());
            boolean zB = ts7.b(arrayList);
            mb6.o(hl0Var2.d.containsKey(strE2), "No such camera id in supported combination list: ".concat(strE2));
            synchronized (hl0Var2.c) {
                mx7Var = (mx7) hl0Var2.d.get(strE2);
            }
            if (mx7Var == null) {
                bt.q("No such camera id in supported combination list: ".concat(strE2));
                return null;
            }
            wp1 wp1Var = mx7Var.y;
            synchronized (wp1Var.c) {
                wp1Var.f = wp1Var.a();
            }
            if (mx7Var.v == null) {
                mx7Var.b();
            } else {
                mx7Var.v = new nz(mx7Var.l().a, mx7Var.l().b, mx7Var.y.c(), mx7Var.l().d, mx7Var.l().e, mx7Var.l().f, mx7Var.l().g, mx7Var.l().h, mx7Var.l().i);
            }
            Range range3 = l03.f;
            Set setKeySet = linkedHashMap7.keySet();
            setKeySet.getClass();
            ArrayList arrayList8 = new ArrayList(xv0.Z(arrayList7, 10));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                arrayList8.add(Integer.valueOf(((rx) it5.next()).g));
            }
            Set set = setKeySet;
            ArrayList arrayList9 = new ArrayList(xv0.Z(set, 10));
            Iterator it6 = set.iterator();
            while (it6.hasNext()) {
                Integer num = (Integer) ((er8) it6.next()).a(er8.Q, 0);
                num.getClass();
                arrayList9.add(num);
            }
            ArrayList arrayListH0 = wv0.H0(arrayList8, arrayList9);
            if (arrayListH0.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it7 = arrayListH0.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((Number) it7.next()).intValue() == 1) {
                    z2 = true;
                    break;
                }
            }
            if (z2 && !arrayListH0.isEmpty()) {
                Iterator it8 = arrayListH0.iterator();
                while (it8.hasNext()) {
                    if (((Number) it8.next()).intValue() != 1) {
                        bt.q("All sessionTypes should be high-speed when any of them is high-speed");
                        return null;
                    }
                }
            }
            if (z2) {
                l03 l03Var = mx7Var.C;
                l03Var.getClass();
                List listA = l03.a(wv0.Y0(linkedHashMap7.values()));
                ArrayList arrayList10 = new ArrayList();
                for (Object obj3 : listA) {
                    if (((List) l03Var.e.getValue()).contains((Size) obj3)) {
                        arrayList10.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(aq4.G(linkedHashMap7.size()));
                for (Map.Entry entry : linkedHashMap7.entrySet()) {
                    Object key = entry.getKey();
                    List list2 = (List) entry.getValue();
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (arrayList10.contains((Size) obj4)) {
                            arrayList11.add(obj4);
                        }
                    }
                    linkedHashMap8.put(key, arrayList11);
                }
                linkedHashMap7 = linkedHashMap8;
            }
            List<er8> listY0 = wv0.Y0(linkedHashMap7.keySet());
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            Iterator it9 = listY0.iterator();
            while (it9.hasNext()) {
                Integer num2 = (Integer) ((er8) it9.next()).a(er8.P, 0);
                num2.getClass();
                if (!arrayList13.contains(num2)) {
                    arrayList13.add(num2);
                }
            }
            aw0.b0(arrayList13);
            Collections.reverse(arrayList13);
            Iterator it10 = arrayList13.iterator();
            while (it10.hasNext()) {
                int iIntValue2 = ((Number) it10.next()).intValue();
                for (er8 er8Var2 : listY0) {
                    if (iIntValue2 == ((Integer) er8Var2.a(er8.P, 0)).intValue()) {
                        arrayList12.add(Integer.valueOf(listY0.indexOf(er8Var2)));
                    }
                }
            }
            LinkedHashMap linkedHashMapN = mx7Var.B.n(arrayList7, listY0, arrayList12);
            if (hi5.i0("CXCP")) {
                linkedHashMapN.toString();
            }
            Iterator it11 = arrayList7.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    Iterator it12 = linkedHashMap7.keySet().iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            z3 = false;
                            break;
                        }
                        if (((er8) it12.next()).n() == 4101) {
                        }
                    }
                } else if (((rx) it11.next()).b == 4101) {
                }
                z3 = true;
                break;
            }
            Iterator it13 = arrayList7.iterator();
            Boolean boolValueOf = null;
            while (it13.hasNext()) {
                boolean z4 = ((rx) it13.next()).i;
                if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(z4))) {
                    bt.i("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            Iterator it14 = listY0.iterator();
            while (it14.hasNext()) {
                Boolean bool2 = (Boolean) ((er8) it14.next()).a(er8.S, Boolean.FALSE);
                Objects.requireNonNull(bool2);
                if (boolValueOf != null && !boolValueOf.equals(bool2)) {
                    bt.i("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = bool2;
            }
            boolean zBooleanValue2 = boolValueOf != null ? boolValueOf.booleanValue() : false;
            Range rangeN = iz.h;
            rangeN.getClass();
            Iterator it15 = arrayList7.iterator();
            while (it15.hasNext()) {
                Range range4 = ((rx) it15.next()).h;
                range4.getClass();
                rangeN = mx7.n(range4, rangeN, zBooleanValue2);
            }
            Iterator it16 = arrayList12.iterator();
            while (it16.hasNext()) {
                List list3 = listY0;
                Range range5 = (Range) ((er8) listY0.get(((Number) it16.next()).intValue())).a(er8.R, iz.h);
                range5.getClass();
                rangeN = mx7.n(range5, rangeN, zBooleanValue2);
                listY0 = list3;
            }
            List list4 = listY0;
            boolean zBooleanValue3 = Boolean.valueOf(zBooleanValue2).booleanValue();
            boolean z5 = lv8VarE == lv8.g0;
            hi5.i0("CXCP");
            if (z5 && !mx7Var.t && z) {
                bt.q("Preview stabilization is not supported by the camera.");
                return null;
            }
            rangeN.getClass();
            Iterator it17 = linkedHashMapN.values().iterator();
            while (true) {
                if (!it17.hasNext()) {
                    i3 = 8;
                    break;
                }
                if (((px1) it17.next()).b == 10) {
                    i3 = 10;
                    break;
                }
            }
            lx7 lx7Var = new lx7(i, i3, zB, lv8VarE, z3, z2, z, false, rangeN, zBooleanValue3);
            mx7Var.s(lx7Var);
            Collection collectionValues = linkedHashMapN.values();
            if (z) {
                ?? Contains = collectionValues.contains(px1.e);
                Integer num3 = (Integer) rangeN.getUpper();
                if (num3 != null && num3.intValue() == 60) {
                    i4 = Contains;
                    i4 = Contains;
                    i4 = Contains + 1;
                }
                i4 = Contains;
                i4 = Contains;
                i4 = Contains;
                if (lv8VarE == lv8.f0 || lv8VarE == lv8.g0) {
                    i5 = i4;
                    i5 = i4 + 1;
                }
                if (z3) {
                    i5++;
                }
                kx7Var = i5 > 1 ? kx7.Y : i5 == 1 ? kx7.Z : kx7.X;
            } else {
                kx7Var = kx7.X;
            }
            if (hi5.i0("CXCP")) {
                Objects.toString(kx7Var);
            }
            int iOrdinal = kx7Var.ordinal();
            if (iOrdinal == 0) {
                lx7 lx7VarA = lx7.a(lx7Var, false, null, 895);
                mx7Var.s(lx7VarA);
                iy7VarO = mx7Var.o(lx7VarA, arrayList7, linkedHashMap7, list4, arrayList12, linkedHashMapN);
            } else if (iOrdinal == 1) {
                LinkedHashMap linkedHashMap9 = linkedHashMap7;
                if (z) {
                    Range range6 = iz.h;
                }
                lx7 lx7VarA2 = lx7.a(lx7Var, true, rangeN, 639);
                mx7Var.s(lx7VarA2);
                iy7VarO = mx7Var.o(lx7VarA2, arrayList7, linkedHashMap9, list4, arrayList12, linkedHashMapN);
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                try {
                    lx7 lx7VarA3 = lx7.a(lx7Var, false, null, 895);
                    mx7Var.s(lx7VarA3);
                    list = list4;
                    linkedHashMap = linkedHashMapN;
                    arrayList3 = arrayList7;
                    arrayList4 = arrayList12;
                    linkedHashMap2 = linkedHashMap7;
                    try {
                        iy7VarO = mx7Var.o(lx7VarA3, arrayList3, linkedHashMap2, list, arrayList4, linkedHashMap);
                    } catch (IllegalArgumentException unused2) {
                        mx7Var = mx7Var;
                        hi5.i0("CXCP");
                        lx7 lx7VarA4 = lx7.a(lx7Var, true, null, 895);
                        mx7Var.s(lx7VarA4);
                        iy7VarO = mx7Var.o(lx7VarA4, arrayList3, linkedHashMap2, list, arrayList4, linkedHashMap);
                    }
                } catch (IllegalArgumentException unused3) {
                    list = list4;
                    linkedHashMap = linkedHashMapN;
                    arrayList3 = arrayList7;
                    arrayList4 = arrayList12;
                    linkedHashMap2 = linkedHashMap7;
                }
            }
            LinkedHashMap linkedHashMap10 = iy7VarO.a;
            LinkedHashMap linkedHashMap11 = iy7VarO.b;
            i2 = iy7VarO.c;
            for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
                Object value = entry2.getValue();
                Object obj5 = linkedHashMap10.get(entry2.getKey());
                if (obj5 == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                linkedHashMap5.put(value, obj5);
            }
            for (Map.Entry entry3 : linkedHashMap11.entrySet()) {
                if (map.containsKey(entry3.getKey())) {
                    Object obj6 = map.get(entry3.getKey());
                    if (obj6 == null) {
                        bt.q("Required value was null.");
                        return null;
                    }
                    linkedHashMap5.put(obj6, entry3.getValue());
                }
            }
        }
        Object obj7 = pair.first;
        obj7.getClass();
        return new il7(zp4.L((Map) obj7, linkedHashMap5), i2);
    }

    public Bundle i(String str) {
        xv6 xv6Var = (xv6) this.Y;
        if (!xv6Var.g) {
            bt.i("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = xv6Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = bundle.containsKey(str) ? x97.B(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            xv6Var.f = null;
        }
        return bundleB;
    }

    public boolean j(s39 s39Var) {
        boolean zContainsKey;
        synchronized (this.Z) {
            zContainsKey = ((fj4) this.Y).a.containsKey(s39Var);
        }
        return zContainsKey;
    }

    public Object l() {
        Object objRemoveLast;
        synchronized (this.Z) {
            objRemoveLast = ((ArrayDeque) this.Y).removeLast();
        }
        return objRemoveLast;
    }

    public View m(int i, int i2, int i3, int i4) {
        cf8 cf8Var = (cf8) this.Z;
        pv8 pv8Var = (pv8) this.Y;
        int iB = pv8Var.b();
        int iC = pv8Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewD = pv8Var.d(i);
            int iA = pv8Var.a(viewD);
            int iE = pv8Var.e(viewD);
            cf8Var.b = iB;
            cf8Var.c = iC;
            cf8Var.d = iA;
            cf8Var.e = iE;
            if (i3 != 0) {
                cf8Var.a = i3;
                if (cf8Var.a()) {
                    return viewD;
                }
            }
            if (i4 != 0) {
                cf8Var.a = i4;
                if (cf8Var.a()) {
                    view = viewD;
                }
            }
            i += i5;
        }
        return view;
    }

    public void n() {
        rh5 rh5Var = (rh5) this.Z;
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            u88 u88Var = (u88) rh5Var.getValue();
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            if (u88Var != null) {
                bm8 bm8Var = (bm8) this.Y;
                vd7 vd7Var = bm8Var.b;
                vd7 vd7Var2 = bm8Var.c;
                vd7Var2.clear();
                while (vd7Var2.size() + vd7Var.size() > bm8Var.a - 1) {
                    bw0.i0(vd7Var);
                }
                vd7Var.add(u88Var);
            }
            rh5Var.setValue(null);
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    public void o(String str, String str2, gn2 gn2Var) {
        LinkedHashMap linkedHashMap = ((fj4) this.Z).a;
        d97 d97Var = new d97(this, str, str2);
        gn2Var.B(d97Var);
        String str3 = (String) this.Y;
        ArrayList arrayList = d97Var.b;
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((qg5) it.next()).X);
        }
        String strL = (String) d97Var.c.X;
        strL.getClass();
        StringBuilder sb = new StringBuilder(str);
        sb.append('(');
        sb.append(wv0.y0(arrayList2, _UrlKt.FRAGMENT_ENCODE_SET, null, null, cd5.A0, 30));
        sb.append(')');
        if (strL.length() > 1) {
            strL = p61.l(';', "L", strL);
        }
        sb.append(strL);
        String str4 = str3 + '.' + sb.toString();
        rh8 rh8Var = (rh8) d97Var.c.Y;
        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((rh8) ((qg5) it2.next()).Y);
        }
        linkedHashMap.put(str4, new cs5(rh8Var, arrayList3, d97Var.a));
    }

    public mo8 p(nl3 nl3Var) {
        mo8 mo8VarN;
        aa7 aa7Var = nl3Var.f;
        return (aa7Var == null || (mo8VarN = y08.n(aa7Var)) == null) ? (q32) ((vz7) this.Y).getValue() : mo8VarN;
    }

    public t14 q(hi8 hi8Var, nl3 nl3Var) {
        hi8Var.getClass();
        nl3Var.getClass();
        return (t14) ((pe4) this.Z).B(new mi8(hi8Var, nl3Var));
    }

    public int r(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.Y;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.Z).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    public wv6 s(String str) {
        wv6 wv6Var;
        xv6 xv6Var = (xv6) this.Y;
        synchronized (xv6Var.c) {
            Iterator it = xv6Var.d.entrySet().iterator();
            do {
                wv6Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                wv6 wv6Var2 = (wv6) entry.getValue();
                if (dh3.f(str2, str)) {
                    wv6Var = wv6Var2;
                }
            } while (wv6Var == null);
        }
        return wv6Var;
    }

    public String t(String str) {
        String str2 = (String) this.Z;
        Resources resources = (Resources) this.Y;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public String toString() {
        switch (this.X) {
            case 26:
                return "Bounds{lower=" + ((fe3) this.Y) + " upper=" + ((fe3) this.Z) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
        switch (this.X) {
            case 14:
                int i = ((xx7) this.Y).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    hi5.z0("SurfaceProcessorNode");
                    return;
                } else {
                    v18.c(i);
                    hi5.z0("SurfaceProcessorNode");
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    public boolean v(View view) {
        cf8 cf8Var = (cf8) this.Z;
        pv8 pv8Var = (pv8) this.Y;
        int iB = pv8Var.b();
        int iC = pv8Var.c();
        int iA = pv8Var.a(view);
        int iE = pv8Var.e(view);
        cf8Var.b = iB;
        cf8Var.c = iC;
        cf8Var.d = iA;
        cf8Var.e = iE;
        cf8Var.a = 24579;
        return cf8Var.a();
    }

    public void w() {
        ((xv6) this.Y).a();
    }

    public void x(Bundle bundle) {
        xv6 xv6Var = (xv6) this.Y;
        yv6 yv6Var = xv6Var.a;
        if (!xv6Var.e) {
            xv6Var.a();
        }
        if (yv6Var.getX().i.compareTo(o84.f0) >= 0) {
            xw3.s(yv6Var.getX().i, "performRestore cannot be called when owner is ");
            return;
        }
        if (xv6Var.g) {
            bt.i("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleB = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleB = x97.B("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        xv6Var.f = bundleB;
        xv6Var.g = true;
    }

    @Override // defpackage.bw6
    public Object y(Object obj) {
        return ((gn2) this.Z).B(obj);
    }

    public void z(Bundle bundle) {
        xv6 xv6Var = (xv6) this.Y;
        Bundle bundleH = dh3.h((qg5[]) Arrays.copyOf(new qg5[0], 0));
        Bundle bundle2 = xv6Var.f;
        if (bundle2 != null) {
            bundleH.putAll(bundle2);
        }
        synchronized (xv6Var.c) {
            for (Map.Entry entry : xv6Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((wv6) entry.getValue()).a();
                str.getClass();
                bundleH.putBundle(str, bundleA);
            }
        }
        if (bundleH.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleH);
    }

    public /* synthetic */ xd6(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    public xd6(Context context) {
        this.X = (byte) 13;
        w45.s(context);
        Resources resources = context.getResources();
        this.Y = resources;
        this.Z = resources.getResourcePackageName(g56.common_google_play_services_unknown_issue);
    }

    public xd6(we5 we5Var) {
        this.X = (byte) 19;
        ve4 ve4Var = new ve4("Type parameter upper bound erasure results");
        this.Y = new vz7(new zk3(this, (byte) 26));
        this.Z = ve4Var.b(new zo6(this, (byte) 4));
    }

    public xd6(xv6 xv6Var, byte b) {
        this.X = b;
        switch (b) {
            case 5:
                this.Y = xv6Var;
                this.Z = new xd6(xv6Var, (byte) 4);
                break;
            default:
                this.Y = xv6Var;
                break;
        }
    }

    public xd6(Object obj) {
        this.X = (byte) 10;
        this.Y = obj;
        this.Z = Thread.currentThread();
    }

    public xd6(u88 u88Var, bm8 bm8Var) {
        this.X = (byte) 16;
        this.Y = bm8Var;
        this.Z = z51.H(u88Var);
    }

    public xd6(ExecutorService executorService) {
        this.X = (byte) 1;
        this.Z = new vt(0);
        this.Y = executorService;
    }

    public xd6(em7 em7Var) {
        this.X = (byte) 29;
        this.Z = new Object();
        this.Y = new ArrayDeque(3);
    }

    public xd6(fv5 fv5Var, y5 y5Var) {
        this.X = (byte) 28;
        fv5Var.getClass();
        y5Var.getClass();
        this.Y = fv5Var;
        this.Z = y5Var;
    }

    public /* synthetic */ xd6(byte b, Object obj, Object obj2, boolean z) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    public xd6(fj4 fj4Var) {
        this.X = (byte) 15;
        this.Y = fj4Var;
        this.Z = new Object();
    }

    public xd6(ul0 ul0Var) {
        this.X = (byte) 12;
        this.Y = ul0Var;
        this.Z = null;
    }

    public xd6(pv8 pv8Var) {
        this.X = (byte) 22;
        this.Y = pv8Var;
        cf8 cf8Var = new cf8();
        cf8Var.a = 0;
        this.Z = cf8Var;
    }

    public xd6(WindowInsetsAnimation.Bounds bounds) {
        this.X = (byte) 26;
        this.Y = a19.g(bounds);
        this.Z = a19.f(bounds);
    }
}
