.class public final synthetic Lz13;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lokhttp3/internal/http2/Http2Connection;

.field public final synthetic Y:I

.field public final synthetic Z:I


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz13;->X:Lokhttp3/internal/http2/Http2Connection;

    .line 5
    .line 6
    iput p2, p0, Lz13;->Y:I

    .line 7
    .line 8
    iput p3, p0, Lz13;->Z:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lz13;->Y:I

    .line 2
    .line 3
    iget v1, p0, Lz13;->Z:I

    .line 4
    .line 5
    iget-object p0, p0, Lz13;->X:Lokhttp3/internal/http2/Http2Connection;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->e(Lokhttp3/internal/http2/Http2Connection;II)Ldn8;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
