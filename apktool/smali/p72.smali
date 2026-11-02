.class public final Lp72;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lq15;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj72;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lp72;->a:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lj72;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lvz7;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lp72;->b:Lvz7;

    .line 29
    .line 30
    invoke-static {}, Lr15;->a()Lq15;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lp72;->c:Lq15;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp72;->c()Ll72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 9
    .line 10
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 11
    .line 12
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "data.result.tmp"

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/io/File;

    .line 26
    .line 27
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "data.result"

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object p0, p0, Ll72;->a:Lvz7;

    .line 47
    .line 48
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 53
    .line 54
    const-string v0, "extra_file_timestamp"

    .line 55
    .line 56
    sget-object v1, Lwe3;->a:Lmu0;

    .line 57
    .line 58
    invoke-interface {v1}, Lmu0;->a()Lte3;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lte3;->a()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-virtual {p0, v1, v2, v0}, Lcom/tencent/mmkv/MMKV;->m(JLjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Ldn8;->a:Ldn8;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_0
    const-string p0, "File rename failed"

    .line 73
    .line 74
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 82
    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 86
    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    new-instance v0, Lrj6;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_1
    throw p0
.end method

.method public final b(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lo72;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lo72;

    .line 7
    .line 8
    iget v1, v0, Lo72;->h0:I

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
    iput v1, v0, Lo72;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo72;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lo72;-><init>(Lp72;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lo72;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lo72;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    sget-object p1, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p1, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v1, Lbv;

    .line 53
    .line 54
    const/4 v4, 0x4

    .line 55
    invoke-direct {v1, p0, v2, v4}, Lbv;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 56
    .line 57
    .line 58
    iput v3, v0, Lo72;->h0:I

    .line 59
    .line 60
    invoke-static {p1, v1, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    sget-object p1, Lc71;->X:Lc71;

    .line 65
    .line 66
    if-ne p0, p1, :cond_3

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    :goto_1
    :try_start_2
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 74
    .line 75
    if-nez p1, :cond_5

    .line 76
    .line 77
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    new-instance p1, Lrj6;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object p0, p1

    .line 87
    :goto_2
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 94
    .line 95
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Ln72;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-direct {v1, p1, v2}, Ln72;-><init>(Ljava/lang/Throwable;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-object p0

    .line 113
    :cond_5
    throw p0
.end method

.method public final c()Ll72;
    .locals 0

    .line 1
    iget-object p0, p0, Lp72;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll72;

    .line 8
    .line 9
    return-object p0
.end method
