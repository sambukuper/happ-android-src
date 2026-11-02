package defpackage;

import android.text.SpannableStringBuilder;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r50 {
    public static final String b;
    public static final String c;
    public static final r50 d;
    public static final r50 e;
    public final boolean a;

    static {
        h70 h70Var = c48.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new r50(false);
        e = new r50(true);
    }

    public r50(boolean z) {
        h70 h70Var = c48.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        q50 q50Var = new q50(charSequence);
        q50Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = q50Var.c;
            if (i4 < q50Var.b && i == 0) {
                CharSequence charSequence2 = q50Var.a;
                char cCharAt = charSequence2.charAt(i4);
                q50Var.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = q50Var.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    q50Var.c = Character.charCount(iCodePointAt) + q50Var.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    q50Var.c = i5 + 1;
                    char c2 = q50Var.d;
                    directionality = c2 < 1792 ? q50.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (q50Var.c > 0) {
                    switch (q50Var.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        q50 q50Var = new q50(charSequence);
        q50Var.c = q50Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (q50Var.c > 0) {
                byte bA = q50Var.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        h70 h70Var = c48.c;
        if (charSequence == null) {
            return null;
        }
        boolean zE = h70Var.e(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zE2 = (zE ? c48.b : c48.a).e(charSequence, charSequence.length());
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zE2 || a(charSequence) == 1)) {
            str = (!z || (zE2 && a(charSequence) != -1)) ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zE != z) {
            spannableStringBuilder.append(zE ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zE3 = (zE ? c48.b : c48.a).e(charSequence, charSequence.length());
        if (!z && (zE3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zE3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
