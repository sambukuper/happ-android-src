.class public final synthetic Liq1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 14
    iput-byte p1, p0, Liq1;->X:B

    iput-object p2, p0, Liq1;->Z:Ljava/lang/Object;

    iput-object p3, p0, Liq1;->f0:Ljava/lang/Object;

    iput-boolean p4, p0, Liq1;->Y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;ZLokhttp3/internal/http2/Settings;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Liq1;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Liq1;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Liq1;->Y:Z

    .line 10
    .line 11
    iput-object p3, p0, Liq1;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLxd6;Ljava/lang/String;)V
    .locals 1

    .line 15
    const/4 v0, 0x0

    iput-byte v0, p0, Liq1;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Liq1;->Y:Z

    iput-object p2, p0, Liq1;->Z:Ljava/lang/Object;

    iput-object p3, p0, Liq1;->f0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Liq1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Liq1;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lokhttp3/Request;

    .line 10
    .line 11
    iget-object v2, p0, Liq1;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lokhttp3/Request$Builder;

    .line 14
    .line 15
    iget-boolean p0, p0, Liq1;->Y:Z

    .line 16
    .line 17
    const-string v3, "X-HWID"

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    move-object v1, v0

    .line 28
    :cond_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "Cookie"

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    :cond_1
    return-object v2

    .line 44
    :pswitch_0
    iget-object v0, p0, Liq1;->Z:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ly5;

    .line 47
    .line 48
    iget-object v2, p0, Liq1;->f0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lz47;

    .line 51
    .line 52
    iget-boolean p0, p0, Liq1;->Y:Z

    .line 53
    .line 54
    const-string v3, "X-HWID"

    .line 55
    .line 56
    iget-object v0, v0, Ly5;->g0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lnz2;

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    move-object v1, v0

    .line 69
    :cond_2
    if-eqz v1, :cond_3

    .line 70
    .line 71
    iget-object p0, v2, Lz47;->f0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lps;

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Lps;->e(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string p0, "Cookie"

    .line 79
    .line 80
    invoke-virtual {v2, p0, v1}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-object v2

    .line 84
    :pswitch_1
    iget-object v0, p0, Liq1;->Z:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

    .line 87
    .line 88
    iget-boolean v1, p0, Liq1;->Y:Z

    .line 89
    .line 90
    iget-object p0, p0, Liq1;->f0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lokhttp3/internal/http2/Settings;

    .line 93
    .line 94
    invoke-static {v0, v1, p0}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->g(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;ZLokhttp3/internal/http2/Settings;)Ldn8;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_2
    iget-boolean v0, p0, Liq1;->Y:Z

    .line 100
    .line 101
    iget-object v1, p0, Liq1;->Z:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Lxd6;

    .line 104
    .line 105
    iget-object p0, p0, Liq1;->f0:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-object v0, v1, Lxd6;->Y:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lxv6;

    .line 114
    .line 115
    iget-object v1, v0, Lxv6;->c:Lwe5;

    .line 116
    .line 117
    monitor-enter v1

    .line 118
    :try_start_0
    iget-object v0, v0, Lxv6;->d:Ljava/util/LinkedHashMap;

    .line 119
    .line 120
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Lwv6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    monitor-exit v1

    .line 127
    goto :goto_0

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    monitor-exit v1

    .line 130
    throw p0

    .line 131
    :cond_4
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
