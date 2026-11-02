package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Locale;
import okhttp3.internal.url._UrlKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uu implements w82 {
    public final /* synthetic */ byte a;
    public final dq8 b;
    public final pd5 c;

    public /* synthetic */ uu(dq8 dq8Var, pd5 pd5Var, byte b) {
        this.a = b;
        this.b = dq8Var;
        this.c = pd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x033a  */
    /* JADX WARN: Code duplicated, block: B:200:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    @Override // defpackage.w82
    public final Object a(l12 l12Var) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        int iL0;
        int i;
        int i2;
        byte[] bArr;
        boolean z;
        int i3;
        Integer numB0;
        String mimeTypeFromExtension2;
        Drawable drawable;
        byte b = this.a;
        char c = 6;
        int i4 = 0;
        ma1 ma1Var = ma1.Z;
        dq8 dq8Var = this.b;
        pd5 pd5Var = this.c;
        String mimeTypeFromExtension3 = null;
        switch (b) {
            case 0:
                String strY0 = wv0.y0(wv0.o0(rq7.j(dq8Var), 1), "/", null, null, null, 62);
                me7 me7Var = new me7(new j76(dh3.Q(pd5Var.a.getAssets().open(strY0))), pd5Var.f, new su(strY0));
                if (fm7.o0(strY0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strO0 = fm7.O0('?', fm7.O0('#', strY0));
                    String strK0 = fm7.K0('.', fm7.K0('/', strO0, strO0), _UrlKt.FRAGMENT_ENCODE_SET);
                    if (fm7.o0(strK0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strK0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) rv4.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new le7(me7Var, mimeTypeFromExtension, ma1Var);
            case 1:
                String str = dq8Var.a;
                int iM0 = fm7.m0(str, ";base64,", 0, false, 6);
                if (iM0 == -1 || (iL0 = fm7.l0(str, ':', 0, 6)) == -1) {
                    xw3.s(dq8Var, "invalid data uri: ");
                } else {
                    String strSubstring = str.substring(iL0 + 1, iM0);
                    h10 h10Var = j10.c;
                    int i5 = iM0 + 8;
                    int length = str.length();
                    h10Var.getClass();
                    boolean z2 = h10Var.b;
                    wl7.s(i5, length, str.length());
                    byte[] bytes = str.substring(i5, length).getBytes(iq0.e);
                    bytes.getClass();
                    int length2 = bytes.length;
                    wl7.s(0, length2, bytes.length);
                    int i6 = -2;
                    if (length2 == 0) {
                        i2 = 0;
                    } else if (length2 != 1) {
                        if (z2) {
                            i = length2;
                            int i7 = 0;
                            while (true) {
                                char c2 = c;
                                if (i7 < length2) {
                                    int i8 = k10.a[bytes[i7] & 255];
                                    if (i8 < 0) {
                                        if (i8 == -2) {
                                            i -= length2 - i7;
                                        } else {
                                            i--;
                                        }
                                    }
                                    i7++;
                                    c = c2;
                                }
                            }
                        } else if (bytes[length2 - 1] == 61) {
                            i = length2 - 1;
                            if (bytes[length2 - 2] == 61) {
                                i = length2 - 2;
                            }
                        } else {
                            i = length2;
                        }
                        i2 = (int) ((((long) i) * 6) / 8);
                    } else {
                        bt.q(pc6.j(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                    }
                    byte[] bArr2 = new byte[i2];
                    int[] iArr = h10Var.a ? k10.b : k10.a;
                    int i9 = -8;
                    int i10 = 8;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = -8;
                    while (true) {
                        if (i11 < length2) {
                            if (i13 != i9 || (i3 = i11 + 3) >= length2) {
                                bArr = bytes;
                            } else {
                                bArr = bytes;
                                int i14 = i11 + 4;
                                int i15 = (iArr[bArr[i11 + 2] & 255] << 6) | (iArr[bytes[i11 + 1] & 255] << 12) | (iArr[bytes[i11] & 255] << 18) | iArr[bArr[i3] & 255];
                                if (i15 >= 0) {
                                    bArr2[i4] = (byte) (i15 >> 16);
                                    int i16 = i4 + 2;
                                    bArr2[i4 + 1] = (byte) (i15 >> 8);
                                    i4 += 3;
                                    bArr2[i16] = (byte) i15;
                                    bytes = bArr;
                                    i11 = i14;
                                }
                                i6 = -2;
                                i9 = -8;
                            }
                            int i17 = bArr[i11] & 255;
                            int i18 = iArr[i17];
                            if (i18 >= 0) {
                                i11++;
                                i12 = (i12 << 6) | i18;
                                int i19 = i13 + 6;
                                if (i19 >= 0) {
                                    bArr2[i4] = (byte) (i12 >>> i19);
                                    i12 &= (1 << i19) - 1;
                                    i13 -= 2;
                                    i4++;
                                } else {
                                    i13 = i19;
                                }
                                bytes = bArr;
                                i6 = -2;
                                i9 = -8;
                                i10 = 8;
                            } else if (i18 == -2) {
                                if (i13 == -8) {
                                    bt.q(pc6.j(i11, "Redundant pad character at index "));
                                } else if (i13 == -6) {
                                    i11++;
                                    z = true;
                                    i6 = -2;
                                } else if (i13 == -4) {
                                    int i20 = i11 + 1;
                                    if (z2) {
                                        while (i20 < length2) {
                                            if (k10.a[bArr[i20] & 255] == -1) {
                                                i20++;
                                            }
                                        }
                                    }
                                    if (i20 == length2 || bArr[i20] != 61) {
                                        bt.q(pc6.j(i20, "Missing one pad character at index "));
                                    } else {
                                        i11 = i20 + 1;
                                        z = true;
                                        i6 = -2;
                                    }
                                } else if (i13 == -2) {
                                    i11++;
                                    z = true;
                                    i6 = -2;
                                } else {
                                    bt.i("Unreachable");
                                }
                            } else {
                                if (!z2) {
                                    char c3 = (char) i17;
                                    km4.q(i10);
                                    String string = Integer.toString(i17, i10);
                                    string.getClass();
                                    throw new IllegalArgumentException("Invalid symbol '" + c3 + "'(" + string + ") at index " + i11);
                                }
                                i11++;
                                bytes = bArr;
                                i6 = -2;
                                i9 = -8;
                            }
                        } else {
                            bArr = bytes;
                            z = false;
                        }
                    }
                    if (i13 == i6) {
                        bt.q("The last unit of input does not have enough bits");
                    } else if (i13 != -8 && !z) {
                        bt.q("The padding option is set to PRESENT, but the input is not properly padded");
                    } else if (i12 == 0) {
                        if (z2) {
                            while (i11 < length2) {
                                if (k10.a[bArr[i11] & 255] == -1) {
                                    i11++;
                                }
                            }
                        }
                        if (i11 < length2) {
                            int i21 = bArr[i11] & 255;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i21);
                            sb.append("'(");
                            km4.q(8);
                            String string2 = Integer.toString(i21, 8);
                            string2.getClass();
                            sb.append(string2);
                            sb.append(") at index ");
                            bt.q(oi0.n(sb, i11 - 1, " is prohibited after the pad character"));
                        } else {
                            if (i4 == i2) {
                                i90 i90Var = new i90();
                                i90Var.write(bArr2, 0, i2);
                                return new le7(vj8.j(i90Var, pd5Var.f), strSubstring, ma1.Y);
                            }
                            bt.i("Check failed.");
                        }
                    } else {
                        bt.q("The pad bits must be zeros");
                    }
                }
                return null;
            case 2:
                String str2 = oi5.Y;
                String strI = rq7.i(dq8Var);
                if (strI == null) {
                    bt.i("filePath == null");
                    return null;
                }
                oi5 oi5VarR = g55.r(strI);
                h92 h92VarI = vj8.i(oi5VarR, pd5Var.f, null, null, 28);
                String strK1 = fm7.K0('.', oi5VarR.b(), _UrlKt.FRAGMENT_ENCODE_SET);
                if (!fm7.o0(strK1)) {
                    String lowerCase2 = strK1.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) rv4.a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new le7(h92VarI, mimeTypeFromExtension3, ma1Var);
            case 3:
                String str3 = dq8Var.e;
                if (str3 == null) {
                    str3 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                int iL1 = fm7.l0(str3, '!', 0, 6);
                if (iL1 == -1) {
                    xw3.s(dq8Var, "Invalid jar:file URI: ");
                    return null;
                }
                String str4 = oi5.Y;
                oi5 oi5VarR2 = g55.r(str3.substring(0, iL1));
                oi5 oi5VarR3 = g55.r(str3.substring(iL1 + 1, str3.length()));
                s92 s92Var = pd5Var.f;
                s92Var.getClass();
                h92 h92VarI2 = vj8.i(oi5VarR3, u28.l(oi5VarR2, s92Var, new a69((byte) 8)), null, null, 28);
                String strK2 = fm7.K0('.', oi5VarR3.b(), _UrlKt.FRAGMENT_ENCODE_SET);
                if (!fm7.o0(strK2)) {
                    String lowerCase3 = strK2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) rv4.a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new le7(h92VarI2, mimeTypeFromExtension3, ma1Var);
            default:
                String str5 = dq8Var.d;
                if (str5 != null) {
                    if (fm7.o0(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        String str6 = (String) wv0.B0(rq7.j(dq8Var));
                        if (str6 == null || (numB0 = mm7.b0(str6)) == null) {
                            u52.r(dq8Var, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numB0.intValue();
                        Context context = pd5Var.a;
                        Resources resources = str5.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str5);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string3 = typedValue.string.toString();
                        if (fm7.o0(string3)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strO1 = fm7.O0('?', fm7.O0('#', string3));
                            String strK3 = fm7.K0('.', fm7.K0('/', strO1, strO1), _UrlKt.FRAGMENT_ENCODE_SET);
                            if (fm7.o0(strK3)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strK3.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) rv4.a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!dh3.f(mimeTypeFromExtension2, "text/xml")) {
                            return new le7(new me7(new j76(dh3.Q(resources.openRawResource(iIntValue, new TypedValue()))), pd5Var.f, new sf6(str5, iIntValue)), mimeTypeFromExtension2, ma1Var);
                        }
                        if (str5.equals(context.getPackageName())) {
                            drawable = u70.O(context, iIntValue);
                            if (drawable == null) {
                                kp5.h(pc6.j(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = xf6.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                kp5.h(pc6.j(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = at8.a;
                        boolean z3 = (drawable instanceof VectorDrawable) || (drawable instanceof eu8);
                        if (z3) {
                            drawable = new BitmapDrawable(context.getResources(), ci8.o(drawable, (Bitmap.Config) z68.G(pd5Var, b73.b), pd5Var.b, pd5Var.c, (ta7) z68.G(pd5Var, y63.b), pd5Var.d == tr5.Y));
                        }
                        return new b63(z39.h(drawable), z3, ma1Var);
                    }
                }
                u52.r(dq8Var, "Invalid android.resource URI: ");
                return null;
        }
    }
}
