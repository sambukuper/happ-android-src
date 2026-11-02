.class public final Lan7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final g:Ljava/util/List;


# instance fields
.field public final a:Lsu/happ/proxyutility/HappApplication;

.field public final b:Lm51;

.field public final c:Lvz7;

.field public final d:Lsu/happ/proxyutility/util/SubBlacklistUtil$mMsgReceiver$1;

.field public e:Ljava/util/Set;

.field public f:Los1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "https://cdn.jsdelivr.net/gh/Happ-proxy/app_domain@main/list.json"

    .line 2
    .line 3
    const-string v1, "https://raw.githubusercontent.com/Happ-proxy/app_domain/refs/heads/main/list.json"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lan7;->g:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lsu/happ/proxyutility/HappApplication;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lan7;->a:Lsu/happ/proxyutility/HappApplication;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lpw7;->b()Low7;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Ltp1;->a:Lnf1;

    .line 14
    .line 15
    sget-object v0, Ldm4;->a:Lhv2;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lgv3;->c(Ls61;)Lm51;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lan7;->b:Lm51;

    .line 26
    .line 27
    new-instance p1, Lr47;

    .line 28
    .line 29
    const/16 v0, 0x19

    .line 30
    .line 31
    invoke-direct {p1, v0}, Lr47;-><init>(B)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lvz7;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lan7;->c:Lvz7;

    .line 40
    .line 41
    new-instance p1, Lsu/happ/proxyutility/util/SubBlacklistUtil$mMsgReceiver$1;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lsu/happ/proxyutility/util/SubBlacklistUtil$mMsgReceiver$1;-><init>(Lan7;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lan7;->d:Lsu/happ/proxyutility/util/SubBlacklistUtil$mMsgReceiver$1;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ls51;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, Lwm7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lwm7;

    .line 7
    .line 8
    iget v1, v0, Lwm7;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwm7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwm7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lwm7;-><init>(Lan7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lwm7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lwm7;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast p2, Lsj6;

    .line 39
    .line 40
    iget-object p0, p2, Lsj6;->X:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    iget-object p0, p0, Lan7;->a:Lsu/happ/proxyutility/HappApplication;

    .line 55
    .line 56
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->z0:Lvz7;

    .line 57
    .line 58
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Le72;

    .line 63
    .line 64
    iput v2, v0, Lwm7;->h0:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Le72;->c(Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    sget-object p1, Lc71;->X:Lc71;

    .line 71
    .line 72
    if-ne p0, p1, :cond_3

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_3
    :goto_1
    :try_start_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    check-cast p0, Lpr;

    .line 79
    .line 80
    iget-object p0, p0, Lpr;->a:Ljava/lang/String;

    .line 81
    .line 82
    new-instance p1, Lcom/google/gson/a;

    .line 83
    .line 84
    invoke-direct {p1}, Lcom/google/gson/a;-><init>()V

    .line 85
    .line 86
    .line 87
    const-class p2, [Ljava/lang/String;

    .line 88
    .line 89
    new-instance v0, Lyi8;

    .line 90
    .line 91
    invoke-direct {v0, p2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0, v0}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast p0, [Ljava/lang/Object;

    .line 102
    .line 103
    new-instance p1, Ljava/util/HashSet;

    .line 104
    .line 105
    array-length p2, p0

    .line 106
    invoke-static {p2}, Laq4;->G(I)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1}, Leu;->I0([Ljava/lang/Object;Ljava/util/HashSet;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :goto_2
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 118
    .line 119
    if-nez p1, :cond_5

    .line 120
    .line 121
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 122
    .line 123
    if-nez p1, :cond_5

    .line 124
    .line 125
    new-instance p1, Lrj6;

    .line 126
    .line 127
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    instance-of p0, p1, Lrj6;

    .line 131
    .line 132
    if-eqz p0, :cond_4

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_4
    move-object v3, p1

    .line 136
    :goto_4
    return-object v3

    .line 137
    :cond_5
    throw p0
.end method

.method public final b(Ls51;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p1, Lxm7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lxm7;

    .line 7
    .line 8
    iget v1, v0, Lxm7;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxm7;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxm7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lxm7;-><init>(Lan7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lxm7;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxm7;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v0, Lxm7;->f0:Ljava/util/Iterator;

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lan7;->g:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    move-object v1, p1

    .line 57
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, v0, Lxm7;->f0:Ljava/util/Iterator;

    .line 70
    .line 71
    iput v2, v0, Lxm7;->i0:I

    .line 72
    .line 73
    invoke-virtual {p0, p1, v0}, Lan7;->a(Ljava/lang/String;Ls51;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object v4, Lc71;->X:Lc71;

    .line 78
    .line 79
    if-ne p1, v4, :cond_4

    .line 80
    .line 81
    return-object v4

    .line 82
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/HashSet;

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_5
    return-object v3
.end method

.method public final c(Luy7;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Ltp1;->a:Lnf1;

    .line 2
    .line 3
    sget-object v0, Lye1;->Z:Lye1;

    .line 4
    .line 5
    new-instance v1, Lym7;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v2, v3}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lc71;->X:Lc71;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 22
    .line 23
    return-object p0
.end method

.method public final d(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lzm7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lzm7;

    .line 7
    .line 8
    iget v1, v0, Lzm7;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzm7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzm7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lzm7;-><init>(Lan7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lzm7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lzm7;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Lzm7;->h0:I

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lan7;->b(Ls51;)Ljava/io/Serializable;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, Lc71;->X:Lc71;

    .line 55
    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/HashSet;

    .line 60
    .line 61
    sget-object v0, Ldn8;->a:Ldn8;

    .line 62
    .line 63
    if-nez p1, :cond_4

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_4
    iget-object p0, p0, Lan7;->c:Lvz7;

    .line 67
    .line 68
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 73
    .line 74
    const-string v2, "pref_blacklist"

    .line 75
    .line 76
    invoke-virtual {v1, v2, p1}, Lcom/tencent/mmkv/MMKV;->n(Ljava/lang/String;Ljava/util/Set;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 84
    .line 85
    const-string p1, "pref_blacklist_last_update"

    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    invoke-virtual {p0, v1, v2, p1}, Lcom/tencent/mmkv/MMKV;->m(JLjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method
