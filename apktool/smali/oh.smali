.class public final synthetic Loh;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:J

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, Loh;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Loh;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Loh;->Y:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Loh;->X:B

    .line 2
    .line 3
    iget-wide v1, p0, Loh;->Y:J

    .line 4
    .line 5
    iget-object p0, p0, Loh;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ly68;

    .line 13
    .line 14
    new-instance v3, Lxd6;

    .line 15
    .line 16
    new-instance v4, Lbm8;

    .line 17
    .line 18
    sget-object v5, Ld02;->X:Ld02;

    .line 19
    .line 20
    const/16 v6, 0x64

    .line 21
    .line 22
    invoke-direct {v4, v5, v5, v6}, Lbm8;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-direct {v3, v5, v4}, Lxd6;-><init>(Lu88;Lbm8;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0, v1, v2, v3}, Ly68;-><init>(Ljava/lang/String;JLxd6;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    check-cast p0, Lokhttp3/internal/ws/RealWebSocket;

    .line 34
    .line 35
    invoke-static {p0, v1, v2}, Lokhttp3/internal/ws/RealWebSocket;->d(Lokhttp3/internal/ws/RealWebSocket;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p0, Lokhttp3/internal/http2/Http2Connection;

    .line 45
    .line 46
    invoke-static {p0, v1, v2}, Lokhttp3/internal/http2/Http2Connection;->u(Lokhttp3/internal/http2/Http2Connection;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_2
    check-cast p0, Ld90;

    .line 56
    .line 57
    check-cast p0, Lq67;

    .line 58
    .line 59
    invoke-virtual {p0, v1, v2}, Lq67;->b(J)Landroid/graphics/Shader;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
