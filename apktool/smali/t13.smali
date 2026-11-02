.class public final synthetic Lt13;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lokhttp3/internal/http2/Http2Connection;

.field public final synthetic Y:I

.field public final synthetic Z:Li90;

.field public final synthetic f0:I

.field public final synthetic g0:Z


# direct methods
.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection;ILi90;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt13;->X:Lokhttp3/internal/http2/Http2Connection;

    .line 5
    .line 6
    iput p2, p0, Lt13;->Y:I

    .line 7
    .line 8
    iput-object p3, p0, Lt13;->Z:Li90;

    .line 9
    .line 10
    iput p4, p0, Lt13;->f0:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lt13;->g0:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lt13;->f0:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lt13;->g0:Z

    .line 4
    .line 5
    iget-object v2, p0, Lt13;->X:Lokhttp3/internal/http2/Http2Connection;

    .line 6
    .line 7
    iget v3, p0, Lt13;->Y:I

    .line 8
    .line 9
    iget-object p0, p0, Lt13;->Z:Li90;

    .line 10
    .line 11
    invoke-static {v2, v3, p0, v0, v1}, Lokhttp3/internal/http2/Http2Connection;->p(Lokhttp3/internal/http2/Http2Connection;ILi90;IZ)Ldn8;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
