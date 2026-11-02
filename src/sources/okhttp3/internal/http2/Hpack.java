package okhttp3.internal.http2;

import defpackage.ba0;
import defpackage.dh3;
import defpackage.eu;
import defpackage.ge1;
import defpackage.i90;
import defpackage.j76;
import defpackage.je7;
import defpackage.kb0;
import defpackage.u52;
import defpackage.wv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\b¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/Hpack;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "Lkb0;", _UrlKt.FRAGMENT_ENCODE_SET, "nameToFirstIndex", "()Ljava/util/Map;", "name", "checkLowercase", "(Lkb0;)Lkb0;", "PREFIX_4_BITS", "I", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "Reader", "Writer", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<kb0, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, _UrlKt.FRAGMENT_ENCODE_SET);
        kb0 kb0Var = Header.TARGET_METHOD;
        Header header2 = new Header(kb0Var, "GET");
        Header header3 = new Header(kb0Var, "POST");
        kb0 kb0Var2 = Header.TARGET_PATH;
        Header header4 = new Header(kb0Var2, "/");
        Header header5 = new Header(kb0Var2, "/index.html");
        kb0 kb0Var3 = Header.TARGET_SCHEME;
        Header header6 = new Header(kb0Var3, "http");
        Header header7 = new Header(kb0Var3, "https");
        kb0 kb0Var4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(kb0Var4, "200"), new Header(kb0Var4, "204"), new Header(kb0Var4, "206"), new Header(kb0Var4, "304"), new Header(kb0Var4, "400"), new Header(kb0Var4, "404"), new Header(kb0Var4, "500"), new Header("accept-charset", _UrlKt.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", _UrlKt.FRAGMENT_ENCODE_SET), new Header("accept-ranges", _UrlKt.FRAGMENT_ENCODE_SET), new Header("accept", _UrlKt.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", _UrlKt.FRAGMENT_ENCODE_SET), new Header("age", _UrlKt.FRAGMENT_ENCODE_SET), new Header("allow", _UrlKt.FRAGMENT_ENCODE_SET), new Header("authorization", _UrlKt.FRAGMENT_ENCODE_SET), new Header("cache-control", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-disposition", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-encoding", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-language", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-length", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-location", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-range", _UrlKt.FRAGMENT_ENCODE_SET), new Header("content-type", _UrlKt.FRAGMENT_ENCODE_SET), new Header("cookie", _UrlKt.FRAGMENT_ENCODE_SET), new Header("date", _UrlKt.FRAGMENT_ENCODE_SET), new Header("etag", _UrlKt.FRAGMENT_ENCODE_SET), new Header("expect", _UrlKt.FRAGMENT_ENCODE_SET), new Header("expires", _UrlKt.FRAGMENT_ENCODE_SET), new Header("from", _UrlKt.FRAGMENT_ENCODE_SET), new Header(MetaParams.HOST, _UrlKt.FRAGMENT_ENCODE_SET), new Header("if-match", _UrlKt.FRAGMENT_ENCODE_SET), new Header("if-modified-since", _UrlKt.FRAGMENT_ENCODE_SET), new Header("if-none-match", _UrlKt.FRAGMENT_ENCODE_SET), new Header("if-range", _UrlKt.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", _UrlKt.FRAGMENT_ENCODE_SET), new Header("last-modified", _UrlKt.FRAGMENT_ENCODE_SET), new Header("link", _UrlKt.FRAGMENT_ENCODE_SET), new Header("location", _UrlKt.FRAGMENT_ENCODE_SET), new Header("max-forwards", _UrlKt.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", _UrlKt.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", _UrlKt.FRAGMENT_ENCODE_SET), new Header("range", _UrlKt.FRAGMENT_ENCODE_SET), new Header("referer", _UrlKt.FRAGMENT_ENCODE_SET), new Header("refresh", _UrlKt.FRAGMENT_ENCODE_SET), new Header("retry-after", _UrlKt.FRAGMENT_ENCODE_SET), new Header("server", _UrlKt.FRAGMENT_ENCODE_SET), new Header("set-cookie", _UrlKt.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", _UrlKt.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", _UrlKt.FRAGMENT_ENCODE_SET), new Header("user-agent", _UrlKt.FRAGMENT_ENCODE_SET), new Header("vary", _UrlKt.FRAGMENT_ENCODE_SET), new Header("via", _UrlKt.FRAGMENT_ENCODE_SET), new Header("www-authenticate", _UrlKt.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<kb0, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<kb0, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final kb0 checkLowercase(kb0 name) throws IOException {
        name.getClass();
        int iE = name.e();
        for (int i = 0; i < iE; i++) {
            byte bJ = name.j(i);
            if (65 <= bJ && bJ < 91) {
                u52.s("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.t()));
                return null;
            }
        }
        return name;
    }

    public final Map<kb0, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010$¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "headerTableSizeSetting", _UrlKt.FRAGMENT_ENCODE_SET, "useCompression", "Li90;", "out", "<init>", "(IZLi90;)V", "Ldn8;", "clearDynamicTable", "()V", "bytesToRecover", "evictToRecoverBytes", "(I)I", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(Lokhttp3/internal/http2/Header;)V", "adjustDynamicTableByteCount", _UrlKt.FRAGMENT_ENCODE_SET, "headerBlock", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "Lkb0;", "data", "writeByteString", "(Lkb0;)V", "resizeHeaderTable", "(I)V", "I", "Z", "Li90;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", _UrlKt.FRAGMENT_ENCODE_SET, "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final i90 out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, boolean z, i90 i90Var) {
            i90Var.getClass();
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = i90Var;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            eu.m0(0, headerArr.length, null, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    bytesToRecover -= header.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    header2.getClass();
                    this.dynamicTableByteCount = i3 - header2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i4 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void insertIntoDynamicTable(Header entry) {
            int i = entry.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
                headerArr = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            headerArr[i4] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == iMin) {
                return;
            }
            if (iMin < i) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(kb0 data) throws IOException {
            data.getClass();
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.e()) {
                    i90 i90Var = new i90();
                    huffman.encode(data, i90Var);
                    kb0 kb0VarS = i90Var.s(i90Var.Y);
                    writeInt(kb0VarS.e(), 127, 128);
                    this.out.C0(kb0VarS);
                    return;
                }
            }
            writeInt(data.e(), 127, 0);
            this.out.C0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        public final void writeHeaders(List<Header> headerBlock) throws IOException {
            int length;
            int length2;
            headerBlock.getClass();
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, Hpack.PREFIX_5_BITS, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, Hpack.PREFIX_5_BITS, 32);
            }
            int size = headerBlock.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = headerBlock.get(i2);
                kb0 kb0VarR = header.name.r();
                kb0 kb0Var = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(kb0VarR);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (dh3.f(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, kb0Var)) {
                        length = length2;
                    } else if (dh3.f(hpack.getSTATIC_HEADER_TABLE()[length2].value, kb0Var)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i3 = this.nextHeaderIndex + 1; i3 < length3; i3++) {
                        Header header2 = this.dynamicTable[i3];
                        header2.getClass();
                        if (dh3.f(header2.name, kb0VarR)) {
                            Header header3 = this.dynamicTable[i3];
                            header3.getClass();
                            if (dh3.f(header3.value, kb0Var)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i3 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.H0(64);
                    writeByteString(kb0VarR);
                    writeByteString(kb0Var);
                    insertIntoDynamicTable(header);
                } else {
                    kb0 kb0Var2 = Header.PSEUDO_PREFIX;
                    kb0VarR.getClass();
                    kb0Var2.getClass();
                    if (!kb0VarR.m(0, kb0Var2, kb0Var2.e()) || dh3.f(Header.TARGET_AUTHORITY, kb0VarR)) {
                        writeInt(length, Hpack.PREFIX_6_BITS, 64);
                        writeByteString(kb0Var);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(kb0Var);
                    }
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            i90 i90Var = this.out;
            if (value < prefixMask) {
                i90Var.H0(bits | value);
                return;
            }
            i90Var.H0(bits | prefixMask);
            int i = value - prefixMask;
            while (true) {
                i90 i90Var2 = this.out;
                if (i < 128) {
                    i90Var2.H0(i);
                    return;
                } else {
                    i90Var2.H0(128 | (i & 127));
                    i >>>= 7;
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(i90 i90Var) {
            this(0, false, i90Var, 3, null);
            i90Var.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, i90 i90Var) {
            this(i, false, i90Var, 2, null);
            i90Var.getClass();
        }

        public /* synthetic */ Writer(int i, boolean z, i90 i90Var, int i2, ge1 ge1Var) {
            this((i2 & 1) != 0 ? Hpack.SETTINGS_HEADER_TABLE_SIZE : i, (i2 & 2) != 0 ? true : z, i90Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0(¢\u0006\u0004\b)\u0010*J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010$J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\u001d\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0019¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u001e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0;8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u0016\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u00102¨\u0006A"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", _UrlKt.FRAGMENT_ENCODE_SET, "Lje7;", "source", _UrlKt.FRAGMENT_ENCODE_SET, "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lje7;II)V", "Ldn8;", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "bytesToRecover", "evictToRecoverBytes", "(I)I", "index", "readIndexedHeader", "(I)V", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lkb0;", "getName", "(I)Lkb0;", _UrlKt.FRAGMENT_ENCODE_SET, "isStaticHeader", "(I)Z", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(ILokhttp3/internal/http2/Header;)V", "readByte", "()I", "header", "addHeader", "(Lokhttp3/internal/http2/Header;)V", _UrlKt.FRAGMENT_ENCODE_SET, "getAndResetHeaderList", "()Ljava/util/List;", "readHeaders", "firstByte", "prefixMask", "readInt", "(II)I", "readByteString", "()Lkb0;", "I", _UrlKt.FRAGMENT_ENCODE_SET, "headerList", "Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "headerListByteCount", "J", "Lba0;", "Lba0;", _UrlKt.FRAGMENT_ENCODE_SET, "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private long headerListByteCount;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final ba0 source;

        public Reader(je7 je7Var, int i, int i2) {
            je7Var.getClass();
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = new j76(je7Var);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        private final void addHeader(Header header) throws IOException {
            this.headerList.add(header);
            long jE = this.headerListByteCount + ((long) (header.value.e() + header.name.e()));
            this.headerListByteCount = jE;
            if (jE <= _HeadersCommonKt.HEADER_LIMIT) {
                return;
            }
            u52.s("header byte count limit of 262144 exceeded");
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            eu.m0(0, headerArr.length, null, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    int i3 = header.hpackSize;
                    bytesToRecover -= i3;
                    this.dynamicTableByteCount -= i3;
                    this.headerCount--;
                    i2++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final kb0 getName(int index) throws IOException {
            if (isStaticHeader(index)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    header.getClass();
                    return header.name;
                }
            }
            u52.h(index + 1, "Header index too large ");
            return null;
        }

        private final void insertIntoDynamicTable(int index, Header entry) throws IOException {
            addHeader(entry);
            int i = entry.hpackSize;
            if (index != -1) {
                Header header = this.dynamicTable[dynamicTableIndex(index)];
                header.getClass();
                i -= header.hpackSize;
            }
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            if (index == -1) {
                int i3 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i3 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                    headerArr = headerArr2;
                }
                int i4 = this.nextHeaderIndex;
                this.nextHeaderIndex = i4 - 1;
                headerArr[i4] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(index) + iEvictToRecoverBytes + index] = entry;
            }
            this.dynamicTableByteCount += i;
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return _UtilCommonKt.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int index) throws IOException {
            if (isStaticHeader(index)) {
                addHeader(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    header.getClass();
                    addHeader(header);
                    return;
                }
            }
            u52.h(index + 1, "Header index too large ");
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(nameIndex), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws IOException {
            addHeader(new Header(getName(index), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            addHeader(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listY0 = wv0.Y0(this.headerList);
            this.headerList.clear();
            this.headerListByteCount = 0L;
            return listY0;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final kb0 readByteString() throws IOException {
            int i = readByte();
            boolean z = (i & 128) == 128;
            long j = readInt(i, 127);
            if (this.headerListByteCount + j > _HeadersCommonKt.HEADER_LIMIT) {
                u52.s("header byte count limit of 262144 exceeded");
                return null;
            }
            if (!z) {
                return this.source.s(j);
            }
            i90 i90Var = new i90();
            Huffman.INSTANCE.decode(this.source, j, i90Var);
            return i90Var.s(i90Var.Y);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.F()) {
                int iAnd = _UtilCommonKt.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    u52.s("index == 0");
                    return;
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, Hpack.PREFIX_6_BITS) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        u52.h(this.maxDynamicTableByteCount, "Invalid dynamic table size update ");
                        return;
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int firstByte, int prefixMask) throws IOException {
            int i = firstByte & prefixMask;
            if (i < prefixMask) {
                return i;
            }
            long j = prefixMask;
            int i2 = 0;
            int i3 = 0;
            while (i2 != 5) {
                int i4 = readByte();
                i2++;
                long j2 = ((long) (i4 & 127)) << i3;
                if (j2 > 2147483647L - j) {
                    u52.s("HPACK integer overflow");
                    return 0;
                }
                j += j2;
                if ((i4 & 128) == 0) {
                    return (int) j;
                }
                i3 += 7;
            }
            u52.s("HPACK integer overflow");
            return 0;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(je7 je7Var, int i) {
            this(je7Var, i, 0, 4, null);
            je7Var.getClass();
        }

        public /* synthetic */ Reader(je7 je7Var, int i, int i2, int i3, ge1 ge1Var) {
            this(je7Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }
}
