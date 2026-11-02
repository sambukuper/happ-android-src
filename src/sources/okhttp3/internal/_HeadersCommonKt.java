package okhttp3.internal;

import defpackage.bt;
import defpackage.bw0;
import defpackage.d02;
import defpackage.eu;
import defpackage.fm7;
import defpackage.km4;
import defpackage.qg5;
import defpackage.w1;
import defpackage.z51;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010!\u001a\u001b\u0010&\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010!\u001a\u001d\u0010)\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0000*\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\u0003*\u000202H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\u00020\u00002\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\"\u00020\u0003H\u0000¢\u0006\u0004\b6\u00107\u001a\u001f\u00109\u001a\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000308H\u0000¢\u0006\u0004\b9\u0010:\"\u0014\u0010<\u001a\u00020;8\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "index", _UrlKt.FRAGMENT_ENCODE_SET, "commonName", "(Lokhttp3/Headers;I)Ljava/lang/String;", "commonValue", "name", _UrlKt.FRAGMENT_ENCODE_SET, "commonValues", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "Lqg5;", "commonIterator", "(Lokhttp3/Headers;)Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "commonNewBuilder", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "commonEquals", "(Lokhttp3/Headers;Ljava/lang/Object;)Z", "commonHashCode", "(Lokhttp3/Headers;)I", "commonToString", "(Lokhttp3/Headers;)Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "namesAndValues", "commonHeadersGet", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "commonAdd", "(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "headers", "commonAddAll", "(Lokhttp3/Headers$Builder;Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "commonAddLenient", "commonRemoveAll", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "commonSet", "commonGet", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Ljava/lang/String;", "commonBuild", "(Lokhttp3/Headers$Builder;)Lokhttp3/Headers;", "Ldn8;", "headersCheckName", "(Ljava/lang/String;)V", "headersCheckValue", "(Ljava/lang/String;Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "charCode", "(C)Ljava/lang/String;", "inputNamesAndValues", "commonHeadersOf", "([Ljava/lang/String;)Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "commonToHeaders", "(Ljava/util/Map;)Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "HEADER_LIMIT", "J", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _HeadersCommonKt {
    public static final long HEADER_LIMIT = 262144;

    private static final String charCode(char c) {
        km4.q(16);
        String string = Integer.toString(c, 16);
        string.getClass();
        return string.length() < 2 ? "0".concat(string) : string;
    }

    public static final Headers.Builder commonAdd(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        headersCheckName(str);
        headersCheckValue(str2, str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers.Builder commonAddAll(Headers.Builder builder, Headers headers) {
        builder.getClass();
        headers.getClass();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            commonAddLenient(builder, headers.name(i), headers.value(i));
        }
        return builder;
    }

    public static final Headers.Builder commonAddLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        builder.getNamesAndValues$okhttp().add(str);
        builder.getNamesAndValues$okhttp().add(fm7.R0(str2).toString());
        return builder;
    }

    public static final Headers commonBuild(Headers.Builder builder) {
        builder.getClass();
        return new Headers((String[]) builder.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final boolean commonEquals(Headers headers, Object obj) {
        headers.getClass();
        return (obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues(), ((Headers) obj).getNamesAndValues());
    }

    public static final String commonGet(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int iB = z51.B(size, 0, -2);
        if (iB > size) {
            return null;
        }
        while (!str.equalsIgnoreCase(builder.getNamesAndValues$okhttp().get(size))) {
            if (size == iB) {
                return null;
            }
            size -= 2;
        }
        return builder.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final int commonHashCode(Headers headers) {
        headers.getClass();
        return Arrays.hashCode(headers.getNamesAndValues());
    }

    public static final String commonHeadersGet(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        int length = strArr.length - 2;
        int iB = z51.B(length, 0, -2);
        if (iB > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iB) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public static final Headers commonHeadersOf(String... strArr) {
        strArr.getClass();
        if (strArr.length % 2 != 0) {
            bt.q("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                bt.q("Headers cannot be null");
                return null;
            }
            strArr2[i2] = fm7.R0(strArr[i2]).toString();
        }
        int iB = z51.B(0, strArr2.length - 1, 2);
        if (iB >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i == iB) {
                    break;
                }
                i += 2;
            }
        }
        return new Headers(strArr2);
    }

    public static final Iterator<qg5> commonIterator(Headers headers) {
        headers.getClass();
        int size = headers.size();
        qg5[] qg5VarArr = new qg5[size];
        for (int i = 0; i < size; i++) {
            qg5VarArr[i] = new qg5(headers.name(i), headers.value(i));
        }
        return new w1(qg5VarArr);
    }

    public static final String commonName(Headers headers, int i) {
        headers.getClass();
        String str = (String) eu.u0(i * 2, headers.getNamesAndValues());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final Headers.Builder commonNewBuilder(Headers headers) {
        headers.getClass();
        Headers.Builder builder = new Headers.Builder();
        bw0.e0(builder.getNamesAndValues$okhttp(), headers.getNamesAndValues());
        return builder;
    }

    public static final Headers.Builder commonRemoveAll(Headers.Builder builder, String str) {
        builder.getClass();
        str.getClass();
        int i = 0;
        while (i < builder.getNamesAndValues$okhttp().size()) {
            if (str.equalsIgnoreCase(builder.getNamesAndValues$okhttp().get(i))) {
                builder.getNamesAndValues$okhttp().remove(i);
                builder.getNamesAndValues$okhttp().remove(i);
                i -= 2;
            }
            i += 2;
        }
        return builder;
    }

    public static final Headers.Builder commonSet(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        headersCheckName(str);
        headersCheckValue(str2, str);
        builder.removeAll(str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers commonToHeaders(Map<String, String> map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = fm7.R0(key).toString();
            String string2 = fm7.R0(value).toString();
            headersCheckName(string);
            headersCheckValue(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new Headers(strArr);
    }

    public static final String commonToString(Headers headers) {
        headers.getClass();
        StringBuilder sb = new StringBuilder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strName = headers.name(i);
            String strValue = headers.value(i);
            sb.append(strName);
            sb.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final String commonValue(Headers headers, int i) {
        headers.getClass();
        String str = (String) eu.u0((i * 2) + 1, headers.getNamesAndValues());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public static final List<String> commonValues(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        int size = headers.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.value(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? d02.X : listUnmodifiableList;
    }

    public static final void headersCheckName(String str) {
        str.getClass();
        if (str.length() <= 0) {
            bt.q("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + charCode(cCharAt) + " at " + i + " in header name: " + str).toString());
            }
        }
    }

    public static final void headersCheckValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                sb.append(charCode(cCharAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(_UtilCommonKt.isSensitiveHeader(str2) ? _UrlKt.FRAGMENT_ENCODE_SET : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
