.class public final Lfe;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lfe;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lfe;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(I)V
    .locals 2

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    if-lt p1, v0, :cond_2

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lhe;

    .line 8
    .line 9
    iget-object p1, p0, Lhe;->e:Ldq;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    iget-object v1, p1, Ldq;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ls05;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ls05;->a()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iput-object v0, p1, Ldq;->Z:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit p1

    .line 30
    goto :goto_2

    .line 31
    :goto_1
    monitor-exit p1

    .line 32
    throw p0

    .line 33
    :cond_1
    :goto_2
    iput-object v0, p0, Lhe;->e:Ldq;

    .line 34
    .line 35
    :cond_2
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-byte p1, p0, Lfe;->X:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lfe;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lwg;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-object p1, p0, Lwg;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lv76;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lwg;->z()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :goto_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit p0

    .line 31
    throw p1

    .line 32
    :pswitch_0
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lfe;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x50

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lfe;->onTrimMemory(I)V

    .line 9
    .line 10
    .line 11
    :pswitch_0
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onTrimMemory(I)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lfe;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lfe;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lwg;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-object v0, p0, Lwg;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lv76;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v1, v0, Lv76;->a:Ls76;

    .line 24
    .line 25
    const/16 v2, 0x28

    .line 26
    .line 27
    if-lt p1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lv76;->c()La86;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object v0, p1, La86;->c:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iget-object v1, p1, La86;->a:Lgj4;

    .line 39
    .line 40
    iget-object v1, v1, Lgj4;->Z:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Le86;

    .line 43
    .line 44
    const-wide/16 v2, -0x1

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Le86;->h(J)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, La86;->b:Lb8;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    iput v1, p1, Lb8;->b:I

    .line 53
    .line 54
    iget-object p1, p1, Lb8;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    :try_start_2
    monitor-exit v0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    monitor-exit v0

    .line 65
    throw p1

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    const/16 v2, 0x14

    .line 69
    .line 70
    if-lt p1, v2, :cond_1

    .line 71
    .line 72
    iget-object p1, p0, Lwg;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lvg;

    .line 75
    .line 76
    iget-object v0, v1, Ls76;->a:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lvg;->a(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/16 v1, 0xa

    .line 83
    .line 84
    if-lt p1, v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, Lv76;->c()La86;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object v0, p1, La86;->c:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    :try_start_3
    iget-object v1, p1, La86;->a:Lgj4;

    .line 96
    .line 97
    iget-object v1, v1, Lgj4;->Z:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Le86;

    .line 100
    .line 101
    invoke-virtual {v1}, Le86;->c()J

    .line 102
    .line 103
    .line 104
    move-result-wide v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 105
    :try_start_4
    monitor-exit v0

    .line 106
    const-wide/16 v3, 0x2

    .line 107
    .line 108
    div-long/2addr v1, v3

    .line 109
    iget-object v0, p1, La86;->c:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 112
    :try_start_5
    iget-object p1, p1, La86;->a:Lgj4;

    .line 113
    .line 114
    iget-object p1, p1, Lgj4;->Z:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Le86;

    .line 117
    .line 118
    invoke-virtual {p1, v1, v2}, Le86;->h(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 119
    .line 120
    .line 121
    :try_start_6
    monitor-exit v0

    .line 122
    goto :goto_0

    .line 123
    :catchall_2
    move-exception p1

    .line 124
    monitor-exit v0

    .line 125
    throw p1

    .line 126
    :catchall_3
    move-exception p1

    .line 127
    monitor-exit v0

    .line 128
    throw p1

    .line 129
    :cond_2
    invoke-virtual {p0}, Lwg;->z()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 130
    .line 131
    .line 132
    :cond_3
    :goto_0
    monitor-exit p0

    .line 133
    return-void

    .line 134
    :goto_1
    monitor-exit p0

    .line 135
    throw p1

    .line 136
    :pswitch_0
    invoke-direct {p0, p1}, Lfe;->c(I)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
