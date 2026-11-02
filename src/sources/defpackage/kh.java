package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh {
    public final /* synthetic */ kd8 a;
    public final /* synthetic */ s73 b;
    public final /* synthetic */ mj0 c;
    public final /* synthetic */ gn2 d;
    public final /* synthetic */ f81 e;
    public final /* synthetic */ y78 f;
    public final /* synthetic */ dn2 g;
    public final /* synthetic */ fw8 h;
    public final /* synthetic */ gn2 i;

    public /* synthetic */ kh(kd8 kd8Var, s73 s73Var, mj0 mj0Var, gn2 gn2Var, f81 f81Var, y78 y78Var, dn2 dn2Var, fw8 fw8Var, gn2 gn2Var2) {
        this.a = kd8Var;
        this.b = s73Var;
        this.c = mj0Var;
        this.d = gn2Var;
        this.e = f81Var;
        this.f = y78Var;
        this.g = dn2Var;
        this.h = fw8Var;
        this.i = gn2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c1 A[PHI: r15
  0x00c1: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00bf, B:48:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    public final di7 a(EditorInfo editorInfo) {
        int i;
        int i2;
        kd8 kd8Var = this.a;
        t6 t6Var = new t6(new eb9(kd8Var), kd8Var, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        h48 h48VarD = kd8Var.d();
        long j = kd8Var.d().f0;
        s73 s73Var = this.b;
        int i3 = s73Var.e;
        int i4 = s73Var.d;
        boolean z = s73Var.a;
        int i5 = 3;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                bt.i("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        ge4 ge4Var = s73Var.f;
        if (dh3.f(ge4Var, ge4.Z)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(xv0.Z(ge4Var, 10));
            Iterator it = ge4Var.X.iterator();
            while (it.hasNext()) {
                arrayList.add(((ce4) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = i5;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 == 8) {
                        i2 = i5;
                    } else if (i4 == 9) {
                        i2 = 8194;
                    } else if (i4 == 10) {
                        i2 = 145;
                    } else if (i4 == 11) {
                        i2 = 113;
                    } else if (i4 == 12) {
                        i2 = 97;
                    } else if (i4 == 13) {
                        i2 = 49;
                    } else if (i4 == 14) {
                        i2 = 65;
                    } else if (i4 == 15) {
                        i2 = 81;
                    } else if (i4 == 16) {
                        i2 = 177;
                    } else if (i4 == 17) {
                        i2 = 193;
                    } else if (i4 == 18) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                        if (i4 != 19) {
                            if (i4 == 20) {
                                i2 = 36;
                            } else if (i4 == 21) {
                                i2 = 4098;
                            } else if (i4 == 22) {
                                i2 = 12290;
                            } else if (i4 == 23) {
                                i2 = 8210;
                            } else if (i4 == 24) {
                                i2 = 4114;
                            } else {
                                if (i4 != 25) {
                                    bt.i("Invalid Keyboard Type");
                                    return null;
                                }
                                i2 = 12306;
                            }
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (s73Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i6 = s73Var.b;
            if (i6 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i6 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i6 == 3) {
                i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                editorInfo.inputType = i2;
            }
            if (s73Var.c) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = 2097152 | i2;
            }
        }
        int i7 = f88.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        py1.d(editorInfo, h48VarD);
        editorInfo.imeOptions |= 33554432;
        if (!tm7.a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                nn.i(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                nn.i(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            u3.E(editorInfo);
        }
        return new di7(t6Var, editorInfo);
    }
}
