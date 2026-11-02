.class public final synthetic Lv13;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lokhttp3/internal/http2/Http2Connection;

.field public final synthetic Z:I

.field public final synthetic f0:Lokhttp3/internal/http2/ErrorCode;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection;ILokhttp3/internal/http2/ErrorCode;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lv13;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv13;->Y:Lokhttp3/internal/http2/Http2Connection;

    .line 4
    .line 5
    iput p2, p0, Lv13;->Z:I

    .line 6
    .line 7
    iput-object p3, p0, Lv13;->f0:Lokhttp3/internal/http2/ErrorCode;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lv13;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lv13;->f0:Lokhttp3/internal/http2/ErrorCode;

    .line 4
    .line 5
    iget v2, p0, Lv13;->Z:I

    .line 6
    .line 7
    iget-object p0, p0, Lv13;->Y:Lokhttp3/internal/http2/Http2Connection;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v2, v1}, Lokhttp3/internal/http2/Http2Connection;->k(Lokhttp3/internal/http2/Http2Connection;ILokhttp3/internal/http2/ErrorCode;)Ldn8;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-static {p0, v2, v1}, Lokhttp3/internal/http2/Http2Connection;->J(Lokhttp3/internal/http2/Http2Connection;ILokhttp3/internal/http2/ErrorCode;)Ldn8;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
