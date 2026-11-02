package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mh implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ mh(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x0338  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        Object objL;
        Object objF;
        hf2 hf2Var;
        Context contextK;
        Resources resources;
        Context contextK2;
        Resources resources2;
        byte b = 1;
        switch (this.X) {
            case 0:
                ((mj0) this.Y).Z();
                return dn8.a;
            case 1:
                dl0 dl0Var = (dl0) obj;
                nf0 nf0Var = (nf0) this.Y;
                oh7 oh7Var = nf0Var.h0;
                dn8 dn8Var = dn8.a;
                if (dl0Var instanceof zk0) {
                    oh7Var.l(dl0Var, q51Var);
                    return dn8Var;
                }
                if (!(dl0Var instanceof bl0)) {
                    return ((dl0Var instanceof al0) && (objL = nf0Var.j0.l(dn8Var, q51Var)) == c71.X) ? objL : dn8Var;
                }
                oh7Var.l(dl0Var, q51Var);
                return dn8Var;
            case 2:
                mj0 mj0Var = ((f81) this.Y).c;
                mj0Var.W().updateCursorAnchorInfo((View) mj0Var.Y, (CursorAnchorInfo) obj);
                return dn8.a;
            case 3:
                dn8 dn8Var2 = dn8.a;
                ib1 ib1Var = (ib1) this.Y;
                return ((ib1Var.j0.b() instanceof ma2) || (objF = ib1Var.f(true, q51Var)) != c71.X) ? dn8Var2 : objF;
            case 4:
                if (q51Var instanceof hf2) {
                    hf2Var = (hf2) q51Var;
                    int i = hf2Var.h0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hf2Var.h0 = i - Integer.MIN_VALUE;
                    } else {
                        hf2Var = new hf2(this, q51Var);
                    }
                } else {
                    hf2Var = new hf2(this, q51Var);
                }
                Object obj2 = hf2Var.f0;
                c71 c71Var = c71.X;
                int i2 = hf2Var.h0;
                if (i2 == 0) {
                    w39.n0(obj2);
                    kv5 kv5Var = (kv5) this.Y;
                    if (obj == null) {
                        obj = d75.a;
                    }
                    hf2Var.h0 = 1;
                    if (kv5Var.g0.a(hf2Var, obj) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj2);
                }
                return dn8.a;
            case 5:
                ((fy4) this.Y).Z.m(((Number) obj).floatValue());
                return dn8.a;
            case 6:
                vf3 vf3Var = (vf3) obj;
                vd7 vd7Var = (vd7) this.Y;
                if (vf3Var instanceof ft5) {
                    vd7Var.add(vf3Var);
                } else if (vf3Var instanceof gt5) {
                    vd7Var.remove(((gt5) vf3Var).a);
                } else if (vf3Var instanceof et5) {
                    vd7Var.remove(((et5) vf3Var).a);
                } else if (vf3Var instanceof zu1) {
                    vd7Var.add(vf3Var);
                } else if (vf3Var instanceof av1) {
                    vd7Var.remove(((av1) vf3Var).a);
                } else if (vf3Var instanceof yu1) {
                    vd7Var.remove(((yu1) vf3Var).a);
                }
                return dn8.a;
            case 7:
                tu7 tu7Var = (tu7) obj;
                wu7 wu7Var = (wu7) this.Y;
                if (tu7Var instanceof ru7) {
                    yk2 yk2Var = wu7Var.t1;
                    if (yk2Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    RelativeLayout relativeLayout = yk2Var.s0;
                    relativeLayout.getClass();
                    relativeLayout.setVisibility(8);
                    String str = ((ru7) tu7Var).a;
                    yk2 yk2Var2 = wu7Var.t1;
                    if (yk2Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ie8.a(yk2Var2.q0, null);
                    yk2 yk2Var3 = wu7Var.t1;
                    if (yk2Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ie8.a(yk2Var3.r0, null);
                    int i3 = a26.a;
                    Bitmap bitmapA = a26.a("happ://" + EDeeplinkType.SEND_TO_DEVICE.getPrefix() + str);
                    if (bitmapA != null && (contextK2 = wu7Var.k()) != null && (resources2 = contextK2.getResources()) != null) {
                        float fApplyDimension = TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
                        hm6 hm6Var = new hm6(resources2, bitmapA);
                        hm6Var.a(fApplyDimension);
                        yk2 yk2Var4 = wu7Var.t1;
                        if (yk2Var4 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        yk2Var4.o0.setImageDrawable(hm6Var);
                    }
                    yk2 yk2Var5 = wu7Var.t1;
                    if (yk2Var5 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    LinearLayout linearLayout = yk2Var5.p0;
                    linearLayout.getClass();
                    rp7.e(linearLayout, false);
                    yk2 yk2Var6 = wu7Var.t1;
                    if (yk2Var6 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView = yk2Var6.x0;
                    happTextView.getClass();
                    rp7.e(happTextView, false);
                    yk2 yk2Var7 = wu7Var.t1;
                    if (yk2Var7 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView2 = yk2Var7.y0;
                    happTextView2.getClass();
                    rp7.e(happTextView2, false);
                    yk2 yk2Var8 = wu7Var.t1;
                    if (yk2Var8 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView3 = yk2Var8.z0;
                    happTextView3.getClass();
                    rp7.e(happTextView3, true);
                    yk2 yk2Var9 = wu7Var.t1;
                    if (yk2Var9 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    Space space = yk2Var9.u0;
                    space.getClass();
                    rp7.e(space, true);
                    yk2 yk2Var10 = wu7Var.t1;
                    if (yk2Var10 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var10.w0.setText(wu7Var.p(y46.sync_with_mobile_description));
                    yk2 yk2Var11 = wu7Var.t1;
                    if (yk2Var11 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var11.m0.setText(wu7Var.p(y46.skip));
                    yk2 yk2Var12 = wu7Var.t1;
                    if (yk2Var12 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    Space space2 = yk2Var12.t0;
                    space2.getClass();
                    rp7.e(space2, true);
                    yk2 yk2Var13 = wu7Var.t1;
                    if (yk2Var13 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var13.m0.setOnClickListener(new qu7(wu7Var, b));
                    yk2 yk2Var14 = wu7Var.t1;
                    if (yk2Var14 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextButton happTextButton = yk2Var14.n0;
                    happTextButton.getClass();
                    rp7.e(happTextButton, true);
                    yk2 yk2Var15 = wu7Var.t1;
                    if (yk2Var15 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var15.n0.requestFocus();
                } else if (tu7Var instanceof su7) {
                    yk2 yk2Var16 = wu7Var.t1;
                    if (yk2Var16 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    RelativeLayout relativeLayout2 = yk2Var16.s0;
                    relativeLayout2.getClass();
                    relativeLayout2.setVisibility(8);
                    String str2 = ((su7) tu7Var).a;
                    yk2 yk2Var17 = wu7Var.t1;
                    if (yk2Var17 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ie8.a(yk2Var17.q0, null);
                    yk2 yk2Var18 = wu7Var.t1;
                    if (yk2Var18 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ie8.a(yk2Var18.r0, null);
                    int i4 = a26.a;
                    Bitmap bitmapA2 = a26.a("https://tv.happ.su/".concat(str2));
                    if (bitmapA2 != null && (contextK = wu7Var.k()) != null && (resources = contextK.getResources()) != null) {
                        float fApplyDimension2 = TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                        hm6 hm6Var2 = new hm6(resources, bitmapA2);
                        hm6Var2.a(fApplyDimension2);
                        yk2 yk2Var19 = wu7Var.t1;
                        if (yk2Var19 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        yk2Var19.o0.setImageDrawable(hm6Var2);
                    }
                    yk2 yk2Var20 = wu7Var.t1;
                    if (yk2Var20 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    LinearLayout linearLayout2 = yk2Var20.p0;
                    linearLayout2.getClass();
                    rp7.e(linearLayout2, true);
                    yk2 yk2Var21 = wu7Var.t1;
                    if (yk2Var21 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var21.v0.setText(str2);
                    yk2 yk2Var22 = wu7Var.t1;
                    if (yk2Var22 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView4 = yk2Var22.x0;
                    happTextView4.getClass();
                    rp7.e(happTextView4, true);
                    yk2 yk2Var23 = wu7Var.t1;
                    if (yk2Var23 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView5 = yk2Var23.y0;
                    happTextView5.getClass();
                    rp7.e(happTextView5, true);
                    yk2 yk2Var24 = wu7Var.t1;
                    if (yk2Var24 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView6 = yk2Var24.z0;
                    happTextView6.getClass();
                    rp7.e(happTextView6, false);
                    yk2 yk2Var25 = wu7Var.t1;
                    if (yk2Var25 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    Space space3 = yk2Var25.u0;
                    space3.getClass();
                    rp7.e(space3, false);
                    yk2 yk2Var26 = wu7Var.t1;
                    if (yk2Var26 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var26.w0.setText(wu7Var.p(y46.sync_with_mobile_transfer_data_using_browser));
                    yk2 yk2Var27 = wu7Var.t1;
                    if (yk2Var27 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var27.m0.setText(wu7Var.p(y46.back));
                    yk2 yk2Var28 = wu7Var.t1;
                    if (yk2Var28 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    Space space4 = yk2Var28.t0;
                    space4.getClass();
                    rp7.e(space4, false);
                    yk2 yk2Var29 = wu7Var.t1;
                    if (yk2Var29 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextButton happTextButton2 = yk2Var29.n0;
                    happTextButton2.getClass();
                    rp7.e(happTextButton2, false);
                    yk2 yk2Var30 = wu7Var.t1;
                    if (yk2Var30 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var30.m0.setOnClickListener(new qu7(wu7Var, (byte) 2));
                    yk2 yk2Var31 = wu7Var.t1;
                    if (yk2Var31 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    yk2Var31.m0.requestFocus();
                } else {
                    if (tu7Var != null) {
                        b61.c();
                        return null;
                    }
                    yk2 yk2Var32 = wu7Var.t1;
                    if (yk2Var32 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    RelativeLayout relativeLayout3 = yk2Var32.s0;
                    relativeLayout3.getClass();
                    relativeLayout3.setVisibility(0);
                }
                return dn8.a;
            case 8:
                ((y48) this.Y).L0.setValue(Boolean.FALSE);
                return dn8.a;
            default:
                mk0 mk0Var = (mk0) obj;
                sy8 sy8Var = (sy8) this.Y;
                synchronized (sy8Var.e) {
                    try {
                        if (mk0Var instanceof rk0) {
                            ly8 ly8Var = new ly8((za) ((rk0) mk0Var).a);
                            sy8Var.g = ly8Var;
                            sy8Var.b(new rk0(ly8Var));
                        } else {
                            sy8Var.b(mk0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dn8.a;
        }
    }
}
